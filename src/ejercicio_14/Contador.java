package ejercicio_14;

public class Contador {
	private int valor;
	
	Contador() {
		this.valor = 0;
	}
	
	public void incrementar() {
		this.valor += 1;
	}
	
	public int obtenerValor() {
		return this.valor;
	}
	
}
