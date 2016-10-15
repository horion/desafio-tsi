package exception;

public class NumeroMaiorQueOPermitidoExcpetion extends Exception {
	
	private static final long serialVersionUID = -1688360267652213472L;
	public NumeroMaiorQueOPermitidoExcpetion(String msg){
		super(msg);
	}
	
	public NumeroMaiorQueOPermitidoExcpetion (String msg,Throwable  cause){
		super(msg,cause);
	}
	public NumeroMaiorQueOPermitidoExcpetion(){
		super();
	}

}
