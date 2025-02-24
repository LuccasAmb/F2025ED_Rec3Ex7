package controller;

public class RecController {

	public RecController() {
		super();
	}

	public int Rec(int n) {

		// n/10 para acessar o numero menos o ultimo digito, quando n=0 é porque acabou
		// os digitos, dai encerra retornando 0 na soma.
		if (n == 0) {
			return 0;
		} else {
			// retorna o ultimo digito acessado pelo resto na divisão por 10 + a propria
			// recursiva enviando o numero original menos o ultimo digtio para acessar o
			// penultimo e assim por diante
			return n % 10 + Rec(n / 10);
		}

	}

}
