package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.DetailProduit;
import com.example.demo.repository.DetailProduitRepository;
@Service
public class DetailProduitServiceImpl implements IDetailProduit{
	@Autowired
	private DetailProduitRepository detailProduitRepository;


	@Override
	public List<DetailProduit> retrieveAllDetailProduits() {
		// TODO Auto-generated method stub
		List<DetailProduit> DetailProduits = (List<DetailProduit>) detailProduitRepository.findAll();
		return DetailProduits;
	}

	@Override
	public DetailProduit addDetailProduit(DetailProduit p) {
		// TODO Auto-generated method stub
		detailProduitRepository.save(p);
		return p;
	}

	@Override
	public void deleteDetailProduit(Long id) {
		// TODO Auto-generated method stub
		detailProduitRepository.deleteById(id);

	}

	@Override
	public DetailProduit updateDetailProduit(DetailProduit u) {
		// TODO Auto-generated method stub
		return detailProduitRepository.save(u);
	}

	@Override
	public DetailProduit retrieveDetailProduit(Long id) {
		// TODO Auto-generated method stub
		DetailProduit DetailProduit = detailProduitRepository.findById(id).orElse(null);
		return DetailProduit;
	}
}
