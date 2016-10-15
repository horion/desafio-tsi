package exception;


public class ForaDoRangeInteiro32BitsException extends Exception {

	private static final long serialVersionUID = 7198548062090400606L;
	
	public ForaDoRangeInteiro32BitsException(String msg){
		super(msg);
	}
	
	public ForaDoRangeInteiro32BitsException (String msg,Throwable  cause){
		super(msg,cause);
	}
	public ForaDoRangeInteiro32BitsException(){
		super();
	}

	
}
