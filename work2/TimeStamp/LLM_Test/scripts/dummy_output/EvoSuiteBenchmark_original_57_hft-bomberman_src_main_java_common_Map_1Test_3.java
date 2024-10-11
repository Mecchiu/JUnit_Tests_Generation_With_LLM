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
		private static final int ITEM = 1;
		private static final String EXTERNAL_FILE_PATH = "/Users/christian/MySouvenir/Documents/TEST-DataBase/";
		
		private Map map;
		
		/**
		* Override constructors.
		* 
		*/
		public Map_1Test(Map map) {
			this.map = map;
		}
		
		/**
		* Override test_1 method.
		* 
		*/	
		@Test
		public void test_1() {
			for(Integer num : new ArrayInt(map.GetStartPoints())) {
				System.out.println("Start-point: "+ map.getStartPoint(num));
			}
}
}