package dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="dj.participante")
public class Participante {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="email")
	private String email;
	@ManyToOne
	@JoinColumn(name="idCompetencia")
	private Competencia competencia;
	@OneToOne(mappedBy="participante")
	RenglonTabla renglon = new RenglonTabla();
	
	public Participante(Integer id, String nombre, String email, Competencia competencia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.competencia=competencia;
	}
	public Participante(String nombre, String email, Competencia competencia) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.competencia=competencia;
	}
	public Participante() {
		super();
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
