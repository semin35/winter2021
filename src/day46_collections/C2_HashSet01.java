package day46_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C2_HashSet01 {

	public static void main(String[] args) {
		// verilen bir arrayin tekrarli elemanlarini silip
		//unique elemanlardan olusan bir array e ceviren method yaziniz
		
		int arr[]= {2,3,4,3,5,3,6,4,7,4,8,5};
		
		int tekrarsizArray[]=tekrarlariSil(arr);
		
		System.out.println("Main methodun icinde array olarak:"+Arrays.toString(tekrarsizArray));
	}

	public static int[] tekrarlariSil(int[] arr) {
	
		Set<Integer> set1=new HashSet<>();
		for (Integer each : arr) {
			set1.add(each);
			
		}
		System.out.println("Set olarak method icinde:"+set1);
		int tekrarsizArray[]= new int[set1.size()];
		int index=0;
		for (int i : set1) {
			tekrarsizArray[index]=i;
			index++;
		}
	
		
		return tekrarsizArray;
	}

	
		
	

}
