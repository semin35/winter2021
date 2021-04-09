package day31_Varargs;

public class C3_Varags02 {

	public static void main(String[] args) {
		// istedigimiz kadar sayi girdigimizde tum sayilari toplayan
		//bir method yazalim.
		
		//var==>variety cesitlilik, args===>arguments
		
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,6,8,10,45,78,-12);
		

	}

	public static void toplama(int...var) {
		int toplam=0;
		// data turunden sonra yazdigimiz ... varags kullanacagimiz anlamina gelir.
		//i varags in adi,var yapabiliriz
		for (int each : var) {//var a git her bir int bana getir.
			toplam+=each;
			
		}
		
		System.out.println("toplam: "+toplam);
		
	}

}
