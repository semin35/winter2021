package day30_localdate;

import java.time.LocalTime;
import java.time.ZoneId;

public class C2_LocalTime {

	public static void main(String[] args) {
		// javada saat ile islem yapmak icin 
		//LocalTime classindan obje kullaniriz.
		
		LocalTime saat=LocalTime.now();
		System.out.println(saat);
		
		for (int i = 0; i <1000000; i++) {
			i+=1;
			
		}
		LocalTime saat2=LocalTime.now();
		System.out.println(saat2);
		
		System.out.println(saat.plusHours(15));
		System.out.println(saat.getSecond());
		System.out.println(saat.now(ZoneId.of("Japan")));
		System.out.println(saat.now(ZoneId.of("America/Chicago")));
	}

}
