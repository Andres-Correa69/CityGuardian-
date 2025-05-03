package co.edu.uniquindio.cityguardian.mapping.dto;

public record FilterReportDto(

        String initialDate,
        String finalDate,
        String status,
        String category
) {
}
