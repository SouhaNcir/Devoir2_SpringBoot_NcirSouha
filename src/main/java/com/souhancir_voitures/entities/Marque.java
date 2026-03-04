package com.souhancir_voitures.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor@Entity

public class Marque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMar;
	private String nomMar;
	private String paysOrigine;
	
	@OneToMany(mappedBy = "marque")
	private List<Voiture> voitures; 
	
	
	public List<Voiture> getVoitures() {
		return voitures;
	}

	public void setVoitures(List<Voiture> voitures) {
		this.voitures = voitures;
	}

	public Marque() {
		super();
		
	}
	
	public Long getIdMar() {
		return idMar;
	}
	public void setIdMar(Long idMar) {
		this.idMar = idMar;
	}
	public String getNomMar() {
		return nomMar;
	}
	public void setNomMar(String nomMar) {
		this.nomMar = nomMar;
	}
	
	public String getPaysOrigine() {
		return paysOrigine;
	}
	public void setPaysOrigine(String paysOrigine) {
		this.paysOrigine = paysOrigine;
	}
	
	
	

}
