package ar.edu.unlam.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;

public class GestorPeaje {

	private HashSet<Pase> pases;

	private ArrayList<Tarifa> tarifas;

	public GestorPeaje() {
		this.pases = new HashSet<>();
		this.tarifas = new ArrayList<>();
	}
	
	 
	public Boolean agregarPase(Pase pase) {
		// TODO Auto-generated method stub
		return this.pases.add(pase);
	}

	public HashSet<Vehiculo> obtenerTodosLosVehiculos() {

		HashSet<Vehiculo> vehiculos = new HashSet<>();
		for (Pase pase : pases) {
			// if(!vehiculos.contains(pase.getVehiculo()))
			vehiculos.add(pase.getVehiculo());
		}

		return vehiculos;
	}

	public Double obtenerMontoAABonarDeUnVehiculoParaUnMesDado(String patente, int anio, int mes) {

		ArrayList<Pase> pasesParaUnaPatente = obtenerPases(patente, anio, mes);
        Double monto=0.0;
		for (Pase pase : pasesParaUnaPatente) {
			Tarifa tarifa = obtenerTarifa(pase.getFechayHora());
		    monto+=tarifa.getValor();
		   
		}

		
		return monto;
	}

	private Tarifa obtenerTarifa(LocalDateTime fechayHora) {
		
		
		LocalDate fecha = LocalDate.of(fechayHora.getYear(), fechayHora.getMonth(), fechayHora.getDayOfMonth());
		
		return obtenerTarifa(fecha);
	}       

	private Tarifa obtenerTarifa(LocalDate fecha) {
		for(Tarifa tarifa : this.tarifas)
			if (((tarifa.getDesde().minusDays(1l).isBefore(fecha) && tarifa.getHasta() == null) || 	tarifa.getDesde().minusDays(1l).isBefore(fecha) && fecha.minusDays(1).isBefore(tarifa.getHasta())) 
					     ) 
				return tarifa;
				
		return null;
	}

	private ArrayList<Pase> obtenerPases(String patente, Integer anio, Integer mes) {

		ArrayList<Pase> pases = new ArrayList<>();
		for (Pase pase : this.pases) {

			if (pase.getVehiculo().getPatente().equals(patente)
					&& pase.getFechayHora().getMonth().getValue() == mes.intValue()
					&& pase.getFechayHora().getMonth().getValue() == mes.intValue())
				pases.add(pase);

		}
		return pases;
	}

	public Tarifa obtenerTarifaVigente() {
		for (Tarifa tarifa : this.tarifas) {
			if (tarifa.getHasta() == null)
				return tarifa;
		}
		return null;
	}

	public boolean crearNuevaTarifa(LocalDate desde, Double valor) {

		Tarifa tarifaAnterior = this.obtenerTarifaVigente();

 
		
		
		
		// Si No hay ninguna Tarifa encuentra Null
		if (!this.tarifas.isEmpty()) {
			if(!validarFechaDesde(tarifaAnterior.getDesde(),desde))
				return false;
			tarifaAnterior.setHasta(desde.minusDays(1));
		}
		Tarifa tarifa = new Tarifa(desde, valor);

		return this.tarifas.add(tarifa);
	}

	private boolean validarFechaDesde(LocalDate desdeAnterio, LocalDate desdeActual) {
		// TODO Auto-generated method stub
		return desdeAnterio.isBefore(desdeActual);
	}


	public HashSet<Pase> getPases() {
		return pases;
	}

	public void setPases(HashSet<Pase> pases) {
		this.pases = pases;
	}

	public ArrayList<Tarifa> getTarifas() {
		return tarifas;
	}

	public void setTarifas(ArrayList<Tarifa> tarifas) {
		this.tarifas = tarifas;
	}

}
