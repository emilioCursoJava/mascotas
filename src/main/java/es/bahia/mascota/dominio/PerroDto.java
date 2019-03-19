package es.bahia.mascota.dominio;

import javax.persistence.Entity;

@Entity
public class PerroDto extends AnimalDto {

	private String descripcionEspecie = "Canis lupus familiaris";

	public String getDescripcionEspecie() {
		return descripcionEspecie;
	}

	
}
