package day40_Exception;

public class Exceptions03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,4,7,8};
		
		
		try {
		System.out.println(arr[8]);
		
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}finally {
			System.out.println("ne olursa olsun bu satir yazilsin");
		}
		
		//Finally blogu try-catch blogu ile veya sadece 
		//try blogu ile calisabilir. 
		//try blogu sadece catch ile mi calisir?
		//hayir catch olmadan finally ile de calisabilir.
		//ama tek basina calisamaz.
		//finally blok her durumda calisir,dosyayi kapatmak icin kullanilabilir.
		//finally blogu catch ile ongordugum bir sorun oldugunda cALISTIGI GIBI 
		//ongoremedigim durumlarda da calisir
		
	}

}
