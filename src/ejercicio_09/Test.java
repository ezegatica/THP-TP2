package ejercicio_09;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Domicilio casa = new Domicilio("Yatay", 240, "Almagro");
		
		Persona fulano = new Persona(12345678, "Fulano", "Gomez", casa);
		CuentaBancaria cuenta1 = new CuentaBancaria(fulano, TIPO_CUENTA.CAJA_DE_AHORRO);
		Persona mengana = new Persona(9123456, "Mengana", "Torres", casa);
		CuentaBancaria cuenta2 = new CuentaBancaria(mengana, TIPO_CUENTA.CUENTA_CORRIENTE);

		System.out.println(cuenta1.getCbu());
		System.out.println(cuenta2.getCbu());

	}

}
