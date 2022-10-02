package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Client;
import com.example.demo.repository.ClientRepository;

@Service
public class IClientServiceImp implements IClientService {

	@Autowired
	private  ClientRepository ClientRepository;

	@Override
	public List<Client> retrieveAllClients() {
		
		return ClientRepository.findAll(); 
	}

	@Override
	public Client addClient(Client c) {
		
		return ClientRepository.save(c)  ;
	}

	@Override
	public void deleteClient(Long id) {
		 ClientRepository.deleteById(id);  ;
	}

	@Override
	public Client updateClient(Client c) {
	
		return ClientRepository.save(c)  ;
		
	}

	@Override
	public Client retrieveClient(Long id) {
	
		return ClientRepository.getById(id);
	}
	
}
