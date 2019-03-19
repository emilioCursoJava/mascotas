package es.bahia.mascota.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.bahia.mascota.dao.AnimalDao;
import es.bahia.mascota.dominio.AnimalDto;
import es.bahia.mascota.service.AnimalService;


@Service
public class AnimalServiceImpl implements AnimalService {


	@Autowired
	private AnimalDao animalDao;

	

	@Override
	public List<AnimalDto> obtieneAnimales() {
		
		return animalDao.obtieneAnimales();
	}

	@Override
	public AnimalDto obtieneDetallesAnimal(int codigo) {
		
		return animalDao.obtieneDetallesAnimal(codigo);
	}

}
