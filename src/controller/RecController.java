package controller;

public class RecController {

	public RecController() {
		super();
	}


	
	public int Rec(int n) {
		
		if(n == 0) {
			return 0;
		}else {
			int soma = (n%10);
			return soma + Rec(n/10);
		}
		
	}

}
