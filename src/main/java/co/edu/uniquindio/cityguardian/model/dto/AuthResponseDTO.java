package co.edu.uniquindio.cityguardian.model.dto;

import co.edu.uniquindio.cityguardian.mapping.dto.UserDto;

public record AuthResponseDTO(
    String token,
    UserDto user
) {}