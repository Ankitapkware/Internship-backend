package com.ProjectBackend.ProjectBackend.Users;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicesLogic implements UserServices {

  private UserRepository userRepository;

  @Autowired
  public UserServicesLogic(UserRepository theUserRepository) {
    userRepository = theUserRepository;
  }

  @Override
  public List<Users> findAll() {
    return userRepository.findAll();
  }

  @Override
  public Users findById(int theId) {
    Optional<Users> result = userRepository.findById(theId);

    Users theStudent = null;

    if (result.isPresent()) {
      theStudent = result.get();
    } else {
      // we didn't find the Student
      throw new RuntimeException("Did not find Student id - " + theId);
    }

    return theStudent;
  }

}
