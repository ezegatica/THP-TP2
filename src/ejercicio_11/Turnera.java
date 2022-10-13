package ejercicio_11;

public class Turnera {
	private int ultimoValor;
	Turnera() {
		this.ultimoValor = 0;
	}
	
	public void otorgarProximoNumero() {
		this.ultimoValor += 1;
	}
	
	public int obtenerUltimoNumeroOtorgado() {
		return this.ultimoValor;
	}
	
	public void resetearContador() {
		this.ultimoValor = 0;
	}
	
	public void resetearContador(int valor) {
		if (valor > 0) {
			this.ultimoValor = valor;
		} else {
			this.resetearContador();
		}
	}
}
