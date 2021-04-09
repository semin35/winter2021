package day45_collections;

import java.util.LinkedList;

public class C3_LinkedList03 {

	public static void main(String[] args) {
		LinkedList<String> ll1=new LinkedList<>();
		
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);
		
		ll1.remove(0);
		//eger listemiz int lardan olusuyorsa() icine yazdigimiz sayinin
		//index mi yoksa sayi mi oldugunu karistirmamak icin java parantez 
		//icine yazilani index olarak kabul eder.
		System.out.println(ll1);
		
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);
		
		System.out.println(ll1.remove("B"));//true veya false dondurur
		System.out.println(ll1);//ilk b yi sildi
		
		ll1.addFirst("B");
		System.out.println(ll1);
		
		System.out.println(ll1.removeFirstOccurrence("B"));//true veya false dondurur
		System.out.println(ll1);//ilk b yi sildi
		
		ll1.remove();//ilk elemani sildi
		System.out.println(ll1);
		
		
		
	}

}
