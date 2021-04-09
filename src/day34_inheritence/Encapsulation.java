package day34_inheritence;

public class Encapsulation {

	private String okulIsmi="Yildiz Koleji";
	private int okulHesapNo=12345;
	private boolean okulAcikMi=true;
	
	
		public String getOkulIsmi() {
			return okulIsmi;
		}
		
		public int getHesapNo() {
			return okulHesapNo;
		}
		
		public boolean isOkulAcikMi() {
			return okulAcikMi;
		
		}
	
		public void setOkulIsmi(String okulIsmi) {
			this.okulIsmi=okulIsmi;//disaridaki classdan gelen okul ismini
			// bu classdaki okul ismine atama yapar.obje uzerinden oldugu icin bu classdaki
			//orjinal degeri degistirmez.
		}
		public void setOkulHesapNo(String okulIsmi) {
			this.okulIsmi=okulIsmi;
		}
		
		public void setOkulHesapNo(int okulHesapNo) {
			this.okulHesapNo=okulHesapNo;
		}
		public void setOkulAcikMi(boolean okulAcikMi) {
			this.okulAcikMi=okulAcikMi;
		}
		/*Tum variable'lar private ve sadece getter() 
		 * methodlari olusturdum.  Bu tarz bir class'da 
		 * datalar sadece okunabilir ama degistirilemez.
		 *  String'lerde degistirilemez yani immutable'dir .
		 *   Bu tarz class'lara immutable class denir, 
		 *   yani Setter'i OLMAYAN classlara denir.
		 */
}
