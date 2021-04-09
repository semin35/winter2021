package day35_inheritance;

public class Personel {

	public String isim;
	public int sayi;
	
	
	public Personel() {//parametresiz bir cons.olusturduk
		//super();
		/*
		 *javadan yardim alarak bir cons olusturdugumuz da
		 *java const.ilk satirina super keywordunu ekler
		 *eger icinde oldugumuz class bir child class degilse
		 *super(); keywordu silinebilir.
		 *bugune kadar biz olusturdugumuz constr.da 
		 *super(); keywordu kullanmadik.ancak bizim classlarimiz
		 *child class olmadigi icin sorun olmadi.  */
		
		System.out.println("Persone parametresiz constructor calisti.");
		
		 		
	}


	public Personel(String isim, int sayi) {//parametreli cons.
		
		System.out.println("Persone parametreli constructor calisti.");
		
	}
	
	
	
	
	
	//her class default constructora sahiptir.
	//default constructorun parametresi yoktur.
	//biz parametreli veya parametresiz bir constructor olusturdugumuzda
	//default constructor olur.Eger biz sadece 1 tane parametreli constructor 
	//olusturursak java default olani sildigi icin parametresiz constructor kalmaz
	//parametreli bir constructor olusturdugumuzda mutlaka default cons.yerine de
	//parametresiz bir cons.olusturmamiz gerekir.
	

}
