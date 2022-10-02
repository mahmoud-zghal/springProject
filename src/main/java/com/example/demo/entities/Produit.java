package com.example.demo.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Produit implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long idProduit ;
	@NonNull
	private String codeProduit ;
	@NonNull
	private String libelleProduit;
	@NonNull
	private float prixUnitaire;
	@NonNull
	@ManyToOne
	private Stock stock;
	@ManyToOne 
	@NonNull
	private Rayon rayon;
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "produit")
	private Set<DetailFacture> detailFactures;
	@NonNull
	@OneToOne
	private DetailProduit detailProduit;
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<Fournisseur>  fournisseurs;
	
	
	



}
