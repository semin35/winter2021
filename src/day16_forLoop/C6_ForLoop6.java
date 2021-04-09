package day16_forLoop;

import java.util.Scanner;

public class C6_ForLoop6 {

	public static void main(String[] args) {
		// Interview Question Kullanicidan bir String isteyin ve
		//Stringi tersine ceviren bir program yazin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen tersine cevirmek icin bir yazi giriniz");
		String str=scan.nextLine();
		
		
		scan.close();
		System.out.print("girdiginiz yazinin tersi: ");
		for (int i =str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		//2.yol method olusturulup
		
		tersineCevir(str);
		
	}

	public static void tersineCevir(String str) {
		System.out.print("girdiginiz yazinin tersi: ");
		for (int i =str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
	}
		
}
