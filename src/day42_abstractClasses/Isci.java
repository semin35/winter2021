package day42_abstractClasses;

public class Isci extends Personel {

	public static void main(String[] args) {
		Isci isci1=new Isci();
		isci1.maasHesapla();
		isci1.mesaiBilgisi();
		isci1.isim="Rumeysa";
		isci1.ozelSigorta();//abstract classdaki concrete methodu istersem kullanabilirim
		System.out.println(isci1.isim);
		
	}

	@Override
	public void maasHesapla() {
		//parent classdaki abstract methodu implement etti.
		//1-sen abstract bir classi parent edindiysen mutlaka oradaki
		//abstract methodu implement etmelisin
		//2-parent classdaki methodda body olmadigi icin onu kullanmanin
		//anlami yok biz child class da body olan method(concrete)kullanip 
		//islem yapmaliyiz.
		System.out.println("isciler icin maas 5000 tl");
		
	}

	@Override
	public void mesaiBilgisi() {
		
		System.out.println("isciler gunluk 8 saat calisir");
	}

}
