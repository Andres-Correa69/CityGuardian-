package co.edu.uniquindio.cityguardian.mapping.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record CreateUserDto(

       @NotBlank @Length(max = 40) String name,
       @NotBlank @Length(max = 40) String lastName,
       @Length(max = 10) String phone,
       @NotBlank @Length(max = 40) String city,
       @NotBlank @Length(max = 100)  String address,
       @NotBlank @Length(max = 40) @Email String email,
       @NotBlank @Length(min = 8) String password


) {

}
