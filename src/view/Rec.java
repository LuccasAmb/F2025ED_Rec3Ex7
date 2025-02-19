package view;

import javax.swing.JOptionPane;

import controller.RecController;

public class Rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, digito;
		RecController rec = new RecController();
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro de 10 a 999999"));
		}while(numero < 10 && numero > 999999);
		
		do {
			digito = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de 0 a 9"));
		}while(digito < 0 && digito > 9);
		
		
		System.out.println(rec.Rec(numero, digito, 0));
	}

}
