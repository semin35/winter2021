package day08;

import java.util.Scanner;

public class C3_ArtikYil {

	public static void main(String[] args) {
		//kullanicidan girilen yilin artik yil olup olmadigini bulun
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir yil giriniz");
		int yil=scan.nextInt();
		
		if (yil%4==0 && yil%100!=0) {
			System.out.println("artik yildir");
		} else if (yil%400==0){
			System.out.println("artik yildir");
		}else {
			System.out.println("artik yil degil");
		}
		
		
scan.close();
	}

}
