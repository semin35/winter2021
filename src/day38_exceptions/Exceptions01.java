package day38_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		// kullanicidan iki tamsayi alin ve bolumlerini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bolunecek sayiyi giriniz");
		int sayi1=scan.nextInt();
		System.out.println("lutfen kaca bolmek istedginizi yazin");
		int sayi2=scan.nextInt();
		//java exceptionslari handle etmek icin try catch blogu olusturmus
		
		scan.close();
		try {
		System.out.println("bolme isleminin sonucu: "+sayi1/sayi2);
		}catch(ArithmeticException e) {
			System.out.println("sayiyi sifira bolemezsiniz");
		}

	}

}
