package dominio2;
// Generated 8 oct. 2020 01:08:24 by Hibernate Tools 5.4.14.Final

/**
 * Modalidadeliminatoriasimple generated by hbm2java
 */
public class Modalidadeliminatoriasimple implements java.io.Serializable {

	private int idcompetencia;
	private Modalidad modalidad;

	public Modalidadeliminatoriasimple() {
	}

	public Modalidadeliminatoriasimple(Modalidad modalidad) {
		this.modalidad = modalidad;
	}

	public int getIdcompetencia() {
		return this.idcompetencia;
	}

	public void setIdcompetencia(int idcompetencia) {
		this.idcompetencia = idcompetencia;
	}

	public Modalidad getModalidad() {
		return this.modalidad;
	}

	public void setModalidad(Modalidad modalidad) {
		this.modalidad = modalidad;
	}

}