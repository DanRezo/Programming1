//********************************************************************************
// PantherID:  [1261300]
// CLASS: COP 2210 – [Fall 2017]
// ASSIGNMENT # [1]
// DATE: [9/20/2017]
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************
package Lotto;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LottoPics {

	public static void main(String[] args) {

		/*
		 * Create two arrays. One for lotto and one for fantasyFive Set arrays
		 * length to equal amount of balls drawn
		 */
		int lotto[] = new int[6];
		int fantasyFive[] = new int[5];

		System.out.println("Your Lotto Numbers ");
		// Iterate overa loop for the length of lotto and put
		// random number into each index of loop
		for (int i = 0; i < lotto.length; i++) {
			// casting Math.random to an int. Math.random has a double value
			lotto[i] = (int) (Math.random() * 54) + 1;
		}
		// Intitalizing a string to hold all the indexies of the lotto array.
		// Quick console test to see if I have 6 numbers.
		String winningLotto = (lotto[0] + " " + lotto[1] + " " + lotto[2] + " " + lotto[3] + " " + lotto[4] + " "
				+ lotto[5]);
		System.out.println(winningLotto);

		// Following the same procedure as above for the fanatsyFive draw
		System.out.println("\nYour Fantasy Five Numbers ");
		for (int i = 0; i < fantasyFive.length; i++) {
			fantasyFive[i] = (int) (Math.random() * 37) + 1;
		}
		String winningFantasy = (fantasyFive[0] + " " + fantasyFive[1] + " " + fantasyFive[2] + " " + fantasyFive[3]
				+ " " + fantasyFive[4]);
		System.out.println(winningFantasy);

		// Using a JOptinonPane to show Momma her Lucky Numbers
		ImageIcon lucky = new ImageIcon("fingerCrossed.jpeg");
		JOptionPane.showMessageDialog(null, "Your Lotto numbers are: " + winningLotto
				+ "\nYour Fantasy Five Numbers are: " + winningFantasy + "\nGood Luck!!!", "FingersCrossed", 0, lucky);
	}
}
