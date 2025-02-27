package com.example.ToDoList.repository;
import com.example.ToDoList.entities.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TachRepository extends JpaRepository<Tache, Integer> {
}
