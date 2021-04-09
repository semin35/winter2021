package day47_queue_maps;

import java.util.Deque;
import java.util.LinkedList;

public class C2_Deque {

	public static void main(String[] args) {
		// De: double Ended(cift tarafli)

		Deque<String> dk1=new LinkedList<>();
		dk1.addFirst("C");
		dk1.add("M");
		dk1.add("A");
		
		System.out.println(dk1);
		dk1.addLast("L");
		System.out.println(dk1);
		
		System.out.println(dk1.getFirst());
		System.out.println(dk1.getLast());
		
		System.out.println(dk1.hashCode());
		
		System.out.println(dk1.pop());
		System.out.println(dk1);
		
	}

}
