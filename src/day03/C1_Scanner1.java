package day03;

import java.util.Scanner;

public class C1_Scanner1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	System.out.println("lutfen isminizi giriniz");
	String name=scan.next();
	System.out.println("lutfen soyisminizi giriniz");
	String surname=scan.next();
	System.out.println("isiminiz= "+name);
	System.out.println("soyisiniz= "+surname);
	System.out.println("kursumuza kaydiniz alinmistir.");
scan.close();
	}

}
