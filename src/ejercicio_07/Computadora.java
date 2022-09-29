package ejercicio_07;

public class Computadora {
	private String marca;
	private String tipo;
	private Procesador procesador;
	private DVD dvd;
	
	private final String DESKTOP= "desktop";
	private final String LAPTOP= "laptop";
	private final String ALLINONE= "all in one";

	Computadora() {
		
	}

	public void prender() {
		System.out.println("Computadora prende");
	}

	public void apagar() {
		System.out.println("Computadora apaga");
	}

	public void reiniciar() {
		System.out.println("Computadora reinicia");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (isTipoValid(tipo.toLowerCase())) {
			this.tipo = tipo;	
		}
	}
	
	private boolean isTipoValid(String tipo) {
		if (tipo.equals(DESKTOP) || tipo.equals(LAPTOP) || tipo.equals(ALLINONE)) {
			return true;
		} else {
			return false;
		}
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public DVD getDvd() {
		return dvd;
	}

	public void setDvd(DVD dvd) {
		this.dvd = dvd;
	}


}
