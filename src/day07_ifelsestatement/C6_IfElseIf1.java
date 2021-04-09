package day07_ifelsestatement;

import java.util.Scanner;

public class C6_IfElseIf1 {

	public static void main(String[] args) {
		// kullanicidan 100 uzerinden notunu isteyin
		//50 den kucukse "d"; 50-60 arasinda"c";60-80 arasi"b",80 uzeri"a"
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen notunuzu girin: ");
		
		double not=scan.nextDouble();
		
		if (not<0 || not>100) {//istenmeyen durum
			System.out.println("lutfen gecerli not giriniz.");
		} else if(not<50){//notumuz 0 ile 100 arasinda
			System.out.println("D");
		}else if (not<60) {//notumuz 50 ile 100 arasinda
			System.out.println("C");
		}else if (not<80) {//notumuz 60 ile 100 arasinda
			System.out.println("B");
		}else  {//notumuz 80 ile 100 arasinda
			System.out.println("A");

		}
scan.close();
	}

}
