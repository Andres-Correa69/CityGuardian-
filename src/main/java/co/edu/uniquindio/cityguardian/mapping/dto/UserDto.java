package co.edu.uniquindio.cityguardian.mapping.dto;

import co.edu.uniquindio.cityguardian.model.UserRol;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public record UserDto(
        @Id
        String id,
        String name,
        String lastName,
        String email,
        String phone,
        String address,
        String city,
        String password,
        Boolean isActive,
        UserRol role,
        LocalDateTime registerDate
) {
}
