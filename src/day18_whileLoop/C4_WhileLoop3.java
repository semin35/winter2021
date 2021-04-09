package day18_whileLoop;

import java.util.Scanner;

public class C4_WhileLoop3 {

	public static void main(String[] args) {
		/*Kullanicidan baslangic ve bitis haflerini alin 
		 * ve baslangic harfinden baslayip bitis harfinde biten
		 *  tum harfleri buyuk harf olarak ekrana yazdirin.
		 *   Kullanicinin hata yapmadigini farz edin.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen baslangic harfi giriniz");
	    char str1=scan.next().toUpperCase().charAt(0);
	    System.out.println("lutfen bitis harfi giriniz");
	    char str2=scan.next().toUpperCase().charAt(0);
	    
	    
	    for (char str = str1; str<=str2; str++) {
			System.out.print(str+" ");
		}
	    
	    System.out.println();
	    //while loop
	    
	    while(str1<=str2) {
	    	System.out.print(str1+" ");
	    	str1++;
	    }
		scan.close();
		
		
		
		
	}

}
