package view;

import java.util.Scanner;

import exception.ForaDoRangeInteiro32BitsException;
import service.QuestaoTresService;

public class ExecutarTres {
	static QuestaoTresService questaoTresService;
	private static Scanner scanner;

	private static QuestaoTresService getQuestaoTresService() {
		if(questaoTresService == null){
			questaoTresService = new QuestaoTresService();
		}
		return questaoTresService;
	} 
	private static Scanner getScanner(){
		if(scanner == null){
			scanner = new Scanner(System.in);
		}
		return scanner;
	}
	public static void main(String[] args) {
		try {
			System.out.println("Digite o número: ");
			System.out.println(getQuestaoTresService().retornarQuartoBit(getScanner().nextInt()));
		} catch (ForaDoRangeInteiro32BitsException e) {
			e.printStackTrace();
		}

	}

}
