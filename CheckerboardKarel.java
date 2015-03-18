/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * The CheckerboardKarel class has Karel draw a checkerboard
 * using beepers. It works on worlds with an even number of columns,
 * but Karel is blocked at the end instead of "stopping" (will fix  that one day).
 * Worlds with an odd number of columns, not so much (will fix that one day). 
 * Jeanette Trudell March 8, 2015 jtrudell@gmail.com 
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run() {
		while (frontIsClear()) {
		putBeeperMove();
		checkFront();
		}
	}
	

/* 
 * This defines a method putBeeperMove which has Karel put a beeper, move
 * and if the front is clear, move again; else Karel goes to the next row (if any).
 */
		private void putBeeperMove() {
		putBeeper();
		move();
		if (frontIsClear()) {
		move();
		} else {
			goToNextRow();
		}
		}
		
/*
 *This defines a method checkFront which checks if the front of Karel is blocked and if
 *it is, tells it to go to the next row; else the front is clear and Karel calls putBeeperMove. 	
 */
		private void checkFront() {
			if (frontIsBlocked()) {
				goToNextRow();
		}	else {
			putBeeperMove();
		}
		}
		
/*
 * This defines a method goToNextRow which has Karel move to the next row and turn to
 * the appropriate direction to continue along the next row.		
 */
		private void goToNextRow() {
			if (facingEast()) {
				moveUpWest();
			} else {
				moveUpEast();
			}
			putBeeperMove();
			}
			
			
	
/*
 * This defines a method moveWest, which has Karel move from the end of a row in which he is
 * facing East to the next row and turns him to face West.
 */
		private void moveUpWest() {
			turnLeft();
			move();
			turnLeft();
			}
		
/*
 * This defines a method moveEast, which has Karel move from the end of a row in which he is
 * facing West to the next row and turns him to face East.
 */

		private void moveUpEast() {
			turnRight();
			move();
			turnRight();
			}
		}

		

		
		
		


