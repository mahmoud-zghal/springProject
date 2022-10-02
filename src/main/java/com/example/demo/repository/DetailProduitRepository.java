package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.DetailProduit;
@Repository
public interface DetailProduitRepository  extends JpaRepository<DetailProduit, Long>{

}
