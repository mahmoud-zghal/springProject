package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Stock;


public interface IStock {
	List<Stock> retrieveAllStocks();

	Stock addStock(Stock p);

	void deleteStock(Long id);

	Stock updateStock(Stock u);

	Stock retrieveStock(Long id);
}
