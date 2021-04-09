package day33_oop;

import day20_scope.Scope1;
import day21.Scope6;

public class Encapsulation {

	public static void main(String[] args) {
		// OOP concept
		//Object Oriented Programing
		//bir proje kapsamindaki classlarda olusturulan variable
		//ve methodlarin baska classlarda tekrar tekrar yazilmamasi
		//var oldugu classdan obje uretilerek bu variable ve methodlarin
		//istendigi kadar kullanilmasidir.(reusability)
		//write once reuse everywhere
		
		//scope6 classindaki variable ve methodlara ulasmak istiyorum.
		//bunun icin scope6 classindan obje uretmeliyiz.
		
		Scope6 obj1=new Scope6();
		//esitligin sol tarafi declaration
		//declaration 2 parcadir.ilk parca data turu ikinci kisim isim
		//non-primitiveler icin data turu ayni zamanda class ismi olabilir
		//esitligin saginda ise deger;2 parcadan olusur.
		//new keywordu ve constructor
		//constructor hangi classdan obje uretmek istersek o classin 
		//constructorunu kullaniriz.
		
		//obje olusturma illa ki main methodun icerisinde olmasina gerek yok
		
		obj1.num1=10;
		System.out.println(obj1.num1);
		
		obj1.add();
		
		//deneme methodunu main method icerisinden cagirabilir miyiz
		
		//deneme methodu static olmadigi icin main methoddan
		//direk cagirilamaz.bunun yerine icinde oldugumuz classdan 
		//bir obje uretip onun uzerinden static olmayan methodlara da ulasabiliriz
		
		Encapsulation obj3=new Encapsulation();
		obj3.deneme();
	
		
	}
	public void deneme() {
		//projemiz kapsaminda bulunan tum classlardan public 
		//variable ve methodlara istedigim yerden obje ureterek 
		//ulasabilirim.eger ulasmak istedigim class uyeleripublic 
		//degilse baska packagelerden ulasmak icin extra islem 
		//yapmamiz gerekir.
		Scope1 obj2=new Scope1();
		obj2.isim="Ahmet";
		obj2.soyIsim="Ozcelik";
		obj2.sayi=20;
		obj2.method();
		
		//ben istedigim classdan obje uretip oradaki public class uyelerine ulasabiliriz.
		
	}
	
	

}
