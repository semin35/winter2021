package day34_inheritence;

public class Isci extends Muhasabe{

	public static void main(String[] args) {
		
		Isci isci1=new Isci();
		isci1.isim="Omer";
		isci1.soyIsim="Aydin";
		isci1.id=1001;
		isci1.izindeMi=false;
		isci1.saatUcreti=10;
		isci1.statu="Isci";
		isci1.maas=isci1.maasHesapla();
		
		
		System.out.println(isci1.isim+" "+isci1.soyIsim+" "+
		isci1.id+" "+isci1.statu+" "+isci1.maas);
		
		//bu derse kadar hangi classdan bilgi elde etmek istiyorsak
		//o classdan obje olusturduk inheritence ile bu mecburiyet ortadan
		//kalkti.
		//child classta olusturdugumuz obje ile tum parent classlarda 
		//bulunan variable ve methodlari inherit edebilirim.
		
		Isci isci2=new Isci();
		isci2.isim="Esat";
		isci2.soyIsim="Okumus";
		isci2.id=1002;
		isci2.izindeMi=true;
		isci2.saatUcreti=15;
		isci2.statu="Isci";
		isci2.maas=isci2.maasHesapla();
		
		
		System.out.println(isci2.isim+" "+isci2.soyIsim+" "+
		isci2.id+" "+isci2.statu+" "+isci2.maas);

	}

}
