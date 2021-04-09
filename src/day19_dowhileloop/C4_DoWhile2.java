package day19_dowhileloop;

import java.util.Scanner;

public class C4_DoWhile2 {

	public static void main(String[] args) {
		/*Kullanicidan toplamak uzere pozitif sayilar isteyin, 
		 * islemi bitirmek icin 0’a basmasini soyleyin.
  Kullanici yanlislikla negative sayi girerse o sayiyi toplamaya eklemeyin
   ve “Negatif sayi giremezsiniz” yazdirip basa donun
  Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, 
  yanlislikla kac negative sayi girdigini ve girdigi pozitif
   sayilarin toplaminin kac oldugunu yazdirin.*/
		
		Scanner scan=new Scanner(System.in);
		
		int countPoz=0;
		int countNeg=0;
		int toplamPoz=0;
		int sayi=1;
		System.out.println("oyuna hosgeldiniz,bitirmek istediginizde 0 a basin");
		do {
			//System.out.println("oyuna hosgeldiniz,bitirmek istediginizde 0 a basin");
			System.out.println("lutfen pozitif bir sayi giriniz");
			sayi=scan.nextInt();
			if (sayi>0) {
				countPoz++;
				toplamPoz+=sayi;
				
			}  if(sayi<0) {
				countNeg++;
				System.out.println("negatif sayi giremezsiniz");
			}
			
			
	}while(sayi!=0);
		System.out.println("toplam "+countPoz+" pozitif sayi girdiniz");
		System.out.println("toplam "+countNeg+" negatif sayi girdiniz");
		System.out.println("Girdiginiz pozitif sayilarin toplami: "+toplamPoz);
	scan.close();
	}

}
