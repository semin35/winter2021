package day13_stringmanipulation;

public class C5_ReplaceAll {

	public static void main(String[] args) {
		
		String str="Java ogren, mutlu ol,Java candir 12345";
		System.out.println(str.replace("Java","hava"));
		
		//replaceAll() methodu replace() methoduna benzer ama
		//2 farki vardir.
		//1-replace() methodu char kabul eder ama replaceAll() kabul etmez
		//2-replaceAll() methodu regexp kullanimina izin verir.
		
		System.out.println(str.replaceAll("\\w","*"));//tum harf ve rakamlar * yazacaktir
		
		System.out.println(str.replaceAll("\\W","*"));//\\wtersi
		System.out.println(str.replaceAll("\\d","*"));// sayilarin yerine * yazar
		System.out.println(str.replaceAll("\\D","*"));//sayi olmayanlari *yapar
		System.out.println(str.replaceAll("\\s","&"));//bosluklari and isareti ile degistirir
		System.out.println(str.replaceAll("\\S","&"));//bosluk olmayan herseyi & yapar
	}

}
