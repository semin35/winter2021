package day39_exceptions;

public class Exceptions05 {

	public static void main(String[] args) {
		
		
		//kod calisirken javanin karsilasilastigi handle edilebilecek istisnalar
		//1.compile time exceptions filenot found
		//2.run time exceptions ArithmeticExceptions
		//
		
		String str1=" ";
		String str2="";
		String str3=null;//null bir deger degildir.sadece str3un hicbirseye esit olmadigini
		//soyleyen bir isaretcidir.
		
		System.out.println(str1.length());//1
		System.out.println(str2.length());//0
		System.out.println(str3.length());//nullpointerexception
		
		
	}

}
