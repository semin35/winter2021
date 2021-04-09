package day33_oop;

public class Encapsulation03 {

	public static void main(String[] args) {
		// Encapsulation02 classindaki class membera ulasmaya calisalim.
		Encapsulation02 obj1=new Encapsulation02();
		Encapsulation02 obj2=new Encapsulation02();
		
		//biz erisim yetkisini ikiye ayiriyoruz
		//1.okuyabilme
		//2.degistirip kullanabilme
		
		System.out.println(obj1.sayi);
		obj1.sayi=25;//public oldugu icin hem okunur hem deger atanir
		System.out.println(obj1.sayi);//25
		
		System.out.println(obj2.sayi);//100 degisiklik obje icerisinde kalir.
		
		
		System.out.println(obj1.getOkulIsmi());//get methodu oldugu icin sadece bilgi verir.
		//obj1.getOkulIsmi()="Mehmet Koleji" sadece okur degistiremez
		
		obj1.setTcNo("23449579402");
		//System.out.println(obj1.setTcNo("23449579402"););
		//set methodu okumaya izin vermez.
		
		
		
		obj1.setHesapNo(546789);
		// Bir Class içinde class member oluşturuken
		//bunu diğer class lar ile
		// ne oranda paylaşacağımıza karar veririz
		// 1- Herkes okuyabilsin ve obje üzerinden 
		//değer atayıp kullanbilsin ==> public
		// 2 - Herkes okuyabilsin ama kimse obje uzerinden 
		//de olsa değiştiremesin Private ==> Public get();
		// 3 - İlk atadığım değeri kimse goremesin Private ==> Public set ()

		
	}

}
