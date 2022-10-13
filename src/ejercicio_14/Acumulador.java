package ejercicio_14;

public class Acumulador {
	private int valor;

	Acumulador() {
		this.valor = 0;
	}
	
	public void incrementar(int valor) {
		this.valor += valor;
	}
	
	public int obtenerValor() {
		return this.valor;
	}
}
