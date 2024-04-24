package ud7_caso1;

public class CocheSegundaMano extends Coche implements Vendible {
	
	
	//atributo específico de la clase
	
	private String antiguoPropietario;
	
	
	//constructor sobreescrito parcialmente de la clase padre 'Coche'
	
	public CocheSegundaMano(String matricula, String color, String modelo, int precio, int kmRecorridos,String antiguoPropietario) {
		super(matricula,color,modelo,precio,kmRecorridos);
		this.antiguoPropietario = antiguoPropietario;
	}

	
	
	//getters y setters
	
	public String getAntiguoPropietario() {
		return antiguoPropietario;
	}

	public void setAntiguoPropietario(String antiguoPropietario) {
		this.antiguoPropietario = antiguoPropietario;
	}
	
	
	
	//metodo toString sobreescrito parcialmente de la clase padre 'Coche'
	
	@Override
	public String toString() {
		return super.toString() + "\nAntiguo propietario: " + antiguoPropietario;
	}

	
	
	//método que obliga a implementar la interfaz Vendible, al cual vamos a darle un comportamiento especifico para esta clase

	@Override
	public void vender() {
		System.out.println("El coche de segunda mano con matrícula: " + getMatricula()+ " se ha vendido");
		
	}



	//método que obliga a implementar la clase padre Coche 
	
	@Override
	public void reservarCoche() {
		System.out.println("Cliente ha reservado el coche de segunda mano: " + getModelo() + " con matricula: " + getMatricula());
		
	}
	
	
	

}
