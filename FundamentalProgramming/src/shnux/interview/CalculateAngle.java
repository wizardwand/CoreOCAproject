package shnux.interview;

import javax.swing.JOptionPane;

public class CalculateAngle {

	public static void main(String[] args) {
		getInputs();
		
	}

	static void getInputs() {
		String hourInput = JOptionPane.showInputDialog(null, "Please input Hour digit between 0 to 12");
		String minuteInput = JOptionPane.showInputDialog(null, "Please input Minute digit between 0 to 60");
		checkValidInput(hourInput, minuteInput);		
	}

	static void checkValidInput(String hourInput, String minuteInput) {
		try {
			int hrInput = Integer.parseInt(hourInput);
			int minInput = Integer.parseInt(minuteInput);

			if (!(hrInput < 0 || minInput < 0 || hrInput > 12 || minInput > 60)) {
				JOptionPane.showMessageDialog(null, "Angle between "+hrInput + " and "+
						minInput+ " is " + calcAngle(hrInput, minInput));
			} else {
				JOptionPane.showMessageDialog(null ,"Input is Wrong  ");
				getInputs();
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Please input integer ", null, 0);
			getInputs();
			
		}
	}

	static int calcAngle(int hrHand, int minHand) {

		if (hrHand == 12)
			hrHand = 0;
		if (minHand == 60)
			minHand = 0;

		// Calculate the angles moved by hour and minute hands
		// with reference to 12:00
		int hour_angle = (int) (0.5 * (hrHand * 60 + minHand));
		int minute_angle = 6 * minHand;

		// Find the difference between two angles
		int angle = Math.abs(hour_angle - minute_angle);

		// Return the smaller angle of two possible angles
		angle = Math.min(360 - angle, angle);

		return angle;
	}

}
