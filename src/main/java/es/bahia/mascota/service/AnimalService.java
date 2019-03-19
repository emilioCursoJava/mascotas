package es.bahia.mascota.service;

import java.util.List;

import es.bahia.mascota.dominio.AnimalDto;


public interface AnimalService {

	public List<AnimalDto> obtieneAnimales();


	public AnimalDto obtieneDetallesAnimal(int codigo);

}
