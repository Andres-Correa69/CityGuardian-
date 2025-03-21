package co.edu.uniquindio.cityguardian.mapping.dto;

public record NotificationDto(
        String id,
        String message,
        String recipientIdFk,
        String sentDate,
        String read
) {
}
