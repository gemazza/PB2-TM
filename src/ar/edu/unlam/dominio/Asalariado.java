package ar.edu.unlam.dominio;

public class Asalariado extends Persona {

	private Double salario;
	
	public Asalariado(Integer dni, String nombre, Integer edad, Double salario) {
		super(dni, nombre, edad);
		this.salario = salario;
	}

	public Double getSalario() {
		return this.salario;
	}

	@Override
	public String toString() {
		
		return super.toString() + " Soy una persona asalariada";
	}
	
	@Override
	public void ayudar() {
		System.out.println("Ayudar de asalariado");
	}
	
}
