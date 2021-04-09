package day40_Exception;

public class InvalidEmailIdCheckedException extends Exception {

	
	
	private static final long serialVersionUID = 1L;
	//java exceptionlarin tekrarsiz olmasini saglamak icin
	//her exceptiona unique bir kod verir. 
	InvalidEmailIdCheckedException (String message){
		super(message);
	}

	

}
