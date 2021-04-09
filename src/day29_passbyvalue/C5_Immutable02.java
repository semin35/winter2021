package day29_passbyvalue;

public class C5_Immutable02 {

	public static void main(String[] args) {
		//degisikligi kalici yapmak icin atama yaparsak 
		//immutable classlar nasil davranir?
		
		String isim="Ali";
		
		isim=isim+"";
		
		System.out.println(isim.equals("Ali"));
		System.out.println(isim=="Ali");//==hem degere hem de referansa bakar
		
		String str1=new String("Mehmet");
		String str2=new String ("Mehmet");
		System.out.println(str1==str2);//false
		System.out.println(str1.equals(str2));//true
		
		String str3="Mehmet";
		String str4="Mehmet";
		System.out.println(str3==str4);//true
		System.out.println(str3.equals(str4));//true
		
		System.out.println(str3==str1);//false
		System.out.println(str3.equals(str1));//true
		

	}

}
