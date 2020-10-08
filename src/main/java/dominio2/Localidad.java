package dominio2;
// Generated 8 oct. 2020 01:08:24 by Hibernate Tools 5.4.14.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Localidad generated by hbm2java
 */
public class Localidad implements java.io.Serializable {

	private int id;
	private Provincia provincia;
	private String nombre;
	private Set usuarios = new HashSet(0);

	public Localidad() {
	}

	public Localidad(int id) {
		this.id = id;
	}

	public Localidad(int id, Provincia provincia, String nombre, Set usuarios) {
		this.id = id;
		this.provincia = provincia;
		this.nombre = nombre;
		this.usuarios = usuarios;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Provincia getProvincia() {
		return this.provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set usuarios) {
		this.usuarios = usuarios;
	}

}