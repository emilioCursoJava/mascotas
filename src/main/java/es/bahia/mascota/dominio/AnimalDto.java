package es.bahia.mascota.dominio;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;

@Entity
public class AnimalDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private int codigo;
	private String nombre;
	private String estado;
	private String especie;
	private Date fechaNacimiento;
	private int numVisitas;
	private String descripcionEspecie;
	private PropietarioDto propietario;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getNumVisitas() {
		return numVisitas;
	}
	public void setNumVisitas(int numVisitas) {
		this.numVisitas = numVisitas;
	}
	public String getDescripcionEspecie() {
		return descripcionEspecie;
	}
	public void setDescripcionEspecie(String descripcionEspecie) {
		this.descripcionEspecie = descripcionEspecie;
	}
	public PropietarioDto getPropietario() {
		return propietario;
	}
	public void setPropietario(PropietarioDto propietario) {
		this.propietario = propietario;
	}

}
