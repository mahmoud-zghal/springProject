package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Produit;
import com.example.demo.repository.ProduitRepository;


@Service
 //equivalent instance de logger
public class ProduitServiceImpl implements IProduit {
	@Autowired
	private ProduitRepository produitRepository;


	@Override
	public List<Produit> retrieveAllProduits() {
		// TODO Auto-generated method stub
		List<Produit> produits = (List<Produit>) produitRepository.findAll();
		/*for (Produit produit:produits) {
			log.info(" produit: " + produit);
		}*/
		return produits;
	}

	@Override
	public Produit addProduit(Produit p) {
		// TODO Auto-generated method stub
		produitRepository.save(p);
		return p;
	}

	@Override
	public void deleteProduit(Long id) {
		// TODO Auto-generated method stub
		produitRepository.deleteById(id);

	}

	@Override
	public Produit updateProduit(Produit u) {
		// TODO Auto-generated method stub
		return produitRepository.save(u);
	}

	@Override
	public Produit retrieveProduit(Long id) {
		// TODO Auto-generated method stub
		Produit produit = produitRepository.findById(id).orElse(null);
		return produit;
	}
}
