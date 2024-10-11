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
		
	private Map map;
	private Point startPoint;
	
	private void mapInit(String xmlFile) {
		this.map = new Map(xmlFile);
		
		Vector<PowerUp> powerupsVector = new Vector<PowerUp>() {
			
			@Override
			public Iterator<PowerUp> iterator() {
				Iterator<PowerUp> iterator = null;
				Iterator<PowerUp> result;
				if(this.size() > 0) {
					result = this.iterator();
				} else {
					result = PowerUpIterator.noPowerUps();
				}
				return result;
			}
		};
		Iterator<PowerUp> it = powerupsVector.iterator();
		PowerUp powerup = it.next();
}
}