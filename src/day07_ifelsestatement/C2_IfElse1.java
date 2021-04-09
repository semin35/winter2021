package day07_ifelsestatement;

import java.util.Scanner;

public class C2_IfElse1 {

	public static void main(String[] args) {
		// kullanicidan dikdortgenin kenar uzunluklarini alin 
		//uzunluklar esit ise kare degil ise kare degil yazdirin
		
	Scanner scan=new Scanner(System.in);
	
	System.out.println("lutfen birinci kenar uzunlugunu girin: ");
	double kenar1=scan.nextDouble();
	
	System.out.println("lutfen ikinci kenar uzunlugunu girin: ");
	double kenar2=scan.nextDouble();
	
	if (kenar1==kenar2) {
		System.out.println("sekil karedir.");
		
	}else {
		System.out.println("sekil kare degildir.");
	}
	
scan.close();
	}

}
