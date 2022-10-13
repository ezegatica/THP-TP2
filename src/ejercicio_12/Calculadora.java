package ejercicio_12;

public class Calculadora {
	Calculadora() {
		
	}
	
	public int sumar(int nroA, int nroB) {
		return nroA + nroB;
	}
	
	public int restar(int nroA, int nroB) {
		return nroA - nroB;
	}
	
	public int multiplicar(int nroA, int nroB) {
		return nroA * nroB;
	}
	
	public int dividir(int nroA, int nroB) {
		if (nroB == 0) {
			return 0;
		} else {
			return nroA / nroB;
		}
	}
	
}
