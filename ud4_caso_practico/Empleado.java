package ud4_caso_practico;

public abstract class Empleado {
	
	//Al ser una clase genérica de la cual no vamos a crear instancias, la haría clase abstracta 
	

	
	//	Atributos
	
	private String nombre;
	private int edad;
	private double salario;
	private int experiencia;

	public final double PLUS = 500;
	
	// Los constructores siempre van a ser públicos 
	
	//	Construtor por defecto, sin parámetros 
	
	public Empleado() {
		
	}
	
	// 	Constructor con parámetros
	
	public Empleado(String nombre, int edad, double salario, int experiencia) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.experiencia=experiencia;
	}


	
	//	Métodos getter y setter
	
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
	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	
	
	//	Método toString()
	
	// METODO toString();
	//En este método toString() de la clase padre no queremos que nos imprima nada en pantalla. De ser asi y añadirle un system.out.print hariamos que imprimiera tanto este toString como el de la clase hija. Seria redundante
	//Además, esta clase la tenemos como plantilla para crear a sus hijas. De esta clase empleado ni queremos ni podemos isntanciar objetos al haberla declarado abstracta
	
	}

	@Override
	public String toString() {
		String informacionCompleta = "nombre= " + nombre + ", edad= " + edad + ", salario= " + salario + ", experiencia= " + experiencia + ", "; //este ", " final es para añadir los toString específicos de las clases hijas al llamar a sus métodos toString()
		return informacionCompleta;  
	
	}

	// CREAMOS UN METODO "ABSTRACTO" el cual va a ser utilizado por las clases hijas de Empleado
	//con este método al crear las clases hijas, las estaríamos "obligando" a crear este método a cada una de ellas. Será el mismo método pero puede actuar diferente o dar diferente resultado
	//este método lo que va a hacer en cada clase hija es, según unas condiciones dadas, sumar o no este plus al empleado en cuestión
	
	public abstract boolean plus();
	
	

	
	
	
	

}
