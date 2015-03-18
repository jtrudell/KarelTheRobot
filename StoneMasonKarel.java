/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass has the robot replace missing stones 
 * in an infinite number of columns to support arches. It has a bug
 * in that it only works if columns are the same height. Version 2.0 fixes this.
 * Jeanette Trudell March 7, 2015 jtrudell@gmail.com
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	
	public void run() {
		firstColumn();
		while (rightIsClear()) {
		subsequentColumns();
		}
		if (rightIsBlocked()) {
			turnAround();
			turnAround();
		}
	}
  /*
   * This defines a method firstColumn which repairs the first column.	
   */
	  private void firstColumn() {
		  turnLeft();
		  repairBeeper();
	  }
  /*
   * This defines a method subsequentColumns which repairs all columns after the first column.
   */
	  private void subsequentColumns() {
		  while (facingNorth()) {
			  if (frontIsBlocked()) {
			  turnRight();
			  moveFour();
			  turnRight();
			  repairBeeper();
			  turnLeft();
			  if (frontIsClear()) {
			  moveFour();
			  turnLeft();
			  repairBeeper();
			  }
	  } else {
		  turnLeft();
		  moveFour();
		  turnLeft();
		  repairBeeper();
			  }	
		  }
	  }	
  /*
   * This defines a method repairBeeper which places a stone/beeper if one ins missing in a column.
   */
	  private void repairBeeper() {
	
		  while (frontIsClear()) {
			  if (beepersPresent()) {
				  move();
			  } else { 
				  putBeeper(); 
			  }
		  }
	  }
		
  /*
   * This defines method moveFour which moves Karel four spaces.
   */
	  private void moveFour() {
		  move();
		  move();
		  move();
		  move();
	  }
}
