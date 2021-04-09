package day43_interfaces;

public interface Interface02 {
	
	//buradaki default ve static bizim bildigimiz 
	//default ve static mi?
	//cevap hayir
	
		
	public default void deneme() {
		System.out.println("default keywordlu method calisti");
		
	}
	
	//default access modifierdi
	//bir methodda birden fazla access modifier olur mu
	//bizim interfacede olusturdugumuz tum methodlar publicdir.
	//interfacede default keyword kullanarak concrete olusturabiliriz
	//buradaki default keywordu access modifier degil javanin
	//ozel bir cozumudur.
	//buradaki default keyword basina yazildigi methodun 
	//concrete oldugunu belirtir.
	
	static void deneme2() {
		System.out.println("static keywordlu method calisti");
	}
	//yukarida default keywordu icin yazdiklarimiz static icin de gecerlidir.
	//static ve default keywordu kullanarak olusturdugumuz methodlar 
	//override edilmek zorunda degildir.

}
