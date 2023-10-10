package com.yass.projettutore.services;

import com.yass.projettutore.entities.Produit;
import com.yass.projettutore.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProduitServiceImp implements IProduitService {
    @Autowired
    ProduitRepository produitRepository;

    @Override
    public Produit createProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Produit findProduitParId(int id) {

        return produitRepository.findById(id).get();
    }

    @Override
    public Produit updateProduit(Produit produit) {
        return produitRepository.saveAndFlush(produit);
    }

    @Override
    public List<Produit> findAll() {
        return produitRepository.findAll();
    }

    @Override
    public void deleteProduit(Produit produit) {
        produitRepository.delete(produit);

    }
}
