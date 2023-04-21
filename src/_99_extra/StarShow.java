
package _99_extra;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/* Before beginning recipe: 
* 1. ask students to find and explain the method in this recipe. 
* 2. ask students how they might use the method to make the picture in the laminated hand-outs. */

public class StarShow {
	
	Robot batman = new Robot("batman");
	
	void makeStars() {
		
		// 13. Set the speed to 8
batman.setSpeed(80);
		// 6. Make a variable to hold the X position of the Robot and set it to 10
int robY = 0;
int robX = 0;
int starSize = 25;
		// 7. Make a variable to hold the Y position of the Robot and set it to 600

		// 8. Make a variable to hold the star size and set it to 25

		// 12. Repeat the steps #19 to #18, 30 times
for(int i = 30; i>=1; i--) {
			// 19. Set the pen width to i 
	batman.setPenWidth(i);
			// 10. Set the X position of the robot to your X variable
	batman.setX(robX);
	batman.setY(robY);
	drawStar(starSize);
	robX = robX + starSize;
	robY += starSize;
	starSize+=20;
	batman.turn(12);
			// 11. Set the Y position of the robot to your Y variable
	
			// 9. Call the drawStar() method with your star size variable
	
			// 14. Increase the X position by star size. See Figure 2.
	
			// 15. decrease the Y position by star size. See Figure 3.
	
			// 16. Increase the star size by 20
	
			// 17. Turn the robot 12 degrees
	
			// 18. Make each star a different random color like in Figure 4. 
}
	}

	private void drawStar(int starSize) {
		// 2. Put the robot's pen down
batman.penDown();
		// 4. Repeat both commands 5 times. See Figure 1 at http://bit.ly/star-show
for(int i = 1; i<=5; i++) {
batman.move(starSize);
batman.turn(144);
			// 1. Move the robot the distance of the starSize variable
	
			// 3. Turn the robot 144 degrees
}
			
	}
	
	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}





