package day22_constructor;

public class CarUret {

	//soru....constructor bu class da nerede
	//su anda bu class da gorunur bir constructor yok
	//bir class olusturuldugunda java bu classtan obje uretilecegini
	// bilir ve gorunmeyen Default Constructoru classa yerlestirir.
	//default constructor parametresizdir dolayisi ile sadece hicbir 
	//ozelligi tanimlanamayan objeler uretir(tisort uret demek gibi)
	//default constructor ile uretilen bir objenin tum ozellikleri sonradan 
	//tanimlanmalidir.
	
	//eger biz sonradan bir constructor yazarsak java default constructor i 
	//iptal eder
	
	//bir constructor olusturalim.
	public CarUret (){
		
	}
	//kurallar 1-ismi class ile ayni olmalidir(dolayisi ile buyuk harf ile baslar)
	//2-Constructor return type sahip degildir.
	//3-constructor isminden sonra mutlaka parantez olur ama parametre olmasi 
	//obtionaldir.
	//4-bir constructor olusuturuldugunda kimlerin kullanacagini belirlemek icin
	//access modifier yazilmalidir.
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	static int aracId=1201;
	public static void main(String[] args) {
	//bir programda cok fazla uretecegimiz objeler icin bir tane 
	//class olustururuz
	//bu classda olusturulacak objelere ait tum ozellikler olur
	//bu class direk calistirilmayacagi icin main method olmasa da olur
	//kaliphane gibidir.

	}
	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak  "+yakit+" kullanir");
	}
	public void vites(String vites) {
		System.out.println("Araba "+vites+" viteslidir");
	}

}
