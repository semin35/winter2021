package day12;

import java.util.Scanner;

public class C5_lastIndexOf {

	public static void main(String[] args) {
		// kullanicidan bir cumle alin 
		//asagidaki uc durumdan uygun olani yazdirin
		//1-cumle java icermiyor
		//2-cumle 1 tane java iceriyor
		//3-cumlede birden fazla java var
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir cumle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		
		int ilkJava=cumle.indexOf("java");//-1 ya da ilk javanin indexini
		int sonJava=cumle.lastIndexOf("java");//son javanin indexsi
		
		if(ilkJava==-1) {
			System.out.println("cumle java icermiyor");
		}else if(ilkJava==sonJava) {
			System.out.println("cumle 1 java iceriyor");
		}else {
			System.out.println("cumle birden fazla java iceriyor");
		}
scan.close();
	}

}
