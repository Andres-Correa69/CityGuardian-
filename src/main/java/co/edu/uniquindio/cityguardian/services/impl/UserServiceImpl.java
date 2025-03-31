package co.edu.uniquindio.cityguardian.services.impl;

import co.edu.uniquindio.cityguardian.exceptions.RepeatedElementException;
import co.edu.uniquindio.cityguardian.mapping.dto.CreateUserDto;
import co.edu.uniquindio.cityguardian.mapping.dto.EditUserDto;
import co.edu.uniquindio.cityguardian.mapping.dto.UserDto;
import co.edu.uniquindio.cityguardian.mapping.mappers.UserMapper;
import co.edu.uniquindio.cityguardian.model.User;
import co.edu.uniquindio.cityguardian.repository.UserRepository;
import co.edu.uniquindio.cityguardian.services.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

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

    @Override
    public void createNewUser(CreateUserDto userDto) {

        if(emailExist(userDto.email())){
            throw new RepeatedElementException("El email ya está registrado");
        }

        User user = userMapper.toDocument(userDto);
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
}
