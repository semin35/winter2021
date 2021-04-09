package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		// kullanicidan gun ismini isteyin girilen 
		//haftasonu ya da hafta sonu oldugunu yazdirin
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("lutfen gun yaziniz");
		String gun=scan.next().toLowerCase();
		//eger stringlerde esitlik sorguluyorsak
		//== kullanmamaliyiz onun yerine esit olma durumunu
		//equal metodu kullanilir.
		if (gun.equals("cumartesi") || gun.equals("pazar")) {
			System.out.println("Haftasonu");
		}
		if(gun.equals("pazartesi") || gun.equals("carsamba") 
				||gun.equals("persembe")||gun.equals("cuma")||
				gun.equals("sali")) {
			System.out.println("haftaici");
		}
		//bu kodda gun ismi yanlis yazilmissa olusacak durum yok
		scan.close();
		

	}

}
