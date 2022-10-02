package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Facture;


public interface IFacture {
	List<Facture> retrieveAllFactures();

	Facture addFacture(Facture c);

	void deleteFacture(Long id);

	Facture updateFacture(Facture u);

	Facture retrieveFacture(Long id);

	
}
