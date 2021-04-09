package day40_Exception;

import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		//Kullanicidan yasini girmesini isteyin. 
		//Kodunuzu kullanici sifirdan kucuk bir sayi 
		//girerse Exception verecek sekilde yazin.
		/*
		Scanner scan=new Scanner (System.in);
		System.out.println("lutfen yasinizi giriniz");
		
		int yas=scan.nextInt();
		
		if (yas>=0) {
			System.out.println("yasiniz: "+yas);
		
		}else {
			throw new IllegalArgumentException();
			
		}
		*/	
		
		//javaya bir exception throw ettirmek icin 
		//throw ve new keywordleri kullanilir. 
		//bu sekilde yazdigimizda java exception throw eder ama
		//kodumuz da bloke olmus olur.
		//bloke olmasini engellemek isterseniz kodu try catch ile 
		//surrond yapabiliriz.
		
		Scanner scan=new Scanner (System.in);
		System.out.println("lutfen yasinizi giriniz");
		
		int yas=scan.nextInt();
		try {
		if (yas>=0) {
			System.out.println("yasiniz: "+yas);
		
		}else {
			throw new IllegalArgumentException();
			
		}
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
		System.out.println("Kod bloke olmamis");
	}

}
