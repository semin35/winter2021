package day13_stringmanipulation;

import java.util.Scanner;

public class C4_Replace {

	public static void main(String[] args) {
		//kullanicidan bir cumle isteyin
		//cumledeki tum bosluklari silin ve
		//tum a`larin yerine e yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		cumle =cumle.replace(" ", "");
		cumle=cumle.replace('a','e');
		
		System.out.println(cumle);//atama yapmazsaniz manipulation str i degistirmez
		//eger atama yaparsak str kalici olarak degistigi icin biz bir daha orjinal
		//str a ulasamayiz
		//bunun icin kullanicidan aldigimiz stra degil yeni bir stringe atamak daha mantiklidir.
		
		System.out.println("lutfen yeni bir cumle yaziniz");
		String str2=scan.nextLine();
		System.out.println(str2.replace(" ","").replace('a','e'));//sadece bu satirda degisiklik yapildi
		
		//hem a hem de enin yerine i yazalim
		System.out.println(str2.replace("a","i").replace('e', 'i'));
		
		//hem a hem de enin yerine i yazalim buyuk kucuk harf gozetmeksizin
		System.out.println(str2.toLowerCase().replace("a","i").replace("e","i"));
		
scan.close();
	}
	

}
