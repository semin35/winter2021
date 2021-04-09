package day07_ifelsestatement;

import java.util.Scanner;

public class C8_IfElseIf3 {

	public static void main(String[] args) {
		/*Kullanicidan maas icin bir teklif isteyin ve
		 *  asagidaki degerlere gore cevap azdirin. 
		 *  Teklif 80.000’in uzerinde ise “Kabul ediyorum” , 
		 *  60 – 80.000 arasinda ise  “Konusabiliriz”,
		 *   60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen maasinizi girin: ");
		long maas=scan.nextLong();
		
		if (maas>80000) {
			System.out.println("kabul ediyorum");
		} else if(maas>60000) {
			System.out.println("konusabiliriz");
		}else {
			System.out.println("maalesef kabul edemem");
		}
		
		
		scan.close();
		
	}

}
