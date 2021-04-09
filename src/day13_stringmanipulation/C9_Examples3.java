package day13_stringmanipulation;

import java.util.Scanner;

public class C9_Examples3 {

	public static void main(String[] args) {
		// kullanicidan ismini soyismini ve kredikarti bilgilerini isteyin
		//isim-soyisim: M***** B****
		//kart no: **** **** **** **** 1234
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen isminizi giriniz");
		String isim=scan.next();
		
		System.out.println("lutfen soyisminizi giriniz");
		String soyIsim=scan.next();
		System.out.println("lutfen kart numaranizi giriniz");
		String kartNo=scan.next();
		
		char isimIlkHarf=isim.toUpperCase().charAt(0);
		String isimGeriKalan=isim.substring(1).replaceAll("\\w","*");
		
		String soyisimIlkHarf=soyIsim.toUpperCase().substring(0,1);
		String soyisimGeriKalan=soyIsim.substring(1).replaceAll("\\w","*");
		
		String kartNoBasi="**** **** **** ";
		String kartNoSonu=kartNo.substring(kartNo.length()-4);
		
		System.out.println("isminiz ve soyisminiz: "+isimIlkHarf+isimGeriKalan+" "+
				soyisimIlkHarf+	soyisimGeriKalan);
		System.out.println("Kart no: "+kartNoBasi+kartNoSonu);

		scan.close();
	}

}
