package co.edu.uniquindio.cityguardian.controller;

import co.edu.uniquindio.cityguardian.mapping.dto.CreateUserDto;
import co.edu.uniquindio.cityguardian.mapping.dto.EditUserDto;
import co.edu.uniquindio.cityguardian.mapping.dto.MessageDTO;
import co.edu.uniquindio.cityguardian.services.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController  {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<MessageDTO<String>> createNewUser(@Valid @RequestBody CreateUserDto account) throws Exception{
        userService.createNewUser(account);
        return ResponseEntity.status(201).body(new MessageDTO<>(false, "Su registro ha sido exitoso"));
    }

    @PutMapping("/{id}")
    public void edit (EditUserDto account) throws  Exception{
    }

}
