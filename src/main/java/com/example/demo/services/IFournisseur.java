package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Fournisseur;


public interface IFournisseur {
	List<Fournisseur> retrieveAllFournisseurs();

	Fournisseur addFournisseur(Fournisseur c);

	void deleteFournisseur(Long id);

	Fournisseur updateFournisseur(Fournisseur u);

	Fournisseur retrieveFournisseur(Long id);
}
