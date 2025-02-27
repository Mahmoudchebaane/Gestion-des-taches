package com.example.ToDoList.repository;

import com.example.ToDoList.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
