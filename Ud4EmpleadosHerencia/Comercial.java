package Ud4EmpleadosHerencia;

public class Comercial extends Empleado {
	
	
	private double comision;
	
	
	//CONSTRUCTOR --> en él, super lo que hace es llamar al constructor de la superclase o clase padre
	//super simpre debe estar en primer lugar
	
	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision=comision;
	
	}
	

	// metodos getter y setter
		
	
	public double getComision() {
		return comision;
	}
	


	public void setComision(double comision) {
		this.comision = comision;
	}
	
	

	// metodo toString() --> aqui el toString por defecto le cambiamos y lo hacemos llamando al toString de la clase padre accediendo a el de la siguiente manera
	
	@Override
	public String toString() {
		return super.toString() + "comision=" + comision ;
	}




	/*Me ha obligado a generar este método plus. Esto es polimorfismo. Obligan a tener el mismo nombre del metodo, que sea de caracter
	 * booleano y demás y que en distintas clases se implemente de distintas formas
	 * */
	
		// METODO que dice que si comercial tiene mas de 30 años y comision de mas de 200 entonces aumente el salario sumandole un plus a Comercial
	@Override
	public boolean plus() {
		
		if(super.getEdad()>30 && this.comision>200) {
			double nuevoSalario = super.getSalario() + super.PLUS;
			super.setSalario(nuevoSalario);
			System.out.println("Se le ha añadido el PLUS, al empleado " + super.getNombre());
			return true;
		}
		return false; // si lo pusiesemos a void no haria falta poner los return ni true ni false
		
		
	} 
	
	
	
	
	

}
