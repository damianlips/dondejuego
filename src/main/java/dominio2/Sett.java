package dominio2;
// Generated 8 oct. 2020 01:08:24 by Hibernate Tools 5.4.14.Final

/**
 * Sett generated by hbm2java
 */
public class Sett implements java.io.Serializable {

	private int idresultado;
	private Resultadoporsets resultadoporsets;
	private Integer puntajea;
	private Integer puntajeb;

	public Sett() {
	}

	public Sett(Resultadoporsets resultadoporsets) {
		this.resultadoporsets = resultadoporsets;
	}

	public Sett(Resultadoporsets resultadoporsets, Integer puntajea, Integer puntajeb) {
		this.resultadoporsets = resultadoporsets;
		this.puntajea = puntajea;
		this.puntajeb = puntajeb;
	}

	public int getIdresultado() {
		return this.idresultado;
	}

	public void setIdresultado(int idresultado) {
		this.idresultado = idresultado;
	}

	public Resultadoporsets getResultadoporsets() {
		return this.resultadoporsets;
	}

	public void setResultadoporsets(Resultadoporsets resultadoporsets) {
		this.resultadoporsets = resultadoporsets;
	}

	public Integer getPuntajea() {
		return this.puntajea;
	}

	public void setPuntajea(Integer puntajea) {
		this.puntajea = puntajea;
	}

	public Integer getPuntajeb() {
		return this.puntajeb;
	}

	public void setPuntajeb(Integer puntajeb) {
		this.puntajeb = puntajeb;
	}

}
