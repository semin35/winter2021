package day17_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// kullanicidan 40dan kucuk bir sayi alin
		//girilen sayinin faktoriyelini hesaplayip yazdiran bir method olusturun.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 35den kucuk bir tam sayi giriniz");
		int sayi=scan.nextInt();
		

		if (sayi>=35 || sayi<=0) {
			System.out.println("lutfen 35den kucuk pozitif bir sayi giriniz");
		} else {
			faktoriyelHesapla(sayi);
		}
	}

	public static void faktoriyelHesapla(int sayi) {
		long faktoriyel=1;
		for (int i = 1; i <=sayi; i++) {
			faktoriyel*=i;
		}
		System.out.println(faktoriyel);
		
		
	
		
	}

	
	}


