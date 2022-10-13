package ejercicio_11;

public class Principal {

	public static void main(String[] args) {
		Turnera turnera = new Turnera();
		System.out.println(turnera.obtenerUltimoNumeroOtorgado());
		
		turnera.otorgarProximoNumero();
		turnera.otorgarProximoNumero();
		turnera.otorgarProximoNumero();
		System.out.println(turnera.obtenerUltimoNumeroOtorgado());
		
		turnera.resetearContador(22);
		System.out.println(turnera.obtenerUltimoNumeroOtorgado());
		
		turnera.resetearContador(-1);
		System.out.println(turnera.obtenerUltimoNumeroOtorgado());
		
		turnera.otorgarProximoNumero();
		turnera.otorgarProximoNumero();
		turnera.resetearContador();
		System.out.println(turnera.obtenerUltimoNumeroOtorgado());
	}

}
