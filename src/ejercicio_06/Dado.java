package ejercicio_06;

public class Dado {
	private int valor;
	private int sumadorValores;

	Dado() {
		tirarDado();
	}

	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int tirarDado() {
		int valor = (int)(Math.random() * 6);
		setValor(valor);
		return getValor();
	}

	public static boolean isEqual(int valor1, int valor2) {
		return valor1 == valor2;
	}
	
	public static int getMayor(int valor1, int valor2) {
		if (valor1 > valor2) {
			return valor1;
		} else {
			return valor2;
		}
	}
	
	public void tirarYSumar() {
		int valor = tirarDado();
		sumar(valor + 1);
	}
	
	public void sumar(int numero) {
		this.sumadorValores += numero;
	}
	
	public int getSumaValores() {
		return this.sumadorValores;
	}
	
	public double getPromedio(int cantidad) {
		System.out.println(this.sumadorValores);
		return (double)((double)getSumaValores() / cantidad);
	}
}
