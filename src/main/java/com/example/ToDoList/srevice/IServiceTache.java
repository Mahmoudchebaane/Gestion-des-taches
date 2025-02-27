package com.example.ToDoList.srevice;

import com.example.ToDoList.entities.Tache;

import java.util.List;

public interface IServiceTache {
    public Tache createTache(Tache t);
    public Tache findTacheById(int id);
    public List<Tache> findAllTaches();
    public Tache updateTache(Tache t);
    public void deleteTache(int id);
}
