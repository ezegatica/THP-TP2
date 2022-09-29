package ejercicio_04;

public class Persona {
	private String nombre;
	private String apellido;
	
	Persona() {
		ponerNombre("");
		ponerApellido("");
	}
	
	public void ponerNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void ponerApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String obtenerNombreCompleto() {
		return getNombre() + " " + getApellido();
	}
	
	private String getNombre() {
		return this.nombre;
	}
	
	private String getApellido() {
		return this.apellido;
	}
	
	
}
