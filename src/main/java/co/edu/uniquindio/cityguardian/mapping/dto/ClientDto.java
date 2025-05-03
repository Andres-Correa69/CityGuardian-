package co.edu.uniquindio.cityguardian.mapping.dto;

public record ClientDto(
        String id,
        String name,
        String email,
        String phone,
        String address,
        String city,
        String password,
        String active,
        String role
) {


}
