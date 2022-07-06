package com.ProjectBackend.ProjectBackend.Users;

import java.util.List;

public interface UserServices {

  public List<Users> findAll();

  public Users findById(int theId);

}
