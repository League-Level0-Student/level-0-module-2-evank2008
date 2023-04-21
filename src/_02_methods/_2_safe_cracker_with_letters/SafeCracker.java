//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _02_methods._2_safe_cracker_with_letters;

import java.io.File;
import java.util.Random;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class SafeCracker {
String l1 = null;
String l2 = null;
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	boolean canPlaySounds = true;
	
	public static void main(String[] args) {
		SafeCracker sc = new SafeCracker();
		System.out.println("sc.crackthesafe");
		sc.crackTheSafe();
		System.out.println("sc.oneletter");
		sc.twoLetters();
		System.out.println("sc.twoLetters");
		
	}

	
	void crackTheSafe() {
		System.out.println("cracksafe ran");
		JOptionPane.showMessageDialog(null, "Oh no! The safe is locked!");
		JOptionPane.showMessageDialog(null, "Initialize safecracker?");
		oneLetter();
		}
	void oneLetter() {
		System.out.println("oneletter ran");
			for(int dig1 = 1;dig1<=26;) {
			switch (dig1) {
			case 1:
				l1 = "a";
				break;
			case 2:
				l1 = "b";
				break;
			case 3:
				l1 = "c";
				break;
			case 4:
				l1 = "d";
				break;
			case 5:
				l1 = "e";
				break;
			case 6:
				l1 = "f";
				break;
			case 7:
				l1 = "g";
				break;
			case 8:
				l1 = "h";
				break;
			case 9:
				l1 = "i";
				break;
			case 10:
				l1 = "j";
				break;
			case 11:
				l1 = "k";
				break;
			case 12:
				l1 = "l";
				break;
			case 13:
				l1 = "m";
				break;
			case 14:
				l1 = "n";
				break;
			case 15:
				l1 = "o";
				break;
			case 16:
				l1 = "p";
				break;
			case 17:
				l1 = "q";
				break;
			case 18:
				l1 = "r";
				break;
			case 19:
				l1 = "s";
				break;
			case 20:
				l1 = "t";
				break;
			case 21:
				l1 = "u";
				break;
			case 22:
				l1 = "v";
				break;
			case 23:
				l1 = "w";
				break;
			case 24:
				l1 = "x";
				break;
			case 25:
				l1 = "y";
				break;
			case 26:
				l1 = "z";
				break;
			default:
				System.out.println("error");
				//this bracket is for the switch
			}
		tryCode(l1);
		dig1++;
		//this bracket is for the for loop
			}
			System.out.println("No valid codes with a length of one letter. Trying two letters.");
	//this bracket is for the void oneLetter
		}
	void twoLetters() {
		System.out.println("twoletters ran");
			for(int dig2 = 1;dig2<=26;) {
			switch (dig2) {
			case 1:
				l2 = "a";
				break;
			case 2:
				l2 = "b";
				break;
			case 3:
				l2 = "c";
				break;
			case 4:
				l2 = "d";
				break;
			case 5:
				l2 = "e";
				break;
			case 6:
				l2 = "f";
				break;
			case 7:
				l2 = "g";
				break;
			case 8:
				l2 = "h";
				break;
			case 9:
				l2 = "i";
				break;
			case 10:
				l2 = "j";
				break;
			case 11:
				l2 = "k";
				break;
			case 12:
				l2 = "l";
				break;
			case 13:
				l2 = "m";
				break;
			case 14:
				l2 = "n";
				break;
			case 15:
				l2 = "o";
				break;
			case 16:
				l2 = "p";
				break;
			case 17:
				l2 = "q";
				break;
			case 18:
				l2 = "r";
				break;
			case 19:
				l2 = "s";
				break;
			case 20:
				l2 = "t";
				break;
			case 21:
				l2 = "u";
				break;
			case 22:
				l2 = "v";
				break;
			case 23:
				l2 = "w";
				break;
			case 24:
				l2 = "x";
				break;
			case 25:
				l2 = "y";
				break;
			case 26:
				l2 = "z";
				break;
			default:
				System.out.println("error");
				//this bracket is for the switch
			}
			for(int dig1 = 1;dig1<=26;) {
				switch (dig1) {
				case 1:
					l1 = "a";
					break;
				case 2:
					l1 = "b";
					break;
				case 3:
					l1 = "c";
					break;
				case 4:
					l1 = "d";
					break;
				case 5:
					l1 = "e";
					break;
				case 6:
					l1 = "f";
					break;
				case 7:
					l1 = "g";
					break;
				case 8:
					l1 = "h";
					break;
				case 9:
					l1 = "i";
					break;
				case 10:
					l1 = "j";
					break;
				case 11:
					l1 = "k";
					break;
				case 12:
					l1 = "l";
					break;
				case 13:
					l1 = "m";
					break;
				case 14:
					l1 = "n";
					break;
				case 15:
					l1 = "o";
					break;
				case 16:
					l1 = "p";
					break;
				case 17:
					l1 = "q";
					break;
				case 18:
					l1 = "r";
					break;
				case 19:
					l1 = "s";
					break;
				case 20:
					l1 = "t";
					break;
				case 21:
					l1 = "u";
					break;
				case 22:
					l1 = "v";
					break;
				case 23:
					l1 = "w";
					break;
				case 24:
					l1 = "x";
					break;
				case 25:
					l1 = "y";
					break;
				case 26:
					l1 = "z";
					break;
				default:
					System.out.println("error");
					//this bracket is for the switch
				}
				tryCode(l2+l1);
				dig1++;
				}
			
		
		dig2++;
		//this bracket is for the for loop
			}
			System.out.println("No valid codes with a length of two letters. Trying three letters.");
	//this bracket is for the void oneLetter
		}

	 void tryCode(String guess) {
		System.out.println("trying " + guess);

		String secretCode = "zh";

		if (guess.equals(secretCode)) {
			JOptionPane.showMessageDialog(null, "Congratulations! You cracked the safe with " + guess);
			playTheSoundOfSuccess();
			System.exit(0);
		}
	}

	private void playTheSoundOfSuccess() {
		
		String path = "src/_02_methods/_2_safe_cracker/";
		if (canPlaySounds) {	
			File sound = new File(path+"me-gusta.wav");
			if (sound.exists()) {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}
			}
		}
	}

	
}
