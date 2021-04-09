package day35_inheritance;

public class Memur extends Personel {

	public int maas;
	public Memur() {
		super();
		System.out.println("Child class parametresiz constructor calisti");
	}
	
	public Memur(int maas) {
		super();
		System.out.println("Child class parametreli constructor calisti");
	}
	
	
	
	
	/*
	 * bir inheritancede const.olusturdugunuz da javanin otomatik olarak
	 * const. a koydugu super() keyword onemlidir.
	 * super() keyword default constructor gibidir.biz gormesek de calisir.ancak
	 * yerine baska bir keyword yazarsak etkisiz hale gelir.
	 * extends varsa yerine bir sey yazmadikca super constructor call calisir;
	 */
	
	public static void main(String[] args) {
		
		Memur obj1=new Memur(2400);
			
		}

		
		

	}


	

