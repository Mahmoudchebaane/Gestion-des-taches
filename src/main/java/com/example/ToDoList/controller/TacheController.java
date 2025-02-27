package com.example.ToDoList.controller;

import com.example.ToDoList.entities.Tache;
import com.example.ToDoList.service.IServiceTache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/taches")
public class TacheController {

    @Autowired
    IServiceTache iServiceTache;

    @PostMapping
    public Tache createTache(@RequestBody Tache tache){
        return iServiceTache.createTache(tache);
    }

    @GetMapping("/all")
    public List<Tache> getAllTaches(){
        return iServiceTache.findAllTaches();
    }

    @GetMapping("/{id}")
    public Tache getTacheById(@PathVariable int id){
        return iServiceTache.findTacheById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTache(@PathVariable int id){
        iServiceTache.deleteTache(id);
    }
}
