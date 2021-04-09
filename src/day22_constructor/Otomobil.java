package day22_constructor;

public class Otomobil {

	public Otomobil(String renk) {//istersek constructor i parametlili
		//olarak da olusturabiliriz.
		
		
	}
	public Otomobil() {
		
	}
	
	//onemli not:default constructor dan baska bir constructor
	//yazdigimizda java default olani yok ettigi icin mutlaka biz default 
	//yerine de constructor yazmaliyiz.
	
	//biz bir constructor olusturdugumuzda java defaultu yok eder
	//dolayisi ile bir constructor olusturdugumuzda mutlaka default 
	//dafault constructorun yerine bir yenisini yazmaliyiz
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	static int aracId=1201;
	
	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak  "+yakit+" kullanir");
	}
	public void vites(String vites) {
		System.out.println("Araba "+vites+" viteslidir");
	}

		

	

}
