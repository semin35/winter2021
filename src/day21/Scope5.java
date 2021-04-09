package day21;

public class Scope5 {

	public static void main(String[] args) {
		
		for (int i=0;i<5;i++) {
			String isim="ayse";
			System.out.println(i+" "+isim+" ");
		}
		//System.out.println(isim);loop icerisinde olusturulan
		//variablelar loopa ozeldir.ve loop disarisinda kullanilamaz.
		
		for (int i=0;i<5;i++) {
			System.out.print(i+" ");
		}
		//System.out.println(i);loop a aittir i
		
		int count=0;//methoda ait local variabledir
		//deger atamadan kullanmaya calisirsak cte alirsiniz.
		while (count<5) {
			System.out.print(count+" ");
			count++;
		}
				
	}

}
