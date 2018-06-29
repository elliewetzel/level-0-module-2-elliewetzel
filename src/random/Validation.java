//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		for(int i = 0; i < 10; i++) {
			if(randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "Your outift is very nice.");
			}else if (randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "You are really nice.");
			}else if (randomNumber == 3) {
				JOptionPane.showMessageDialog(null, "You're really smart.");
			}else if (randomNumber == 4) {
				JOptionPane.showMessageDialog(null, "You've got real skill.");
			}else {
				JOptionPane.showMessageDialog(null, "Your hair looks really nice.");
			}
			randomNumber = randomMaker.nextInt(5);
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
