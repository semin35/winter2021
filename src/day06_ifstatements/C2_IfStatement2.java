package day06_ifstatements;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		//kullanicidan bir sayi isteyin ve sayinin
		//sayinin cift yada tek sayi oldugunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz: ");
		int sayi=scan.nextInt();
	scan.close();	
		if (sayi%2==0) {
			System.out.println("girilen sayi cifttir.");
		}if (sayi%2==1 || sayi%2==-1) {
			System.out.println("girilen sayi tektir.");
						
		}	
		System.out.println("katildiginiz icin tesekkurler");

	}

}
