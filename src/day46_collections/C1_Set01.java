package day46_collections;

import java.util.HashSet;
import java.util.Set;

public class C1_Set01 {

	public static void main(String[] args) {
		
		Set<String> set1=new HashSet<>();
		set1.add("F");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("B");
		set1.add("A");
		
		System.out.println(set1);
		System.out.println(set1.hashCode());
		
		set1.add("M");
		set1.add("E");
		System.out.println(set1);
		
		//set de onemli olan ozellik no dublication; ve
		//elemanin kumede olup olmamasidir. siralama 
		//set icin onemli degildir.Set icin elemanlari 
		//girdigimiz sirada verir ve ya elemanlari natural siralama
		//ile verir gibi bir cumle kullanamayiz.
		System.out.println(set1.hashCode());
		
		//collectionsda hashCode methodu o collection
		//icindeki hash code larinin toplamini verir.
		//yeni eleman eklersek dogal olarak hash code da degisir;
		

	}

}
