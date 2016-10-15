package exception;


public class CasosDeTesteMenorQueOPermitidoException extends Exception {

	private static final long serialVersionUID = 7198548062090400606L;
	
	public CasosDeTesteMenorQueOPermitidoException(String msg){
		super(msg);
	}
	
	public CasosDeTesteMenorQueOPermitidoException (String msg,Throwable  cause){
		super(msg,cause);
	}
	public CasosDeTesteMenorQueOPermitidoException(){
		super();
	}

	
}
