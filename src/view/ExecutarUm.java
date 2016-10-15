package view;

import service.QuestaoUmService;

public class ExecutarUm {
	private static QuestaoUmService questaoUmService;
	
	private static QuestaoUmService getquestaoUmService() {
		if(questaoUmService == null){
			questaoUmService = new QuestaoUmService();
		}
		return questaoUmService;
	} 

	public static void main(String[] args) {
		getquestaoUmService();

	}

}
