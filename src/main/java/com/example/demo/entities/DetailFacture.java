package com.example.demo.entities;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class DetailFacture  implements Serializable{
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long idDetailFacture;
	private int qte;
	private float prixTotal;
	private int  pourcentageRemise;
	private int montantRemise;
	@ManyToOne
	Facture facture;
	@ManyToOne
	Produit produit;
	
	

}
