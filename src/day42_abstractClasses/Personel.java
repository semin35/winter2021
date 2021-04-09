package day42_abstractClasses;

public abstract class Personel {
	//bir classi abstract yapmak icin class keywordunden once 
	//abstract yazmak yeterlidir,
	
	//abstract bir classin icinde bir variable olabilir mi?
	//variable olabilir.
	
	public String isim="Yasin";
	
	//variable lar abstract olur mu?
	//olmaz cunku variable larda body yoktur,
	
	//public abstract int sayi=10; illegalmodifier...
	
	//abstract classin tum concrete childlari abstract classdaki
	//tum dinamik ozellikleri yani methodlari override etmek zorundadir,
	
	//bir method abstract olur mu ve nasil yapilir?
	
	public abstract void maasHesapla();
	public abstract void mesaiBilgisi();
	
	//bir abstract class da concrete method yazilabilir mi?
	
	//bir abstract class da concrete ve abstract classlar olabilir
	//concrete child classlar abstract methodlari override etmek zorundadir
	//ama concrete methodlari override etmek istege baglidir.
	public void ozelSigorta() {
		System.out.println("bu personel ozel sigorta kapsamindadir");
	}
	
	
	
	
	

}
