package es.bahia.mascota.dominio;

import javax.persistence.Entity;

@Entity
public class GatoDto extends AnimalDto {

	private String descripcionEspecie = "Felis silvestris catus";

	public String getDescripcionEspecie() {
		return descripcionEspecie;
	}






}
