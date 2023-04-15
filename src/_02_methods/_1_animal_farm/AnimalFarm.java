//    Copyright (c) The League of Amazing Programmers 2013-2020
//    Level 0

package _02_methods._1_animal_farm;

import java.io.File;
import javax.swing.JOptionPane;
import java.util.Random;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
public class AnimalFarm {
	
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	boolean canPlaySounds = true;

	
	public static void main(String[] args) {
		new AnimalFarm().animals();
	}
	
	void animals() {
String input = "start";
		/* 1. Ask the user which animal they want, then see and hear 
		 *    the animal they chose using one of the methods below.
		*/	while(!input.equals("quit")) {		 
			input = JOptionPane.showInputDialog("Pick an animal on the farm! No capital letters pls");
			switch(input) {
			case "cow":
				moo();
				break;
			case "duck":
				duck();
				break;
			case "dog":
				dog();
				break;
			case "cat":
				cat();
				break;
			case "llama":
				llama();
				break;
			case "quit":
				break;
			default:
				JOptionPane.showMessageDialog(null,  "We don't have that animal on our farm!");
			}
		}
		/* 2. Make it so that the user can keep entering new animals. */

	}

	void moo() {
		playNoise(mooFile);
		showImage(cowIcon);
	}

	void duck() {
		playNoise(quackFile);
		showImage(duckIcon);
	}

	void dog() {
		playNoise(woofFile);
		showImage(dogIcon);
	}
	
	void cat() {
		playNoise(meowFile);
		showImage(catIcon);
	}
	
	void llama() {
		playNoise(llamaFile);
		showImage(llamaIcon);
	}
	


	

	/* Ignore this stuff */
	String path = "src/_02_methods/_1_animal_farm/";
	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";
	ImageIcon llamaIcon;
	ImageIcon catIcon;
	ImageIcon dogIcon;
	ImageIcon duckIcon;
	ImageIcon cowIcon;
	
	private void showImage (ImageIcon icon) {
			JOptionPane.showMessageDialog(null, "", "You chose", 0, icon);
	}
	
	private void playNoise(String soundFile) {
		if (canPlaySounds) {	
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		}
	}
	public AnimalFarm() {
		try {
			llamaIcon = new ImageIcon(path+"llama.jpg");
			cowIcon = new ImageIcon(path+"cow.jpg");
			dogIcon = new ImageIcon(path+"dog.jpg");
			catIcon = new ImageIcon(path+"cat.jpg");
			duckIcon = new ImageIcon(path+"duck.jpg");

		} catch (Exception e) {
					
		}
	}
}