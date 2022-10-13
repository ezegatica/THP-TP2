package ejercicio_10;

public class Robot {
	private String nombre;
	Robot(String nombre) {
		this.nombre = nombre;
	}
	
	public void saludar() {
		String mensaje = String.format("Hola, mi nombre es %s. ¿En qué puedo ayudarte?", this.nombre);
		System.out.println(mensaje);
	}
	
	public void saludar(Persona persona) {
		String mensaje = String.format("Hola %s, mi nombre es %s. ¿En qué puedo ayudarte?", persona.toString(), this.nombre);
		System.out.println(mensaje);
	}
}
