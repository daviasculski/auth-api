package com.davi.auth.auth_api.service;

import com.davi.auth.auth_api.entity.User;
import com.davi.auth.auth_api.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User registerUser(String username, String password) {
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(passwordEncoder.encode(password)); // A senha agora será criptografada

        return userRepository.save(newUser);
    }

    public User authenticateUser(String username, String password){
        User user =userRepository.findByUsername(username)
            .orElseThrow(() -> new RuntimeException("Usuario nao encontrado."));

        if(!passwordEncoder.matches(password, user.getPassword())){
            throw new RuntimeException("Senha incorreta");
        }

        //se e o usuario e senha estiverem ok,
        //retorna o usuario

        return user;
    }


}