package day46_collections;

import java.util.HashSet;
import java.util.Set;

public class C3_HashSet02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1=new HashSet<>();
		set1.add("F");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("B");
		set1.add("A");
		set1.add("D");
		set1.add("Y");
		
		System.out.println(set1);
		set1.clear();
		System.out.println(set1);
		set1.add("F");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		System.out.println(set1);
		Set<String> set2=new HashSet<>();
		set2.add("B");
		set2.add("F");
		set2.add("A");
		System.out.println(set2);
		
		System.out.println(set1.containsAll(set2));
		
		System.out.println(set1.equals(set2));
		
		//set1.removeAll(set2);
		
		
		set1.retainAll(set2);
		System.out.println(set1);
		System.out.println(set2);
		
		
		
	}
}
