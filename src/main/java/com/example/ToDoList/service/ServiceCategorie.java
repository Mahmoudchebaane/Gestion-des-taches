package com.example.ToDoList.service;

import com.example.ToDoList.entities.Categorie;
import com.example.ToDoList.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCategorie implements IServiceCategorie{
    @Autowired
    CategorieRepository categorieRepository;

    @Override
    public Categorie createCategory(Categorie c) {
        return categorieRepository.save(c);
    }

    @Override
    public Categorie findCategoryById(int id) {
        return categorieRepository.findById(id).get();
    }

    @Override
    public List<Categorie> findAllCategory() {
        return categorieRepository.findAll();
    }

    @Override
    public Categorie updateCategory(Categorie c) {
        return categorieRepository.save(c);
    }

    @Override
    public void deleteCategory(int id) {
        categorieRepository.deleteById(id);
    }
}
