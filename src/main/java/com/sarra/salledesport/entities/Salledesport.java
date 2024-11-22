package com.sarra.salledesport.entities;
import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Entity; 
import jakarta.persistence.Id;


@Entity
public class Salledesport {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long idsalle;
	private String nomsalle;
	private Double prixsalle;
	private Date datecreation;
	
	
	
	@Override
	public String toString() {
		return "Salledesport [idsalle=" + idsalle + ", nomsalle=" + nomsalle + ", prixsalle=" + prixsalle
				+ ", datecreation=" + datecreation + "]";
	}
	public Salledesport(String nomsalle, double prixsalle, Date datecreation) {
		super();
		this.nomsalle = nomsalle;
		this.prixsalle = prixsalle;
		this.datecreation = datecreation;
	}
	public Salledesport() {
		super();
	}
	public long getIdsalle() {
		return idsalle;
	}
	public void setIdsalle(long idsalle) {
		this.idsalle = idsalle;
	}
	public String getNomsalle() {
		return nomsalle;
	}
	public void setNomsalle(String nomsalle) {
		this.nomsalle = nomsalle;
	}
	public double getPrixsalle() {
		return prixsalle;
	}
	public void setPrixsalle(double prixsalle) {
		this.prixsalle = prixsalle;
	}
	public Date getDatecreation() {
		return datecreation;
	}
	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}
}
