package com.yass.projettutore.repositories;

import com.yass.projettutore.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit,Integer> {
    Produit findByDescription(String description);
    List<Produit> findByTitre(String title);
}
