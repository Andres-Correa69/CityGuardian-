package co.edu.uniquindio.cityguardian.controller;


import co.edu.uniquindio.cityguardian.mapping.dto.CreateReportDto;
import co.edu.uniquindio.cityguardian.mapping.dto.EditReportDto;
import co.edu.uniquindio.cityguardian.mapping.dto.MessageDTO;
import co.edu.uniquindio.cityguardian.mapping.dto.ReportDto;
import co.edu.uniquindio.cityguardian.services.ReportService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @PostMapping
    public ResponseEntity<MessageDTO<String>> createNewReport(@Valid @RequestBody CreateReportDto reportDto) throws Exception {
        reportService.createNewReport(reportDto);
        return ResponseEntity.status(201).body(new MessageDTO<>(false, "Su reporte ha sido creado exitosamente"));
    }

    @PutMapping("/{id}")
    public ReportDto editReport(@Valid @RequestBody EditReportDto reportDto) throws Exception {
        return reportService.updateReport(reportDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MessageDTO<String>> deleteReport(@PathVariable String id) throws Exception {
        reportService.deleteReport(id);
        return ResponseEntity.status(200).body(new MessageDTO<>(false, "Reporte eliminado correctamente"));
    }

    @GetMapping("/{id}")
    public ReportDto getReportById(@PathVariable String id) throws Exception {
        return reportService.getReportById(id);
    }

    @PutMapping("/{id}/solve")
    public void markReportAsSolve(@PathVariable String id) throws Exception {
        reportService.markReportAsSolved(id);
    }

    @PutMapping("/{id}/important")
    public void markReportAsImportant(@PathVariable String id) throws Exception {
        reportService.markReportAsImportant(id);
    }

    @GetMapping
    public List<ReportDto> getReports(){
        return reportService.getReports();
    }
}
