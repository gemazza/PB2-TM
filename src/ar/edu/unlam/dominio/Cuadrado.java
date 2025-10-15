package ar.edu.unlam.dominio;

public class Cuadrado extends Figura{

	
	private Double lado;

	public Cuadrado(String color, Double lado) {
		super(color);
	 	this.lado = lado;
	}

	 
	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}

	public Double calcularPerimetro() {
		// TODO Auto-generated method stub
		return this.lado*4;
	}


	@Override
	public String obtenerDescripcionFigura() {
		// TODO Auto-generated method stub
		return "soy un Cuadrad de color " + getColor()  +  " y lado " + this.lado;
	}


	@Override
	public Double calcularSuperficie() {
		// TODO Auto-generated method stub
		return this.lado*this.lado;
	}

	public String x() {
		return "este es el metodo x del cuadrado";
	}
	
	
}
