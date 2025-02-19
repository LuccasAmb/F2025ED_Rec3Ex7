package controller;

public class RecController {

	public RecController() {
		super();
	}
	
	public int Rec(int numero, int digito, int cont) {
		
		//Condição de parada definida quando o numero/10 for 0 é porque acabou os digitos daquele número
		if(numero == 0) {
			return cont;
		}
		
		if((numero%10) == digito) {
			cont++;
		}
		
		//vai checar usando o resto da divisao por 10 o último dígito se é igual ao dígito comparado digitado pelo usuario, se sim adiciona ao contador
		//depois segue chamando a recursiva mas dividindo o numero por 10 para eliminar o ultimo digito e para o próximo poder ser checado.
		return Rec(numero/10, digito, cont);
		
	}
	

	
}
