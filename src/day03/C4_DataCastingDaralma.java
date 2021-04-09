package day03;

public class C4_DataCastingDaralma {

	public static void main(String[] args) {
		//double bir degisken olusturalim ve bunu int ve byte cevirelim.
		
		double numDouble=141.56;
		
		System.out.println("double degisken degeri: "+numDouble);
		
		int numInt=(int) numDouble;
		System.out.println("int degisken degeri: "+numInt);

		byte numByte= (byte)numInt;
		System.out.println("byte degisken degeri: "+numByte);
	}

}
