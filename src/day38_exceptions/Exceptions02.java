package day38_exceptions;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {
		
		int count=1;
		Scanner scan=new Scanner(System.in);
		while(count<=100) {
		
		System.out.println("lutfen bolunecek sayiyi giriniz");
		int sayi1=scan.nextInt();
		System.out.println("lutfen kaca bolmek istedginizi yazin");
		int sayi2=scan.nextInt();
		 /*  java'ya exceptions'i handle etmek icin bir cozum uretmezsek
        java exception ile karsilastiginda calismayi durdurur (stops execution)
        throws exception (exception firlatir)(problemin kaynagini bize gosterir)
        
        tum aplication durmus olur... 
        Musterinin kullandigi bir uygulama icin bu KABUL EDILEMEZ
        BUnun icin kod yazan kisi muhtemel sorunlari ongormeli ve
        Java'ya bu sorunla handle edebilmesi icin yol gostermelidir.
    */
		
		System.out.println("islem no: "+count);
		try {
		System.out.println("bolme isleminin sonucu: "+sayi1/sayi2);
		}catch (ArithmeticException e) {
			System.out.println("sayiyi sifira bolemezsin");
		}
		count++;
		
		
		}

		scan.close();
	}

}
