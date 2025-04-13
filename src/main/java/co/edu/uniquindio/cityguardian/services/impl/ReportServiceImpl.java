package co.edu.uniquindio.cityguardian.services.impl;

import co.edu.uniquindio.cityguardian.exceptions.RepeatedElementException;
import co.edu.uniquindio.cityguardian.mapping.dto.CreateReportDto;
import co.edu.uniquindio.cityguardian.mapping.dto.EditReportDto;
import co.edu.uniquindio.cityguardian.mapping.dto.ReportDto;
import co.edu.uniquindio.cityguardian.mapping.mappers.ReportMapper;
import co.edu.uniquindio.cityguardian.model.Report;
import co.edu.uniquindio.cityguardian.repository.ReportRepository;
import co.edu.uniquindio.cityguardian.services.ReportService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ReportRepository repository;
    @Autowired
    private ReportMapper reportMapper;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public void createNewReport(CreateReportDto reportDto) throws Exception {
        if(idExist(reportDto.id())){
            throw new RepeatedElementException("El reporte ya fue creado");
        }

        Report report = reportMapper.toDocument(reportDto);
        repository.save(report);

    }

    @Override
    public ReportDto updateReport(EditReportDto updatedReport) throws Exception {
        Optional<Report> optionalReport = repository.findById(updatedReport.id());
        if (optionalReport.isEmpty()){
            throw new RuntimeException("Reporte no encontrado");
        }

        Report existingReport = optionalReport.get();
        objectMapper.updateValue(existingReport, updatedReport);
        return reportMapper.toReportDto(repository.save(existingReport));
    }

    @Override
    public void deleteReport(String id) throws Exception {
        Optional<Report> reportOptional = repository.findById(id);
        if (reportOptional.isEmpty()){
            throw  new RuntimeException("Reporte no encontrado");
        }
        repository.deleteById(id);
    }

    @Override
    public ReportDto getReportById(String id) throws Exception {
        Optional<Report> optionalReport = repository.findById(id);
        if (optionalReport.isEmpty()){
            throw new RuntimeException("Reporte no encontrado");
        }
        return reportMapper.toReportDto(optionalReport.get());
    }

    @Override
    public List<ReportDto> getReports() {
        List<Report> reports = repository.findAll();
        return reports.stream().map(reportMapper::toReportDto).toList();
    }

    @Override
    public void markReportAsSolved(String id) throws Exception {
        Optional<Report> optionalReport = repository.findById(id);
        if (optionalReport.isEmpty()){
            throw new RuntimeException("Reporte no encontrado");
        }
        Report report = optionalReport.get();
        report.setSolved(true);
        repository.save(report);
    }

    @Override
    public void markReportAsImportant(String id) throws Exception {
        Optional<Report> optionalReport = repository.findById(id);
        if (optionalReport.isEmpty()){
            throw new RuntimeException("Reporte no encontrado");
        }
        Report report = optionalReport.get();
        report.setImportant(true);
        repository.save(report);

    }


    public boolean idExist(String id){
        return  repository.findById(id).isPresent();
    }


}
