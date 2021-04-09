package day05;

public class C4_OperatorsSigns {

	public static void main(String[] args) {
		//=atama ya da assigment isareti
		
		int sayi1=5;
		int sayi2=4;
		
		boolean isGreat =sayi1>sayi2;
		System.out.println(isGreat);
		
		boolean isSmall=sayi1<=sayi2;
		System.out.println(isSmall);
		
		boolean isEqual= sayi1==sayi2;//comparison operator
		System.out.println(isEqual);

		System.out.println(sayi1==5);
		System.out.println(sayi1*sayi2==20);
		
		System.out.println(sayi1+sayi2!=9);//sayilarin toplami 9 degil mi
		
		System.out.println(sayi1-sayi2!=0);
		
	}

}
