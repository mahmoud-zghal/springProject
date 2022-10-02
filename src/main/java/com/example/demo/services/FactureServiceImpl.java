package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Facture;
import com.example.demo.repository.FactureRepository;

public class FactureServiceImpl implements IFacture {
	@Autowired
	private FactureRepository factureRepository;


	@Override
	public List<Facture> retrieveAllFactures() {
		// TODO Auto-generated method stub
		List<Facture> Factures = (List<Facture>) factureRepository.findAll();
		return Factures;
	}

	@Override
	public Facture addFacture(Facture p) {
		// TODO Auto-generated method stub
		factureRepository.save(p);
		return p;
	}

	@Override
	public void deleteFacture(Long id) {
		// TODO Auto-generated method stub
		factureRepository.deleteById(id);

	}

	@Override
	public Facture updateFacture(Facture u) {
		// TODO Auto-generated method stub
		return factureRepository.save(u);
	}

	@Override
	public Facture retrieveFacture(Long id) {
		// TODO Auto-generated method stub
		Facture Facture = factureRepository.findById(id).orElse(null);
		return Facture;
	}
}
