package methods;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
		while (true) {
			String ch = "chicken";
			String c = "cow";
			String h = "horse";
			String d = "dog";

			String animal = JOptionPane.showInputDialog("What is a farm animal you want to own?");
			if (animal.equals(ch)) {
				playQuack();
			} else if (animal.equals(c)) {
				playMoo();
			} else if (animal.equals(h)) {
				playLlama();
			} else if (animal.equals(d)) {
				playWoof();
			}
			break;
		}
		/* 2. Make it so that the user can keep entering new animals. */

	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	void playLlama() {
		playNoise(llamaFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(getClass().getResource(soundFile)));
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
