package day08;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		//gun ismini yazmasini isteyin
		
		Scanner scan=new Scanner(System.in); 
		System.out.println("lutfen gun ismini giriniz");
		
		String gun=scan.nextLine();
		
		if (gun.equalsIgnoreCase("pazar") || gun.equalsIgnoreCase("pazartesi")) {
			System.out.println("paz");
			
		}else if (gun.equalsIgnoreCase("sali")) {
			System.out.println("sal");
			
		}else if (gun.equalsIgnoreCase("carsamba")) {
			System.out.println("car");
			
		}else if(gun.equalsIgnoreCase("persembe")) {
			System.out.println("per");
			
		}else if(gun.equalsIgnoreCase("cuma") || gun.equalsIgnoreCase("cumartesi")) {
			System.out.println("cum");
			
		}else {
			System.out.println("gecerli gun yaziniz.");
			
		}
		
		
		//equalsIgnoreCase():buyuk kucuk harf hassasiyetini ortadan kaldirir.
		
scan.close();		
		
		

	}

}
