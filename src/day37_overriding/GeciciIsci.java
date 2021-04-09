package day37_overriding;

public class GeciciIsci extends Isci{

	public String calistigiBolum="Yemekhane";
	
	public static void main(String[] args) {
		
		//overriding (gecersiz kilma)
		//bir child classda parent classdan miras alinan
		//methodu degistirmeye overriding denir.
		GeciciIsci gi1=new GeciciIsci();
		
		System.out.println(gi1.maasHesapla());
		gi1.mesai();
		

	}
	//overriding yapmak icin parent classdaki method signature ile
	//child class da bir method olusturulur signature ayni oldugundan sadece body degisir, boylece parent classdaki 
	//method child class icin gecersiz hale gelir.
	public int maasHesapla() {
		return 30*8*10;
	}
	@Override//annotation: 
	public void mesai() {
		//super.mesai();
		System.out.println("Gecici isciler haftada 25 saat calisir.");
		
	}
	
	//annotation:aciklama,dipnot
	//Java 28.satirda kodu inceleyenler icin bir aciklama getiriyor
	
	//annotation olmasi ile olmamasi arasindaki fark
	//annotation bir aciklama degildir
	//override yaptigimiz methodu surekli kontrol eder ve parent classdaki
	//overridden method signature degistirilirse CTE verdirir.
	
	//eger override edilen parent classdaki methodun (overriden)da
	//calismasini istiyorsak overriding methodun super.overridenMethodIsmi
	//yazariz.
	//eger overriding methodda super. yazilmazsa overriden method calismaz.
	
	//access modifier
	//child parenti sinirlandiramaz
	//yani overriding methodun access modifieri overriden methodun
	//access modifierindan daha dar olamaz.
	
	//return type
	//overriden methodun return type'i primitive veya void ise overriding methodun
	//return type da ayni olmalidir.
	//eger return type primitive degil ise 
	//(overriding methodun return type i) Is-A (overriden methodun return type i) olmalidir.
	
}
