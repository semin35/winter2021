package day23_staticKeyword;

public class StaticBlock {

	static String isim;
	//static block class calistirildiginda ilk olarak calisir(main method)
	//main methoddan bile once yani
	//static blocklar static variablelara deger atamak icin kullanilir.
	
	static {
		isim="mehmet";
		System.out.println(isim);
	}
	static {
		System.out.println("2.static block calisti");
	}
	
	public static void main(String[] args) {
		
		isim="alican";
		System.out.println(isim);

	}

}
