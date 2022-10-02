package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.*;

import com.example.demo.entities.CategorieClient;
import com.example.demo.entities.Client;
import com.example.demo.entities.Facture;
@Repository
public interface ClientRepository  extends JpaRepository<Client, Long> {
	

	//@Query(value="select f from Facture f Client c where f.client_id_client = c.id_client and c.categorie_client=:cat")
	//List<Facture> getAllFactureByCategorieClient(@Param(value = "cat") CategorieClient cat);


}
