package day11_stringmanipulations;

public class C2_CharAt {

	public static void main(String[] args) {
		// charAt(index) methodu icine yazilan indexteki karakteri alir
		//scan.next().charAt(0) 0.indexdeki karakteri verir
		//index 0 dan baslar
		
		
		
		String str="Java cok guzel";
		System.out.println(str.charAt(0));// J harfini verir
		System.out.println(str.charAt(5));// c harfini verir
		System.out.println(str.charAt(13));//l
		//kelimenin uzunlugu son index+1 dir.
		//son index kelimenin uzunlugu -1 dir.
		
		//System.out.println(str.charAt(15));//exception verdi
		//eger index olarak stringin uzunlugu ya da daha buyuk 
		//bir deger girilirse 
		
		//kullanici 10 harfli bir kelime girerse 
		//bana son harfi verecek kodu yaziniz
		//str.charAt(9)
		
		
		//String str3=5; compile time error CTE
						//kod calismasi javanin farkina varip altini kirmizi cizdigi hatalardir.
		//bu tur hatalar duzeltilmeden java kodu calistirmaz.
		
		
		//System.out.println(str.charAt(15));//bazi hatalar syntax den anlasilmaz
				// ancak kod calistirildiktan sonra java islemi yaparken anlar
				//kod run edildiginde ortaya ciktigi icin bu tur hatalara
				//run time error denir RTE
		
		
		
		
		
		
		
		
		

	}

}
