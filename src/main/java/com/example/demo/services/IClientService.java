package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Client;


public interface IClientService {
	
	List<Client> retrieveAllClients();

	Client addClient(Client c);

	void deleteClient(Long id);

	Client updateClient(Client c);

	Client retrieveClient(Long id);
}
