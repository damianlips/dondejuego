package dominio2;
// Generated 8 oct. 2020 01:08:24 by Hibernate Tools 5.4.14.Final

/**
 * Encuentroliga generated by hbm2java
 */
public class Encuentroliga implements java.io.Serializable {

	private int idencuentro;
	private Encuentro encuentro;

	public Encuentroliga() {
	}

	public Encuentroliga(Encuentro encuentro) {
		this.encuentro = encuentro;
	}

	public int getIdencuentro() {
		return this.idencuentro;
	}

	public void setIdencuentro(int idencuentro) {
		this.idencuentro = idencuentro;
	}

	public Encuentro getEncuentro() {
		return this.encuentro;
	}

	public void setEncuentro(Encuentro encuentro) {
		this.encuentro = encuentro;
	}

}