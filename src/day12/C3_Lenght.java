package day12;

import java.util.Scanner;

public class C3_Lenght {

	public static void main(String[] args) {
		//kullanicidan bir string girmesini isteyin
		//girilen stringin son harfini buyuk harf olarak yazdirin.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir cumle giriniz");
		String str=scan.nextLine().toUpperCase();
		
		
		System.out.println("girdiginiz cumlenin son harfi= "+ str.charAt(str.length()-1));
		
		
		//length() methodu girilen stringin uzunlugunu verir.
	
		String str2="";//"Ali"-->3
		System.out.println(str2.length());//0
		
		//String str3=null;//null hic demektir.normalde Stringler ""icene yazilir
		//null icin buna gerek yoktur.null case sensitivedir;dolasiyla Null veya
		//NULL yazilmaz.null bir deger degildir sadece hicligi 
		//gosteren bir pointerdir.(isaretleyicidir)
		
		//System.out.println(str3.length());//RTE verir.
		//null deger atanan String ile string manipulation methodlari calismaz.
		//System.out.println(str3.equals(str2));
		System.out.println(str.charAt(1));//indexi 1 olan (bastan ikinci) harfi verir
		
	scan.close();	

	}

}
