package co.edu.uniquindio.cityguardian.mapping.dto;

public record CommentDto(
        String id,
        String content,
        String clientIdFk,
        String reportIdFk,
        String date

) {
}
