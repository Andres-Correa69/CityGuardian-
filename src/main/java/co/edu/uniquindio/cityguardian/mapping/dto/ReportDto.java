package co.edu.uniquindio.cityguardian.mapping.dto;

public record ReportDto(
        String id,
        String title,
        String categoryIdFK,
        String description,
        String locationIdFk,
        String statusId,
        String creationDate,
        String clientIdFk,
        String priority
) {
}
