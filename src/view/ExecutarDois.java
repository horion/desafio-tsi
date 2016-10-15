package view;

import exception.CasosDeTesteMaiorQueOPermitidoException;
import exception.CasosDeTesteMenorQueOPermitidoException;
import exception.NumeroMaiorQueOPermitidoExcpetion;
import exception.NumeroMenorQueOPermitidoExcpetion;
import service.QuestaoDoisService;

public class ExecutarDois {
	
	static QuestaoDoisService questaoDoisService;

	private static QuestaoDoisService getQuestaoDoisService() {
		if(questaoDoisService == null){
			questaoDoisService = new QuestaoDoisService();
		}
		return questaoDoisService;
	}

	public static void main(String[] args) {
		
		try {
			System.out.println("Digite a quantidade de casos de teste ");
			getQuestaoDoisService().verificarDivisibilidadePorOito(getQuestaoDoisService().getScanner().nextInt());
		} catch (NumeroMenorQueOPermitidoExcpetion e) {
			System.out.println("O número digitado é menor que 0");
		} catch (NumeroMaiorQueOPermitidoExcpetion e) {
			System.out.println("O número digitado é maior que 10 elevado a 110");
		} catch (CasosDeTesteMenorQueOPermitidoException e) {
			System.out.println("O T é menor que 1");
		} catch (CasosDeTesteMaiorQueOPermitidoException e) {
			System.out.println("O T é maior que 45");
		}catch (Exception e){
			System.out.println("Um erro geral ocorreu");
		}

	}

}
