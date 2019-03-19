/*
 * Copyright 2018
 * 
 * Author: Emilio Domínguez
 * Proyecto: Prueba técnica Bahia - Gestión mascotas
 * 
 */
package es.bahia.mascota.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.Assert;


/**
 * Clase service test mascota.
 */
@RunWith(SpringRunner.class)
@SpringBootTest

public class AnimalServiceTest {

	@Autowired
	AnimalService animalService;
	
	@Test
	public void obtieneAnimalesTest () {
		Assert.assertTrue(animalService.obtieneAnimales().size()>1);
	}
	
	@Test
	public void obtieneDetallesTest () {
		Assert.assertTrue(animalService.obtieneDetallesAnimal(1).getNombre() != null);
	}

}