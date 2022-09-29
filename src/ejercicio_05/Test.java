package ejercicio_05;

public class Test {

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		persona1.ponerNombre("Fulano");
		persona1.ponerApellido("Gomez");

		Persona persona2 = new Persona();
		persona2.ponerNombre("Mario");
		persona2.ponerApellido("Borges");

		Domicilio domicilio = new Domicilio();

		System.out.println(persona1.obtenerDireccion());

		domicilio.setCalle("Calle falsa");
		domicilio.setCiudad("Springfield");
		domicilio.setNumero(123);

		persona1.ponerDomicilio(domicilio);
		persona2.ponerDomicilio(domicilio);

		System.out.println(persona1.obtenerNombreCompleto());
		System.out.println(persona1.obtenerDireccion());

		System.out.println(persona2.obtenerNombreCompleto());
		System.out.println(persona2.obtenerDireccion());

		domicilio.setCalle("Avenida Siemprevida");

		System.out.println(persona1.obtenerNombreCompleto());
		System.out.println(persona1.obtenerDireccion());

		System.out.println(persona2.obtenerNombreCompleto());
		System.out.println(persona2.obtenerDireccion());

		/*
		 * Se puede observar que el domicilio cambió para las 2 personas.
		 */
	}

}
