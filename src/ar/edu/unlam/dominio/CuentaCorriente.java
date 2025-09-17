package ar.edu.unlam.dominio;

public class CuentaCorriente extends Cuenta implements Iextraible,ICancelables {
 
	private Double limiteDescubierto;
	private boolean estaActiva;

	public CuentaCorriente(Integer cbu, Cliente cliente, Double limiteDescubierto) {


		super(cbu, cliente);
		this.limiteDescubierto = limiteDescubierto;
		this.estaActiva=true;
	}

	 

	
 

	@Override
	public Boolean extraer(Double monto) {

		Boolean seExtrajo = false;
		if (monto <= super.getSaldo() + this.limiteDescubierto) {
			Double  montoAAcutalizar  = getSaldo() - monto;
			super.setSaldo(montoAAcutalizar);
			seExtrajo = true;
		}
		return seExtrajo;
	}






	@Override
	public void cancelar() {
this.estaActiva =false;		
	}

}
