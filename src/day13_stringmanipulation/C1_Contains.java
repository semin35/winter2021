package day13_stringmanipulation;

import java.util.Scanner;

public class C1_Contains {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve aramak istedigi bir String isteyin
		// cumle String'i iceriyorsa "Basarili" , 
		//degilse "Basarisiz" yazdirin

		/*Scanner scan=new Scanner(System.in);
		System.out.println("bir cumle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		System.out.println("aramak istediginiz bir kelime giriniz");
		String aranan=scan.nextLine().toLowerCase();
		
		
		System.out.println(cumle.contains(aranan)? "basarili" : "basarisiz");
		
		
		if (cumle.contains(aranan)) {
			System.out.println("basarili");
			
		} else {
			System.out.println("basarisiz");
		}*/
		
		//kullanicidan mail adresini isteyin
		//mail adresi @gmail.com iceriyorsa mailiniz kaydedildi yazsin
		//yoksa gmail adresini giriniz yazsin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("mail adresinizi giriniz");
		String mail=scan.next().toLowerCase();
		
				
		//System.out.println(mail.contains("@gmail.com")? "mailiniz kaydedildi":"gmail adresinizi girin");
		
		
		//eger @gmail.com un en sonda olmasini kontrol etmek istersek
		
		int sondami= mail.indexOf("@gmail.com", mail.length()-10);//index olarak lenght()-10  yazarsam
		//eger mail gmail.com ile bitiyorsa bu islemin sonucu bir int olur
		//eger mail gmail.com ile bitmiyorsa bu islemin sonucunu -1 yazdirir.
		
		
		if (mail.contains("@gmail.com")&& sondami!=-1) {
			System.out.println("mail kaydedildi");
		}else {
			System.out.println("lutfen gecerli bir gmail adresinizi giriniz");
		}
		
		
		
	scan.close();	
		
	}

}
