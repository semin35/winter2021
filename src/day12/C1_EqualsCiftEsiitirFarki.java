package day12;

public class C1_EqualsCiftEsiitirFarki {

	public static void main(String[] args) {
		
		String str1="Ali Can";
		String str2= str1+ "" ;//Ali Can
		
		System.out.println(str1==str2);//adressler ayni olmadigi icin false
		//==ler stringlerin hem degerlerine hem adreslerine bakar
		//bu ornekte str1+""yazdiginizda concatenation yapildigi icin java 
		//yeni bir obje olusturur ve islemin sonucunu yeni objenin icine koyar.
		//str1 ve str2 yi karsilastirirsak degerleri ayni fakat adresleri 
		//farkli oldugu icin false doner.
		
		System.out.println(str1.equals(str2));//sadece stringe bakar
		//equals() methodu sadece Stringlerin degerlerini karsilastirir.
		//bu ornekte str1 ve str2 nin degerleri ayni oldugu icin true doner.
		
		String str3=str1;
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		
		
	}

}
