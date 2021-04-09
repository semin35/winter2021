package day47_queue_maps;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C1_Queue01 {

	public static void main(String[] args) {
		//queue bir interfacedir obje uretemeyiz child class i olan
		//priority ve linkedlist constructor secimine gore olusturdugumuz
		//queue nin durumuna gore
		
		Queue<String> k1=new PriorityQueue<>();

		k1.add("D");
		k1.add("C");
		k1.add("M");
		k1.add("A");
		
		System.out.println(k1);
		//Queue yapisi geregi insertion order a gore siralama
		//yapmasi beklenir ancak constructor olarak priority 
		//Queue sectigimiz icin java tarafindan belirlenen 
		//priority e gore siralama yapar
		
		//biz de istersek priority kuralini tanimlayabiliriz o zaman
		//bizim istedigimize gore siralar.
		
		Queue<String> k2=new LinkedList<>();
		//ayni elemanlarla fakat LinkedList constructor i kullanarak
		//olusturdugumuz queue ise beklenenlere uygun olarak ekleme
		//sirasina gore yazdirir.

		k2.add("D");
		k2.add("C");
		k2.add("M");
		k2.add("A");
		
		System.out.println(k2);
		k2.offer("Z");//sona ekler
		System.out.println(k2);
		
		System.out.println(k2.peek());//silmeden ilk elemani bize dondurur
		
		System.out.println(k2.poll());
		System.out.println(k2);//ilk siradakini siler
		
	}

}
