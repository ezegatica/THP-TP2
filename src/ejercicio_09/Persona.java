package ejercicio_09;

public class Persona {
	private int dni;
	private String nombre;
	private String apellido;
	private Domicilio domicilio;

	Persona(int dni, String nombre, String apellido, Domicilio domicilio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.setDni(dni);
	}

	@Override
	public String toString() {
		return this.nombre + " " + this.apellido + ", DNI: " + this.dni;
	}
	
	private void setDni(int dni) {
		final int DNI_MINIMO = 10000000;
		if (dni / DNI_MINIMO < 1) {
			this.dni = DNI_MINIMO + dni; // Esto es para que no se tenga que cortar la ejecución, se pasa a un numero de 8 digitos con el valor que ya tenia
		} else {	
			this.dni = dni;
		}
	}
	
	public int getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDomicilio() {
		return domicilio.toString();
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
}
