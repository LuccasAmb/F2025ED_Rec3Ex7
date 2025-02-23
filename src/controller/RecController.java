package controller;

public class RecController {

	public RecController() {
		super();
	}


	public int Rec(int n) {
		
		//condição de parada quando os retornos são 1 e não requerem contas com o termo anterior
		if(n <= 2) {
			return 1;
		}else {
			//quando os retornos não forem simples = 1 chamar a recursiva com a formula padrão da fibonnaci até chegar nos retornos simples = 1 e ir somando no final
			return Rec(n-1) + Rec (n-2);
		}
		
	}

}
