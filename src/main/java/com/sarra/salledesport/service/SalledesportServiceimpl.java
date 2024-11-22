package com.sarra.salledesport.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarra.salledesport.entities.Salledesport;
import com.sarra.salledesport.repos.SalledesportRepository;
@Service
public class SalledesportServiceimpl implements SalledesportService{
	@Autowired
	SalledesportRepository salledesportRepository;
	@Override
	public Salledesport saveSalledesport(Salledesport s) {
		
		return salledesportRepository.save(s);
	}

	@Override
	public Salledesport updateSalledesport(Salledesport s) {
		return salledesportRepository.save(s);
	}

	@Override
	public void deleteSalledesport(Salledesport s) {
		salledesportRepository.delete(s);
	}

	@Override
	public void deleteSalledesportById(Long id) {
		salledesportRepository.deleteById(id);
	}

	@Override
	public Salledesport getSalledesport(Long id) {
		return salledesportRepository.findById(id).get();
	}

	@Override
	public List<Salledesport> getAllSalledesports() {
		return salledesportRepository.findAll();
	}

	

}
