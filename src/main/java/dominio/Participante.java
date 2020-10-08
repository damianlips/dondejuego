package dominio;

public class Participante {
	private Integer id;
	private String nombre;
	private String email;
	public Participante(Integer id, String nombre, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
	}
	public Participante(Integer id) {
		super();
		this.id = id;
		this.nombre = null;
		this.email = null;
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
