package dominio2;
// Generated 8 oct. 2020 01:08:24 by Hibernate Tools 5.4.14.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Encuentroeliminatoriadoble generated by hbm2java
 */
public class Encuentroeliminatoriadoble implements java.io.Serializable {

	private int idencuentro;
	private Encuentro encuentro;
	private Encuentroeliminatoriadoble encuentroeliminatoriadobleByDestinoperdedor;
	private Encuentroeliminatoriadoble encuentroeliminatoriadobleByDestinoganador;
	private Set encuentroeliminatoriadoblesForDestinoperdedor = new HashSet(0);
	private Set encuentroeliminatoriadoblesForDestinoganador = new HashSet(0);

	public Encuentroeliminatoriadoble() {
	}

	public Encuentroeliminatoriadoble(Encuentro encuentro) {
		this.encuentro = encuentro;
	}

	public Encuentroeliminatoriadoble(Encuentro encuentro,
			Encuentroeliminatoriadoble encuentroeliminatoriadobleByDestinoperdedor,
			Encuentroeliminatoriadoble encuentroeliminatoriadobleByDestinoganador,
			Set encuentroeliminatoriadoblesForDestinoperdedor, Set encuentroeliminatoriadoblesForDestinoganador) {
		this.encuentro = encuentro;
		this.encuentroeliminatoriadobleByDestinoperdedor = encuentroeliminatoriadobleByDestinoperdedor;
		this.encuentroeliminatoriadobleByDestinoganador = encuentroeliminatoriadobleByDestinoganador;
		this.encuentroeliminatoriadoblesForDestinoperdedor = encuentroeliminatoriadoblesForDestinoperdedor;
		this.encuentroeliminatoriadoblesForDestinoganador = encuentroeliminatoriadoblesForDestinoganador;
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

	public Encuentroeliminatoriadoble getEncuentroeliminatoriadobleByDestinoperdedor() {
		return this.encuentroeliminatoriadobleByDestinoperdedor;
	}

	public void setEncuentroeliminatoriadobleByDestinoperdedor(
			Encuentroeliminatoriadoble encuentroeliminatoriadobleByDestinoperdedor) {
		this.encuentroeliminatoriadobleByDestinoperdedor = encuentroeliminatoriadobleByDestinoperdedor;
	}

	public Encuentroeliminatoriadoble getEncuentroeliminatoriadobleByDestinoganador() {
		return this.encuentroeliminatoriadobleByDestinoganador;
	}

	public void setEncuentroeliminatoriadobleByDestinoganador(
			Encuentroeliminatoriadoble encuentroeliminatoriadobleByDestinoganador) {
		this.encuentroeliminatoriadobleByDestinoganador = encuentroeliminatoriadobleByDestinoganador;
	}

	public Set getEncuentroeliminatoriadoblesForDestinoperdedor() {
		return this.encuentroeliminatoriadoblesForDestinoperdedor;
	}

	public void setEncuentroeliminatoriadoblesForDestinoperdedor(Set encuentroeliminatoriadoblesForDestinoperdedor) {
		this.encuentroeliminatoriadoblesForDestinoperdedor = encuentroeliminatoriadoblesForDestinoperdedor;
	}

	public Set getEncuentroeliminatoriadoblesForDestinoganador() {
		return this.encuentroeliminatoriadoblesForDestinoganador;
	}

	public void setEncuentroeliminatoriadoblesForDestinoganador(Set encuentroeliminatoriadoblesForDestinoganador) {
		this.encuentroeliminatoriadoblesForDestinoganador = encuentroeliminatoriadoblesForDestinoganador;
	}

}
