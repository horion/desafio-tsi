package service;

import exception.ForaDoRangeInteiro32BitsException;

public class QuestaoTresService {

	public Integer retornarQuartoBit(Integer numero) throws ForaDoRangeInteiro32BitsException {
		validarEntrada(numero);
		Integer retorno = null;
		String binario = Integer.toBinaryString(numero);
		if(binario.length() >= 4){
			retorno = Integer.parseInt(inverter(binario).substring(3, 4));
		}
		return retorno;
	}

	private void validarEntrada(Integer numero) throws ForaDoRangeInteiro32BitsException {
		if(numero > Integer.MAX_VALUE || numero < Integer.MIN_VALUE){
			throw new ForaDoRangeInteiro32BitsException();
		}
	}

	
	private String inverter(String string){
		return (new StringBuilder(string.toString())).reverse().toString();
		
	}
}
