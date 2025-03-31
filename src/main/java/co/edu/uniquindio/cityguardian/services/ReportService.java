package co.edu.uniquindio.cityguardian.services;

import co.edu.uniquindio.cityguardian.mapping.dto.CreateReportDto;

public interface ReportService {

    void createNewReport(CreateReportDto reportDto) throws Exception;
}
