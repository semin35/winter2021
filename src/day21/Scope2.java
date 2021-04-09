package day21;

public class Scope2 {

	public static void main(String[] args) {
		//static variable icin obje olusturma ihtiyaci yoktur.
		//baska bir classtan static variablelara ulasmak istedigimizde
		//ulasmak istedigimiz classin adi.static variable adi yazmamis 
		//yeterlidir.
		
		System.out.println(Scope1.okulAdi);
		System.out.println(Scope1.okulId);//java run time programdir.
		//Scope2 Classi calistirildiginda Scope1 calismazzz
		//dolasiyla en basta olusturulan ve ya atanan degerler gecerli olur.
		
		Scope1.okulAdi="mehmet koleji";
		System.out.println(Scope1.okulAdi);
		
		Scope1.staticMethod();
		System.out.println(Scope1.okulId);
		System.out.println(Scope1.okulAdi);
	}

}
