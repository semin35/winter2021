package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions01 {

	public static void main(String[] args) {
		//javaya bir dosyayi okumasini veya yazmasini soyledigimizde
		//java "ya dosyayi bulamazsam"der ve bizden cozum uretmemizi bekler
		//dosya bulma ile ilgili exception turu:FileNotFoundException
		//java kodu yazar yazmaz buradaki olasi problemi gorur ve CTE verir.
		//kodumuzu yazdigimiz anda ortaya cikan exceptionslara Checked Exceptions denir.
		
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\seray\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace();//tum hata aciklamalarini yazdirir ama kodumuz 
			//bloke olmaz.
			System.out.println(e.getMessage());//daha az hata msj yazdirir.
		}
		System.out.println("kod bloke olmamis");

	}

}
