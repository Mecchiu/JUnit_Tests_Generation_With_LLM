// Map_1Test.java
package common;

import java.awt.Point;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Map}.
* It contains one unit test case for the {@link Map#getTile(int, int)} method.
*/
class Map_1Test {
		
	final int ROWS = 10;
	final int COLUMNS = 10;
	final Vector<PowerUp> Powerups = new Vector<PowerUp>(ROWS*2, ROWS * 2);
	
	private boolean settiles = false;
	private boolean setpowerups = false;
	private boolean setstartpoints = false;
	
	// 2 dimensional game board
	private Object[][] MapGrid = new Object[5][5];
	
	
	// constructor
	public Map_1Test() {
		powerups(); 
		Powerups.add(new PowerUp(1,"POWERUP1")); 
		Powerups.add(new PowerUp(1,"POWERUP2"));
		Powerups.add(new PowerUp(1,"POWERUP3"));
}
}