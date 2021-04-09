package day14_methodCreation;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
		//
		String str="Java cok guzel";
		//java methodlarin sadece ismine degil,
		//isim +parametrelere bakar.
		//sadece parametre sayisi degil parametrelerin
		//data tiplerine de bakar.
		
		str.endsWith("el");//bu metodun gorevi bu kelimenin
		//bu methodu kullanmak icin bu methodun kontrol ettikten sonra 
		//bana rapor olarak ne getirdigini bilmek lazim(true false)
		
		//2-bir method olusturdugumuzda methodun ne yapacagina 
		//ve gorevi yaptiktan sonra bana ne dondurecegine bastan karar vermeliyiz
		
		//3-bir method olusturulurken "str.indexof(str,fromindex) de oldugu gibi
		//disaridan kabul edecegi parametreleri ve parametrelerin data tiplerini
		//deklare etmeliyiz.
		
		
		//methodu calistirmak istedigimde (methodu cagirmak)parametre olarak
		//declare edilen data tiplerine uygun degerler girmeliyiz.
		//girilen bu degerlere ARGUMENT denir.
		str.indexOf("va", 1);
		
		
		
		

	}

}
