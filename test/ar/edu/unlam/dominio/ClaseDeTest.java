package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ClaseDeTest {

	
	
	/*
	 * cajas ahorro            saldo id cbu propietario
	 * cuentaCorriente         saldo id cbu propietario limiteDescibierto
	 *
	 *
	 * CA depo consultar saldo  - extraer (NO PUEDO EXTRAR MAS QUE LO QUE TIENE EL SALDO)
	 * CC depo consultar saldo  - extraer ( puedo tener un saldo negativo igual al LD)
	 */

	
	@Test
	public void dadoQueExisteUnaCajaAhorroPuedoConsultarSualdoInicial() {
		
		Integer dni=1;
		String apellido="perez";
		Cliente cliente = new Cliente(dni,apellido);
		
		
		Integer cbu= 112233;
		CajaAhorro ca = new CajaAhorro (cbu,cliente);
		
	
		Double valorEsperado=0.0;
		Double valorObtenido=ca.getSaldo();
		
		assertEquals(valorEsperado, valorObtenido);
		
	
	}
	
	@Test
	public void dadoQueExisteUnaCajaAhorroYRealizoUndepositode1000AlConsultarSualdoObtngounValorDe1000() {
		
		Integer dni=1;
		String apellido="perez";
		Cliente cliente = new Cliente(dni,apellido);
		
		
		Integer cbu= 112233;
		CajaAhorro ca = new CajaAhorro (cbu,cliente);
		Double monto=1000.0;
		ca.depositar(monto);
	
		Double valorEsperado=1000.0;
		Double valorObtenido=ca.getSaldo();
		
		assertEquals(valorEsperado, valorObtenido);
		
	
	}

	@Test
	public void dadoQueExisteUnaCajaAhorroConSaldo1000AlExtraer400ObtngounSaaldode600() {
		
		Integer dni=1;
		String apellido="perez";
		Cliente cliente = new Cliente(dni,apellido);
		
		
		Integer cbu= 112233;
		CajaAhorro ca = new CajaAhorro (cbu,cliente);
		Double monto=1000.0;
		ca.depositar(monto);
	
		monto=400.0;
		ca.extraer(monto);
		Double valorEsperado=600.0;
		Double valorObtenido=ca.getSaldo();
		
		assertEquals(valorEsperado, valorObtenido);
		
	
	}
	
	@Test
	public void dadoQueExisteUnaCajaAhorroConSaldo1000AlExtraer1400ONoMePermiteExtraer() {
		
		Integer dni=1;
		String apellido="perez";
		Cliente cliente = new Cliente(dni,apellido);
		
		
		Integer cbu= 112233;
		CajaAhorro ca = new CajaAhorro (cbu,cliente);
		Double monto=1000.0;
		ca.depositar(monto);
	
		monto=1400.0;
		assertFalse(ca.extraer(monto));
		Double valorEsperado=1000.0;
		Double valorObtenido=ca.getSaldo();
		
		assertEquals(valorEsperado, valorObtenido);
		
	
	}
	@Test
	public void dadoQueExisteUnaCuentaCorrienteConSaldo1000YUnDescubiertoDe500AlExtraer1400ObtengounSaldodeMenos400() {
		
		Integer dni=1;
		String apellido="perez";
		Cliente cliente = new Cliente(dni,apellido);
		
		
		Integer cbu= 112233;
		Double limiteDescubierto=500.0;
		CuentaCorriente ca = new CuentaCorriente (cbu,cliente,limiteDescubierto);
		Double monto=1000.0;
		ca.depositar(monto);
	
		monto=1400.0;
		assertTrue(ca.extraer(monto));
		Double valorEsperado=-400.0;
		Double valorObtenido=ca.getSaldo();
		
		assertEquals(valorEsperado, valorObtenido);
		
	
	}
	
}

