// PlotRunList_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#remove(int)} method.
*/
class PlotRunList_2Test {
		/**
		 * Test method for {@link PlotRunList#remove(int)}.
		 * The method runs once for each run that fits into the run list.
		 */
		@Test
    public void testRemove2() {
    	
        String plotName = "PlotName";
        String colorName = "color";
    	
        int min = 2;
        int max = 300;
        
        double width = 6;
        double height = 8;
        
        PlotSymbol psc = PlotSymbolFactory.create(plotName, colorName,
                width, height, min, max);
        
        double[][] x = {{30, 150}, {30, 70}, {60, 70}, {20, 150}, {0, 75}, {0, 75}};
        double[][] y = {{0, 0}, {8, 0}, {60, 0}, {160, 0},{0, 0}, {0, 0}};
        
        int[][] runR = new int[][] {
        		{0, 1, 2},{3, 4, 5}
        };

        int count = 0;
        int index = 0;
    	
        double[] colorArray = new double[4];
    	
}
}