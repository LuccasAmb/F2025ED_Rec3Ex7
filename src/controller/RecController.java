package controller;

public class RecController {

	public RecController() {
		super();
	}
	
	public int Rec(int numero, int cont) {
		
		String numeros[] = Integer.toString(numero).split("");
		int tamanho = numeros.length;
		
		//A condição de parada é definida pelo contador sendo igual a tamanho do vetor de String com os dígitos do numero inteiro.
		if(tamanho == cont) {
			return cont;
		}else {
			//Contador aumenta para acumular na contagem e posteriormente comparar com o tamanho manualmente acessado pelo método length
			cont++;
			return Rec(numero, cont);
		}
		
	}
	
	public int Rec2(int numero) {
		
		//Condição de parada é quando sobra apenas um dígito
		if(numero < 10) {
			return 1;
		}
		
		//Dividir por 10 o número original, reduzindo um dígito dele, caso ele seja maior ou igual a 10, ou seja, tenha mais de um dígito.
		return 1 + Rec2(numero/10);
	}
	
}
