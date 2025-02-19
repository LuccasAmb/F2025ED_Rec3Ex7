package view;

import javax.swing.JOptionPane;

import controller.RecController;

public class Rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		RecController rec = new RecController();
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro"));
		System.out.println(rec.Rec(numero, 0));
		System.out.println(rec.Rec2(numero));
	}

}
