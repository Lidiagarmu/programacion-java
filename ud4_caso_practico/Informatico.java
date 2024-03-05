package ud4_caso_practico;

import java.util.ArrayList;
import java.util.List;

public class Informatico extends Empleado {
	

	//	Atributos
	
	private List<String> skills;
	private int proyectosFinalizados; 
	
	
	//	Construtor por defecto
	
	public Informatico() {
		
	}
	
	//	Constructor con parámetros
	
	public Informatico(String nombre, int edad, double salario, int experiencia, int proyectosFinalizados) {
		super(nombre, edad, salario, experiencia);
		this.skills= new ArrayList<>(); // Lista vacía al inicio
		this.proyectosFinalizados=proyectosFinalizados;
		
	}
	
	//	Métodos getter y setter
	
	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public int getProyectosFinalizados() {
		return proyectosFinalizados;
	}

	public void setProyectosFinalizados(int proyectosFinalizados) {
		this.proyectosFinalizados = proyectosFinalizados;
	}
	
	
	//	Método toString()
	
	@Override
	public String toString() {
		String informacionCompleta = super.toString() + " proyectos finalizados= " + proyectosFinalizados;
		System.out.println(informacionCompleta);
		return informacionCompleta; 
		
	}
	
	
	//	Métodos específicos de la clase
	
	
	// 1) Método para agregar skills o habilidades al empleado y las muestra en terminal
	
	public void addSkill(String skill) {
		this.skills.add(skill);
		System.out.println("habilidades: " + skills);
	}
	
	
	
	// 2) Método para añadir o no el plus al empleado en cuestión
	//	Para esta clase sumaremos el plus al empleado de la clase Informatico cuando cumpla la condición de haber finalizado al menos 4 proyectos y tenga más de 4 años de experiencia
	
	@Override
	public boolean plus() {
		if(super.getExperiencia()>4 && this.proyectosFinalizados >=4){
			double nuevoSalario = super.getSalario() + super.PLUS;
			super.setSalario(nuevoSalario);
			System.out.println("Se le ha añadido el PLUS, al informático/a " + super.getNombre());
			return true;
		}
		return false;
	}

}









