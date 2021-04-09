package day22_constructor;

public class Car {

	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	static int aracId=1201;
	
	public static void main(String[] args) {
	
		Car car1=new Car();
		//bir obje olusuturuldugunda esitligin saginda mutlaka constructor kullanilir
		//constructor ismi Class ismi ile ayni olmalidir
		//Constructorda mutlaka parantez olmali
		//parametre istege baglidir.
		System.out.println(car1.marka+" "+car1.model+" "+car1.yil+" "+car1.kazasiVarMi);
		
		car1.marka="Toyota";
		car1.model="Corolla";
		car1.yil=2010;
		car1.kazasiVarMi=false;
		
		System.out.println(car1.marka+" "+car1.model+" "+car1.yil+" "+car1.kazasiVarMi);
		
		Car car2=new Car();
		car2.marka="Opel";
		car2.model="Astra";
		car2.yil=2015;
		car2.kazasiVarMi=true;
	
		System.out.println(car2.marka+" "+car2.model+" "+car2.yil+" "+car2.kazasiVarMi);
	
		car1.kazasiVarMi=true;
		System.out.println(car1.marka+" "+car1.model+" "+car1.yil+" "+car1.kazasiVarMi);
	
	}

}
