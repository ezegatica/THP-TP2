package ejercicio_10;

public class Persona {
	private String nombre;
	private String apellido;
	Persona(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return String.format("%s %s", this.nombre, this.apellido);
	}
}
