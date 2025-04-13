package co.edu.uniquindio.cityguardian.mapping.dto;

import org.springframework.data.annotation.Id;

public record ReportDto(

        @Id
        String id,
        String title,
        String categoryIdFK,
        String description,
        String solved,
        String important,
        String locationIdFk,
        String statusId,
        String creationDate,
        String clientIdFk,
        String priority
) {
}
