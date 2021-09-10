package Oblig123;

import javax.swing.JOptionPane;

public class Fakk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dialogboks = JOptionPane.showInputDialog("skriv et tall");
		
		int tall = Integer.parseInt(dialogboks);
		
		int svar = 1;
		
		for(; tall > 0; tall--) {
			svar = svar * tall;
		}
		
		System.out.println(svar);

	}

}
