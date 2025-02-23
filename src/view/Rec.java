package view;

import javax.swing.JOptionPane;

import controller.RecController;

public class Rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string;
		RecController rec = new RecController();
		string = JOptionPane.showInputDialog("Digite algo");
		System.out.println(rec.Rec(string, ""));
	}

}
