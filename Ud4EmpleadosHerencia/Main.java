package Ud4EmpleadosHerencia;

public class Main {

	public static void main(String[] args) {
		
		Comercial c1 = new Comercial("Pepe",40, 1000, 400);
		Repartidor r1 =  new Repartidor("zona 3", "Fer", 20, 900);
		
		
		c1.plus();
		r1.plus();
		
		System.out.println(c1);
		System.out.println(r1);
	}
}
