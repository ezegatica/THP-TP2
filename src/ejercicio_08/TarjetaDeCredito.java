package ejercicio_08;

public class TarjetaDeCredito {
	private String numero;
	private String titular;
	private double limiteDeCompra;
	private double acumuladoActual;
	
	TarjetaDeCredito(String numero, String titular, double limiteDeCompra) {
		setNumero(numero);
		setTitular(titular);
		setLimiteDeCompra(limiteDeCompra);
		this.acumuladoActual = 0;
	}

	private void setNumero(String numero) {
		this.numero = numero;
	}

	private void setTitular(String titular) {
		this.titular = titular;
	}

	private void setLimiteDeCompra(double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}

	public String getNumero() {
		return this.numero;
	}

	public String getTitular() {
		return this.titular;
	}

	public double getLimiteDeCompra() {
		return this.limiteDeCompra;
	}

	public double getAcumuladoActual() {
		return this.acumuladoActual;
	}	
	
	public double montoDisponible() {
		double monto = getLimiteDeCompra() - getAcumuladoActual();
		if (monto < 0) {
			return 0;
		} else {
			return monto;
		}
	}

	private boolean compraPosible(double monto) {
		if( monto < montoDisponible() ) {
			return true;
		} else {
			return false;
		}
	}
	
	public void actualizarLimite(double nuevoLimiteDeCompra) {
		setLimiteDeCompra(nuevoLimiteDeCompra);
	}
	
	private void acumularGastoActual(double gasto){
		this.acumuladoActual += gasto;
	}
	
	public boolean realizarCompra(double monto) {
		if (compraPosible(monto)) {
			acumularGastoActual(monto);
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Titular: " + getTitular() + '\n' + 
				"Numero: " + getNumero() + '\n' + 
				"Gastos acumulados: $" + getAcumuladoActual()  + '\n' + 
				"Limite de compra: $" + getLimiteDeCompra() + '\n' + 
				"Monto disponible: $" + montoDisponible();
	}
	
	
}
