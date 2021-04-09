package day37_overriding;

public class Isci extends Personel {
	
	public String bolum="Kaynak Atolyesi";
	public int maas=5000;
	public String isim="Mesut";


	
	protected int maasHesapla() {
		return 30*8*15;
	}
	
	public void mesai() {
		System.out.println("isciler gunluk 8 saat calisir.");
	}
	
	
	
	
	//overloading: ayni isimde ama farkli method signaturelara
	//sahip methodlara denir.
	
	public int maasHesapla(int gunSayisi) {
		return gunSayisi*8*15;
	}
	public int maasHesapla(int gunlukCalismaSaati,int gunSayisi) {
		return gunSayisi*gunlukCalismaSaati*15;
	}
	public int maasHesapla(int gunlukCalismaSaati,int gunSayisi,int saatUcreti) {
		return gunSayisi*gunlukCalismaSaati*saatUcreti;
	}

}
