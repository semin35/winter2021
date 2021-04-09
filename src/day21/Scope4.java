package day21;

public class Scope4 {

	public static void main(String[] args) {
		
		int sayi=10;
		//1-bir method icinde olusturulan variable, sadece o method 
		//icinde kullanilabilir.
		
		int sayi2;//declaration:bir local variable deger atanmadan da olusturulabilir.
        //2-System.out.println(sayi2); ancak ilk deger atamasi yapilmayan
		//variablelar kullanilamaz.
		//sayi2++//ilk deger atamadigi icin artirma yada azaltma yapamayiz
		//java deger atamasi yapilmadan local variable olusturulmasina izin 
		//verir,ileride deger atanacak diye bekler.
		sayi2=15;//initiliation
		//3-birden fazla methodun oldugu classlarda her methodda kullanmamiz gereken
		//ortak variablelar varda class levelde variable olusturmaliyim.
		//ortak variable classin yapisina bagli olarak instance veya static olabilir.
		
		
	}
	public static void staticMethod() {
		String isim="hasan";
		//1-bu kurala main method icinde olusturulan variableda dahildir.
	}
	
	public void method() {
		boolean isTrue=true;
		//bu kural static olan ve ya olmayan tum methodlar icin gecerlidir.
		
	}
}
