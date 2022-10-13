package ejercicio_14;
import java.util.Scanner;

public class Principal {
	private static Scanner input = new Scanner(System.in);

	private static final int NOTA_MIN = 0;
	private static final int NOTA_MAX = 10;
	private static final int ESCAPE = -1;

	public static void main(String[] args) {
		int nota = 0;

		Promedio promedio = new Promedio();

		do {
			System.out.println("Ingrese una nota entre 1 y 10 (-1 para escapar)");
			nota = Integer.parseInt(input.nextLine());

			if (nota != ESCAPE && !(nota < NOTA_MIN || nota > NOTA_MAX)) {
				promedio.incrementar(nota);
			}

		} while(nota != ESCAPE);

		System.out.println("El promedio de notas es: " + promedio.obtenerValor());
	}
}
