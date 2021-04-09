package day16_forLoop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// kullanicidan pozitif bir sayi alin
		//1den kullanicinin girdigi sayiya kadar olan tum tam 
		//sayilarin toplamini yazin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen pozitif tam sayi giriniz");
		int sayi=scan.nextInt();
		scan.close();
		int toplam=0;
		for (int i =1; i <=sayi; i++) {
			toplam+=i;
		}
		System.out.println(toplam);

	}

}
