package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.DetailProduit;

public interface IDetailProduit {
	List<DetailProduit> retrieveAllDetailProduits();

	DetailProduit addDetailProduit(DetailProduit c);

	void deleteDetailProduit(Long id);

	DetailProduit updateDetailProduit(DetailProduit u);

	DetailProduit retrieveDetailProduit(Long id);
}
