package day31_Varargs;

public class C1_Varargs {

	public static void main(String[] args) {
		//Verilen iki sayiyi toplayan ve sonucu yazdiran bir method yaziniz.
		
		int sayi1=10;
		int sayi2=20;
		int sayi3=30;

		toplama(sayi1,sayi2);
				
		//Verilen uc sayiyi toplayan ve sonucu yazdiran bir method yaziniz.
		
		toplama(sayi1,sayi2,sayi3);
		//oyle bir method yazalim ki icine kac sayi yazarsak yazalim toplasin
		toplama(2,3);//iki sayinin toplami methodu
		toplama(2,5,8);// uc sayinin toplami methodu calisir
		//istedigimiz kadar sayiyi yazabilecegimiz methodu 
		//olusturabilmemiz icin varags olusturmus
	}

	public static void toplama(int sayi1, int sayi2, int sayi3) {
		System.out.println("uc sayinin toplami: "+(sayi1+sayi2+sayi3));
		
	}

	public static void toplama(int sayi1, int sayi2) {
		int toplam=sayi1+sayi2;
		System.out.println("iki sayinin toplami: "+toplam);
		
	}

}
