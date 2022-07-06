package com.ProjectBackend.ProjectBackend;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Users, Integer> {

	List<Users> findAll();

}