package day05;

public class C5_ConditionalOperator {

	public static void main(String[] args) {
		//And &&, or ||
		
		boolean isTrue=5>4 && 7-3>0;//and ile baglanan mantiksal ifadelerin
		//hepsi dogru ise truedur,sadece biri yanlis olursa false olur.
		System.out.println(isTrue);
		
		int x=10;
		int y=5;
		
		System.out.println(x/y==2 && x*y>20 && x-y>0);
		System.out.println(x+y<0 && x-y>0);
		
		System.out.println(x<y || x+y<0 || x*y>0);
		
		
	}

}
