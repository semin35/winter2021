package day23_staticKeyword;

public class Static2 {
	int x;
	static int y;
	
	Static2 (int i){
		x+=i;
		y+=i;
	}
	public static void main (String[] args) {
		new Static2(2);
		Static2 dnm=new Static2(3);
		System.out.println(dnm.x+","+y);
	}
}
