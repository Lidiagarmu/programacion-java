package ud7_caso1;

public class CocheNuevo extends Coche implements Vendible{
	
	//atributo especifico de la clase hija
	
	private int duracionGarantia; //será en meses

	
	//constructor sobreescrito parcialmente de la clase padre 'Coche'
	
	
	public CocheNuevo(String matricula, String color, String modelo, int precio, int kmRecorridos, int garantiaEnMeses) {
		super(matricula,color,modelo,precio,kmRecorridos);
		this.duracionGarantia = garantiaEnMeses;
	}


	//getters y setters
	
	public int getDuracionGarantia() {
		return duracionGarantia;
	}


	public void setDuracionGarantia(int duracionGarantia) {
		this.duracionGarantia = duracionGarantia;
	}

	
	//metodo toString sobreescrito parcialmente de la clase padre 'Coche'

	@Override
	public String toString() {
		return super.toString() + "\nCoche nuevo con garantía de " + duracionGarantia + " meses";
	}

	
	
	//método que obliga a implementar la interfaz Vendible, al cual vamos a darle un comportamiento especifico para esta clase

	@Override
	public void vender() {
		System.out.println("El coche nuevo con matrícula: " + getMatricula() + " se ha vendido");
		
	}

	
	//método que obliga a implementar la clase padre Coche 

	@Override
	public void reservarCoche() {
		System.out.println("Cliente ha reservado el coche nuevo: " + getModelo() + " con matricula: " + getMatricula());
		
	}
	

	
	

}
