package day45_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C1_LinkedList01 {

	public static void main(String[] args) {
		//linked bagli demektir.
		//linked listte tum elemanlar tren gibi birbirine baglidir.
		
		
		//collectionsda obje olustururken olusturmak
		//istedigimiz collectionun classi mi yoksa inteface mi olduguna bakmaliyiz
		//eger olusturmak istedigimiz collection interface ise data turu olarak 
		//o interface i constructor olarak ise uygun bir class secmeliyiz
		//simdiye kadar interface olan list olustururken constructor
		//olarak ArrayList() seciyorduk.
		
		List<String>liste=new ArrayList<>();
		liste.add("X");
		liste.add("Y");
		
		
		LinkedList<String> ll1=new LinkedList<>();
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);
		
		ll1.add(1,"C");
		System.out.println(ll1);
		
		ll1.addAll(liste);
		System.out.println(ll1);
		
		ll1.addAll(2, liste);
		System.out.println(ll1);
		
		ll1.addFirst("D");
		System.out.println(ll1);
		
		ll1.addLast("K");
		System.out.println(ll1);
		
		//linked list list ve Queue interfacelerine implement
		//ile child oldugundan her iki interfacedeki tum methodlari
		//override etmek zorundadir
		//islev olarak ayni isi yapan addLast Queue dan;add ise List
		//den inherit edilmistir.
		
		//ben bir linkedlist olusturmak istiyorum ama sadece list
		//ozelliklerini tasisin 
		
		List<String> listList=new LinkedList<>();
		listList.add("sadece listten gelen ozellikler var");
		
		Queue<String> queList=new LinkedList<>();
		queList.add("sadece queue dan gelen ozellikler var");
		
		
		
		

	}

}
