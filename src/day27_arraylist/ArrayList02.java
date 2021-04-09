package day27_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
    List <String> list=new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Fatma");
		
		System.out.println(list);
		
		list.set(2,"Kemal");
		System.out.println(list);
		
		list.set(0,"Semih");
		System.out.println(list);
		
		//list.set(5,"Ela");olmayan bir index kullanilirsa
		//RTE hata verir.
		
		list.add(2,"Yasin");
		System.out.println(list);//istedigimiz index e ekleme yapar
		
		list.add(5,"Hurriyet");
		System.out.println(list);
		
		System.out.println(list.contains("Hurriyet"));
		System.out.println(list.contains("Mehmet"));
		
		//list elemanlarini siralama
		Collections.sort(list);
		System.out.println(list);
		
		

	}

}
