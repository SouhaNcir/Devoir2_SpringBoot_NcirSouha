package com.souhancir_voitures.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.souhancir_voitures.entities.Marque;
import com.souhancir_voitures.entities.Voiture;

public interface VoitureService {
	Voiture saveProduit(Voiture v);
	Voiture updateVoiture(Voiture v);
	void deleteVoiture(Voiture v);
	void deleteProduitById(Long id);
	Voiture getVoiture(Long id);
	List<Voiture> getAllVoitures();
	Page<Voiture> getAllVoituresParPage(int page,int size);
	List<Voiture> findByModele(String model);
	List<Voiture> findByModeleContains(String model);
	List<Voiture> findByModelePrix (String modele, Double prix);
	List<Voiture> findByMarque (Marque marque);
	List<Voiture> findByMarqueIdMar(Long id);
	List<Voiture> findByOrderByModeleAsc();
	List<Voiture> trierVoitureModelePrix();
	

}
