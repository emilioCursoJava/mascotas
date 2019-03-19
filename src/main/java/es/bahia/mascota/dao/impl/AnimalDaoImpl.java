package es.bahia.mascota.dao.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import es.bahia.mascota.dao.AnimalDao;
import es.bahia.mascota.dominio.AnimalDto;
import es.bahia.mascota.dominio.GatoDto;
import es.bahia.mascota.dominio.PerroDto;
import es.bahia.mascota.dominio.PropietarioDto;

/**
 * Clase de implementación de la interfaz que simula los datos
 * 
 */
@Repository
public class AnimalDaoImpl implements AnimalDao {

	@Override
	public List<AnimalDto> obtieneAnimales() {
		GatoDto a1 = new GatoDto();
		a1.setCodigo(1);
		a1.setEspecie("Gato");
		a1.setEstado("INGRESADO");
		a1.setFechaNacimiento(new Date(0));
		a1.setNombre("BRUMA");
		a1.setNumVisitas(2);
		PropietarioDto prop = new PropietarioDto("Emilio", "Dominguez Sanchez");
		a1.setPropietario(prop);

		GatoDto a2 = new GatoDto();
		a2.setCodigo(2);
		a2.setEspecie("Gato");
		a2.setEstado("OPERADO");
		a2.setFechaNacimiento(new Date(0));
		a2.setNombre("RAISA");
		a2.setNumVisitas(2);
		PropietarioDto prop3 = new PropietarioDto("Emilio3", "Dominguez Sanchez");
		a2.setPropietario(prop3);

		PerroDto p1 = new PerroDto();
		p1.setCodigo(3);
		p1.setEspecie("Perro");
		p1.setEstado("BIEN");
		p1.setFechaNacimiento(new Date(0));
		p1.setNombre("PERDI");
		p1.setNumVisitas(5);
		PropietarioDto prop2 = new PropietarioDto("Emilio2", "Dominguez Sanchez");
		p1.setPropietario(prop2);

		PerroDto p2 = new PerroDto();
		p2.setCodigo(4);
		p2.setEspecie("Perro");
		p2.setEstado("REGULAR");
		p2.setFechaNacimiento(new Date(0));
		p2.setNombre("BRUMA");
		p2.setNumVisitas(6);
		p2.setPropietario(prop3);

		List<AnimalDto> animales = new ArrayList<AnimalDto>();
		animales.add(a1);
		animales.add(a2);
		animales.add(p1);
		animales.add(p2);
		return animales;

	}

	@Override
	public AnimalDto obtieneDetallesAnimal(int codigo) {
		switch (codigo) {
		case 1:
			GatoDto a1 = new GatoDto();
			a1.setCodigo(1);
			a1.setEspecie("Gato");
			a1.setEstado("INGRESADO");
			a1.setFechaNacimiento(new Date(0));
			a1.setNombre("BRUMA");
			a1.setNumVisitas(2);
			PropietarioDto prop = new PropietarioDto("Emilio", "Dominguez Sanchez");
			a1.setPropietario(prop);
			return a1;
		case 2:
			GatoDto a2 = new GatoDto();
			a2.setCodigo(2);
			a2.setEspecie("Gato");
			a2.setEstado("OPERADO");
			a2.setFechaNacimiento(new Date(0));
			a2.setNombre("RAISA");
			a2.setNumVisitas(2);
			PropietarioDto prop3 = new PropietarioDto("Emilio3", "Dominguez Sanchez");
			a2.setPropietario(prop3);
			return a2;
		case 3:
			PerroDto p1 = new PerroDto();
			p1.setCodigo(3);
			p1.setEspecie("Perro");
			p1.setEstado("BIEN");
			p1.setFechaNacimiento(new Date(0));
			p1.setNombre("PERDI");
			p1.setNumVisitas(5);
			PropietarioDto prop2 = new PropietarioDto("Emilio2", "Dominguez Sanchez");
			p1.setPropietario(prop2);
			return p1;
		case 4:
			PerroDto p2 = new PerroDto();
			p2.setCodigo(4);
			p2.setEspecie("Perro");
			p2.setEstado("REGULAR");
			p2.setFechaNacimiento(new Date(0));
			p2.setNombre("BRUMA");
			p2.setNumVisitas(6);
			PropietarioDto prop4 = new PropietarioDto("Emilio4", "Dominguez Sanchez");
			p2.setPropietario(prop4);
			return p2;
		default:
			return null;
		}
	}
}
