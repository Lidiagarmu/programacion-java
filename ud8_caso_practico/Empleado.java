package ud8_caso_practico;

public class Empleado  {
	//-------------------------CREAR CLASE Empleado (apartado 2.b del caso práctico)-----------------------------------
	
	private String NIF;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String direccion;
	private String telefono;
	private String email;
	private double sueldo;
	
	//constructor 
	
	public Empleado(String NIF, String nombre, String apellido1, String apellido2, String direccion, String telefono,
			String email, double sueldo) {
	
		this.NIF = NIF;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.sueldo = sueldo;
	}
	
	//getters y setters 

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	
	
}
