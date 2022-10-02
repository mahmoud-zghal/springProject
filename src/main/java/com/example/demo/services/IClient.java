package com.example.demo.services;

import java.util.List;


import com.example.demo.entities.CategorieClient;
import com.example.demo.entities.Client;
import com.example.demo.entities.Facture;

public interface IClient {
	List<Client> retrieveAllClients();

	Client addClient(Client c);

	void deleteClient(Long id);

	Client updateClient(Client u);

	Client retrieveClient(Long id);
	
	//List<Facture> getAllFactureByCategorieClient(CategorieClient categorieClient);
}
