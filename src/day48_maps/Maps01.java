package day48_maps;

import java.util.HashMap;
import java.util.Map;

public class Maps01 {

	public static void main(String[] args) {
		Map<Integer,String> map1=new HashMap<>();
		Map<Integer,String> map2=new HashMap<>();
		
		map1.put(101,"Ali,Can,java");
		map1.put(102,"Veli,Yan,java");
		map1.put(103,"Ali,Yan,C#");
		System.out.println(map1);
		
		map2.put(101,"Vehri,Bas,java");
		map2.put(102,"Esra,Coban,SQL");
		
		System.out.println(map2);
		
		map1.putAll(map2);
		System.out.println(map1);
		
		map2.put(104,"omer,ari,sql");
		map1.putAll(map2);
		System.out.println(map1);
		
		map1.putIfAbsent(102, "ahmet,demir,java");
		System.out.println(map1);
		
		map1.putIfAbsent(100, "ahmet,demir,java");
		System.out.println(map1);
		
		System.out.println(map1.containsKey(100));
		
		System.out.println(map1.containsValue("java"));
		System.out.println(map1.containsValue("ahmet,demir,java"));
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
