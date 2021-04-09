package day09_ternary;

import java.util.Scanner;

public class C3_Ternary3 {

	public static void main(String[] args) {
		// kullanicidan 2 sayi alin buyuk olani yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 2 sayi giriniz");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("buyuk sayi= "+(sayi1>=sayi2 ? sayi1 : sayi2));
				
		
		
		
		
	scan.close();	

	}

}
