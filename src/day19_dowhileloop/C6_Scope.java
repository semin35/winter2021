package day19_dowhileloop;

public class C6_Scope {

	public static void main(String[] args) {
		//bir class icerisinde olusturulan variablelarin nerede gecerli oldugu
		//ve nereden kullanilabildigini o variablen scope i belirler.
		//google javada scope nedir diye bakiyor.
		int sayi=10;
		
		denemeMethod();
		sayi++;
		System.out.println(sayi);

	}

	public static void denemeMethod() {
		
		
	}

}
