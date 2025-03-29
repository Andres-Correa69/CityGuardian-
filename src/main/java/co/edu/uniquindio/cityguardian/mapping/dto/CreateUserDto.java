package co.edu.uniquindio.cityguardian.mapping.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record CreateUserDto(

       @NotBlank @Length(max = 100) String name,
        @NotBlank @Length(max = 100) String lastName,
        @Length(max = 11) String phone,
        @NotBlank @Length(max = 100)  String address,
        @NotBlank @Length(max = 50) @Email String email,
        @NotBlank @Length(min = 7, max = 15) String password
) {

}
