/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * The MidpointFindingKarel class leaves a beeper on the corner 
 * closest to the center of the first row (or either of the two central 
 * corners if the first row  has an even number of corners). Imaginary
 * version 2.0 would get rid of the fristReturn method and rely on subsequentReturns
 * for each movement along the row after firstRow.
 * Jeanette Trudell March 8, 2015 jtrudell@gmail.com
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	/*
	 * Karel executes method firstRow, and then executes method secondRow.
	 * Thereafter, while beepers are present, he executes the subsequentReturns 
	 * loop, until he is in the middle with no beepers. He then puts a beeper in
	 * the middle and turns until he is facing east.
	 */
	public void run() {
		firstRow();
		firstReturn();
		while (beepersPresent()) {
		subsequentReturns();
		}
		putBeeper();
		while (notFacingEast()) {
			turnRight();
		}
	}
		
	
	/* 
	 * Defines a method firstRow which puts a beeper on every corner in the first row.
	 * When Karel gets to the wall at the end of the first row, he turns around.
	 */
			private void firstRow() {
				while (frontIsClear()) {
					putBeeper();
					move();
				}
				turnAround();
			}
				
	/*
	 * Defines a method firstReturn. While the space in front of him is clear (no wall), Karel moves until
	 * he hits the west wall, and then he picks up the beeper next to the west wall, wall turns around to face
	 * east and moves, leaving him in the second spot from the east wall.
	 */
			private void firstReturn() {
				while (frontIsClear()) {
					move();
				}
				if (frontIsBlocked()) {
					pickBeeper();
					turnAround();
					move();
				}
			}
	
	/*
	 * Defines a method subsequentReturns which takes care of each return along the 
	 * row after the first return. If a beeper is present in the spot Karel is  in
	 * as he starts the subsequent return, he picks up the beeper and moves to the next spot.
	 * Thereafter, while there is a beeper, he moves until he is on a spot with no beepers, and then he
	 * turns around and moves back along the row to the next spot. This loop is used to carve a 
	 * single beeper from each end of the row until there are no beepers left and Karel is in the middle. 	
	 */
				private void subsequentReturns() {
				if (beepersPresent()) {
					pickBeeper();
					move();
				}
				while (beepersPresent()) {
					move();
				}
					turnAround();
					move();
					
				}
		
}
				
		
		
			
	


