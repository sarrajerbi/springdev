package com.sarra.salledesport.service;

import java.util.List;

import com.sarra.salledesport.entities.Salledesport;

public interface SalledesportService {
	Salledesport saveSalledesport(Salledesport s);
	Salledesport updateSalledesport(Salledesport s);
	void deleteSalledesport(Salledesport s);
	 void deleteSalledesportById(Long id);
	Salledesport getSalledesport(Long id);
	List<Salledesport> getAllSalledesports();

}
