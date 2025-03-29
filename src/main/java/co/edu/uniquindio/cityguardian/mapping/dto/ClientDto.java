package co.edu.uniquindio.cityguardian.mapping.dto;
import co.edu.uniquindio.cityguardian.model.Client;
public record ClientDto(
        String id,
        String name,
        String email,
        String phone,
        String address,
        String city,
        String password,
        String active,
        String role,
        String userIdFk
) {


}
