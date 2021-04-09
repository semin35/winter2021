package day18_whileLoop;


import java.util.Scanner;

public class C5_WhileLoop4 {

	public static void main(String[] args) {
		/*kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari 
		 * ve toplam kac tane  olduklarini ekranda yazdirin */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		int sayi=scan.nextInt();
		int bolen=1;
		int sayac=0;
		
		while(bolen<=sayi) {
			if(sayi%bolen==0) {
				System.out.println(bolen);
				sayac++;
			}
			bolen++;
		}
		System.out.println("bolen sayisi: "+sayac);
		
		//bolenleri su sekilde yazdirin
		//1-1
		//2-2
		
				
		
		bolen=1;
		sayac=0;
		
		while(bolen<=sayi) {
			if(sayi%bolen==0) {
				sayac++;
				System.out.println(sayac+"-"+ bolen);
				
			}
			bolen++;
		}
		scan.close();
		

	}

}
