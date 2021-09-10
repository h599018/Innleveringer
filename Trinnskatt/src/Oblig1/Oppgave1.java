package Oblig1;

import javax.swing.JOptionPane;

public class Oppgave1 {

	public static void main(String[] args) {

		String dialogboks = JOptionPane.showInputDialog("Hva er bruttoinntekten din?");

		int bint = Integer.parseInt(dialogboks);

		if (bint <= 184800) {
			System.out.println("Du betaler ingen trinnskatt");
		} else if (bint <= 260100) {
			System.out.println("du betaler 1,7% trinnskatt");
		} else if (bint <= 651250) {
			System.out.println("du betaler 4,0% trinnskatt");
		} else if (bint <= 1021550) {
			System.out.println("du betaler 13,2% trinnskatt");
		} else if (bint > 1021550) {
			System.out.println("du betaler 16,2% trinnskatt");
		} else {
			System.out.println("error");
		}
	}
}
