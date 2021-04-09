package day34_inheritence;

public class Muhasabe extends Personel {
	//muhasabe classinin personel classinin child classinin
	//oldugunu declare etmek icin class ismine extends keyword ile
	//parent classi yazariz
	
	
	public int saatUcreti;
	public String statu;
	public int maas;
	
	
	
	public int maasHesapla() {
		maas=30*8*saatUcreti;
		return maas;
	}
	
	
	
	

}
