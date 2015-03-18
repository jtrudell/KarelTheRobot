/*
 * File: CollectNewspaperKarel.java

 * --------------------------------
 * Karel the Robot leaves his house, gets his paper and returns home.
 * Jeanette Trudell March 7, 2015 jtrudel@gmail.com
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

	public void run() {
		getPaper();
		returnHome();
	}
	
/* This defines a method getPaper where Karel leaves his house and
 * and picks up the paper.
 */
	  private void getPaper() {
		  move();
		  turnRight();
		  move();
		  turnLeft();
		  move();
		  move();
		  pickBeeper();
	  }


/* This defines a method returnHome where Karel returns to the place he started.
 */
	  private void returnHome() {
		  turnAround();
		  move();
		  move();
		  move();
		  turnRight();
		  move();
		  turnRight();
		  }
}
