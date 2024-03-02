package ud3_calculadora_silvia;

public class calculator {

	
	private int resp;
	
	
	public calculator() {
		this.resp = 0;
	}

	public int restar(int a, int b) {

		resp = a - b;
		return resp;
	}

	public int sumar(int a, int b) {

		resp = a + b;
		return resp;
	}
	
	public void clear() {
		resp = 0;
	}
	
	public int dividir(int a, int b) {
		resp = a /b;		
		return resp;
	}
	
	public void OperacionOptima() {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
