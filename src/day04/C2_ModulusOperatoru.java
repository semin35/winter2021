package day04;

//import java.util.Scanner;

public class C2_ModulusOperatoru {

	public static void main(String[] args) {
		int kalan=15%4;
		System.out.println(kalan);
		
		System.out.println(26%8);
		
		//Scanner scan=new Scanner(System.in);
		System.out.println("bir sayi girin");
		//int sayi=scan.nextInt();
		int sayi=856;
		int birler=sayi%10;
		System.out.println("sayinin birler basamagi= " +birler);
		
		sayi/=10;
		//System.out.println("sayinin son hali= "+sayi);
		
		int onlar= sayi%10;
		System.out.println("sayinin onlar basamagi= "+onlar);
		
		sayi/=10;
		System.out.println("sayinin yuzler basamagi= "+sayi);

	}

}
