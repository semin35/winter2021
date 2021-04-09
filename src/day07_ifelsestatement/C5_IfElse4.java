package day07_ifelsestatement;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {
		// kullanicidan ucgenin kenar uzunluklarini alin
		//uc kenar esitse eskenar
		//yoksa eskenar degil yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen ucgenin kenar uzunluklarini girin: ");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3 ) {
			System.out.println("ucgen eskenar ucgendir.");
		} else {
			System.out.println("ucgen eskenar ucgen degildir.");
		}
scan.close();
	}

}
