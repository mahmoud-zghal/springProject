package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Stock;
import com.example.demo.repository.StockRepository;
@Service
public class StockServiceImpl  implements IStock{
	@Autowired
	private StockRepository stockRepository;


	@Override
	public List<Stock> retrieveAllStocks() {
		// TODO Auto-generated method stub
		List<Stock> Stocks = (List<Stock>) stockRepository.findAll();
		return Stocks;
	}

	@Override
	public Stock addStock(Stock p) {
		// TODO Auto-generated method stub
		stockRepository.save(p);
		return p;
	}

	@Override
	public void deleteStock(Long id) {
		// TODO Auto-generated method stub
		stockRepository.deleteById(id);

	}

	@Override
	public Stock updateStock(Stock u) {
		// TODO Auto-generated method stub
		return stockRepository.save(u);
	}

	@Override
	public Stock retrieveStock(Long id) {
		// TODO Auto-generated method stub
		Stock Stock = stockRepository.findById(id).orElse(null);
		return Stock;
	}
}
