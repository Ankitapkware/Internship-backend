package com.ProjectBackend.ProjectBackend.Users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Users, Integer> {

	List<Users> findAll();

}