package day13_stringmanipulation;

import java.util.Scanner;

public class C2_EndsWith {

	public static void main(String[] args) {

		String str = "Javayla hayat ne guzel";
		System.out.println(str.endsWith("zel"));// true

		System.out.println(str.endsWith("ne guzel"));// true
		System.out.println(str.endsWith("zel "));// false

		// kullanicidan bir email isteyin
		// eger @ isareti icermiyorsa "girdiginiz bilgi email degil"
		// eger @isareti iceriyor ama @gmail.com icermiyorse "lutfen gmail adresini
		// yazin
		// eger ilk iki sarti sagliyor ama @gmail.com ile bitmiyorsa "gecersiz gmail
		// adresi" yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("mail adresinizi giriniz");
		String mail = scan.next().toLowerCase();

		if (!mail.contains("@")) {// eger booleanin basina unlem isareti konarsa
			// mail @ icermiyorsa
			System.out.println("girdiginiz bilgi email degil");

		} else if (!mail.contains("@gmail.com")) {
			System.out.println("lutfen gmail adresi yaziniz");

		} else if (mail.endsWith("gmail.com")) {
			System.out.println("mailiniz basariyla kaydedildi");
		} else {
			System.out.println("gecersiz mail adresi");
		}
		scan.close();
	}

}
