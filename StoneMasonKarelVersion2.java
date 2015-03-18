/*
 * File: StoneMasonKarelVersion2.java
 * version 2.0
 * --------------------------
 * The StoneMasonKarel subclass has Karel the robot replace missing stones 
 * in an infinite number of columns of varying height to support arches.
 * This fixes version 1.0 which worked on an infinite number of columns of
 * of the same height but did not work when columns were of varying height.
 * Jeanette Trudell March 7, 2015 jtrudell@gmail.com
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	
	public void run() {
		fixVertical();
		goToNext();
		while (frontIsClear()) {
		fixVertical();
		goToNext();
		}
		if (frontIsBlocked()) {
			fixVertical();
			turnLeft();
		}
		}
		
   /*
   * this defines a method fixVertical which fixes each column.	
   */
	  private void fixVertical() {
		  if (noBeepersPresent()) {
			  putBeeper();
		  }
		  turnLeft();
		  repairBeeper();
		  if (frontIsBlocked()) {
			  if (noBeepersPresent()) {
				  putBeeper();
			  }
			  if (beepersPresent()) {
				  turnAround();
			  }
		  }
		  while (frontIsClear()) {
			  move();
		  }			
	  }

  /* 
   * This defines a method goToNext that moves Karel the Robot to the next column (if any).
   */
	  private void goToNext() {
		  turnLeft();
		  if (frontIsClear()) {
			  moveFour();
		  }
	  }
	
  /*
   * This defines a method repairBeeper which places a stone/beeper if one is missing in a column.
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
   * This defines method moveFour which moves Karel the Robot four spaces.
   */
	  private void moveFour() {
		  for (int i = 0; i<4; i++) {
			  move();
		  }
	  }
	  }

