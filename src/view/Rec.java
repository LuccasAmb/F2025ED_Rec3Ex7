package view;

import javax.swing.JOptionPane;

import controller.RecController;

public class Rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		RecController rec = new RecController();
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um númeor inteiro até 20"));

		} while (numero > 20 || numero < 1);
		System.out.println(rec.Rec(numero));
	}

}
