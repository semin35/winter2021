package day28_foreachLoop;


import java.util.ArrayList;
import java.util.List;

public class C3_ForEachLoop3 {

	public static void main(String[] args) {
		// verilen bir arraydeki tum elemanlari bir listeye 
		//aktaran bir method yaziniz.
		
		
		String arr[]= {"Ali","Veli","Ayse","Fatma"};
		
		List<String> list=listeyeCevir(arr);
		list.add(0,"bu is bu kadar");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);

	}

	public static List<String> listeyeCevir(String[] arr) {
		
		List<String> geciciList=new ArrayList<>();
		for (String each : arr) {
			geciciList.add(each);
			
			
		}
		
		
		return geciciList;
	}

}
