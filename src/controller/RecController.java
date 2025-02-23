package controller;

public class RecController {

	public RecController() {
		super();
	}

	public String Rec3(String string, String gnirts) {

		// condição de parada: quando a subtring retornar um string vazia depois de
		// acessar todos os ultimos caracteres
		if (string == "") {
			return gnirts;
		} else {
			// pega o termo atual e envia ele menos o ultimo caractere (que já foi
			// adicionado na string ao contrario)
			gnirts += string.substring(string.length() - 1);
			return Rec3(string.substring(0, (string.length() - 1)), gnirts);
		}

	}

	public String Rec(int numero, String binario) {
		
		//condição de parada quando a divisão por 2 retornar o numero 0, quer dizer que já acabou os numeros dessa fatoração por 2
		if (numero == 0) {
			return Rec3(binario, "");
		} else {
			// pega o termo atual da fatoração e divide por 2 para poder chamar a recursiva e acessar seu resto para compor o numero binario
			binario += String.valueOf(numero % 2);
			return Rec(numero / 2, binario);
		}

	}

}
