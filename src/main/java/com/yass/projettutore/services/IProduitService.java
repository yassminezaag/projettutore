package com.yass.projettutore.services;

import com.yass.projettutore.entities.Produit;

import java.util.List;

public interface IProduitService {

    public Produit createProduit(Produit produit);
    public Produit findProduitParId(int id);
    public Produit updateProduit(Produit produit);
    public List<Produit> findAll();
    public void deleteProduit(Produit produit);
}
