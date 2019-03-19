package es.bahia.mascota.dao;

import java.util.List;

import es.bahia.mascota.dominio.AnimalDto;



/**
 * 
 * Interface que accede a los datos de los animales
 * 
 */
public interface AnimalDao {

	
	public List<AnimalDto> obtieneAnimales();

	
	public AnimalDto obtieneDetallesAnimal(int codigo);

	
}
