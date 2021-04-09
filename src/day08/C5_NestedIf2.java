package day08;

import java.util.Scanner;

public class C5_NestedIf2 {

	public static void main(String[] args) {
		/* Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
		Kullanicidan bir sifre girmesini isteyin
		Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin.
		Ilk harf A ise  “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
		Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin.
		Ilk harf z ise  “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.*/
		//1.islem kullanicidan sifreyi alip ilk harfine bak.
		//buyuk mu kucuk harf mi olduguna bak
		
		Scanner scan=new Scanner(System.in);
		System.out.println("sifrenizi giriniz");
		char ilkHarf=scan.next().charAt(0);
		
		if (ilkHarf>='A' && ilkHarf<='Z') {//ilk harf buyukse calisir
			if (ilkHarf=='A') {
				System.out.println("gecerli sifre");
			}else {
				System.out.println("gecersiz sifre");
			}
			
					
		}else if (ilkHarf>='a' && ilkHarf<='z') {//ilk harf kucukse calisir
			if (ilkHarf=='z') {
				System.out.println("sifre gecerli");
			}else {
				System.out.println("sifre gecersiz");
			}
			
			
			
		} else {//ilk harf buyuk veya kucuk harf degilse
			System.out.println("gecersiz karakter girdiniz");
		}
		
		scan.close();
		
	}

}
