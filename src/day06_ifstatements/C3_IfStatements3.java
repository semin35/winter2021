package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatements3 {

	public static void main(String[] args) {
		// kullanicidan gun isminin ilk harfini isteyin ve harfe 
		//uygun olan gun isimlerini yaziniz.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("yazmami istediginiz gun isminin bas harfini yazin:");
		
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		if (ilkHarf=='P') {
			System.out.println("pazartesi,pazar,persembe");
		}
		if (ilkHarf=='S') {
			System.out.println("sali");
		}
		if (ilkHarf=='C') {
			System.out.println("carsamba,cuma,cumartesi");
		}
		
		if (ilkHarf!='C' && ilkHarf!='S' && ilkHarf!='P'){
			System.out.println("lutfen gecerli harf giriniz.nyanlis harf girdiniz");
		}
scan.close();
	}
	

}
