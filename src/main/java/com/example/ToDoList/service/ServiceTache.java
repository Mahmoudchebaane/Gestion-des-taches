package com.example.ToDoList.service;

import com.example.ToDoList.entities.Tache;
import com.example.ToDoList.repository.TachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTache implements IServiceTache{

    @Autowired
    TachRepository tachRepository;

    @Override
    public Tache createTache(Tache t) {
        return tachRepository.save(t);
    }

    @Override
    public Tache findTacheById(int id) {
        return tachRepository.findById(id).get();
    }

    @Override
    public List<Tache> findAllTaches() {
        return tachRepository.findAll();
    }

    @Override
    public Tache updateTache(Tache t) {
        return tachRepository.save(t);
    }

    @Override
    public void deleteTache(int id) {
        tachRepository.deleteById(id);
    }
}
