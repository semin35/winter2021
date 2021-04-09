package day34_inheritence;

public class EncapsulationRunner {

	public static void main(String[] args) {
		
		Encapsulation obj1=new Encapsulation();
		System.out.println(obj1.getOkulIsmi());
		System.out.println(obj1.getHesapNo());
		System.out.println(obj1.isOkulAcikMi());
		
		obj1.setOkulIsmi("Mehmet Koleji");
		System.out.println(obj1.getOkulIsmi());
		Encapsulation obj2=new Encapsulation();
		System.out.println(obj2.getOkulIsmi());
	}

}
