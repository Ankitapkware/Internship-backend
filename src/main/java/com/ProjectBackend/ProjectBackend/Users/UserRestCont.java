package com.ProjectBackend.ProjectBackend.Users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserRestCont {

  private UserServices userService;

  @Autowired
  public UserRestCont(UserServices theUserService) {
	  userService = theUserService;
  }

  // expose "/Students" and return list of Students
  @GetMapping("/users")
  public List<Users> findAll() {
    return userService.findAll();
  }

  // add mapping for GET /Students/{StudentId}

  @GetMapping("/students/{studentId}")
  public Users getStudent(@PathVariable int studentId) {

    Users theStudent = userService.findById(studentId);

    if (theStudent == null) {
      throw new RuntimeException("student id not found - " + studentId);
    }

    return theStudent;
  }
 
}