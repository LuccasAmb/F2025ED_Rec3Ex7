package controller;

public class RecController {

	public RecController() {
		super();
	}
	
	public String Rec(String string, String gnirts) {
		
		//condição de parada: quando a subtring retornar um string vazia depois de acessar todos os ultimos caracteres
		if(string == "") {
			return gnirts;
		}else {
			//pega o termo atual e envia ele menos o ultimo caractere (que já foi adicionado na string ao contrario)
			gnirts+= string.substring(string.length()-1);
			return Rec(string.substring(0, (string.length() - 1)), gnirts);
		}
		
		
	}
	

	
}
