package ar.edu.unlam.dominio;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;

import org.junit.Test;

public class TestFigura {

	@Test
	public void dadoQueExisteUncuadradoDeColorRojoYLadoCalcularSuPerietro() {

		Double lado = 5.0;
		String color = "Rojo";
		Cuadrado cuadrado = new Cuadrado(color, lado);

		Double valorEsperado = 20.0;
		Double valorObtenido = cuadrado.calcularPerimetro();
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void dadoQueExisteUnCirculoDeColorRojoYRdio10CalcularSuPerietro() {

		Double radio = 10.0;
		String color = "Rojo";
		Circulo circulo = new Circulo(color, radio);
		// Figura f =new Cuadrado(color,5.0);
		Double valorEsperado = 62.83;
		Double valorObtenido = circulo.calcularPerimetro();
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}

	@Test
	public void xxx() {

		Figura c1 = new Circulo("rojo", 5.0);
		Figura c2 = new Circulo("Amarillo", 1.0);
		Figura cuadrado1 = new Cuadrado("verde", 8.0);
		Figura cuadrado2 = new Cuadrado("azul", 11.0);

		HashSet<Figura> figuras = new HashSet<>();

		figuras.add(cuadrado1);
		figuras.add(cuadrado2);
		figuras.add(c2);
		figuras.add(c1);

		for (Figura figura : figuras) {

			System.out.println(figura.obtenerDescripcionFigura());

			if (figura instanceof Cuadrado)
				System.out.println(((Cuadrado) figura).x());
//			if (figura instanceof Circulo)
			//	System.out.println(((Circulo) figura).y());

		}

	}
}
