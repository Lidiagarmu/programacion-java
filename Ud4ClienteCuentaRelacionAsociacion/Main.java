package Ud4ClienteCuentaRelacionAsociacion;



public class Main {

	public static void main(String[] args) {

		/*este ejemplo muestra como se crea un objeto de tipo Cliente, se inicializa con datos y se pasa como parametro en el 
		constructor de la clase CuentaBancaria */
		
		Cliente cliente1 = new Cliente("Lidia", "Garcia", "12345677H");
		CuentaBancaria cuenta1 = new CuentaBancaria("CAIX333", 1700, cliente1);
		
		
		
		
		System.out.println("Datos de la cuenta bancaria");
		
		System.out.println("----------------------------\n" );
		
		System.out.println("Número de cuenta: "+  cuenta1.getNumCuenta() + "\n");
		
		System.out.println("Saldo: "+ cuenta1.getSaldo() +"\n");  
		
		System.out.println("\nDatos del titular:");
		
		System.out.println("-----------------\n" );
		
	    System.out.println("Nombre: "+ cuenta1.getTitular().getNombre() + "\n");
	    
		System.out.println("Apellidos: "+ cuenta1.getTitular().getApellidos() + "\n");
		
		System.out.println("DNI: "+ cuenta1.getTitular().getDni() + "\n");
				     
	}
	

}
