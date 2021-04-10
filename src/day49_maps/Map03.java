package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class Map03 {

	public static void main(String[] args) {
		
		Map<Integer,String> map1=new HashMap<>();
		map1.put(101, "Ali,Can,Java");
		map1.putIfAbsent(102,"Veli,Yan,Java");
		map1.put(103,"Ali,Yan,C#");
		
		System.out.println(map1.get(101));
		System.out.println(map1.get(105));
		System.out.println(map1.getOrDefault(105,"aradiginiz bu mapte yok"));
		System.out.println(map1.keySet());
		map1.replace(103,"Mesut,Aksu,Java");//put ile de bu islemi yapabiliriz
		
		Map<String,Integer> map2=new HashMap<>();
		map2.put("h",1);
		map2.put("e",1);
		map2.put("l",2);
		map2.put("o",3);
		System.out.println(map2);
		
		map2.compute("h",(key,value)->10);
		System.out.println(map2);
		
		map2.computeIfAbsent("A",v->15);
		map2.computeIfAbsent("h",v->5);
		System.out.println(map2);
		
		map2.computeIfPresent("h", (key,value)->20);
		map2.computeIfPresent("m", (key,value)->20);
		System.out.println(map2);
	}

}
