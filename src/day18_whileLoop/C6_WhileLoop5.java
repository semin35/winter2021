package day18_whileLoop;

public class C6_WhileLoop5 {

	public static void main(String[] args) {
		// verilen sayinin asal olup olmadigini bulan bir program yazin
		//asal sayi kendisinden ve 1 den baska hic bir tam sayiya bolunemez
						
		int sayi=7;
		int bolen=2;
		String flag="asal";//bizim istedigimiz sartin gerceklesip gerceklesmedigini kontrol eder.
		
		while(bolen<sayi) {
			if(sayi%bolen==0) {
				flag="asal sayi degildir";
			}
			bolen++;
		}
		System.out.println(flag);

	}

}
