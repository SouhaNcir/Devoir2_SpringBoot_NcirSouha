package com.souhancir_voitures.entities;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity 
public class Voiture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoiture;
    private String modele;
    private Date dateFabrication;
    private String couleur;
    private String typeCarburant;
    private String boiteVitesse;
    private double prixVoiture;
    
	public Voiture( String modele, Date dateFabrication, String couleur, String typeCarburant,
			String boiteVitesse, double prixVoiture) {
		super();
		this.modele = modele;
		this.dateFabrication = dateFabrication;
		this.couleur = couleur;
		this.typeCarburant = typeCarburant;
		this.boiteVitesse = boiteVitesse;
		this.prixVoiture = prixVoiture;
	}
	

	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getIdVoiture() {
		return idVoiture;
	}

	public void setIdVoiture(Long idVoiture) {
		this.idVoiture = idVoiture;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public Date getDateFabrication() {
		return dateFabrication;
	}

	public void setDateFabrication(Date dateFabrication) {
		this.dateFabrication = dateFabrication;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getTypeCarburant() {
		return typeCarburant;
	}

	public void setTypeCarburant(String typeCarburant) {
		this.typeCarburant = typeCarburant;
	}

	public String getBoiteVitesse() {
		return boiteVitesse;
	}

	public void setBoiteVitesse(String boiteVitesse) {
		this.boiteVitesse = boiteVitesse;
	}

	public double getPrixVoiture() {
		return prixVoiture;
	}

	public void setPrixVoiture(double prixVoiture) {
		this.prixVoiture = prixVoiture;
	}

	@Override
	public String toString() {
		return "Voiture [idVoiture=" + idVoiture + ", modele=" + modele + ", dateFabrication=" + dateFabrication
				+ ", couleur=" + couleur + ", typeCarburant=" + typeCarburant + ", boiteVitesse=" + boiteVitesse
				+ ", prixVoiture=" + prixVoiture + "]";
	}

}
