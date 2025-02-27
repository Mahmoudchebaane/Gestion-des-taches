package com.example.ToDoList.srevice;

import com.example.ToDoList.entities.Categorie;

import java.util.List;

public interface IServiceCategorie {
    public Categorie createCategory(Categorie c);
    public Categorie findCategoryById(int id);
    public List<Categorie> findAllCategory();
    public Categorie updateCategory(Categorie c);
    public void deleteCategory(int id);
}
