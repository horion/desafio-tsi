package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import exception.CasosDeTesteMaiorQueOPermitidoException;
import exception.CasosDeTesteMenorQueOPermitidoException;
import exception.NumeroMaiorQueOPermitidoExcpetion;
import exception.NumeroMenorQueOPermitidoExcpetion;

public class QuestaoDoisService {

	private static final Integer _45 = 45;
	private static final Double _10110 = Math.pow(10, 110);
	private static final Integer ZERO_INT = 0;
	private static final Integer UM_INT = 1;
	private Scanner scanner;

	public void verificarDivisibilidadePorOito(Integer casosDeTeste)
			throws NumeroMenorQueOPermitidoExcpetion, NumeroMaiorQueOPermitidoExcpetion,
			CasosDeTesteMenorQueOPermitidoException, CasosDeTesteMaiorQueOPermitidoException {
		
		validarEntrada(null, casosDeTeste);
		for (int i = 0; i < casosDeTeste; i++) {
			System.out.println("Digite o número: ");
			Integer numero = getScanner().nextInt();
			validarEntrada(numero, null);
			retornarSeDivisivel(numero);
		}

	}

	private void retornarSeDivisivel(Integer numero) {
		if(verificaPermutacao(numero)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}


	private boolean verificaPermutacao(Integer numero) {
		List<String> listaPermutada = new ArrayList<String>();
		permutacao(numero.toString(),listaPermutada);
		boolean retorno = false;
		for (String num : listaPermutada) {
			Integer numeroCombinado = Integer.parseInt(num);
			if(numeroCombinado % 8 == 0){
				retorno = true;
			}
			
		}
		return retorno;
	}
	
	private void permutacao(String numero, List<String> listaPermutada) {
        char[] original = numero.toCharArray();
        Arrays.sort(original);
        char[] clone = new char[numero.length()];
        boolean[] mark = new boolean[numero.length()];
        Arrays.fill(mark, false);
        permutar(original, clone, mark, 0, numero.length(),listaPermutada);
    }
	
	private void permutar(char[] original, char[] clone, boolean[] marcador, int length, int n, List<String> listaPermutada) {
        if (length == n) {
        	String elemento = new String(clone);
        	if(!listaPermutada.contains(elemento)){
        		listaPermutada.add(elemento);
        	}
            return;
        }

        for (int i = 0; i < n; i++) {
            if (marcador[i] == true) continue;
            if (i > 0 && original[i] == original[i-1] && marcador[i-1] == false) continue;
            marcador[i] = true;
            clone[length] = original[i];
            permutar(original, clone, marcador, length+1, n,listaPermutada);
            marcador[i] = false;
        }

    }



	private void validarEntrada(Integer numero, Integer casosDeTeste)
			throws NumeroMenorQueOPermitidoExcpetion, NumeroMaiorQueOPermitidoExcpetion,
			CasosDeTesteMenorQueOPermitidoException, CasosDeTesteMaiorQueOPermitidoException {
		if (numero != null && numero < ZERO_INT) {
			throw new NumeroMenorQueOPermitidoExcpetion();
		}

		if (numero != null && numero > _10110) {
			throw new NumeroMaiorQueOPermitidoExcpetion();
		}

		if (casosDeTeste != null && casosDeTeste < UM_INT) {
			throw new CasosDeTesteMenorQueOPermitidoException();
		}

		if (casosDeTeste != null && casosDeTeste > _45) {
			throw new CasosDeTesteMaiorQueOPermitidoException();
		}
	}

	public Scanner getScanner() {
		if (scanner == null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}

}
