package es.bahia.mascota.dominio;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class PropietarioDto implements Serializable {

	private String nombre;
	private String apellidos;
	
	
	
	public PropietarioDto(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


}
