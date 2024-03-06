package Ud4ClienteCuentaRelacionAsociacion;



public class CuentaBancaria {
	
	//ejemplo de clasd CuentaBancaria, existe una relacion de asociacion entre clase Cliente y esta
	//esta relacion podria ser de composicion o agregacion dependera de la dependencia de una clase con otra segun el contexto
	
	
	//Atributos
	
	private String numCuenta;
	private long saldo;
	private Cliente titular;
	
	//Contructor con parametros
	
	public CuentaBancaria(String numCuenta, long saldo, Cliente titular) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.titular = titular;
	
	}
	
	//Metodos getter and setter
	
	
	public String getNumCuenta() {
		return numCuenta;
	}
	
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	
	public long getSaldo() {
		return saldo;
	}
	
	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}
	
	public Cliente getTitular () {
		return titular;
		
	}
	
	public void setTitular (Cliente titular) {
		this.titular= titular;
	}

}
