package day08;

import java.util.Scanner;

public class C4_ArtikYilNestedIf {

	public static void main(String[] args) {
		// kullanicidan girilen yilin artik yil olup olmadigini bulun

		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir yil giriniz");
		int yil=scan.nextInt();
		
		if (yil%100==0) {
			if (yil%400==0) {
				System.out.println("artik yil");
			}else {
				System.out.println("artik yil degil");
			}
		} else {
			if(yil%4==0) {
				System.out.println("artik yil");
			}else {
				System.out.println("artik yil degil");
			}
		}
		
		
		scan.close();
		
		
	}

}
