package Zadaca4;

public class GlavnaKlasa {

	public static void main(String[] args) {
		Avtomobil avtomobil1 = new Avtomobil();
		avtomobil1.marka = "Mazda";
		avtomobil1.model = "6";
		avtomobil1.pominatiKm = 20000;
		
		Avtomobil avtomobil2 = new Avtomobil ("Fiat", "Punto",30000);
		
		System.out.println(avtomobil1.marka + " " + avtomobil1.model + " " + avtomobil1.pominatiKm);
		System.out.println(avtomobil2.marka + " " + avtomobil2.model + " " + avtomobil2.pominatiKm);

	}

}
