package day17_forloop;

import java.util.Scanner;

public class C2_ForLoop2 {
	public static void main(String[] args) {
		/*
		 Kullanicidan bir tamsayi girmesini isteyin
		 sayi negatif veya sifirsa "Lutfen pozitif bir tamsayi giriniz" yazdirin
		 Girilen Sayinin rakamlar toplamini ayri bir method'da hesaplayin
		
		 Main method icinde Kullanicidan bir sinir deger isteyin
		 rakamlar toplami sinir degerden buyukse
		 "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 degilse "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden 
		 buyuk degil"  yazdirin		
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		int sayi=scan.nextInt();
		System.out.println("lutfen sinir degeri icin bir tam sayi giriniz");
		int sinir=scan.nextInt();
		
		scan.close();
		if (sayi<=0) {
			System.out.println("lutfen pozitif bir tamsayi giriniz.");
		}else {
			
			if(rakamlarToplamiHesapla(sayi)>sinir){//girilen sayinin rakamlar toplami int
			System.out.println("girdiginiz sayinin rakamlari toplami girdiginiz sinir degerini asiyor");
		
		
		}else {
		
			System.out.println("girdiginiz sayinin rakamlari toplami girdiginiz sinir degerinden kucuk");
		}
		}
		}

	public static int rakamlarToplamiHesapla(int sayi) {
		int rakamlarToplami=0;
		String sayi2=sayi+"";//sayi1 i string e cevirdik.
		for (int i = 1; i <=sayi2.length() ; i++) {
			rakamlarToplami+=sayi%10;
			sayi/=10;
		
		}
		return rakamlarToplami;
		
	}

}
