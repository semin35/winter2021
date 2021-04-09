package day41_errors_garbagecollector;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector01 {

	public static void main(String[] args) {
		
		String str="";
		for (int i = 0; i < 1000; i++) {
			str+=i;
		}
		//bu kod calistiginda kac tane obje olusur?
		//1001
		//ilk basta 1 tane olusturduk
		//sonra her dongude str a concatination yapilacak
		//ama String classi immutable oldugu icin her yeni
		//degeri koymak icin yeni bir String objesi olusturulur
		//ve eski objeden pointer silinir
		
		//dolayisi ile loop bittiginde str icin bir tane pointerin
		//isaret ettigi obje,1000 tane de hic bir pointerin isaret etmedigi
		//obje heap memoryde bulunur.
		
		List <Integer> list=new ArrayList<>();
		//bu satir javaya yeni bir obje olusturmasini soyluyor
		//java yeni obje icin yer varmi diye memory i kontrol eder
		//ve memory kritik seviyede ise 
		//Garbage Collectoru devreye sokuyor...
		
		//Garbage Collector de finalize() methodunu calistirir.
		//finalize() methodu silinecek objeleri isaretler ve sonra
		//Garbage Collector finalized olan objeleri siler.
		
		
		
		
		
		
		
		
		
	}

}
