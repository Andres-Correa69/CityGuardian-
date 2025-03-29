package co.edu.uniquindio.cityguardian.controller;

import co.edu.uniquindio.cityguardian.mapping.dto.CreateUserDto;
import co.edu.uniquindio.cityguardian.mapping.dto.EditUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import co.edu.uniquindio.cityguardian.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController  {

    @Autowired
    private UserService userService;

    @PostMapping
    public void create (CreateUserDto account) throws Exception{
    }

    @PutMapping("/users/{id}")
    public void edit (EditUserDto account) throws  Exception{
    }

}
