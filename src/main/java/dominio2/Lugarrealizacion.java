package dominio2;
// Generated 8 oct. 2020 01:08:24 by Hibernate Tools 5.4.14.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Lugarrealizacion generated by hbm2java
 */
public class Lugarrealizacion implements java.io.Serializable {

	private int id;
	private Usuario usuario;
	private String nombre;
	private String descripcion;
	private Set deportes = new HashSet(0);
	private Set competencias = new HashSet(0);

	public Lugarrealizacion() {
	}

	public Lugarrealizacion(int id) {
		this.id = id;
	}

	public Lugarrealizacion(int id, Usuario usuario, String nombre, String descripcion, Set deportes,
			Set competencias) {
		this.id = id;
		this.usuario = usuario;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.deportes = deportes;
		this.competencias = competencias;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set getDeportes() {
		return this.deportes;
	}

	public void setDeportes(Set deportes) {
		this.deportes = deportes;
	}

	public Set getCompetencias() {
		return this.competencias;
	}

	public void setCompetencias(Set competencias) {
		this.competencias = competencias;
	}

}
