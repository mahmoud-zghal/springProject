package com.example.demo.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.lang.NonNull;


@Entity

public class Rayon implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long idRayon;
	@NonNull
	private String codeRayon;
	@NonNull
	private String libelleRayon ;
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "rayon")
	private Set<Produit> produits;

}
