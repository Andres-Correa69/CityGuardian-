package co.edu.uniquindio.cityguardian.controller;


import co.edu.uniquindio.cityguardian.mapping.dto.CreateReportDto;
import co.edu.uniquindio.cityguardian.mapping.dto.EditReportDto;
import co.edu.uniquindio.cityguardian.mapping.dto.ReportDto;
import co.edu.uniquindio.cityguardian.services.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @PostMapping
    public void createNewReport(CreateReportDto reportDto) throws Exception {}

    @PutMapping("/{id}")
    public void editReport(EditReportDto reportDto) throws Exception {}

    @DeleteMapping("/{id}")
    public void deleteReport(@PathVariable String id) throws Exception {}

    @GetMapping("/{id}")
    public ReportDto getReportById(@PathVariable String id) throws Exception {
        return null;
    }

    @PutMapping("/{id}/solve")
    public void markReportAsSolve(@PathVariable String id) throws Exception {}

    @PutMapping("/{id}/important")
    public void markReportAsImportant(@PathVariable String id) throws Exception {}

    @GetMapping
    public List<ReportDto> getReports(){
        return null;
    }
}
