package day06_ifstatements;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
		// kullanicidan bir dikdortgenin iki kenar uzunlugunu alin
		//kenar uzunluklari esitse kare degilse dikdortgen yazdirin
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("lutfen 1.kenar uzunlugunu girin");
		int kenar1=scan.nextInt();
		System.out.println("lutfen 2.kenar uzunlugunu girin");
		int kenar2=scan.nextInt();
		
		if (kenar1>0 && kenar2>0 && kenar1==kenar2) {
			System.out.println("sekil karedir.");
		}if (kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			System.out.println("sekil dikdortgendir.");
		}if (kenar1<=0 || kenar2<=0) {
			System.out.println("lutfen gecerli uzunluk giriniz");
		}
		scan.close();
	}
	

}
