package day08;

import java.util.Scanner;

public class C6_Odev {

	public static void main(String[] args) {
		
		//kullanicidan 4 basamakli sayi girmesini isteyin
		//girilen sayinin 5 e bolunup bolunmedigini kontrol edin
		//eger son rakami 0 ise "sayi 5 e bolunebilen cift sayidir"
		//son rakami 5 ise "sayi 5 e bolunebilen tek sayidir."
		// 5 e bolunemiyorsa "tekrar deneyiniz " yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 4 basamakli bir sayi giriniz");
		
		int sayi = scan.nextInt();
		boolean bl=sayi<1000 || sayi>10000;
			
		if (bl) {
			System.out.println("gecerli sayi giriniz");
			}else if (sayi%10==0) {
			System.out.println("girilen sayi 5`e bolunebilen cift sayidir.");
				
			}else if  (sayi%5==0) {
					System.out.println("girilen sayi 5`e bolunebilen tek sayidir");
									
		} else {
				System.out.println("tekrar deneyiniz");
			
					
			
		}
		
scan.close();
	}
	}
	
