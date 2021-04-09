package day27_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {
	
	public static void main(String[] args) {
		//kullanicidan pozitif bir tamsayi alin
		//aldiginiz sayidan kucuk olan fibonacci 
		//dizisi elemanlarini yazdirin
		//1 1 2 3 5 8 13 21 34....
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen pozitif bir tamsayi giriniz");
		int sayi=scan.nextInt();
		
		List<Integer> fibo=new ArrayList<>();
		fibo.add(1);
		fibo.add(1);
		
		//System.out.println(fibo.get(0)+fibo.get(1));
		
		scan.close();
		for (int i = 2; fibo.get(i-1)+fibo.get(i-2)<sayi; i++) {
			fibo.add(fibo.get(i-1)+fibo.get(i-2));
		} 
		
		System.out.println(fibo);
		System.out.println(fibo.size());
		/*
		int i=2;
		int yenisayi=0;
		
		while(yenisayi<sayi) {
			yenisayi=fibo.get(i-1)+fibo.get(i-2);
			fibo.add(yenisayi);
			i++;
		}
			
		System.out.println(fibo);*/
	}

}
