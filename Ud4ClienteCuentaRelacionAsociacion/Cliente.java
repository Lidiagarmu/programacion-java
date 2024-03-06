package Ud4ClienteCuentaRelacionAsociacion;

public class Cliente {
	
	
	//Ejemplo de clase Cliente que sera utilizada en una relacion de asociacion
	
	//atributos
	
	private String nombre;
	private String apellidos;
	private String dni;
	
	//constructor con parametros
	
	public Cliente(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	//metodos getter and setter
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
		
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getDni() {
		return dni;
	}
	
	

}
