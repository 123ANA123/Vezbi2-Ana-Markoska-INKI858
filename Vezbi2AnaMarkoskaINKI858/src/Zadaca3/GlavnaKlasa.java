package Zadaca3;

public class GlavnaKlasa {

	public static void main(String[] args) {
		Covek c = new Covek ();
		c.ime = "Ana";
		c.prezime = "Markoska";
		c.embg = "0502999415814";
		
		System.out.println("Imeto na covekot e: " + c.ime);
		System.out.println("Prezimeto na covekot e: " + c.prezime);
		System.out.println("Covekot ima maticen broj: " + c.embg);

	}

}
