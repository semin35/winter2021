package day08;

public class C2_NestedIf {

	public static void main(String[] args) {
		//verilen cinsiyet ve yas icin emekli olup olmamasi yazdiran prog.
		// eger calisan kadinsa 60 yasindan buyukse
		//erkek 65 yas uzeinde emekli olabilir
		
		
		String cinsiyet="erkek";
		int yas=65;
			
		if (yas<0) {
			System.out.println("yas negatif olamaz");
		}
		else if (cinsiyet.equalsIgnoreCase("erkek")&& yas>=65) {
			System.out.println("emekli olabilirsin");
		}else if(cinsiyet.equalsIgnoreCase("erkek")&& yas<65) {
			System.out.println("emekli olamazsin");
		}else if(cinsiyet.equalsIgnoreCase("kadin")&& yas<60) {
			System.out.println("emekli olamazsin");
			
		}else if (cinsiyet.equalsIgnoreCase("kadin")&&yas>=60) {
			System.out.println("emekli olabilirsin");
		}else {
			System.out.println("cinsiyet veya yas tanimsiz");
		}
			
			System.out.println("nested if ile sonuc");
			
			if (cinsiyet.equalsIgnoreCase("erkek")) {
				if (yas<0) {
					System.out.println("erkek yas negatif olamaz");
				}else if (yas<65) {
					System.out.println("bu yastaki erkek emekli olamaz");
				}else {
					System.out.println("bu yastaki erkek emekli olabilir");
				}
				
				
			}else if(cinsiyet.equalsIgnoreCase("kadin")) {
				if (yas<0) {
					System.out.println("kadin yas negatif olamaz");
				}else if (yas<60) {
					System.out.println("bu yastaki kadin emekli olamaz");
				}else {
					System.out.println("bu yastaki kadin emekli olabilir");
				}
				
			}else {
				System.out.println("yazdiginiz cinsiyet sisteme kayitli degil");
			}
			
			
			
	}

}
