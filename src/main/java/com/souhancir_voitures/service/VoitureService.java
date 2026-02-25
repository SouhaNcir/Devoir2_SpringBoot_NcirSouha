package com.souhancir_voitures.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.souhancir_voitures.entities.Voiture;

public interface VoitureService {
	Voiture saveProduit(Voiture v);
	Voiture updateVoiture(Voiture v);
	void deleteVoiture(Voiture v);
	void deleteProduitById(Long id);
	Voiture getVoiture(Long id);
	List<Voiture> getAllVoitures();
	Page<Voiture> getAllVoituresParPage(int page,int size);
	

}
