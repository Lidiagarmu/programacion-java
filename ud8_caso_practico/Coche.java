package ud8_caso_practico;

public class Coche {
	
	//-------------------------CREAR CLASE Coche (apartado 2.a del caso práctico)-----------------------------------
	
	private String matricula;
	private String color;
	private String modelo;
	private int precio;
	private int kms;
	private String antiguo_propietario;
	private String garantia;
	private String tipo;
	
	//constructor 
	
	public Coche(String matricula, String color, String modelo, int precio, int kms, String antiguo_propietario,
			String garantia, String tipo) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.modelo = modelo;
		this.precio = precio;
		this.kms = kms;
		this.antiguo_propietario = antiguo_propietario;
		this.garantia = garantia;
		this.tipo = tipo;
	}
	
	//getters y setters 

	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public int getKms() {
		return kms;
	}


	public void setKms(int kms) {
		this.kms = kms;
	}


	public String getAntiguo_propietario() {
		return antiguo_propietario;
	}


	public void setAntiguo_propietario(String antiguo_propietario) {
		this.antiguo_propietario = antiguo_propietario;
	}


	public String getGarantia() {
		return garantia;
	}


	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
