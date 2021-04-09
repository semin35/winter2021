package day37_overriding;

public class Formen extends Isci{
	public String sorumluOldBolum="bakim";
	public String isim="Emrullah";

	public static void main(String[] args) {
		
		//inheritance da data type olarak class ismi kullanimi
		
		//bir classda obje uretirken data turu olarak classin kendisini ve ya parent
		//kullanabiliriz.olusturdugumuz obje ile variable kullanmamiz gerekirse, hangi degeri
		//alacagini anlamak icin once data turu olan class a gideriz orada aradigimiz variable varsa
		//kullaniriz yoksa parentlerina bakariz, yukari dogru giderken ilk buldugumuz degeri kullaniriz
		
	
		
		Formen fr1=new Formen();
		//fr1 objesini kullanarak hangi classlarin variablelarini gorebilirim
		//formen,isci,personel
		fr1.sorumluOldBolum="Marangozhane";
		fr1.maas=10000;
		System.out.println(fr1.isim+" "+fr1.sorumluOldBolum+" "+fr1.maas);
		//Emre Marangozhane 10000
		
		
		Isci fr2=new Formen();
		//Data turu olarak isci secildigi icin formeni goremem
		//isci sinifini ve parentini gorururuz
		
		fr2.bolum="Kaynak atolyesi";
		
		
		System.out.println(fr2.isim+" "+fr2.bolum+" "+fr2.maas);

		Personel fr3=new Formen();
		System.out.println(fr3.isim);//Emre
		
	}

}
