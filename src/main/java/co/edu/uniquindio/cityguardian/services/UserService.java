package co.edu.uniquindio.cityguardian.services;

import co.edu.uniquindio.cityguardian.mapping.dto.CreateUserDto;
import co.edu.uniquindio.cityguardian.mapping.dto.EditUserDto;
import co.edu.uniquindio.cityguardian.mapping.dto.UserDto;

import java.util.List;

public interface UserService {
    void createNewUser(CreateUserDto userDto) throws Exception;
    UserDto updateUser(EditUserDto updatedUser) throws Exception;
    void deleteUser(String id) throws Exception;
    UserDto getUserById(String id) throws Exception;
    List<UserDto> getUsers();
}
