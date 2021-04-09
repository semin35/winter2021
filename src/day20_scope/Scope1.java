package day20_scope;

import java.util.Scanner;

public class Scope1 {
	public int sayi;//class'in icinde ama main methodun disinda olusturulan
			 //static olmayan variablelara 'instance'(object)variable 
			 //denir.Class levelda olusturuldugu icin classin her yerinden 
			 //belli sartlarla kullanilabilir.
	public String isim="mehmet";
	public String soyIsim;//null
	public char ilkHarf;
	boolean izindeMi;//default deger false
	public static void main(String[] args) {
		
		//System.out.println(sayi);//static olmayan bir variable a static method
								 //icinden ulasamayiz.main methodumuz static 
								 //oldugu  icin main method icerisinden static
								 //olmayan variable veya methodlara direk ulasamayiz
	//instance bir variable a main method icerisinden ulasmak istedigimizde
	// Object olusturmaliyiz.
	//instance variable'lar object e bagli olarak calisir(ogretmen adi)
		
		Scanner scan=new Scanner(System.in);//bu javadaki standart obje olusturma formudur.	
		
		Scope1 obj1=new Scope1();
		System.out.println(obj1.sayi);//java kendi deger atadi 0
		System.out.println(obj1.isim);
		System.out.println(obj1.soyIsim);//java kendi deger atadi null
		//instance variablelar olusturuldugunda biz istersek deger atayabiliriz
		//instance variable lara eger biz deger atamazsak Java default deger atar
		Scope1 obj2=new Scope1();
		obj2.isim="muslum";
		obj2.soyIsim="baba";
		
		System.out.println(obj2.isim+" "+obj2.soyIsim);//muslum baba
		System.out.println(obj1.isim+" "+obj1.soyIsim);//mehmet null
		
		System.out.println(obj2.izindeMi);//false
		System.out.println(obj2.ilkHarf);//default deger bosluk
		
		Scope1 obj3=new Scope1();
		obj3.isim="ferdi";
		obj3.soyIsim="tayfur";
		obj3.izindeMi=true;
		System.out.println(obj3.isim+" "+obj3.soyIsim+" "+obj3.izindeMi);
		
		scan.close();
	}
	public static void staticMethod() {
		System.out.println("static method calisti");
	}
	
	public void method() {
		System.out.println(sayi);//bu method static olmadigi icin instance varaiablelara direk erisebilir;
		sayi=sayi+20;//
	}
}
