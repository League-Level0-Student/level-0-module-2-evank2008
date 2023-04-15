//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import javax.swing.JOptionPane;

import java.net.URI;
import java.util.Random;



public class Validation {
	public static void main(String[] args) {

		Random ran = new Random();
		
		
		// 1.   Savde somethig remarkable about each person in a variable.
		String a1 = null;
		String a2 = null;
		String a3 = null;
		String a4 = null;
		String a5 = null;
		String a6 = null;
		String a7 = null;
		String p1 = " exist";
		String p2 = " have eyebrows";
		String p3 = " have the ability to read";
		String p4 = " are currently either standing or sitting";
		String p5 = " are currently in possesion of at least 2 kidneys";
		String p6 = " are not holding 8.4 slices of american cheese in your right hand";
		String p7 = " have breathed in the past minute";
		String name = null;
		// 2. Ask the user to enter a name. Store their answer in a variable.

		name = JOptionPane.showInputDialog("Let's find out how valid you are! What's your name? Type 'quit' to close.");
		while(!name.equals("quit")) {


			// 3. In a pop-up, tell the user what is remarkable about that person. 
			//This part randomizes the remarkability strings
			if(!name.equals("quit")) {
				//This part converts the random numbers to remarkabilities #1
				Random ran1 = new Random();
				int r1 = ran1.nextInt(7);
				switch(r1) {
				case 0:
					a1=p1;
					break;
				case 1:
					a1=p2;
					break;
				case 2:
					a1=p3;
					break;
				case 3:
					a1=p4;
					break;
				case 4:
					a1=p5;
					break;
				case 5:
					a1=p6;
					break;
				case 6:
					a1=p7;
					break;
				default:
					break;
				}
				
				//This part converts the random numbers to remarkabilities #2
				Random ran2 = new Random();
				int r2 = ran2.nextInt(7);
				switch(r2) {
				case 0:
					a2=p1;
					break;
				case 1:
					a2=p2;
					break;
				case 2:
					a2=p3;
					break;
				case 3:
					a2=p4;
					break;
				case 4:
					a2=p5;
					break;
				case 5:
					a2=p6;
					break;
				case 6:
					a2=p7;
					break;
				default:
					break;
				}
				//This part converts the random numbers to remarkabilities #5
				Random ran5 = new Random();
				int r5 = ran5.nextInt(7);
				switch(r5) {
				case 0:
					a5=p1;
					break;
				case 1:
					a5=p2;
					break;
				case 2:
					a5=p3;
					break;
				case 3:
					a5=p4;
					break;
				case 4:
					a5=p5;
					break;
				case 5:
					a5=p6;
					break;
				case 6:
					a5=p7;
					break;
				default:
					break;
				}
				//This part converts the random numbers to remarkabilities #4
				Random ran4 = new Random();
				int r4 = ran4.nextInt(7);
				switch(r4) {
				case 0:
					a4=p1;
					break;
				case 1:
					a4=p2;
					break;
				case 2:
					a4=p3;
					break;
				case 3:
					a4=p4;
					break;
				case 4:
					a4=p5;
					break;
				case 5:
					a4=p6;
					break;
				case 6:
					a4=p7;
					break;
				default:
					break;
				}
				//This part converts the random numbers to remarkabilities #3
				Random ran3 = new Random();
				int r3 = ran3.nextInt(7);
				switch(r3) {
				case 0:
					a3=p1;
					break;
				case 1:
					a3=p2;
					break;
				case 2:
					a3=p3;
					break;
				case 3:
					a3=p4;
					break;
				case 4:
					a3=p5;
					break;
				case 5:
					a3=p6;
					break;
				case 6:
					a3=p7;
					break;
				default:
					break;
				}
				//This part converts the random numbers to remarkabilities #1
				Random ran6 = new Random();
				int r6 = ran6.nextInt(7);
				switch(r6) {
				case 0:
					a6=p1;
					break;
				case 1:
					a6=p2;
					break;
				case 2:
					a6=p3;
					break;
				case 3:
					a6=p4;
					break;
				case 4:
					a6=p5;
					break;
				case 5:
					a6=p6;
					break;
				case 6:
					a6=p7;
					break;
				default:
					break;
				}
				//This part converts the random numbers to remarkabilities #7
				Random ran7 = new Random();
				int r7 = ran7.nextInt(7);
				switch(r7) {
				case 0:
					a7=p1;
					break;
				case 1:
					a7=p2;
					break;
				case 2:
					a7=p3;
					break;
				case 3:
					a7=p4;
					break;
				case 4:
					a7=p5;
					break;
				case 5:
					a7=p6;
					break;
				case 6:
					a7=p7;
					break;
				default:
					break;
				}
				JOptionPane.showMessageDialog(null,"Amazing! You simultaneously" + a1 + " AND you" + a2 + " AND you" + a3 + "\nAND you" + a4 + " AND you" + a5 + " AND you" + a6 + " AND you" + a7 + "! How crazy is that?");
				
				
			}
			name = JOptionPane.showInputDialog("Let's find out how valid you are! What's your name?");
		}
	}
}