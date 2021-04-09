package day04;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		//kulllanicidan 4 basamakli bir sayi alalim ve
		//sayinin basamaklarini ters sirada yazdiralim.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 4 basamakli bir sayi giriniz");
		
		int sayi=scan.nextInt();
		
		int birler=sayi%10;
		System.out.println("girilen sayinin birler basmagi= "+birler);
		
		int onlar=sayi/10;
		int onlar1=onlar%10;
		
		System.out.println("girilen sayinin onlar basamagi= "+onlar1);
		
		int yuzler=onlar/10;
		int yuzler1=yuzler%10;
		
		System.out.println("girilen sayinin yuzler basamagi= "+yuzler1);
		
		int binler1=yuzler/10;
		//int binler1=binler%10;
		
		System.out.println("girilen sayinin binler basamagi= "+binler1);
		
		System.out.print("basamak degerleri toplami= ");
		System.out.println(birler+onlar1+yuzler1+binler1);
		System.out.println("yeni sayi= "+birler+onlar1+yuzler1+binler1);
		
		scan.close();

	}

}
