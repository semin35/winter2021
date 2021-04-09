package day30_localdate;

import java.time.LocalDate;

public class C1_LocalDate01 {

	public static void main(String[] args) {
		//javada sadece tarih kullanmak istiyorsak
		//LocalDate Classindan bir obje uretiriz
		
		LocalDate tarih=LocalDate.now();
		System.out.println(tarih);
		
		System.out.println(tarih.plusWeeks(20));
		System.out.println(tarih.plusDays(500));
		System.out.println(tarih.plusYears(3).plusMonths(5).plusDays(12));
		System.out.println(tarih.minusMonths(20));
		System.out.println(tarih.minusYears(3).minusMonths(4).minusDays(10));
		System.out.println(tarih.getDayOfYear());
		System.out.println(tarih.getMonthValue());
		LocalDate dogumGunu=LocalDate.of(1984,9,23);
		System.out.println(dogumGunu.getDayOfWeek());
		
		System.out.println(tarih.isLeapYear());
		//eger suanki tarihi degil de eski bir tarih ile islem yapacaksak
		//LocalDate.of() metodunu kullaniyoruz.
		LocalDate tarih1=LocalDate.of(1995,12,15);
		LocalDate tarih2=LocalDate.of(1995,12,10);
		System.out.println(tarih1.isAfter(tarih2));
		System.out.println(tarih1.isBefore(tarih2));
		
	}
	

}
