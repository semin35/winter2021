package day25_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		//Array (diziler): javada birden fazla variable store etmek icin kullanilan
		//objelerden biridir.Array olusturulurken 2 seyi declare etmeliyiz
		//1.data type:bir arrayin icerisinde sadece ayni data tipinden elemanlar
		//olabilir.2.uzunluk:uzunluk arrayin icerisine konulacak max.eleman 
		//sayisini belirtir ve bundan fazlasini koymak istersek RTE verir.
		
		int arr[]= {10,23,54};//lenght=3
		String isimler[]=new String[4];//lenght=4 olan bos bir array olusturur.
		
		//arrayde primitive datalar veya non-primitive datalarin referanslari
		//store edilebilir.
		//mesela isimler arrayinin icinde isim degerleri degil,
		//isimlerin referanslari olur.
		//arrayin elemanlarina ulasma ve update etme
		
		System.out.println(isimler[1]);
		isimler[2]="Boss";
		isimler[0]="Elveda";
		isimler[1]="Oguzhan";
		isimler[3]="Bilal";
		
		//arrayin tum elemanlarini yazdirma
		
		System.out.println(Arrays.toString(isimler));//[Elveda, null, Boss, null]
		
		//method kullanmadan tum elemanlari yazdiralim.loop lazim
		
		for (int i = 0; i < isimler.length; i++) {
			System.out.print(isimler[i]+" ");
			
		}
		System.out.println(arr);
		
		//arrayin elemanlarini nasil siralayabiliriz
		
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));
		
	}

}
