package day16_forLoop;

import java.util.Scanner;

public class C2_ForLoop2 {

	public static void main(String[] args) {
		// kullanicidan 2 tam sayi alin.
		//ilk sayidan ikinci sayiya kadar tum sayilari 
		//yanyana aralarinda bosluk olarak yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 2 tane sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		scan.close();
		if (sayi1>sayi2) {
			for (int i = sayi1; i>=sayi2; i--) {
				
			System.out.print(i+" ");	
			}
		} else {
			for (int i = sayi1; i <=sayi2; i++) {
				System.out.print(i+" ");
			}
		}

	}

}
