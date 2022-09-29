package ejercicio_07;

public class Procesador {
	private String marca;
	private String modelo;
	private int temperatura;
	private final int TEMPERATURA_CRITICA = 99;

	Procesador() {
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
		if (temperatura >= TEMPERATURA_CRITICA) {
			System.out.println("ALERTA! Temperatura critica alcanzada");
		}
	}
	
	
}
