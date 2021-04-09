package day43_interfaces;

public interface Interface01 {
	
	public void motor();//interface icinde abstract methodlar
	//ve ozel concrete methodlar olabilir
	
	//bir abstract un bodysi olmadigindan o methodun istenen dinamik ozelligi nasil
	//gerceklestirecegini bilmemiz mumkun degildir
	//sadece ne yapacagini biliriz
	
	//bu method bize sunu anlatir:
	//beni inherit eden her concrete classin dinamik motor ozelligi olmalidir.
	
	void vites();//beni inherit eden her concrete classin dinamik vites ozelligi olmalidir.
	abstract void kasa();//beni inherit eden her concrete classin dinamik kasa ozelligi olmalidir.
	
	//interface de sadece abstract, public methodlar olur.
	//bu iki keywordu yazsak da yazmasak da java tum methodlari bu sekilde kabul eder.
	//javada interface olusturmak istiyorsak bastan o sekilde olusturmaliyiz
	//bir class sonradan bazi keywordler yazilarak interface yapilamaz
	
	String ISIM="mustafa";//java isim kelimesini italik ve bold yapti 
	//demek ki tum variable lar final ve statictir
	
}

