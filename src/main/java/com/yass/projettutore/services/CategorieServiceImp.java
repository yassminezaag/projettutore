package com.yass.projettutore.services;

import com.yass.projettutore.entities.Categorie;
import com.yass.projettutore.repositories.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategorieServiceImp implements ICategorieService{
    @Autowired
    CategorieRepository categorieRepository;
    @Override
    public Categorie createCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public Categorie findCategorieParId(int id) {
        return categorieRepository.findById(id).get();
    }

    @Override
    public Categorie updateCategorie(Categorie categorie) {
        return categorieRepository.saveAndFlush(categorie);
    }

    @Override
    public List<Categorie> findAll() {
        return categorieRepository.findAll();
    }

    @Override
    public void deleteCategorie(Categorie categorie) {
        categorieRepository.delete(categorie);

    }
}
