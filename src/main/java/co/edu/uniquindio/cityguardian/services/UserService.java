package co.edu.uniquindio.cityguardian.services;

import co.edu.uniquindio.cityguardian.mapping.dto.CreateUserDto;

public interface UserService {
    void createNewUser(CreateUserDto userDto) throws Exception;

}
