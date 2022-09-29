package ejercicio_04;

public class Test {

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		persona1.ponerNombre("Fulano");
		persona1.ponerApellido("Gomez");
		System.out.println(persona1.obtenerNombreCompleto());

		Persona persona2 = new Persona();
		persona2.ponerNombre("Mario");
		persona2.ponerApellido("Borges");
		System.out.println(persona2.obtenerNombreCompleto());

	}

}
