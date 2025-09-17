package ar.edu.unlam.dominio;

public abstract class Cuenta {
	
	private Integer cbu;
	private Cliente cliente;
	private Double saldo;

	public Cuenta(Integer cbu, Cliente cliente) {

		this.cbu = cbu;
		this.cliente = cliente;
		this.saldo = 0.0;

	}

	 
	public Double getSaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
	}

	public void depositar(Double monto) {
		this.saldo += monto;

	}





	public Integer getCbu() {
		return cbu;
	}


	public void setCbu(Integer cbu) {
		this.cbu = cbu;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	


}
