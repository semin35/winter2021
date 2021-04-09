package day42_abstractClasses;

public class C1_Final {
	final static int SAYI=10;
	
	//instance bir variable i final ve static 
	//yaparsaniz java onu biz de ismi buyuk harfle yazariz.
	
	String isim;
	//instance variable lara ilk deger atamasi yapmak zorunda degiliz
	//deger atamadigimizda java data turune gore default bir deger atar.
	
	//final String soyisim;
	//final variablelarin sonradan degeri degistirilemeyecegi icin
	//ilk atama yapilmadan olusturulmasina izin vermez
	
	
	
	public static void main(String[] args) {
	

		System.out.println(SAYI);
		
		System.out.println(Integer.MAX_VALUE);
	}

	public void deneme() {
		System.out.println("deneme yapiyoruz");
	}
	
	public final void deneme2() {
		System.out.println("deneme yapiyoruz 2");
	}
	
	
	
}
