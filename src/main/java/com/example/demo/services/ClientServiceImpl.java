package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.CategorieClient;
import com.example.demo.entities.Client;
import com.example.demo.entities.Facture;
import com.example.demo.repository.ClientRepository;
@Service
public class ClientServiceImpl implements IClient{
	@Autowired
	private ClientRepository clientRepository;


	@Override
	public List<Client> retrieveAllClients() {
		// TODO Auto-generated method stub
		List<Client> clients =  clientRepository.findAll();
		return clients;
	}

	@Override
	public Client addClient(Client p) {
		// TODO Auto-generated method stub
		clientRepository.save(p);
		return p;
	}

	@Override
	public void deleteClient(Long id) {
		// TODO Auto-generated method stub
		clientRepository.deleteById(id);

	}

	@Override
	public Client updateClient(Client u) {
		// TODO Auto-generated method stub
		return clientRepository.save(u);
	}

	@Override
	public Client retrieveClient(Long id) {
		// TODO Auto-generated method stub
		Client Client = clientRepository.findById(id).orElse(null);
		return Client;
	}
/*
	@Override
	public List<Facture> getAllFactureByCategorieClient(CategorieClient categorieClient) {
       
		return clientRepository.getAllFactureByCategorieClient(categorieClient.PREMIUM);
	}*/
}
