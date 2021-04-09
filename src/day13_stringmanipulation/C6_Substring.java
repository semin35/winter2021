package day13_stringmanipulation;

public class C6_Substring {

	public static void main(String[] args) {
		
		String str="Her ders Java gibi olsa";
		//str in ilk 10 harfini * ile gizleyin,
		//geriye kalanlar normal yazilsin
		
		System.out.println(str.substring(10));//10.index dahil sonuna kadar
		//ava gibi olsa
		
		System.out.println(str.substring(str.length()-10));//son 10 harfi yazdirin
		
		//ilk 10 karakteri almak
		System.out.println(str.substring(0, 10));//substring(0,10) yazildiginda 
		//0 dahil(inclusive) 10 haric(exclusive)
		
		//11.karakterden sonuna kadar olan string i yazdirin
		System.out.println(str.substring(10));
		
		//strin ilk 10 harfini * ile gizleyin,geriye kalanlari normal yazsin
		System.out.println("**********"+str.substring(10));
		
		System.out.println(str.substring(0,10).replaceAll("\\D", "*")+
				str.substring(10));
		
		
		
		System.out.println(str.substring(10,10));//10.indextekini al digeri de 
		//10.indextekini alma diyor.Java son soyleneni yapar.
		//System.out.println(str.substring(8,7));hata verir 8 den basladiktan sonra 7 ye gidemem
		System.out.println(str.substring(22));//lenght()-1-->son karakter
		System.out.println(str.substring(23));//lenght()--->bos
		//System.out.println(str.substring(24));//lenght()--->run time error
		
		
		
		//strin ilk 10 harfini * ile gizleyin,geriye kalanlari normal yazsin
		
		String str3=str.substring(0,10);//strnin ilk 10 harfini aldik
		str3=str3.replaceAll("\\W","a");
		
		System.out.println(str3.replaceAll("\\w","*")+str.substring(10));
		
		
		
		
	}

}
