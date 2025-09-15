package com.davi.auth.auth_api.service;

import org.springframework.stereotype.Service;
import com.davi.auth.auth_api.entity.User;
import com.davi.auth.auth_api.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User registerUser(String username, String password) {
    User newUser = new User();
    newUser.setUsername(username);
    newUser.setPassword(password);

    return userRepository.save(newUser);
  }
}
