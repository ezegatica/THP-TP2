package ejercicio_12;

public class Principal {

	public static void main(String[] args) {
		Calculadora calcu = new Calculadora();
		final int A = 1;
		final int B = 2;
		final int CERO = 0;
		
		System.out.println(calcu.sumar(A, B));
		System.out.println(calcu.restar(A, B));
		System.out.println(calcu.restar(B, A));
		System.out.println(calcu.multiplicar(A, B));
		System.out.println(calcu.dividir(A, B));
		System.out.println(calcu.dividir(B, A));
		System.out.println(calcu.dividir(A, CERO));
		System.out.println(calcu.dividir(B, CERO));
		System.out.println(calcu.dividir(CERO, A));
		System.out.println(calcu.dividir(CERO, B));


	}

}
