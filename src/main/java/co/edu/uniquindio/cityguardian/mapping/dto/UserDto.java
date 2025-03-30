package co.edu.uniquindio.cityguardian.mapping.dto;

public record UserDto(

        String id,
        String firstName,
        String lastName,
        String email,
        String phone,
        String address,
        String city,
        String password,
        String isActive,
        String role,
        String registerDate

) {
}
