package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
 
public class DetailProduit implements Serializable {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long idDetailProduit;
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	@Temporal(TemporalType.DATE)
	private Date dateDernierModification;
	@Enumerated(EnumType.STRING)
	private CategorieProduit categorieProduit;
	@OneToOne(mappedBy = "detailProduit")
	Produit produit;
	public DetailProduit(CategorieProduit categorieProduits) {
		super();
		this.dateCreation = new Date(System.currentTimeMillis());
		this.dateDernierModification =dateCreation;
		this.categorieProduit = categorieProduit;
	}
	
	public void setDateDernierModification() {
		this.dateDernierModification =new Date(System.currentTimeMillis());
	}
	
	
	
	
}
