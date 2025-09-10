package ar.edu.unlam.dominio;

public class Voluntario extends Persona {
	private Integer horasDisponibles;

	public Voluntario(Integer dni, String nombre, Integer edad, Integer horasDisponibles) {
		super(dni, nombre, edad);
		this.horasDisponibles = horasDisponibles;
	}

	public Integer getHorasDisponibles() {
		return this.horasDisponibles;
	}
	
	@Override
	public String toString() {
		return "Soy una persona voluntaria";
	}
	
	@Override
	public void ayudar() {
		System.out.println("Ayudar de asalariado");
	}
}
