package day11_stringmanipulations;

public class C4_Equals {

	public static void main(String[] args) {
		// str.equals(str2) str ve str2`yi karsilastirir ve string olarak
		//esit olmadiklarina bakar sonuc olarak true veya false dondurur.
		
		//bazi metodlarin yaptiklari islem ile dondurdukleri sonuc farkli olabilir
		//bir metoda git ali ismindeki elementi sil deriz,
		//o da gidip aliyi bulur ve siler
		
		String str= "Ali Can";
		String str2="Ali Can";
		
		//str ile str2nin esit olup olmadigini yazdirin
		// esit yada esit degil yazdirin
	
		System.out.println(str.equals(str2));
		System.out.println(str.equals(str2) ? "esit" : "esit degil");
		
		//javada stringler case sensetivedir buyuk kucuk harf duyarlidir
		//bir harf bile degistirilse stringler esit olmaz
		
		

	}

}
