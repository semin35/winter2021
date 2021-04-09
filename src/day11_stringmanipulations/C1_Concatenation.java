package day11_stringmanipulations;

public class C1_Concatenation {

	public static void main(String[] args) {
		// Javada toplama islemi yapilirken eger toplanan ifadelerden 
		//biri veya her ikisi string ise toplama degil birlestirme yapar.
		
		System.out.println(15+20+"merhaba");//35merhaba
		System.out.println("merhaba"+15+20);//merhaba1520
		System.out.println("merhaba"+(15+20));//merhaba35
		System.out.println("merhaba"+15*20);//merhaba300
		
		
		String str1="Hello";
		String str2="World";
		
		//Hello World yazdirmak istersek
		
		System.out.println(str1+" "+str2);
		System.out.println(str1.concat(str2));//HelloWorld
		System.out.println(str1.concat(" ").concat(str2));//Hello World
		System.out.println(str1.concat(" "+str2));//Hello World
		
	}

}
