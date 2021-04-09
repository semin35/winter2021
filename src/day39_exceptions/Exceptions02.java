package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) {
		//eger kodumuzu yazdigimizda bir den fazla exception ile iliskili
		//durum olusuyorsa icice try-catch bloklari olusturabiliriz.
		//bu ornekte ilk once dosyayi okutmak istedik
		//java ya dosyayi bulamazsam diye bizden yardim istedi
		//biz de try-catch blogu ile  FileNotFoundException ile handle etmesine yardim ettik
		//sonra dosyadaki yazilari okumaya calistik ve java yeniden ya dosyayi
		//okuyamazsam diye yardim istedi.
		//biz de try-catch blogu ile IOException ile handle etmesine yardim ettik
		
		
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\seray\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
			int k=0;
			try {
				while ((k=fis.read())!=-1) {
					System.out.print((char)k);
					
				}
			} catch (IOException e) {//dosyalarla ilgili genel yazma ve okuma sorunlari ile handle eder.
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
		} catch (FileNotFoundException e) {
			
			
			System.out.println(e.getMessage());
		}
		System.out.println("kod bloke olmamis");


	}

}
