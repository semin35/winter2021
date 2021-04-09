package day25_arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		// iki arrayin esit oldugunu kontrol etme
		
		int arr1[]= {10,25,5,20};
		int arr2[]= {25,10,20,5};
		
		Arrays.sort(arr2);
		Arrays.sort(arr1);
		
		System.out.println(Arrays.equals(arr1, arr2));
		
		//iki arrayin birbirine esit olmasi icin hem uzunluklari,icindeki
		//tum elemanlar,ve esit elemanlarin indexleri esit olmalidir.
		

	}

}
