package day40_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception02 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\seray\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");

		//try-catch blogu exception ile handle etmek icin kullanilir
		//throws keywordu ise sadece declaration icindir.
		//throw kullanilan bir methodda exception olusursa KOD bloke olur
		
		int k=0;
		
			while ((k=fis.read())!=-1) {
				System.out.print((char)k);
				
			}
			
		//eger birden fazla exception icin throws keywordu kullanacaksak
		//yazacagimiz exceptionlarin arasindaki iliski ve siralam onemli olur
		//eger yazdigimiz exceptionlar arasinda parent child iliskisi varsa
		//once child exception yazilmali
			//ama istersek sadece parent yazsak da yeterli olur.
	}

}
