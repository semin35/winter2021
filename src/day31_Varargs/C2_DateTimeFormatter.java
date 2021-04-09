package day31_Varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C2_DateTimeFormatter {

	public static void main(String[] args) {
		/*
		 * yy:yilin son iki rakami
		 * M:ay sirasi icin mart icin:3;
		 * MM:ay sirasini verir mart icin:03
		 * MMM:ay icin ilk 3 harfi verir 
		 * MMMM:ay isminin tamamini verir
		 */
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yy/MMMM/dd hh:mm");
		System.out.println(dtf.format(ldt));

		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("HH/mm");//24 saat
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("hh/mm");//pm/am sistemine gore
		System.out.println(dtf2.format(ldt));//16/23
		System.out.println(dtf3.format(ldt));//04/23
		
		LocalDate dogumTarihi=LocalDate.of(2016,3,28);
		LocalDate bugun=LocalDate.now();
		
		Period benimYasim=Period.between(bugun, dogumTarihi);
		System.out.println(benimYasim);
		
		int yas=Period.between( dogumTarihi,bugun).getYears();
		System.out.println(yas);
		
		
	}

}
