/*
 * Copyright 2018
 * 
 * Author: Emilio Domínguez
 * Proyecto: Prueba técnica Bahia - Gestión mascotas
 * 
 */
package es.bahia.mascota.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.bahia.mascota.dominio.AnimalDto;
import es.bahia.mascota.service.AnimalService;

/**
 * Clase IndexController.
 */
@Controller
@Scope("session")
public class IndexController {
	
	@Autowired
	AnimalService animalService;
	Logger logger = LoggerFactory.getLogger(IndexController.class);

	/**
	 * Llamada a Index cuando entramos a la pagina principal
	 *
	 * @param model el model
	 * @param session el session
	 * @return string
	 */
	@RequestMapping(value = { "/", "/mascota" }, method = RequestMethod.GET)
	String index(Model model,HttpSession  session) {
		logger.info("Se esta accediendo a la página /mascota o index para consultar el listado de mascotas");

		List<AnimalDto> lista = animalService.obtieneAnimales();
		model.addAttribute("listaAnimales", lista);
		return "index";
	}

	
}

