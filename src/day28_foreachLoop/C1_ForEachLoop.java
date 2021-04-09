package day28_foreachLoop;

public class C1_ForEachLoop {
	
	public static void main(String[] args) {
		//bir arrayin tum elemanlarini for loop ile yazdiralim
		int arr[]= {2,4,6,8,10,12};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		//for loop yazmamizin amaci arrayin tum elemanlari uzerinde islem yapmak ise;
		//foreach loop daha kolay yazmamizi saglar.
		
		//each==>herbir demek 
		//foreach loop istedigim bir topluluktaki tum elemanlari 
		//birer birer bana getirir.
		//for each loopun baslangic degeri, bitis degeri ,index i yoktur.
		System.out.println();
		for (int each : arr) {
			System.out.print(each+" ");
		}
		
		
	}
}
