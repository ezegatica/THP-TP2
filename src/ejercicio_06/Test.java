package ejercicio_06;

public class Test {
	public static void main(String[] args) {
		/*
		 * Escribí la clase Test que utilice la clase dado para lanzar dos dados. Haga lo siguiente:
● Decir si el resultado es el mismo en los dos dados, indicando el valor.
● Si el resultado no es el mismo en los dos dados, mostrar el valor mayor.
● Mostrar por pantalla el promedio de los resultados de 100 lanzamientos (de los dos dados)
		 */
		final int LANZAMIENTOS_TOTALES = 100;
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();

		if (Dado.isEqual(dado1.getValor(), dado2.getValor())) {
			System.out.println("Los valores son iguales, el valor es: " + dado1.getValor());			
		} else {
			System.out.println("Los valores no son iguales, el numero mayor es: " + Dado.getMayor(dado1.getValor(), dado2.getValor()));
		}
		
		for(int i = 1; i<= LANZAMIENTOS_TOTALES; i++) {
			dado1.tirarYSumar();
			dado2.tirarYSumar();
		}
		
		System.out.println("El promedio del dado1 es: " + dado1.getPromedio(LANZAMIENTOS_TOTALES));
		System.out.println("El promedio del dado2 es: " + dado2.getPromedio(LANZAMIENTOS_TOTALES));
	}
}
