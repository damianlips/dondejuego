package dominio2;
// Generated 8 oct. 2020 01:08:24 by Hibernate Tools 5.4.14.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Fecha generated by hbm2java
 */
public class Fecha implements java.io.Serializable {

	private int id;
	private Fixture fixture;
	private Integer tiporonda;
	private Set encuentros = new HashSet(0);

	public Fecha() {
	}

	public Fecha(int id) {
		this.id = id;
	}

	public Fecha(int id, Fixture fixture, Integer tiporonda, Set encuentros) {
		this.id = id;
		this.fixture = fixture;
		this.tiporonda = tiporonda;
		this.encuentros = encuentros;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Fixture getFixture() {
		return this.fixture;
	}

	public void setFixture(Fixture fixture) {
		this.fixture = fixture;
	}

	public Integer getTiporonda() {
		return this.tiporonda;
	}

	public void setTiporonda(Integer tiporonda) {
		this.tiporonda = tiporonda;
	}

	public Set getEncuentros() {
		return this.encuentros;
	}

	public void setEncuentros(Set encuentros) {
		this.encuentros = encuentros;
	}

}
