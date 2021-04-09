package day10_switchcase;

import java.util.Scanner;

public class C1_Ternarytekrar {

	public static void main(String[] args) {
		// kullanicidan bir sayi alin
		// 3 basamakli ise 3 basamakli degilse degil yazdirsin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		int sayi=scan.nextInt();
		
		System.out.println((sayi>99 && sayi<1000 || sayi<=-100 && sayi>-1000) ? "uc basamakli" :"uc basamakli degil");
		
		//String sonuc=sayi>99 ? (sayi<1000 ? "uc basamakli" : "uc basamakli degil") :"uc basamakli degil";
		
				
scan.close();
	}

}
