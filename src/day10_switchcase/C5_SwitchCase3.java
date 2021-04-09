package day10_switchcase;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		// kullanicidan yaziyla hangi gunde oldugunu isteyin
		// girilen gunun hafta ici ya da hafta sonu oldugunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen hangi gunde oldugunuzu giriniz");
		String gun=scan.next().toLowerCase();
		
		switch (gun) {
		case "pazartesi":
		case "sali":
		case "carsamba":
		case "persembe":
		case "cuma":
			System.out.println("hafta ici");
			break;
		case "cumartesi":
		case "pazar":
			System.out.println("hafta sonu");
			break;
		default:
			System.out.println("gecerli gun yaziniz");
	
		}
	scan.close();	
		
		

	}

}
