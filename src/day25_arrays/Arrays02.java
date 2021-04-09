package day25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// verilen bir arrayde bir elemanin var 
		//olup olmadigini nasil kontrol ederiz
		
		int arr[]= {10,25,3,16,75};
		int sayi=12;
		
		boolean flag=false;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==sayi) {
				flag=true;
			}
		} 
		if (flag) {
		System.out.println("array sorulan elemani iceriyor");

	}else {
		System.out.println("array sorulan elemani icermiyor");
	}
		//arrays classindan method kullanarak yapalim
		//ilk once siralama yapmaliyiz
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, sayi)); 
		
		
		int arr2[]= {12,15,25,14,3,12,65};
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.binarySearch(arr2, 5)); 
		
		//array nasil String e cevrilir
		
		String arrayString=Arrays.toString(arr2);
		System.out.println(arrayString);
		System.out.println(arrayString.substring(5));
		
	}
}
