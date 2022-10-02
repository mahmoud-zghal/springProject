package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Rayon;

public interface IRayon {
	List<Rayon> retrieveAllRayons();

	Rayon addRayon(Rayon p);

	void deleteRayon(Long id);

	Rayon updateRayon(Rayon u);

	Rayon retrieveRayon(Long id);
}
