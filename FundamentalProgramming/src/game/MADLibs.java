package game;

import java.util.Random;
import java.util.Scanner;

public class MADLibs {
	Scanner s = new Scanner(System.in);
	String story, name, adjective1, adjective2, noun1, noun2, noun3, adverb, randomNums;
	Random rand = new Random();

	public static void main(String[] args) {
		MADLibs m = new MADLibs();
		m.printInstrustions();
		m.play();
	}

	public void printInstrustions() {
		System.out.println(
				"Welcome to Mad Libs game . If you type in words we will give you a story" + "\nType in the words .");
		
	}

	public void play() {
		enterName();
		enterNoun();
		enterADj1();
		enterADj2();
		enterNoun2();
		enterNoun3();
		setRandomNums();
		putStoryTogether();
		System.out.println(getStory());
	}

	public void enterName() {
		System.out.println("Give me a Name");
		setName(s.nextLine());
	}

	public void enterNoun() {
		System.out.println("Give me a Noun");
		setNoun1(s.nextLine());
	}

	public void enterNoun2() {
		System.out.println("Give me a Noun");
		setNoun2(s.nextLine());
	}

	public void enterNoun3() {
		System.out.println("Give me a Noun");
		setNoun3(s.nextLine());
	}

	public void enterADj1() {
		System.out.println("Give me a Ajjective");
		setAdjective1(s.nextLine());
	}

	public void enterADj2() {
		System.out.println("Give me a Adjective");
		setAdjective2(s.nextLine());
	}

	public void enterADverb() {
		System.out.println("Give me a Name");
		setAdverb(s.nextLine());
	}

	public void putStoryTogether() {
		String story = "";
		int i = Math.abs(rand.nextInt()) % 2;
		if (i == 0) {
			story = "Jessy and his friend " + getName() + "went to Disney World Land!" + " They saw a " + getNoun1()
					+ " in a show at the magic Kingdon . \n" + "" + "and ate a " + getAdjective1()
					+ " feast for a dinner . And next day I ran " + getAdverb() + " to Mickey Mouse in his "
					+ getNoun2() + " And then at the night I gazed at the " + getRandomNums() + " " + getNoun3() + ""
					+ " " + getAdjective2() + " fireworks shooting from the " + getNoun3() + " .";
		}else{
			story = "Rama and his friend " + getName() + "went into forest!" + " They saw a huge" + getNoun1()
			+ " in the trees. " + "" + "and \nate a " + getAdjective1()
			+ " feast for a dinner . And next day  " + getAdverb() + " into  "
			+ getNoun2() + " treesss  " + getRandomNums() + " " + getNoun3() + ""
			+ " " + getAdjective2() + " they slept " + getNoun3() + " .";
		}
		setStory(story);
	}

	// getters and setter;
	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdjective1() {
		return adjective1;
	}

	public void setAdjective1(String adjective1) {
		this.adjective1 = adjective1;
	}

	public String getAdjective2() {
		return adjective2;
	}

	public void setAdjective2(String adjective2) {
		this.adjective2 = adjective2;
	}

	public String getNoun1() {
		return noun1;
	}

	public void setNoun1(String noun1) {
		this.noun1 = noun1;
	}

	public String getNoun2() {
		return noun2;
	}

	public void setNoun2(String noun2) {
		this.noun2 = noun2;
	}

	public String getNoun3() {
		return noun3;
	}

	public void setNoun3(String noun3) {
		this.noun3 = noun3;
	}

	public String getAdverb() {
		return adverb;
	}

	public void setAdverb(String adverb) {
		this.adverb = adverb;
	}

	public String getRandomNums() {
		return randomNums;
	}

	public void setRandomNums() {
		int num = Math.abs(rand.nextInt() % 100);
		int index = 0;
		int[] numHolder = new int[3];
		while (index < numHolder.length) {
			numHolder[index] = num + index;
			index++;
		}
		this.randomNums = "not " + numHolder[0] + " ,not " + numHolder[1] + " ,but " + numHolder[1];
	}

}
