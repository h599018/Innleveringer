package Oblig12;

import javax.swing.JOptionPane;

public class Oppgave2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int elever = 1; elever <= 10; elever++) {

			String dialogboks = JOptionPane.showInputDialog("Hvor var scoren din?");

			int Score = Integer.parseInt(dialogboks);

			if (100 >= Score && Score >= 90) {
				System.out.println("A");
			} else if (90 > Score && Score >= 80) {
				System.out.println("B");
			} else if (80 > Score && Score >= 60) {
				System.out.println("C");
			} else if (60 > Score && Score >= 50) {
				System.out.println("D");
			} else if (50 > Score && Score >= 40) {
				System.out.println("E");
			} else if (40 > Score && Score >= 0) {
				System.out.println("F");
			} else {
				elever--;
				
			}
		}

	}

}
