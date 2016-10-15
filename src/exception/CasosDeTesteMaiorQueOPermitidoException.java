package exception;


public class CasosDeTesteMaiorQueOPermitidoException extends Exception {

	private static final long serialVersionUID = 7198548062090400606L;
	
	public CasosDeTesteMaiorQueOPermitidoException(String msg){
		super(msg);
	}
	
	public CasosDeTesteMaiorQueOPermitidoException (String msg,Throwable  cause){
		super(msg,cause);
	}
	public CasosDeTesteMaiorQueOPermitidoException(){
		super();
	}

	
}
