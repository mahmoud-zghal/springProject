package com.example.demo.spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Produit;
import com.example.demo.services.IProduitService;

@RestController
@RequestMapping(value = "product")
public class ProduitRestController {

	@Autowired
	private IProduitService iProduitService;
	
	
	
	@GetMapping(value = "/bonjour")
	private String  HelloWorld() {
		return "Bonsoir 4SE3";
		
	}
	
	@GetMapping(value = "/bonjour1/{name}")
	private String  HelloWorld1(@PathVariable String name) {
		return "Bonsoir 4SE3 2" + name;
		
	}
	
	@GetMapping(value = "/bonjour2")
	private String  HelloWorld2(@RequestParam String name) {
		return "Bonsoir 4SE3 2" + name;
		
	}
	
	
//	localhost:8090/product/add-product/1/1
	@PostMapping(value = "/add-product/{idRayon}/{idStock}")
	public Produit addProduct(@RequestBody Produit p, @PathVariable Long idRayon,@PathVariable Long idStock) {
		
		return iProduitService.addProduit(p, idRayon, idStock);
	}
	
	
	
	
	
	
	
	
}