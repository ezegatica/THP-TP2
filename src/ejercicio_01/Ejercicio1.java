package ejercicio_01;
import java.util.Scanner;

public class Ejercicio1 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = pedirNumero("Ingrese un numero entre 1 y 4", 1, 4);
		int n2 = pedirNumero("Ingrese un numero entre 10 y 34", 10, 34);
		System.out.println(sumar(n1, n2));
	}
	
	public static int sumar(int n1, int n2) {
		return n1 + n2;
	}
	
	public static int pedirNumero(String texto, int min, int max) {
		int numeroIngresado;
		do {
			System.out.println(texto);
			numeroIngresado = Integer.parseInt(input.nextLine());
		} while(! (numeroIngresado >= min &&  numeroIngresado <= max));
		return numeroIngresado;
	}

}
