package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.DetailFacture;

public interface IDetailFacture {
	List<DetailFacture> retrieveAllDetailFactures();

	DetailFacture addDetailFacture(DetailFacture c);

	void deleteDetailFacture(Long id);

	DetailFacture updateDetailFacture(DetailFacture u);

	DetailFacture retrieveDetailFacture(Long id);
}
