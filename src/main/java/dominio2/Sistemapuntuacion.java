package dominio2;
// Generated 8 oct. 2020 01:08:24 by Hibernate Tools 5.4.14.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Sistemapuntuacion generated by hbm2java
 */
public class Sistemapuntuacion implements java.io.Serializable {

	private int id;
	private Set competencias = new HashSet(0);
	private Sistemapuntuacionporpuntuacion sistemapuntuacionporpuntuacion;
	private Sistemapuntuacionporsets sistemapuntuacionporsets;
	private Sistemapuntuacionporresultadofinal sistemapuntuacionporresultadofinal;

	public Sistemapuntuacion() {
	}

	public Sistemapuntuacion(int id) {
		this.id = id;
	}

	public Sistemapuntuacion(int id, Set competencias, Sistemapuntuacionporpuntuacion sistemapuntuacionporpuntuacion,
			Sistemapuntuacionporsets sistemapuntuacionporsets,
			Sistemapuntuacionporresultadofinal sistemapuntuacionporresultadofinal) {
		this.id = id;
		this.competencias = competencias;
		this.sistemapuntuacionporpuntuacion = sistemapuntuacionporpuntuacion;
		this.sistemapuntuacionporsets = sistemapuntuacionporsets;
		this.sistemapuntuacionporresultadofinal = sistemapuntuacionporresultadofinal;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set getCompetencias() {
		return this.competencias;
	}

	public void setCompetencias(Set competencias) {
		this.competencias = competencias;
	}

	public Sistemapuntuacionporpuntuacion getSistemapuntuacionporpuntuacion() {
		return this.sistemapuntuacionporpuntuacion;
	}

	public void setSistemapuntuacionporpuntuacion(Sistemapuntuacionporpuntuacion sistemapuntuacionporpuntuacion) {
		this.sistemapuntuacionporpuntuacion = sistemapuntuacionporpuntuacion;
	}

	public Sistemapuntuacionporsets getSistemapuntuacionporsets() {
		return this.sistemapuntuacionporsets;
	}

	public void setSistemapuntuacionporsets(Sistemapuntuacionporsets sistemapuntuacionporsets) {
		this.sistemapuntuacionporsets = sistemapuntuacionporsets;
	}

	public Sistemapuntuacionporresultadofinal getSistemapuntuacionporresultadofinal() {
		return this.sistemapuntuacionporresultadofinal;
	}

	public void setSistemapuntuacionporresultadofinal(
			Sistemapuntuacionporresultadofinal sistemapuntuacionporresultadofinal) {
		this.sistemapuntuacionporresultadofinal = sistemapuntuacionporresultadofinal;
	}

}
