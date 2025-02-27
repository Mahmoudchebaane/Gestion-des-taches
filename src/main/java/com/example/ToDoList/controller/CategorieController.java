package com.example.ToDoList.controller;

import com.example.ToDoList.entities.Categorie;
import com.example.ToDoList.service.IServiceCategorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategorieController {

    @Autowired
    IServiceCategorie iServiceCategorie;

//    @GetMapping("/hello")
//    public String hello(){
//        return "bonjour test reussi";
//    }

    @PostMapping
    public Categorie createCategorie(@RequestBody Categorie categorie){
        return iServiceCategorie.createCategory(categorie);
    }

    @GetMapping("/all")
    public List<Categorie> getAllCategories(){
        return iServiceCategorie.findAllCategory();
    }

    @GetMapping("/{id}")
    public Categorie getCategoryById(@PathVariable int id){
        return iServiceCategorie.findCategoryById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable int id){
        iServiceCategorie.deleteCategory(id);
    }
}
