package day43_interfaces;

public class InterfaceRunner implements Interface02{

	public static void main(String[] args) {
		
		//static olarak tanimlanmis bir variable veya method
		//baska classdan classismi.method ismi seklinde cagirilabilir
		
		Interface02.deneme2();
		
		//default keywordu ile olusturdugumuz meethod ise 
		//obje uzerinden cagrilir.
		
		InterfaceRunner obj1=new InterfaceRunner();
		obj1.deneme();

	}

}
