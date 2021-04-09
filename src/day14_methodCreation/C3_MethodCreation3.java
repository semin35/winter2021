package day14_methodCreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {
		//verilen 3 double sayinin ortalamasini yazdiran bir method yazin
		//main method icinden cagirarak methodu calistirin

		ortalama(60,67);
		ortalama(45,80,43);
	}
	
	
	public static void ortalama(double sayi1,double sayi2,double sayi3) {
		System.out.println("verilen 3 sayinin ortalamasi: "+(sayi1+sayi2+sayi3)/3);
		
		
	}
	public static void ortalama(double sayi1, double sayi2) {
		System.out.println("girdiginiz iki sayinin ortalamasi: "+(sayi1+sayi2)/2);
	}
}
