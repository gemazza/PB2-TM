package ar.edu.unlam.dominio;

public class Cliente {

	private Integer dni;
	private String apellido;

	public Cliente(Integer dni, String apellido) {
		this.apellido = apellido;
		this.dni = dni;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
