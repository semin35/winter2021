package day26_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C3_ArrayList02 {

	public static void main(String[] args) {
		// Listin uzunlugu nasil bulunur
		
		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(12);
		list.add(20);
		
		list.size();
		System.out.println(list.size());
		
		//bir eleman nasil silinir
		
		list.remove(1);
		System.out.println(list);
		
		System.out.println(list.remove(2));//12 yazar
		//remove(index)kullandigimizda o indexteki elemani remove eder
		//ve bunun delili olarak o elemani bize getirir.
		//eger olmayan bir index verirsek RTE verir.
		System.out.println(list);
		
		List<String> list2=new ArrayList<>();
		list2.add("Ali");
		
		System.out.println(list2.remove("Hasan"));
		System.out.println(list2);
		
		//remove(object) metodu kullanildiginda eger java istenen elemani
		//bulup remove ederse bize true;listede 
		//bulumazsa istegin yerine getirilemedigini anlamamiz icin false dondurur.
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
