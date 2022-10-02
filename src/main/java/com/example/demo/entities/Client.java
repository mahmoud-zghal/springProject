package com.example.demo.entities;



import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.NonNull;

@Entity

public class Client implements Serializable {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long idClient;
	@NonNull
	private String nom;
	@NonNull
	private String prenom;
	@NonNull
	@Temporal(TemporalType.DATE)
	private Date DateNaissance;
	@NonNull
	private String email ;
	@NonNull
	private String password;
	@Enumerated(EnumType.STRING)
	private  CategorieClient categorieClient;
	@Enumerated(EnumType.STRING)
	private Profession profession;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="client")
	private Set<Facture> factures;
	

}
