package com.example.demo.services;
import java.util.List;
import com.example.demo.entities.Produit;

public interface IProduitService {
	List<Produit> retrieveAllProduits();

	Produit addProduit(Produit p, Long idRayon, Long idStock);

	Produit retrieveProduit(Long id);

}
