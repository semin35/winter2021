package day07_ifelsestatement;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		// kullanicidan bir tamsayi isteyin
		//sayi pozitif ise "sayi pozitif"yazdirin
		//sayi 100den kucuk ise kucuk sayi yazdirin
		//sayi 1000den buyukse buyuk sayi yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen tam sayi giriniz: ");
		
		int sayi=scan.nextInt();
		
		if (sayi>0) {
			System.out.println("sayi pozitiftir.");
			
		}//else{
			//System.out.println("sayi negatiftir.");
		//}
			
			if (sayi<100) {
		
			System.out.println("kucuk sayi.");
		}
		if (sayi>1000) {
			System.out.println("buyuk sayi.");
		}
		scan.close();

	}

}
