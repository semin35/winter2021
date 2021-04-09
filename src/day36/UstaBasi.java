package day36;

public class UstaBasi extends Isci {

	public String bolum="takimhane";
	public int sorOldIsciSay=20;
	
	public static void main(String[] args) {
		UstaBasi ub1=new UstaBasi();
	//objeyi torun const.classinda olusturunca
	//3 class a ulasabiliyoruz
		System.out.println(ub1.bolum);
		System.out.println(ub1.sorOldIsciSay);
		System.out.println(ub1.saatUcreti);
		System.out.println(ub1.isim);

		Isci ub2=new UstaBasi();
		//extend ole birbirine bagli olan classlarda
		//is a relation olan data turleri istege bagli
		//olarak kullanilabilir.
		//daha genis data turu yazmanin avantaji:kapsamin 
		//daha genis olmasidir.
		//daha genis data turu yazmanin dezavantaji:
		//kendi icinde bulundugu class a ulasamaz.
		//data turu olarak sectigimiz clss
		System.out.println(ub2.izindeMi);
		System.out.println(ub2.departman);
		Personel ub3=new UstaBasi();
		System.out.println(ub3.id);//personel
		
		
		
	}

}
