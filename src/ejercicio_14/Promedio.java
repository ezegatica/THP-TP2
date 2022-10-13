package ejercicio_14;

public class Promedio {
	private Contador contador;
	private Acumulador acumulador;

	Promedio() {
		this.contador = new Contador();
		this.acumulador = new Acumulador();
	}

	public void incrementar(int valor) {
		this.acumulador.incrementar(valor);
		this.contador.incrementar();
	}

	public int obtenerValor() {
		if (this.contador.obtenerValor() == 0) {
			return 0;
		} else {
			return this.acumulador.obtenerValor() / this.contador.obtenerValor();
		}
	}

}
