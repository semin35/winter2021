package day09_ternary;

import java.util.Scanner;

public class C6_NestedTernary2 {

	public static void main(String[] args) {
		// kullanicidan bir harf isteyin
		//kucuk harfse kucuk harf
		//buyuk harfse buyuk
		//degilse karakter harf degil yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir harf giriniz");
		char ilkHarf=scan.next().charAt(0);
		
		/*if (ilkHarf>='A' && ilkHarf<='Z') {
			System.out.println("buyuk harf");  	
			}else if (ilkHarf>='a' && ilkHarf<='z') {
			System.out.println("kucuk harf");	
			}else {
				System.out.println("gecerli bir harf giriniz");
			}*/
		
		
		String sonuc=((ilkHarf>='a' && ilkHarf<='z') || (ilkHarf>='A' && ilkHarf<='Z') ) ?
				(ilkHarf>='a' && ilkHarf<='z') ? "kucuk harf" :"buyuk harf" :"gecersiz karakter";
		
		System.out.println(sonuc);
scan.close();
	}

}
