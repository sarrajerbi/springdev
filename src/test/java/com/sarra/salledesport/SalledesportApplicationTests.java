package com.sarra.salledesport;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sarra.salledesport.entities.Salledesport;
import com.sarra.salledesport.repos.SalledesportRepository;

@SpringBootTest
class SalledesportApplicationTests {

	@Autowired
	private SalledesportRepository salledesportRepository;
	@Test
	public void testCreateProduit() {
	 Salledesport salle = new Salledesport("fitness",80,new Date());
	 salledesportRepository.save(salle);
	}
	@Test
	public void testFindSalle()
	{
		Salledesport s = salledesportRepository.findById(1L).get();
	System.out.println(s);
	}
	@Test
	public void testUpdateSalle()
	{
		Salledesport s = salledesportRepository.findById(1L).get();
	s.setPrixsalle(100);
	salledesportRepository.save(s);
	}
	@Test
	public void testDeleteSalle() {
		salledesportRepository.deleteById(1L);;
		
	}
	@Test
	public void testListerToussalle() {
		List<Salledesport> salles = salledesportRepository.findAll();
		for (Salledesport s : salles) {
			System.out.println(s);
		}
	}



}
