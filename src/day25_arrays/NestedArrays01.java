package day25_arrays;

import java.util.Arrays;

public class NestedArrays01 {

	public static void main(String[] args) {
		// ic ice array olusturdugumuzda disaridaki ana array e outer array
		//icerdeki kucuk arraylara ise inner array denir
		//eger icerideki arraylarin boyutlari birbirinden farkli ise array i
		//ancak tum elemanlari yazarak declare edebiliriz
		//multi dimensional arrayde bir elemanin indexi icin en distaki arrar
		//haric elemana kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
		
		//int arr[][]= {{1,3,5},{3,5},{5,9,11,3}};//2 katli
		
		//11 i index ile ifade etmek istersek arr[2][2]
		//eger array i uzunlukla declare etmek istersek inner array uzunluklari
		//esit olmalidir
		
		int arr2[][]=new int[3][2];
		//[3] ilk yazilan sayi outer arrayin icinde kac tane inner array oldugunu belirtir.
		//[2] herbir inner arrayin uzunlugu
		
		System.out.println(Arrays.toString(arr2));
		
		//multidimension arraylari yazdirmak icin toString methodu kullanilamaz
		//cunku toString methodu outer arrayi String e cevirir.\
		
		System.out.println(Arrays.deepToString(arr2));

	}

}
