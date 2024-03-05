package Ud4EmpleadosHerencia;

public abstract class Empleado {

	// nos especifica el ejercicio que no se pueden crear objetos o onstancias de
	// esta clase. esto quiere decir
	// que es una clase abtracta

	private String nombre;
	private int edad;
	private double salario;

	public final double PLUS = 300;

	// CONSTRUCTOR

	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	// METODOS GETTER AND SETTER

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// METODO toString();

	@Override
	public String toString() {
		return "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", ";

		// ##########################################
		// CREAMOS UN METODO "ABSTRACTO" el cual va a ser utilizado por las clases hijas
		// de Empleado
		// ########################################

	}

	public abstract boolean plus();
	/*
	 * esto es como decirle: este método hay que crearlo en los demasves de las
	 * pocas veces que veremos un booleano con (;) es decir, este metodo dirá: oye
	 * eres hijo de la clase empleado ? si? pues tienes que crear este método
	 */

}
