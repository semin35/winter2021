package day23_staticKeyword;

public class Static1 {

	static String isim="mehmet";
	int yas=49;
	
	public static void main(String[] args) {
		// static variablelar olusturulan tum objeler icin gecerlidir.
		//mesela bir class da 1 instance; bir de static variable olsun
		
		Static1 st1=new Static1();
		Static1 st2=new Static1();
		Static1 st3=new Static1();
		
		isim="hasan";
		st1.yas=25;
		
		isim="ayse";
		st2.yas=30;
		
		isim="alican";
		st3.yas=40;
		

	}

}
