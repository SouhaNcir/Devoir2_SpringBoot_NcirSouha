package com.souhancir_voitures.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.souhancir_voitures.entities.Voiture;
import com.souhancir_voitures.repos.VoitureReporsitory;



@Service
public class VoitureServiceImpl implements VoitureService{
	
	@Autowired    
	VoitureReporsitory voitureReporsitory;
	
	
	
	@Override
	public Voiture saveProduit(Voiture v) {
		return voitureReporsitory.save(v);
	}

	@Override
	public Voiture updateVoiture(Voiture v) {
		return voitureReporsitory.save(v);
	}

	@Override
	public void deleteVoiture(Voiture v) {
		 voitureReporsitory.delete(v);
		
	}

	@Override
	public void deleteProduitById(Long id) {
		 voitureReporsitory.deleteById(id);		
	}

	@Override
	public Voiture getVoiture(Long id) {
		 return voitureReporsitory.findById(id).get();
	}

	@Override
	public List<Voiture> getAllVoitures() {
		return  voitureReporsitory.findAll();
	}

	@Override
	public Page<Voiture> getAllVoituresParPage(int page, int size) {
		return voitureReporsitory.findAll(PageRequest.of(page, size));
	}

}
