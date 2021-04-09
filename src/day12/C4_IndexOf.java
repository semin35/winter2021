package day12;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		// indexOf() methodu bize istedigimiz karakter(lerin) indexini dondurur.
		
		String str="java ogren, is sahibi ol";
		System.out.println(str.charAt(6));//g
		
		System.out.println("char arama "+str.indexOf('g'));//6 sadece bir harf arar
		
		System.out.println("string arama "+str.indexOf("g"));//6
		
		System.out.println("string kelime arama "+str.indexOf("is"));//12
		
		System.out.println("birden fazla varsa "+ str.indexOf('i'));//ilk buldugunun indexsini getirir.

		System.out.println("baslangic indexi ile"+str.indexOf('a', 4));//bas.indexi inclusive(dahil)
		
		System.out.println("olmayan harf"+str.indexOf("dert"));
		
		//kullanicidan bir cumle isteyin
		//case sensitive olmadan java kelimesi
		//icerip icermedigini yazdirin.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir cumle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		
		
		int sonuc=cumle.indexOf("java");//java varsa ilk java indexini dondurur
		//java yoksa -1 
		System.out.println(sonuc==-1 ? "java icermiyor":"java iceriyor");
		 if (cumle.indexOf("java")>=0) {//java indexsinin 0 veya daha buyuk oldugunu kontrol ediyor
			 System.out.println("cumle java iceriyor");
		 }else {
			 System.out.println("cumle java icermiyor");
		 }
		
		
		
	scan.close();	
		
	}

}
