//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_intro_to_random;

import java.util.Random;

public class IntroToRandom {
	public static void main(String[] args) {
		
		int num = 0;
		
		
		Random random = new Random();
		
		num=random.nextInt(-222 - 76);
		//4. Now limit the value of num to be between 0 and 100
System.out.println(num);
		//5. Now limit the value of num to be between 25 and 75. Hint: ((highest value - lowest value)+1) + lowest value

		//6. Challenge: Limit the value of num to be between -222 and 88

		//1. Print out the value of num
		
		//2. Run the program.  What number appears in the console?
		//   Run it again. Is the number the same?
	}
}
