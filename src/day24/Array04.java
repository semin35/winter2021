package day24;

import java.util.Arrays;
import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		// kullanicidan degerler alarak bir array olusturun.
		//once kullanicidan girecegi sayi adetini almamiz lazim ki
		//arrayi olusturalim
		
		Scanner scan=new Scanner(System.in);
		System.out.println("kac tane sayi girmek istersiniz");
		int uzunluk=scan.nextInt();
		
		int arr[]=new int[uzunluk];
		System.out.println("lutfen sayilari giriniz");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		scan.close();
	}

}
