package ud4_caso_practico;

public class Contable extends Empleado {
	

	//	Atributos
	
	private double balanceAnual;
	
	//	Construtor por defecto
	
	public Contable() {
		
	};
	
	
	
	// 	Constructor con parámetros
	
	public Contable(String nombre, int edad, double salario, int experiencia, double balanceAnual) {
		super(nombre, edad, salario, experiencia);
		this.balanceAnual=balanceAnual;
	}
	
	
	//	Métodos getter y setter
	
	public double getBalanceAnual() {
		return balanceAnual;
	}


	public void setBalanceAnual(double balanceAnual) {
		this.balanceAnual = balanceAnual;
	}

	
	//	Método toString()
	
	@Override 
	public String toString() {
		String informacionCompleta = super.toString() + "balance anual= " + balanceAnual;
		System.out.println(informacionCompleta);
		return informacionCompleta; 
	}
	
	
	//	Métodos específicos de la clase
	// 	En este método específico para la clase Contable lo que queremos esque aumente ese PLUS al empleado, cuando este tengo un balance positivo a final de año en sus cuentas de pérdidas y ganacias
	
	@Override 
	public boolean plus() {
		if(balanceAnual > 0) {
			double nuevoSalario = super.getSalario() + super.PLUS;
			super.setSalario(nuevoSalario);
			System.out.println("Se le ha añadido un PLUS, al contable " + super.getNombre());
			return true;
			
		}
		return false;
	}


}

