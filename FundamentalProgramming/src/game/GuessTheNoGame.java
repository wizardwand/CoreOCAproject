package game;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNoGame {
	int max;
	int theNumber;
	Scanner s = new Scanner(System.in);

	GuessTheNoGame() {
		Random rand = new Random();
		max = 100;
		theNumber = Math.abs(rand.nextInt() % max);
	}

	public void play() {

		while (true) {
			try {
				int x = s.nextInt();
				if (x > theNumber) {
					System.out.println("Hint : Your Number is too Big  ! Give another try :D");
				} else if (x < theNumber) {
					System.out.println("Hint : Your Number is too small! Give another try :D");
				} else if (x == theNumber) {
					System.out.println("Perfect you got it !! Congradulations");
					System.out.println("  ^     ^");
					System.out.println("     >    ");
					System.out.println(" " + '\\' + "___/");
					break;

				}
			} catch (Exception e) {
				s.close();
				break;
			}
		}
		s.close();
	}

	public static void main(String[] args) {

		System.out.println(
				"Welcome to my Game ! Guess a number in the Range of 0 to 100 inclusive .\n Please enter the number");
		GuessTheNoGame n = new GuessTheNoGame();
		n.play();

	}

}
