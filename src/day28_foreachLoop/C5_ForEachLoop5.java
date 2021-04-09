package day28_foreachLoop;

import java.util.ArrayList;
import java.util.List;

public class C5_ForEachLoop5 {

	public static void main(String[] args) {
		// Bir integer list olusturunuz ve
		// bu list�deki tum sayilarin karesinin toplamini
		// For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.

		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(3);
		list.add(8);
		
		System.out.println(list);
		
		int kareToplami=0;
		
		for (Integer each : list) {
			kareToplami+=each*each;
						
		}
		
		System.out.println(kareToplami);
	}

}
