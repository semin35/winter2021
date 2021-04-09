package day10_switchcase;

public class C7_StringManipulation {

	public static void main(String[] args) {
		// manipulation: degistirmek , donusturme
		// stringi degistirme 
		//string non primitive data turundendir 
		//non primitive data turleri value ile birlikte methodlara sahiptirler
		//methodlari kullanarak degistirmeye string manipulation denir.
		
		String str= "Hello World";
		
		System.out.println(str.toUpperCase());//HELLO WORLD
		System.out.println(str);//Hello World cunku bir assigment yapmadik
		
		String str2=str.toUpperCase();
		System.out.println(str);//Hello World
		
		System.out.println(str2);//atama oldugu icin HELLO WORLD
		//methodlarla kalici olarak degistirmiyoruz 
		//sadece isimizi halletmek icin kullanmak istedigimiz sekle donduruyoruz
		//sonra tekrar ayni haline kaliyor
		
		
	}

}
