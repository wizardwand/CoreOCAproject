package coinToss;

import java.util.Random;

public class CoinToss {

	/*
	 * @ 0 - head 1- Tail
	 */
	public String tossACoin() {
		Random rand = new Random();
		int t = Math.abs(rand.nextInt()) % 2;
		if (t == 0) {
			return "HEADS";
		} else {
			return "TAILS";
		}
	}

	public static void main(String[] args) {
		CoinToss game = new CoinToss();
		for (int i = 0; i < 10; i++)
			System.out.println(game.tossACoin());
	}

}
