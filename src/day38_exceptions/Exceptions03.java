package day38_exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		//try-catch blogundaki e nin gorevi
		
		int sayi1=10;
		int sayi2=0;
		
		
		Exceptions01 exp=new Exceptions01();
		//esitligin solundaki Exceptions01 hem class adi hem de 
		//exp objesi icin data turu
		
		try {
		System.out.println(sayi1/sayi2);
		}catch(ArithmeticException e) {
			//ArithmeticException javada bir class ve e objesi icin 
			//data turu e ise ArithmeticException classindan 
			//olusturdugumuz objenin adi o zaman ismi e olmak
			//zorunda degiliz ama genelde e kullanilir.
			System.out.println("sayiyi sifira bolemezsin");
			System.out.println(e);
			//bu durumda hem javaya sorunu yazmasi icin firsat 
			//vermis hem de applicationi bloke etmemis oluruz
			System.out.println(e.getMessage());//problemin ne oldugunu soyler
			
			e.printStackTrace();//problemin tamamini yazdirir.
		}
		System.out.println("kod bloke olmadi");
	}

}
