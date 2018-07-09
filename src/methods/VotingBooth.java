package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int a= Integer.parseInt(age);
		if(a > 18) {
			JOptionPane.showInputDialog("Who should be the next president?");
		}
		else {
			JOptionPane.showMessageDialog(null, "Nobody cares about your opinion"); 
		}
	}

}
