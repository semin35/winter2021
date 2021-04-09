package day33_oop;

public class Encapsulation02 {
	
	private String okulIsmi="Yildiz Koleji";
	//okul isminin baska classlardan okunmasini ama 
	//deger atanmamasini istiyorsak getter() methodunu olustururuz.
	private String tcNo="12345342323";
	private int hesapNo=5554321;
	//obje olusturularak deger atanip kullanilmasini istedigimiz ama
	//ilk atadigimiz degerin gorunmemesini istiyorsak setter()
	//methodunu kullaniriz.
	public int sayi=100;

	public static void main(String[] args) {
		//eger ulasmak istedigimiz class uyeleri public 
		//degilse baska packagelerden ulasmak icin extra islem 
		//yapmamiz gerekir.

		//yapabilecegimiz islemlerdan 1.si encapsulation(Data saklama)
		//bu classda kimseyle paylasmak istemedigimiz variable ve methodlar
		//olusturalim.
		
		//private yapinca guvenlik konusunu hallettik
		//ancak class uyelerinin private olmasi OOP concept'e aykiri
		
		//encapsulation classimizda olusturdugumuz class uyelerine
		//kimlerin ne oranda ulasabilecegini belirlemek icin yapilir.
		
	}
	
	private void denemeMethod() {
		System.out.println("Deneme methodu calisti.");
	}

	public String getOkulIsmi() {
		return okulIsmi;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
	}

	
	
}
