package com.yass.projettutore.services;

import com.yass.projettutore.entities.Categorie;

import java.util.List;

public interface ICategorieService {
    public Categorie createCategorie(Categorie categorie);
    public Categorie findCategorieParId(int id);
    public Categorie updateCategorie(Categorie categorie);
    public List<Categorie> findAll();
    public void deleteCategorie(Categorie categorie);
}
