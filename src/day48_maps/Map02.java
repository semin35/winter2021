package day48_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map02 {

	public static void main(String[] args) {
		//Asagida verilen  mapte yazilim dili java 
		//olan kisi isimlerini bir
		//liste olarak yazdiran bir method yaziniz
		
		Map<Integer,String> map1=new HashMap<>();
		
		
		map1.put(101,"Ali,Can,java");
		map1.put(102,"Veli,Yan,java");
		map1.put(103,"Ali,Yan,C#");
		
		String istenenDil="JAVA";
		
		List<String> isimList=javaBilenler(map1,istenenDil);
		System.out.println(isimList);
		System.out.println(map1.values());

	}

	private static List<String> javaBilenler(Map<Integer, String> map1, String istenenDil) {
		
		List<String>isimListesi=new ArrayList<>();
		
		for (String each : map1.values()) {
			
	
			String arr[]=each.split(", ");
			if(arr[2].equalsIgnoreCase(istenenDil)) {
				isimListesi.add(arr[0]);
			}
			
		}
		System.out.println(map1.values());
		
		return isimListesi;
	}

}
