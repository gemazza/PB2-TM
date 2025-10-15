package ar.edu.unlam.dominio;

import java.util.Objects;

public abstract class Cuenta {

	public static Integer proximoId=0;
	
	private Integer cbu;
	private Integer id;
	private Cliente cliente;
	private Double saldo;

	public Cuenta(Integer cbu, Cliente cliente) {

		this.id=++proximoId;
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


	@Override
	public int hashCode() {
		 return Objects.hash(cbu);

		 
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Cuenta other = (Cuenta) obj;
		return Objects.equals(cbu, other.cbu);
	}
	


}
