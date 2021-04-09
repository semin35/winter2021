package day12;

public class C2_EqualsIgnoreCase {

	public static void main(String[] args) {
		//equalsIgnoreCase() method`u karsilastirdigi Stringlere case sensitive
		//(buyuk kucuk harf duyarliligi) olmaksizin bakar.
		//stringler ayni ise true; ayni degilse false doner.
		
		String str1="Ali Can";
		String str2="ali Can";
		String str3="Ali can ";
		System.out.println(str1.equals(str2));//false
		
		System.out.println(str1.equalsIgnoreCase(str2));//true
		
		System.out.println(str1.equals(str3));//false
		System.out.println(str1.equalsIgnoreCase(str3));//false
		
	

		
	}

}
