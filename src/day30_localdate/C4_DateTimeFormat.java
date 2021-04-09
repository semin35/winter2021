package day30_localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C4_DateTimeFormat {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MMM/d");
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("yy/MM/d");
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("yy*MMMM*dd");
		//M=month; m=minute
		
		LocalDate tarih=LocalDate.now();
		System.out.println(dtf.format(tarih));
		System.out.println(dtf2.format(tarih));
		System.out.println(dtf3.format(tarih));
	}

}
