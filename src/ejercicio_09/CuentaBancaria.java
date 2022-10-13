package ejercicio_09;

public class CuentaBancaria {
	private String cbu;
	private TIPO_CUENTA tipo;
	private double saldo;
	private Persona titular;
	
	private static final String GUION = "-";

	CuentaBancaria(Persona persona, TIPO_CUENTA tipo) {
		this.titular = persona;
		this.saldo = 0;
		this.tipo = tipo;
		this.cbu = this.generarCBU();
	}
	
	public String generarCBU() {
		int dniUsuario = this.titular.getDni();

		String valorA = Integer.toString(this.tipo.ordinal() + 10);
		String valorC = Integer.toString(dniUsuario);
		String valorE = Integer.toString(dniUsuario % 10);
		return valorA + GUION + valorC + GUION + valorE;
	}
	
	public void setTipo(TIPO_CUENTA tipo) {
		this.tipo = tipo;
	}
	public double obtenerSaldo() {
		return saldo;
	}
	public void depositar(double cantidad) {
		this.saldo = this.saldo + cantidad;
	}
	public boolean extraer(double cantidad) {
		double postSaldo =  this.saldo - cantidad;
		if (postSaldo < 0) {
			System.out.println("No cuentas con el saldo suficiente para realizar esta transacción");
			return false;
		} else {
			this.saldo = postSaldo;
			return true;
		}
	}
	public String getTitular() {
		return titular.toString();
	}
	
	public String getCbu() {
		return this.cbu;
	}
}
