package day29_passbyvalue;

import java.util.ArrayList;
import java.util.List;

public class C4_Immutable01 {

	public static void main(String[] args) {
		
		String isim="Ali";
		isim.concat("Can");
		
		System.out.println(isim);
		System.out.println(isim.concat("Can"));
		System.out.println(isim);
		
		//Stringlerde method ile yaptigimiz degisiklikler kalici olmaz.
		//cunku java String classini immutable yapmistir.
		List<String> isimList=new ArrayList<>();
		System.out.println(isimList);
		isimList.add("Ali");
		isimList.add("Can");
		System.out.println(isimList);
		isimList.remove(1);
		System.out.println(isimList);
		
		//List lerde method ile yaptigimiz degisiklikler kalici olarak liste islenir.
		//cunku list mutabledir.
		
		
		
	

	}

}
