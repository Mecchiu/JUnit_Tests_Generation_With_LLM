// Map_2Test.java
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
* It contains one unit test case for the {@link Map#getStartPoint(int)} method.
*/
class Map_2Test {
		
	// constructor
	public Map_2Test(){}

	// constructor with string name
	public Map_2Test(String name){
		this.name = name;
                if (PowerUps.isEmpty() == false)
	            System.out.println("There are " + PowerUps.size() + " powerups\n");
	}

	// constructor without parameters
	public Map_2Test(String name, String filepath){
		this.name = name;
                if (PowerUps.isEmpty() == false)
		    System.out.println("There are " + PowerUps.size() + " powerups\n");
	}

	@Test
	public void test1(){
		// if the number of powerups is empty, do nothing
}
}