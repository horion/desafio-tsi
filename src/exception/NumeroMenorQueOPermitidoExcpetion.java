package exception;

public class NumeroMenorQueOPermitidoExcpetion extends Exception {

	private static final long serialVersionUID = 7198548062090400606L;
	
	public NumeroMenorQueOPermitidoExcpetion(String msg){
		super(msg);
	}
	
	public NumeroMenorQueOPermitidoExcpetion (String msg,Throwable  cause){
		super(msg,cause);
	}
	public NumeroMenorQueOPermitidoExcpetion(){
		super();
	}

	
}
