package com.souhancir_voitures;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.souhancir_voitures.entities.Voiture;
import com.souhancir_voitures.service.VoitureService;



@SpringBootApplication
public class VoitureNcirSouhaApplication implements CommandLineRunner{
	
	@Autowired	
	VoitureService voitureService;

	public static void main(String[] args) {
		SpringApplication.run(VoitureNcirSouhaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		voitureService.saveProduit(new Voiture( "Audi A4",new Date(11, 2, 18), // 18 Mars 2019
			    "Noir","Diesel","Automatique",87000.0));
		voitureService.saveProduit(new Voiture(  "Hyundai i20",new Date(12, 10, 5), // 5 Novembre 2022
			    "Rouge","Essence","Manuelle",45000.0));
		voitureService.saveProduit(new Voiture("Kia Sportage",new Date(2023, 6, 12),
			    "Blanc","Diesel","Automatique",110000.0 ));
		
		
	}

}
