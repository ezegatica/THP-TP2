package ejercicio_05;

public class Persona {
	private String nombre;
	private String apellido;
	private Domicilio domicilio;

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
	
	public void ponerDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	public String obtenerNombreCompleto() {
		return getNombre() + " " + getApellido();
	}
	
	public String obtenerDireccion() {
		if (this.domicilio == null) {
			return "La persona " + obtenerNombreCompleto() + " no tiene un domicilio asignado/creado";
		} else {			
			return this.domicilio.toString();
		}
	}
	
	private String getNombre() {
		return this.nombre;
	}
	
	private String getApellido() {
		return this.apellido;
	}
	
	
}
