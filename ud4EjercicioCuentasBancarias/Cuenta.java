package ud4EjercicioCuentasBancarias;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;


public class Cuenta {
	
	//------------NOTA: Diagrama UML del ejercicio en carpeta tareas recursos PROGRAMACION---------------
	
	//PRIMERO............
	
	private int numeroCuenta;
	private double saldo;
	private Cliente titular; // hace referencia a la clase Cliente por la relacion que tiene con la de varios a 1 (Cuenta-Cliente)
	private ArrayList <Movimiento> movimientos; //Lista de movimientos. Movimiento va a ser una clase privada de la clase Cuenta
	
	
	
	
	
	
	//SEGUNDO............
	
	////////////////////////////////////////
	// CONSTRUCTORES
	///////////////////////////////////////
	
	
	// con este constructor, cada vez que creemos una cuenta vamos a hacerlo con si numCuenta, saldo y titular porque toda cuenta
	// debe estar asociada a un titular
	
	
	public Cuenta(int numCuenta, double saldo, Cliente titular) {
		this.numeroCuenta=numCuenta;
		this.saldo = saldo;
		this.titular = titular;
		this.movimientos = new ArrayList<Movimiento>(); //ArrayList nuevo pero que en principio no tiene movimientos será nulls
	}
	
	
	
	
	
	//CUARTO.............
	
	
	////////////////////////////////////////
	// GETTERS Y SETTERS	
	///////////////////////////////////////
	
	
	public int getNumeroCuenta() {
		return numeroCuenta;
	}


	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public Cliente getTitular() {
		return titular;
	}


	public void setTitular(Cliente titular) {
		this.titular = titular;
	}


	public ArrayList<Movimiento> getMovimientos() {
		return movimientos;
	}


	public void setMovimientos(ArrayList<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}
	
	
	////////////////////////////////////////
	// METODOS	
	///////////////////////////////////////

	// mñetodos de la clase Cuenta a partir de aqui---------METODOS INGRESO Y RETIRO------------



	public void ingreso(double cantidad) {
		//el ingreso debe ser positivo
		if (cantidad < 0) {
			System.out.println("ERROR: no se puede ingresar una cantidad negativa");
			return;
		} else // se ingresa y se retira
			saldo += cantidad;
		movimientos.add(new Movimiento(LocalDateTime.now(), cantidad,  Movimiento.INGRESO)); //se crea una nueva instancia en movimiento al hacerse un ingreso
	}




	
	public void retiro(float cantidad) {
	//el retiro debe ser positivo
	if (cantidad <0) {
	System.out.println("ERROR: No se puede retirar una cantidad negativa");
	return;
	}
	// si no hay suficiente saldo, podemos acceder a saldo
	if (cantidad>saldo) {
	System.out.println("ERROR: No hay suficiente saldo");
	return;
	
	}
	//se retira y registra
	saldo -= cantidad;
	movimientos.add(new Movimiento(LocalDateTime.now(), cantidad, Movimiento.RETIRO)); //se crea una nueva instancia en movimientos al hacerse un retiro
	
	}
	
	
	

	

	///////////////////////////////////////////////////////
	// METODOS ADICIONALES PARA MOSTRAR LA INFORMACION	
	//////////////////////////////////////////////////////
	
	
	//metodo para ver todos los movimientos
	
	private String obtenerMovimientos() {
		String s = ""; //esta variable nos va a devolver una cadena de texto
		
		for (Movimiento m : movimientos) { //este bucle recorrerá m veces el array movimientos
			s += m.toString() + "\n"; //esto hará que se vayan sumando los datos del metodo toString() a s 
		}
		return s; //nos devuelve todas las iteraciones que serán igual al número de instancias del array movimientos
					// es decirm cuadrará con el número de movimientos que se hayan hecho tanto de retiro como de ingreso
	}
	
	
	//metodo para ver info al completo
	
	public void verDatos() {
		String  s = "";
		s += "Numero de cuenta: " + numeroCuenta + "\n";
		s += "Titular: " + titular.nombreCompleto() + " , domicilio en  " + titular.direcionCompleta() + "\n";
		s += "Saldo actual : " + saldo + "€\n";
		s += "--------------------- MOVIMIENTOS -----------------------\n";
		s += obtenerMovimientos();
		System.out.println(s);
		
	}
	
	// metodo para ver info basica cuenta
	// sera gambien, una forma distinta de ver las diferentes cuentas existentes
	
	@Override
	public String toString() {
		return "Cuenta [numeroCuenta= " + numeroCuenta + " , titular= " + titular.nombreCompleto() + "]";
	}
	
	
	
	
	

	///////////////////////////////////////////////////////
	// CLASE MOVIMIENTO 
	//////////////////////////////////////////////////////
	
	//TERCERO................
	
	//-------Será una clase privada de la clase principal Cuenta ya que por si solas las clases no pueden ser privadas
	//........Además, esta solo podrá ser accesible para la clase Cuenta, relacion de composicion
	
	private class Movimiento { 
		
		private static final byte INGRESO = 0; //en este ejemplo pondremos las clases static privadas porque dentro de la clase Cuenta continuaran siendo visibles
		private static final byte RETIRO = 1;	// pero perfectamente podrian ser public. Aunque solo las vamos a utilizar desde esta clase
		
		
		private LocalDateTime fechaHora;
		private double importe;
		private double saldoFinal;
		private byte tipo;
		
		public Movimiento(LocalDateTime fechaHora, double importe, byte tipo) {
			this.fechaHora=fechaHora;
			this.importe=importe;
			this.saldoFinal= saldo; // no haria falta pasar saldoFinal por el constructor (linea 201) pues lo obtendremos de saldo de la clase cuenta
			this.tipo=tipo;
		}
		
		
		//METODO TOSTRING QUE NOS DEVOLVERA UNA STRING CON LOS DATOS DE UN MOVIMIENTO
		
		 /*  tenemos aqui un ternario: esto quiere decir que dependiendo de si tipo es igual 
		a INGRESO si es true, nos imprimir la primero opcion "INGRESO" en pantalla si es false, la segunda.
		Despues iremos concatenando
		*/
		
		@Override
		public String toString() {
			return (tipo == INGRESO  ? "INGRESO" : "RETIRO")
					+ " [Fecha = " + fechaHora.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM))
					+ " , hora = " + fechaHora.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM))
					+ ", importe = " + importe + "€"
					+ ", saldo = " + saldo + "€"
					+ "]";
							
		}
		

	
	}


}
