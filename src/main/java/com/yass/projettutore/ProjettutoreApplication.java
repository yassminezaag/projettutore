package com.yass.projettutore;

import com.yass.projettutore.entities.Categorie;
import com.yass.projettutore.entities.Produit;
import com.yass.projettutore.services.CategorieServiceImp;
import com.yass.projettutore.services.ProduitServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjettutoreApplication implements CommandLineRunner {
	@Autowired
	CategorieServiceImp categorieServiceImp;
	@Autowired
	ProduitServiceImp produitServiceImp;

	public static void main(String[] args) {
		SpringApplication.run(ProjettutoreApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Categorie categorie1 = new Categorie();
		categorie1.setCategorie("Mini PC");
		categorieServiceImp.createCategorie(categorie1);

		Produit produit1 = new Produit();
		produit1.setTitre("Pc");
		produit1.setDescription("behy");
		produit1.setCategorie(categorie1);
		produitServiceImp.createProduit(produit1);


	}
}
