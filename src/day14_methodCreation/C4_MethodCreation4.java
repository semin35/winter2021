package day14_methodCreation;

public class C4_MethodCreation4 {

	public static void main(String[] args) {
		toplama(60,50);
		toplama(60.5,50.7);
		toplama(60.2,50);
		toplama(60,58.8);
		toplama('a','b');//ascii 
		toplama("ali ","veli");
		

	}

	public static void toplama(int sayi1,int sayi2) {
		System.out.println("integer methodu sonucu: "+(sayi1+sayi2));
	}
	
	public static void toplama(double sayi1,double sayi2) {
		System.out.println("double methodu sonucu: "+(sayi1+sayi2));
	}
	
	public static void toplama(int sayi1,double sayi2) {
		System.out.println("int-double methodu sonucu: "+(sayi1+sayi2));
	}
	
	public static void toplama(char char1,char char2) {
		System.out.println("char methodu sonucu: "+(char1+char2));
	}
	
	public static void toplama(String str1,String str2) {
		System.out.println("String methodu sonucu: "+(str1+str2));
	}
	
}
