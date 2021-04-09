package day17_forloop;

import java.util.Scanner;

public class C1_ForLoopJava {

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
		scan.close();
		if (sayi<=0) {
			System.out.println("lutfen pozitif bir tamsayi giriniz.");
		}else {
			rakamlarToplamiYazdir(sayi);
		}
		
		
		
		}

		public static void rakamlarToplamiYazdir(int sayi) {
			int rakamlarToplami=0;
			int basamakDegeri=0;
			
			while(sayi>0) {
				basamakDegeri=sayi%10;
				rakamlarToplami+=basamakDegeri;
				sayi/=10;
			}
			
			/*String sayi2=sayi+"";//sayi1 i string e cevirdik.
			for (int i = 1; i <=sayi2.length() ; i++) {
				rakamlarToplami+=sayi%10;
				sayi/=10;*/
				
			
		System.out.println("rakamlar toplami: "+rakamlarToplami);
		
	}
		
		
		
	}
		
		
		
		
		
		
	


