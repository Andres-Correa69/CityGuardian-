package co.edu.uniquindio.cityguardian.controller;

import co.edu.uniquindio.cityguardian.model.dto.AuthResponseDTO;
import co.edu.uniquindio.cityguardian.model.dto.LoginRequest;
import co.edu.uniquindio.cityguardian.services.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private  UserService userService;

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDTO> login(@Valid @RequestBody LoginRequest loginRequest) throws Exception {
        return ResponseEntity.ok(userService.login(loginRequest));
    }
} 