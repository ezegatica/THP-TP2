package ejercicio_13;

public class SuperHeroe {
	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;

	private final int MIN = 0;
	private final int MAX = 100;

	SuperHeroe(String nombre, int fuerza, int resistencia, int superpoderes) {
		this.setNombre(nombre);
		this.setFuerza(fuerza);
		this.setResistencia(resistencia);
		this.setSuperpoderes(superpoderes);

	}

	@Override
	public String toString() {
		String mensaje = String.format("Nombre: '%s', Fuerza: %d, Resistencia: %d, Superpoderes: %d");
		return mensaje;
	}
	
	public RESULTADO competir(SuperHeroe superHeroe2) {
		int puntosMios = 0;
		int puntosOtro = 0;

		if (this.fuerza > superHeroe2.getFuerza()) {
			puntosMios++;
		} else if (this.fuerza < superHeroe2.getFuerza()) {
			puntosOtro++;
		}
		
		if (this.resistencia > superHeroe2.getResistencia()) {
			puntosMios++;
		} else if (this.resistencia < superHeroe2.getResistencia()) {
			puntosOtro++;
		}
		
		if (this.superpoderes > superHeroe2.getSuperpoderes()) {
			puntosMios++;
		} else if (this.superpoderes < superHeroe2.getSuperpoderes()) {
			puntosOtro++;
		}
		
		if (puntosMios > puntosOtro) {
			return RESULTADO.TRIUNFO;
		} else if (puntosMios < puntosOtro) {
			return RESULTADO.DERROTA;
		} else {
			return RESULTADO.EMPATE;
		}
		
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setFuerza(int fuerza) {
		this.fuerza = this.formatearValor(fuerza);
	}

	private void setResistencia(int resistencia) {
		this.resistencia = this.formatearValor(resistencia);
	}

	private void setSuperpoderes(int superpoderes) {
		this.superpoderes = this.formatearValor(superpoderes);
	}
	
	public int getFuerza() {
		return this.fuerza;
	}
	
	public int getResistencia() {
		return this.resistencia;
	}
	
	public int getSuperpoderes() {
		return this.superpoderes;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	private int formatearValor(int valor) {
		if (valor < MIN) {
			return MIN;
		} else if (valor > MAX) {
			return MAX;
		} else {
			return valor;
		}
	}
}
