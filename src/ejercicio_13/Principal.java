package ejercicio_13;

public class Principal {
	public static void main(String[] args) {
		SuperHeroe superHeroe1 = new SuperHeroe("Batman", 90, 70, 0);
		SuperHeroe superHeroe2 = new SuperHeroe("Superman", 95, 60, 70);
		SuperHeroe superHeroe3 = new SuperHeroe("Robin", 90, 30, 50);

		System.out.println(superHeroe1.competir(superHeroe2));
		
		System.out.println(superHeroe2.competir(superHeroe1));

		System.out.println(superHeroe3.competir(superHeroe1));


	}
}
