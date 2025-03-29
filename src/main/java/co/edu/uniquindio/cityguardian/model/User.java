package co.edu.uniquindio.cityguardian.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("users")
@Setter
@Getter
@NoArgsConstructor
public class User {

    @Id
    private String id;

    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String password;
    private Boolean isActive;
    private UserRol role;
    private LocalDateTime registerDate;

    @Builder
    public User(String name, String city, String address, String email, String phone, String password, UserRol role, Boolean isActive, LocalDateTime registerDate) {
        this.name = name;
        this.city = city;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.role = role;
        this.isActive = isActive;
        this.registerDate = registerDate;
    }
}
