package day10_switchcase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		// kullanicidan vip kisaltmasinda hangi harfin anlamini istedigini soralim
		//girilen harfin aciklamasini yazdirilalim
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen hangi harfin anlamini istediginizi giriniz");
		char harf=scan.next().charAt(0);//girilen kelimenin ilk harfini alir sikayet etmez
		
		switch (harf) {
		case 'V':
		case 'v':
			System.out.println("very");
			break;
		case 'I':
		case 'i':
			System.out.println("important");
			break;
		case 'P':
		case 'p':
			System.out.println("person");
			break;
		default:
				System.out.println("gecerli harf giriniz");
		}
		
		//kullanicinin birden fazla harf girmesini sorun olarak kabul ediyorsaniz
		//ve bunu hata olarak kullaniciya geri bildirmek istiyorsaniz
		
		
		System.out.println("lutfen hangi harfin anlamini istediginizi giriniz");
		String str=scan.next();
		
		switch (str) {
		case "V":
		case "v":
			System.out.println("very");
			break;
		case "I":
		case "i":
			System.out.println("important");
			break;
		case "P":
		case "p":
			System.out.println("person");
			break;
		default:
				System.out.println("gecerli harf giriniz");
		}
		
scan.close();
	}

}
