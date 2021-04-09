package day15;

import java.util.Scanner;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
		/*Kullanicidan bir sayi alin.
		 Bu sayinin negatif veya pozitif oldugunu,
		 tek mi cift mi oldugunu ve
		 uc basamakli ve ya daha buyukse birler,onlar ve yuzler 
		 basamagindaki rakamlarin toplamini,
		 100’den kucukse sadece 1’ler basamagini
		  yazdirin.
		
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		int sayi=scan.nextInt();
		
		pozitifNegatif(sayi);//girilen sayi argumentinin pozitif ya da negatif
		//oldugunu yazdirsin.
		tekMiCiftMi(sayi);
		
		if (sayi>=100) {
			yuzdenBuyuk(sayi);
		}
		else {
			yuzdenKucuk(sayi);
		}
		scan.close();
	}
	
	public static void yuzdenKucuk(int sayi) {
		System.out.println(sayi%10);
		
	}

	public static void yuzdenBuyuk(int sayi) {
		int rakamlarToplami=0;
		rakamlarToplami=sayi%10;
		sayi/=10;
		rakamlarToplami+=sayi%10;
		sayi/=10;
		rakamlarToplami+=sayi%10;
		System.out.println(rakamlarToplami);
		
	}

	public static void tekMiCiftMi(int sayi) {
		System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");
		
		
		
	}

	public static void pozitifNegatif(int sayi) {//parametre yazarken data tipini de yazmaliyiz
		
		System.out.println(sayi>0 ? "pozitif" : (sayi<0 ? "negatif" : "pozitif ya da negatif degil"));
		
	}
	
	

}
