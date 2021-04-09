package day07_ifelsestatement;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		// kullanicidan yasini sorun
		//65 ve ya buyukse emekli olabilirsin
		//degilse emekli olamazsin yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen yasinizi giriniz: ");
		int yas=scan.nextInt();
		
		if (yas>=65) {
			System.out.println("emekli olabilirsiniz.");
		} else {
			System.out.println("emekli olamazsiniz.");
		}
				
		scan.close();
		
		

	}

}
