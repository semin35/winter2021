package day45_collections;

import java.util.LinkedList;

public class C2_LinkedList02 {

	public static void main(String[] args) {
		
	LinkedList<Object>ll1=new LinkedList<>();
	System.out.println(System.currentTimeMillis());
	for (int i = 0; i < 1000; i++) {
		
	
	ll1.add("A"+i);
	ll1.add(20+i);
	ll1.add('C'+i);
	}
	System.out.println(System.currentTimeMillis());
	//System.out.println(ll1);
	
	LinkedList ll2=new LinkedList<>();
	
	ll2.add("B");
	ll2.add(25);
	ll2.add('K');
	System.out.println(ll2);
	
	LinkedList<String>ll3=new LinkedList<>();
	
	ll3.add("D");
	ll3.add(""+15);
	ll3.add(""+'C');
	System.out.println(ll3);
	
	

	}

}
