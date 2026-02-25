package com.souhancir_voitures;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.souhancir_voitures.repos.VoitureReporsitory;
import com.souhancir_voitures.service.VoitureService;
import com.souhancir_voitures.entities.Voiture;

@SpringBootTest
class VoitureNcirSouhaApplicationTests {
	@Autowired
	private VoitureReporsitory VoitureReporsitory;
	private VoitureService voitureService ;

	@Test
	public void testCreateVoiture(){ 
		Voiture voi = new Voiture("Peugeot 208",new Date(),"Blanc",
			    "Diesel","Manuelle",18900.0);
		Voiture saved = VoitureReporsitory.save(voi);
        System.out.println("ID généré = " + saved.getIdVoiture());
	}
	@Test
	public void testFindVoiture(){
		Voiture v = VoitureReporsitory.findById(3L).get();
		System.out.println(v);
	}
	
	@Test
	public void testUpdateVoiture(){
		Voiture v = VoitureReporsitory.findById(3L).get();
		v.setPrixVoiture(500000.0);
		VoitureReporsitory.save(v);
		System.out.println(v);
	}
	
	@Test
	public void testDeleteVoiture() {
		VoitureReporsitory.deleteById(2L);
	}
	
	@Test
	public void testListerTousVoiture() {
		List<Voiture> voits = VoitureReporsitory.findAll();
		for(Voiture v : voits) {
			System.out.println(v);
		}
	}
	
	@Test
	public void testFindByNomVoitureContains() {
		Page<Voiture> voits =voitureService.getAllVoituresParPage(0,2);
		System.out.println(voits.getSize());
		System.out.println(voits.getTotalElements());
	    System.out.println(voits.getTotalPages());
	    // voits.getContent().forEach(v -> {System.out.println(v.toString());});
	    for (Voiture v : voits)
	    {
	    System.out.println(v);
	    }			
		
	}

	

	
}
