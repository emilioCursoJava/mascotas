/*
 * Copyright 2018
 * 
 * Author: Emilio Domínguez
 * Proyecto: Prueba técnica Bahia - Gestión mascotas
 * 
 */
package es.bahia.mascota.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.bahia.mascota.dominio.AnimalDto;
import es.bahia.mascota.service.AnimalService;


/**
 * Clase MascotaController.
 */
@Controller
@Scope("session")
public class MascotaController {
	
	/** Messages. */
	@Autowired
	MessageSource messages;

	
	@Autowired
	AnimalService animalService;

	Logger logger = LoggerFactory.getLogger(MascotaController.class);

	/**
	 *
	 * @param codigo codigo mascota
	 * @param model el model
	 * @param locale el locale
	 * @param session el session
	 * @return string
	 */
	

	@RequestMapping(value = "/consultaDetalle", method = {RequestMethod.GET})
	public String consultaDetalle(Integer codigo, Model model, Locale locale,HttpSession session) {
			logger.info("Se esta accediendo a la página /consultaDetalle para consultar la mascota con código :" + codigo);

			AnimalDto animal = animalService.obtieneDetallesAnimal(codigo);
			model.addAttribute("animal", animal);
			return "detalleMascota";
		}



	
}
