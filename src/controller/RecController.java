package controller;

public class RecController {

	public RecController() {
		super();
	}


	public int Fat(int n) {
		if(n <= 1) {
			return 1;
		}else {
			return n * Fat(n-1);
		}
	}
	
	public double Rec(int n, double soma) {
		//quando o n chega a 1, apenas soma 1 a série, já que 1/1! = 1;
		if(n <= 1) {
			return 1+ soma;
		}else {
			//adiciona a soma 1/pelo fatorial do N atual calculado por outra recursiva simples, depois chama a própria recursiva -1 para ir para o proximo termo.
			soma+= 1.0/ Fat(n);
			return Rec(n-1, soma);
		}
	}

}
