package ejercicio_05;

public class Domicilio {
	private String calle;
	private int numero;
	private String ciudad;
	private final String S_DEFAULT = "";
	private final int I_DEFAULT = 0;

	Domicilio() {
		setCalle(S_DEFAULT);
		setCiudad(S_DEFAULT);
		setNumero(I_DEFAULT);
	}

	@Override
	public String toString() {		
		return this.calle + " " + this.numero + ", " + this.ciudad;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCalle() {
		return this.calle;
	}

	public int getNumero() {
		return this.numero;
	}

	public String getCiudad() {
		return this.ciudad;
	}
}
