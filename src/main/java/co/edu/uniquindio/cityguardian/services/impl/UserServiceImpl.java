package co.edu.uniquindio.cityguardian.services.impl;

import co.edu.uniquindio.cityguardian.exceptions.RepeatedElementException;
import co.edu.uniquindio.cityguardian.mapping.dto.CreateUserDto;
import co.edu.uniquindio.cityguardian.mapping.dto.EditUserDto;
import co.edu.uniquindio.cityguardian.mapping.dto.UserDto;
import co.edu.uniquindio.cityguardian.mapping.mappers.UserMapper;
import co.edu.uniquindio.cityguardian.model.Report;
import co.edu.uniquindio.cityguardian.model.User;
import co.edu.uniquindio.cityguardian.model.dto.AuthResponseDTO;
import co.edu.uniquindio.cityguardian.model.dto.LoginRequest;
import co.edu.uniquindio.cityguardian.repository.UserRepository;
import co.edu.uniquindio.cityguardian.security.JWTUtils;
import co.edu.uniquindio.cityguardian.services.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import javax.naming.AuthenticationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserRepository repository;
    @Autowired
    private  UserMapper userMapper;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private  MongoTemplate mongoTemplate;
    @Autowired
    private  PasswordEncoder passwordEncoder;
    @Autowired
    private JWTUtils jwtUtils;

    @Override
    public AuthResponseDTO login(LoginRequest loginRequest) throws Exception {
        if (!emailExist(loginRequest.email())){
            throw new AuthenticationException("El email no existe");
        }
        User user = repository.findByEmail(loginRequest.email())
        .orElseThrow(() -> new AuthenticationException("El usuario no existe"));

        if (!passwordEncoder.matches(loginRequest.password(), user.getPassword())) {
            throw new Exception("Credenciales inválidas");
        }

        Map<String, String> claims = new HashMap<>();
        claims.put("email", user.getEmail());
        claims.put("role", user.getRole().name());


        String token = jwtUtils.generateToken(user.getId(), claims);

        UserDto userDto = userMapper.toUserDto(user);

        return new AuthResponseDTO(token, userDto);
    }

    @Override
    public void createNewUser(CreateUserDto userDto)  throws Exception {

        if(emailExist(userDto.email())){
            throw new RepeatedElementException("El email ya está registrado");
        }

        User user = userMapper.toDocument(userDto);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repository.save(user);
    }

    public boolean emailExist(String email) {
        return repository.findByEmail(email).isPresent();
    }

    @Override
    public UserDto updateUser(EditUserDto updatedUser) throws Exception {
        Optional<User> optionalUser = repository.findByEmail(updatedUser.email());
        if (optionalUser.isEmpty()) {
            throw new RuntimeException("Usuario no encontrado");
        }

        User existingUser = optionalUser.get();

        objectMapper.updateValue(existingUser, updatedUser);

        return userMapper.toUserDto(repository.save(existingUser));
    }

    @Override
    public void deleteUser(String id) throws Exception {
        Optional<User> reportOptional = repository.findById(id);
        if (reportOptional.isEmpty()){
            throw new RuntimeException("Usuario no encontrado");
        }
        repository.deleteById(id);
    }

    @Override
    public UserDto getUserById(String id) throws Exception {
        Optional<User> optionalUser = repository.findById(id);
        if (optionalUser.isEmpty()){
            throw new RuntimeException("Usuario no encontrado");
        }
        return userMapper.toUserDto(optionalUser.get());
    }

    @Override
    public List<UserDto> getUsers() {
        List<User> users = repository.findAll();
        return users.stream().map(userMapper::toUserDto).toList();
    }

}
