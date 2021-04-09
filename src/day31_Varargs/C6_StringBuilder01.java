package day31_Varargs;

public class C6_StringBuilder01 {

	public static void main(String[] args) {
		
		StringBuilder sb1=new StringBuilder();//bos bir sb olusturur.
		System.out.println("sb1: "+sb1);
		
		StringBuilder sb2=new StringBuilder("Mehmet");//icinde mehmet degeri olan bir sb uretir.
		System.out.println("sb2: "+sb2);
		
		StringBuilder sb3=new StringBuilder(10);//10 karakter kapatisesi olan bir sb uretir.
		System.out.println("sb3: "+sb3);
		
		sb1.append(" hoca");
		System.out.println("sb1: "+sb1);
		
		sb2.append(" hoca");
		System.out.println("sb2: "+sb2);

		sb3.append(" hoca");
		System.out.println("sb3: "+sb3);
		
		System.out.println("sb1 uzunluk"+sb1.length());
		System.out.println("sb1 kapasite"+sb1.capacity());
		
		System.out.println("sb2 uzunluk"+sb2.length());
		System.out.println("sb2 kapasite"+sb2.capacity());
		
		System.out.println("sb3 uzunluk"+sb3.length());
		System.out.println("sb3 kapasite"+sb3.capacity());
		
		//capacity hafiza yonetimi icin cok onemli
		//kod yazilirken sabit uzunluk ve ya max uzunluk belli ise
		//3.method ile olusturarak hafiza kullanimini optimize edebiliriz.
		
	}

}
