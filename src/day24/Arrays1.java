package day24;

import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		
		
		//int sayi=10;
		//int sayi2=20;
		//int sayi3=30;
		//String isim="Ali";
		
		//javada birden fazla elemani koyabilecegimiz (store)
		//objeler vardir.ilki arraydir.
		
		int arr[]= {10,20,30};//int[] arr seklinde de kullanilabilir.
				//bu ornekte Arrayin elemanlarini direk yazdigim icin 
				//uzunluk belirtmeye ihtiyac kalmadi.
				//bu kullanimda max eleman sayisi(lenght)yazdigimiz eleman sayisidir.
		
		System.out.println(arr);//array bir objedir.eger direkt olarak arrayi yazdirmak 
		//isterseniz java referansi yazdirir.
		
		System.out.println(Arrays.toString(arr));//[10,20,30]
		
		String takim[]=new String [5];//[null,null,null]
		System.out.println(Arrays.toString(takim));
		
		takim[0]="Ali";
		takim[1]="mustafa";
		takim[2]="hasan";
		System.out.println(Arrays.toString(takim));
		
		//takim[3]="mehmet";//java run time programdir.dolayisiyla array 
		//program calistiginda olusuturulur.Syntex olarak hata olmadiginda CtE olmaz.
		//System.out.println(Arrays.toString(takim));
		
		
		//arraydaki bir elemani guncelleme
		
		//mustafanin yerine kemal gelsin
		takim[1]="kemal";
		System.out.println(Arrays.toString(takim));
		
		//bir arrayin uzunlugunu nasil bulabiliriz
		
		System.out.println(takim.length);//3
						//String deki lenght() idi Array de parantez yok
		
		//Array deki son elemani Mehmet yapalim
		
		takim[takim.length-1]="Mehmet";
		
		System.out.println(Arrays.toString(takim));
		
		//Arrayin elemani sayisi tek ise ortasindaki elemani Can yapalim
		
		if (takim.length%2==1) {
		takim[(takim.length-1)/2]="CAn";
		System.out.println(Arrays.toString(takim));
		}
	}

}
