package co.edu.uniquindio.cityguardian.mapping.dto;

public record StatusHistoryDto(
        String id,
        String reportIdFk,
        String previusStatusId,
        String newStatusId,
        String changeDate
) {
}
