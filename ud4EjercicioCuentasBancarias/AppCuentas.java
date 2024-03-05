package ud4EjercicioCuentasBancarias;

import java.time.LocalDate;

public class AppCuentas {

	public static void main(String[] args) {
	
		
		Cliente cliente1 = new Cliente("Lidi", "Garcia Muñoz", "c/del Mar","Madrid", LocalDate.of(2000, 1, 1));
		Cliente cliente2 = new Cliente("Lau", "Sanchez Gonzalez", "c/del Sol","Madrid", LocalDate.of(2001, 3, 15));
		
		Cuenta cuenta1 = new Cuenta(( 111), 2000, cliente1);
		Cuenta cuenta2 = new Cuenta(( 222), 3800, cliente2);
		
		
		cuenta1.ingreso(100);
		cuenta1.ingreso(500);
		cuenta1.retiro(120);
		
		
		cuenta2.ingreso(1000);
		cuenta2.retiro(2000);
		cuenta2.retiro(1000);
		
		
		
		System.out.println("Datos de cuenta1 después de operaciones:");
	    cuenta1.verDatos();

	    System.out.println("\nDatos de cuenta2 después de operaciones:");
		cuenta2.verDatos();
	
		

		

	}

}
