package day13_stringmanipulation;

public class C3_StartsWithIsEmpty {

	public static void main(String[] args) {
		
		String str="her gun Java olsa";
		
		System.out.println(str.startsWith("h"));//true
		System.out.println(str.startsWith("her "));//true
		System.out.println(str.startsWith("g",4));//true
		System.out.println(str.startsWith("java",8));//false
		
		System.out.println(str.isEmpty());//false
		
		String str2="";
		System.out.println(str2.isEmpty());//true
		
		//String str3=null;//null bir deger degildir 
		//sadece str3 un hicbirseye esit olmadigini gosteren pointerdir.
		//System.out.println(str3.isEmpty());//rte
		//null string manupilationda run time error verir.
	}

}
