package ejercicio_10;

public class Principal {
	public static void main(String[] args) {
		Robot robot = new Robot("Baymax");
		Persona juan = new Persona("Juan", "Gomez");
		Persona fulano = new Persona("Fulano", "Detal");

		robot.saludar();
		robot.saludar(juan);
		robot.saludar(fulano);
	}
}
