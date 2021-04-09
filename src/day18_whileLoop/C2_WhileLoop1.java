package day18_whileLoop;

public class C2_WhileLoop1 {

	public static void main(String[] args) {
		// while: iken, oldugu surece
		//10dan 30a kadar olan sayilardan 4 ile bolunebilenleri aralarinda bir 
		//bosluk olacak sekilde yanyana yazdirin.

		for (int i =10; i <=30; i++) {
			if (i%4==0) {
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		//aynisini while ile yapalim
		int sayi=10;
		while (sayi<=30) {
			if (sayi%4==0) {
				System.out.print(sayi+" ");
			}
			
			sayi++;
			
		}
		
	}

}
