package day39_exceptions;

import java.io.FileInputStream;

import java.io.IOException;

public class Exceptions04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//eger handle edilecek exceptions arasinda parent-child iliskisi
		//varsa bu durumda child exceptions icin catch blogu yazmasak da kodumuz calisir
		//pozitif yani: tek catch blogu ile tum exceptionslar handle edilebilir
		//negatif yonu: bir sorunla karsilastigimizda bunun dosya bulunamadigi icin mi
		//yoksa dosya okunamadigi icin mi sorun cikiyor kesin bilemeyiz.
		
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\seray\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
			int k=0;
			
				while ((k=fis.read())!=-1) {
					System.out.print((char)k);
					
				}
			
		
		
		
		
		} catch (IOException e) {
			
			
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("kod bloke olmamis");



	}

}
