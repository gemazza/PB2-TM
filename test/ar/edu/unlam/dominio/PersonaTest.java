package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

import org.junit.Test;

public class PersonaTest {

	@Test
	public void dadoQueExisteUnaPersonaCuandoLaInstancioLosAtributosSePuedenConsultar() {
		Persona persona = new Persona(12345678, "Matias", 30);
		assertEquals(12345678, (int) persona.getDni());
		assertEquals("Matias", persona.getNombre());
		assertEquals(30, (int) persona.getEdad());
		assertEquals("Soy una Persona", persona.toString());
		persona.emitirMensaje();
	}

	@Test
	public void dadoQueExisteUnaPersonaAsalariadoCuandoLaInstancioLosAtributosSePuedenConsultar() {
		Asalariado asalariado = new Asalariado(12345678, "Matias", 30, 1000000D);
		assertEquals(12345678, (int) asalariado.getDni());
		assertEquals("Matias", asalariado.getNombre());
		assertEquals(30, (int) asalariado.getEdad());
		assertEquals("Soy una persona asalariada", asalariado.toString());
		
//		assertEquals(1000000, (double) asalariado.getSalario());
	}

	@Test
	public void dadoQueExisteUnaPersonaVoluntarioCuandoLaInstancioLosAtributosSePuedenConsultar() {
		Voluntario voluntario = new Voluntario(12345678, "Matias", 30, 4);
		assertEquals(12345678, (int) voluntario.getDni());
		assertEquals("Matias", voluntario.getNombre());
		assertEquals(30, (int) voluntario.getEdad());
		assertEquals(4, (int) voluntario.getHorasDisponibles());
		assertEquals("Soy una persona voluntaria", voluntario.toString());
	}
	
	@Test
	public void test() {
		
		Persona asalariado = new Asalariado(12345678, "Matias", 30, 1000000D);
		
		System.out.println(asalariado.toString());
		
		asalariado.ayudar();
		
		Asalariado otroAsalariado = new Asalariado(12345678, "Matias", 30, 1000000D);
		Voluntario voluntario = new Voluntario(12345678, "Matias", 30, 4);
		
		List<Voluntario> voluntarios = new ArrayList<>();
		Set<Voluntario> voluntariosHashSet = new HashSet<>();
		
		List<Voluntario> voluntariosLinkedList = new LinkedList<Voluntario>();
		voluntariosLinkedList = new ArrayList<Voluntario>();
		
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(voluntario);
		personas.add(asalariado);
		
		for (Persona persona : personas) {
			
			if(persona instanceof Voluntario){
				System.out.println("Voluntario: " + ((Voluntario)persona).getHorasDisponibles());
			}
			
		}
		
		ArrayList<Persona> personasDos = new ArrayList<>();
		personasDos.add(asalariado);
		personasDos.add(voluntario);
		
		personasDos.add(otroAsalariado);
		otroAsalariado.getSalario();
		otroAsalariado.getNombre();
		
		((Asalariado)asalariado).getSalario();
		
	}
}
