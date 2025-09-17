package ar.edu.unlam.dominio;

public class CajaAhorro extends Cuenta implements Iextraible {

	public CajaAhorro(Integer cbu, Cliente cliente) {
		super(cbu, cliente);
	}

	

	@Override
	public Boolean extraer(Double monto) {

		Boolean seExtrajo = false;
		if (monto <= this.getSaldo()) {
			this.setSaldo(getSaldo()-monto);
			seExtrajo = true;
		}
		return seExtrajo;
	}
	
	


}
