package ud4_caso_practico;


public class Administrativo extends Empleado{

	//	Atributos
	
	
	private int horasTrabajadas;
	
	//	Constructor por defecto 
	
	public Administrativo() {
		
	}
	
	//	Constructor --> en él, super lo que hace es llamar al constructor de la superclase o clase padre. super simpre debe estar en primer lugar
	
	public Administrativo(String nombre, int edad, double salario, int experiencia, int horasTrabajadas) {
		super(nombre, edad, salario, experiencia);
		this.horasTrabajadas=horasTrabajadas;
	
	}

	
	
	//	Métodos getter y setter
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	//	Métodos específicos de la clase
	
	/*	La clase padre tiene un método abstracto de tipo booleano por lo que me "obliga a crear el siguiente método en cada una de sus clases hijas A esto se le llama polimorfismo. Obliga a sus clases hijas tener
	  el mismo nombre del método y que sea de carácter booleano, aun pudiendo en distintas clases implementarse este método de distintas formas.
	  
	  En este caso, queremos que aumente el salario de Administrativo si cumple la condición de haber trabajado más de 1519 horas anuales estupiladas por la ley y tiene mas de 2 años de experiemcia*/
	
	
	
	@Override
	public boolean plus() {
		
		if(super.getExperiencia() >1 && this.horasTrabajadas>1519) {
			double nuevoSalario = super.getSalario() + super.PLUS;
			super.setSalario(nuevoSalario);
			System.out.println("Se le ha añadido un PLUS, al administrativo/a " + super.getNombre());
			return true;
		}

		return false;
	}

	//	Método toString() --> aqui el toString por defecto que nos ofrece el IDE lo cambiamos y creamos uno llamado al toString de la clase padre accediendo al mismo desde la clase padre
	
	@Override
	public String toString() {
		String informacionCompleta = super.toString() + "horas trabajadas= " + horasTrabajadas;
		System.out.println(informacionCompleta);
		return informacionCompleta; 
	}

}



