package co.edu.uniquindio.cityguardian.services;

import co.edu.uniquindio.cityguardian.mapping.dto.CreateReportDto;
import co.edu.uniquindio.cityguardian.mapping.dto.EditReportDto;
import co.edu.uniquindio.cityguardian.mapping.dto.FilterReportDto;
import co.edu.uniquindio.cityguardian.mapping.dto.ReportDto;

import java.util.List;

public interface ReportService {

    void createNewReport(CreateReportDto reportDto) throws Exception;
    ReportDto updateReport(EditReportDto updatedReport, String id) throws Exception;
    void deleteReport(String id) throws Exception;
    ReportDto getReportById(String id) throws Exception;
    List<ReportDto> getReports();
    void markReportAsSolved(String id) throws Exception;
    void markReportAsImportant(String id) throws Exception;
    List<ReportDto> filterReports(FilterReportDto filterReportDto) throws Exception;

}
