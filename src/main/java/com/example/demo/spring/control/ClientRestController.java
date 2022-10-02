package com.example.demo.spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.demo.services.IClientService;
import com.example.demo.entities.Client;



@RestController
@RequestMapping(value = "client")
public class ClientRestController {
	@Autowired
	private IClientService iClientService ;  
	@GetMapping(value = "/bonjour")
	private String  HelloWorld() {
		return "Bonsoir 4SE3";
		
	}
	
	 @GetMapping("/get_all_clients")
	    @ResponseBody
	    public List<Client> getClients() {
	        List<Client> clients = iClientService.retrieveAllClients();
	        System.out.println(clients);
	        return clients;
	    }
	 
	   // http://localhost:8082/client/add_client    
	    @PostMapping(value ="/add_client")
	    
	    public Client addClient(@RequestBody Client c) {
	  
	    		return iClientService.addClient(c);
	  
	    }
	    
	    @PutMapping(value ="/update_client")
	    
	    public Client updateClient(@RequestBody Client c) {
	  
	    		return iClientService.updateClient(c);
	  
	    }
	    
	      
	     
	
}
