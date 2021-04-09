package day42_abstractClasses;

public class IdariPersonel extends Personel{
	//extends personel yazarak abstract Personele concrete
	//bir child olusturdum ve java CTE verdi.
	//cozum olarak urettigi iki ihtimal var 
	//1-unimplemented methodlari uyarla
	//2-personel classindan abstract kelimesini kaldir
	//bu classin calisabilmesi icin iki islemden birini yapmak zorundayiz
	
	public static void main(String[] args) {
	
		

	}

	@Override
	public void maasHesapla() {
		System.out.println("idari personel maasi 4000tl");
		
	}

	@Override
	public void mesaiBilgisi() {
		// TODO Auto-generated method stub
		
	}

}
