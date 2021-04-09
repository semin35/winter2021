package day29_passbyvalue;

public class C1_PassByValue01 {

	public static void main(String[] args) {
		// PassByValue ve PassByReference 
		
		/*Soru : Verilen bir fiyat icin %10 indirim yapan
		 *  bir method olusturun.
  - Method�da indirim uygulanan fiyati yazdirin
  - Method Call sonrasi original fiyati yazdirin ve
   method�da yapilan degisikligin  orginal degeri
    degistirip degistirmedigini kontrol edin.
				 */
		int fiyat=100;
		
		
		indirimUygula(fiyat);
		
		
		System.out.println("method call sonrasi fiyat: "+fiyat);
		
		
		
		

	}

	public static void indirimUygula(int fiyat) {
		System.out.println("%10 indirimli fiyat: "+fiyat*0.90);
		
	}

}
