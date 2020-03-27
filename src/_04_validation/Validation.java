//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
if(randomNumber==(0)) {
	System.out.println("You look not bad today.");
	} else if(randomNumber==(1)) {
		System.out.println("You are smart");
	} else if(randomNumber==(2)) {
		System.out.println("You are good at making me write compliments.");
	} else if(randomNumber==(3)) {
		System.out.println("You are good at making me bored of writing these");
	}else {
		System.out.println("You know what? I'm gonna stop. I've written enough compliments.");
	}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
