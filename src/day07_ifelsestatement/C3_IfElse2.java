package day07_ifelsestatement;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		// kullanicidan bir karakter girmesini isteyin
		//harf olup olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen bir karakter giriniz: ");
		
		char karakter=scan.next().charAt(0);//lowercase de kullanilabilir.
		
	if (karakter>='a' && karakter<='z' || (karakter>='A' && karakter<='Z')) {
		System.out.println("girdiniz karakter harftir.");
	} else {
		System.out.println("girdiginiz karakter harf degildir.");
	}
scan.close();
	}

}
