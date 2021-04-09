package day05;

class C3_Concatenation {

	public static void main(String[] args) {
		
		String str1="Java";
		String str2="Guzeldir";
		
		int sayi1=5;
		int sayi2=4;
		String str3=" ";
		
		System.out.println(str1+" "+str2);	
		System.out.println(str2+str1);

		System.out.println(str1+str2+(sayi1-sayi2));
		System.out.println(sayi1+sayi2+str3+str1+str2);
		System.out.println(sayi1+sayi2+str1+' '+str2);
		System.out.println(str1+str2+sayi1*sayi2);
	}

}
