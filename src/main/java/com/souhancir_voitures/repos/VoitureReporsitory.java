package com.souhancir_voitures.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.souhancir_voitures.entities.Voiture;

public interface VoitureReporsitory extends JpaRepository<Voiture, Long> {

}
