package com.souhancir_voitures.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.souhancir_voitures.entities.Marque;
import com.souhancir_voitures.entities.Voiture;
import com.souhancir_voitures.repos.VoitureRepository;



@Service
public class VoitureServiceImpl implements VoitureService{
	
	@Autowired    
	VoitureRepository voitureRepository;
	
	
	
	@Override
	public Voiture saveProduit(Voiture v) {
		return voitureRepository.save(v);
	}

	@Override
	public Voiture updateVoiture(Voiture v) {
		return voitureRepository.save(v);
	}

	@Override
	public void deleteVoiture(Voiture v) {
		voitureRepository.delete(v);
		
	}

	@Override
	public void deleteProduitById(Long id) {
		voitureRepository.deleteById(id);		
	}

	@Override
	public Voiture getVoiture(Long id) {
		 return voitureRepository.findById(id).get();
	}

	@Override
	public List<Voiture> getAllVoitures() {
		return  voitureRepository.findAll();
	}

	@Override
	public Page<Voiture> getAllVoituresParPage(int page, int size) {
		return voitureRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public List<Voiture> findByModele(String model) {
		return voitureRepository.findByModele(model);
	}

	@Override
	public List<Voiture> findByModeleContains(String model) {
		return voitureRepository.findByModeleContains(model);
	}

	@Override
	public List<Voiture> findByModelePrix(String modele, Double prix) {
		return voitureRepository.findByModelePrix(modele, prix);
	}

	@Override
	public List<Voiture> findByMarque(Marque marque) {
		return voitureRepository.findByMarque(marque);
	}

	@Override
	public List<Voiture> findByMarqueIdMar(Long id) {
		return voitureRepository.findByMarqueIdMar(id);
	}

	@Override
	public List<Voiture> findByOrderByModeleAsc() {
		return voitureRepository.findByOrderByModeleAsc();
	}

	@Override
	public List<Voiture> trierVoitureModelePrix() {
		return voitureRepository.trierVoitureModelePrix();
	}

}
