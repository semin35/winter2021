package day03;

public class C3_DataCasting {

	public static void main(String[] args) {
		//byte veri turunde bir degisken olusturup deger atayin.
		//olusturulan variableyi auto widening ile genisletip yazidirin.
		
		byte numByte=34;
		
		System.out.println("byte degisken degeri: "+numByte);
		
		//short yapalim
		short numShort = numByte;
		
		System.out.println("short degisken degeri: "+numShort);
		
		//int yapalim
		int numInt=numShort;
		System.out.println("int degisken degeri: "+numInt);
		
		long numLong=numInt;
		System.out.println("long degisken degeri: "+numLong);
		
		float numFloat=numLong;
		System.out.println("float degisken degeri: "+numFloat);
		
		double numDouble=numFloat;
		System.out.println("double degisken degeri: "+numDouble);
		
		
		
	}

}
