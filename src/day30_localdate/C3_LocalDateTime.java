package day30_localdate;

import java.time.LocalDateTime;

public class C3_LocalDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		
		System.out.println(ldt.toString());
		
		String time=ldt.toString();
		
		System.out.println(time.startsWith("2021"));
		

	}

}
