package day09_ternary;

import java.util.Scanner;

public class C4_Ternary4 {
	public static void main(String[] args) {
		//kullanicidan bir sayi alin
		//sayi tek mi cift mi oldugunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		
		int sayi=scan.nextInt();
		
		
		System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");
		
		//girilen sayinin mutlak degerini yazdirin
		
		System.out.println("sayinin mutlak degeri "+(sayi>0 ?  sayi : -sayi));
		
		scan.close();
	}

}
