package day21;

public class Scope1 {
	static int okulId=1201;
	static String okulAdi="yildiz koleji";
	static boolean acikMi;
	//static variablelar class levelda olusturuldugu icin classin her yerinden
	//kullanilabilir.Instance variablelar static olmayan methodlarda
	//direk kullanilabiliyorken,static methodlarda object olusturularak kullanilabiliyordu
	//static variablelar ise ister static isterse olmayan tum methodlardan direk kullanilabilir
	
	
	public static void main(String[] args) {
		System.out.println(okulId+" "+okulAdi+" "+acikMi);
		okulId=1202;
		acikMi=true;
		staticMethod();
		System.out.println(okulId+" "+okulAdi+" "+acikMi);
	}
	public static void staticMethod() {
		System.out.println(okulId+" "+okulAdi+" "+acikMi);
		okulId=1203;
	}
	public void method() {
		okulId=1205;
	}
	
}
