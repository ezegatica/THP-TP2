package ejercicio_07;

public class Persona {
	private String nombre;
	private String apellido;
	private Integer dni;
	private Computadora computadora;

	Persona() {
		
	}
	
	public void trabajar() {
		System.out.println("Persona trabaja");
	}
	
	public void descansar() {
		System.out.println("Persona descansa");
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

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Computadora getComputadora() {
		return computadora;
	}

	public void setComputadora(Computadora computadora) {
		this.computadora = computadora;
	}
}
