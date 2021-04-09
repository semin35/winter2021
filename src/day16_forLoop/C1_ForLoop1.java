package day16_forLoop;

import java.util.Scanner;

public class C1_ForLoop1 {

	public static void main(String[] args) {
		// kullanicidan pozitif 2 tam sayi alin
		//aldigimiz degerlerden kucuk olandan baslayip,buyuk olana kadar
		//tum sayilari yanyana yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 2 tane sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		int kucukSayi=0;
		int buyukSayi=0;
		int i;
		scan.close();
		if (sayi1<0 || sayi2<0) {System.out.println("lutfen pozitif sayi giriniz");
		}else if (sayi1>sayi2) {
			buyukSayi=sayi1;
			kucukSayi=sayi2;
			
			for ( i=kucukSayi; i<=buyukSayi;i++) {
				System.out.print(i+",");	
		}
		}else {
			kucukSayi=sayi1;
			buyukSayi=sayi2;
			
			for ( i=kucukSayi; i<=buyukSayi;i++) {
				System.out.print(i+",");
		}
		
	
			
		}
	

	}

}
