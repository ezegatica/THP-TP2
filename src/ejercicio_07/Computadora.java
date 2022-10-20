package ejercicio_07;

public class Computadora {
	private String marca;
	private TIPO_PC tipo;
	private Procesador procesador;
	private DVD dvd;

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

	public TIPO_PC getTipo() {
		return tipo;
	}

	public void setTipo(TIPO_PC tipo) {
		this.tipo = tipo;
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
