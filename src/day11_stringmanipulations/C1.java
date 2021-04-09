package day11_stringmanipulations;

public class C1 {

	public static void main(String[] args) {
		
		int y=2;
		int z=0;
		int a=y<8 ? ++y:z--;
		System.out.println(y+","+z+","+a);
		
		String str="Java guzel";
		System.out.println(str.endsWith(""));
		System.out.println(str.endsWith("Java guzel"));

	}

}
