package day27_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
		// verilen bir arrayi list e nasil cevirebiliriz?
		
		String sayi[]= {"Ali","Mehmet"};
		
		List<String> listArr=Arrays.asList(sayi);
		
		System.out.println(listArr);
		
		Integer arr1[]= {1,2,3};
		
		List<Integer> list1=Arrays.asList(arr1);
		System.out.println(list1);
		
		//bazen cok fazla elemani olan bir liste olusturmamiz gerekir
		//bu durumda liste elemanlarini tek tek eklemek yerine 
		//elemanlari bir array e ekler,sonra da arrayi list e cevirebiliriz
		//ornek bir web sitesindeki tum urunleri bir listeye eklemek istedigimizde
		//ancak bu methodla arraydan cevirdigimiz list esnek olmaz
		
		//(arrayin ozelliklerini tasir)add();remove();clear()
		//uzunluklarini etkileyen methodlar kullanilamaz.
		//java bu degisimdeki array ve list i senkronize eder.birinde yaptigimiz
		//degisiklik otomatik olarak digerini de update eder.
		
		
		//arr1 array ve list1 listesi sekron calisir,birinde yaptigimiz degisiklik digerine de islenir  		
		arr1[1]=5;
		System.out.println(Arrays.toString(arr1));
		System.out.println("list1: "+list1);
		
		list1.set(2,13);
		System.out.println("list1: "+list1);
		System.out.println(Arrays.toString(arr1));//list ile array senkronize calisiyorlar.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
