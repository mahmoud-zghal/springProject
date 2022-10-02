package com.example.demo.entities;



import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class Fournisseur implements Serializable {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long idfournisseur;
	private String codeFornisseur;
	private String libelleFournisseur;
	@ManyToMany(cascade=CascadeType.ALL,mappedBy = "fournisseurs")
	public Set<Produit> produits;
}
