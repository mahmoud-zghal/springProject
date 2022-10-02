package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Produit;
import com.example.demo.entities.Rayon;
import com.example.demo.entities.Stock;
import com.example.demo.repository.ProduitRepository;
import com.example.demo.repository.RayonRepository;
import com.example.demo.repository.StockRepository;

@Service
public class IProduitServiceImp implements IProduitService {
	 
@Autowired 
private ProduitRepository produitRepository ; 
@Autowired
private RayonRepository rayonRepository ; 
@Autowired
private StockRepository stockRepository; 


@Override
public List<Produit> retrieveAllProduits() {
	List<Produit> produits = produitRepository.findAll();
	return produits ; 
}

@Override
public Produit addProduit(Produit p, Long idRayon, Long idStock) {
	
	Rayon rayon = rayonRepository.findById(idRayon).orElse(null);
	Stock stock = stockRepository.findById(idStock).orElse(null);
	
	p.setRayon(rayon);
	p.setStock(stock);
	

	
	return produitRepository.save(p);
	
}

@Override
public Produit retrieveProduit(Long id) {
	
	Produit produit = produitRepository.findById(id).orElse(null);
	return produit;
}


}
