package day02_scanner;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("isminizi giriniz");
		String name = scan.next();
		//Scanner scan1 = new Scanner(System.in);
		System.out.println("soyadinizi giriniz");
		String surname=scan.next();
		System.out.println(name+" "+surname);
		scan.close();
		int num=12;
		System.out.println(num-=3);
	}

}
