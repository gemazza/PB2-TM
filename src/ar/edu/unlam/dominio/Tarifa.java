package ar.edu.unlam.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;
 
public class Tarifa {
	public static Integer cantidadDeTarifas =0;
	private  Integer id =0;
	private LocalDate desde;
	private LocalDate  hasta;
	private Double valor;
	public Tarifa(LocalDate desde, Double valor) {

		this.id = ++cantidadDeTarifas;
		this.desde=desde;
		this.hasta=null;
		this.valor=valor;

	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getDesde() {
		return desde;
	}
	public void setDesde(LocalDate  desde) {
		this.desde = desde;
	}
	public LocalDate  getHasta() {
		return hasta;
	}
	public void setHasta(LocalDate  hasta) {
		this.hasta = hasta;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	

}

//        desde    hasta

// 1   1/7/2025  31/7/2025    valor 1000.0
// 2   1/8/2025  2/9/2025       valor 1100.0
// 3   3/9/2025   null





