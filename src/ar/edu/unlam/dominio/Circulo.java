package ar.edu.unlam.dominio;

public class Circulo extends Figura{

	 private Double radio;

	public Circulo(String color, Double radio) {
		super(color);
		this.radio=radio;
		 
	}

	public Double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI*this.radio;
	}

	@Override
	public Double calcularSuperficie() {
		// TODO t-generated method stub
		return Math.PI*this.radio*this.radio;
	}

	@Override
	public String obtenerDescripcionFigura() {
		// TODO Auto-generated method stub
		return "soy un circulo de color " + getColor() + " y radio " + this.radio ;
	}

	public String y() {
		return "este es el metodo y del circulo";
	}
}
