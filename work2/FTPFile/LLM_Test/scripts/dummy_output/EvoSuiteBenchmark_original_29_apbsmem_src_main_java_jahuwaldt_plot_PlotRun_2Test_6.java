// PlotRun_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#remove(int)} method.
*/
class PlotRun_2Test {
		
	//Constructor
	public PlotRun_2Test() {

	}

	/**
	 *  Constructor with various data values.
	 *
	 *  @param   data  The ArrayList containing the objects to add to the run.
	 */
	public PlotRun_2Test(ArrayList data) {		
	}
	
	//test cases
	/**
     * Test remove() method.
     */
    @Test public void testRemove() {
        
        System.out.println("remove:");
        this.remove0(0);
        System.out.println("returned 0: " + this.size());

    }

	/**
     *  test add() method.
     */	
    @Test public void testAdd() {
        
        this.remove0(0);	
        //this.size =1;
        this.add("", new double[]{1})	;
        System.out.println("returned 1: " + this.size());
            
    }

	/**
     * test removeAll() method
     */							
    @Test public void testRemoveAll1() {	
        
        this.removeAll();
        System.out.println("returned 0: " + this.size());
        
    }

    public void addAll(ArrayList data) {	
        this.addAll(data);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class) 
	public void testRemoveAll2() {	
			
		this.removeAll(2);
		
	}

    public void testRemoveAll3() {		
        Object[][] lst = new Object[][]{new Object[]{"apple"}, new Object[]{"apple", "pete"}};	
		
		this.removeAll(0);		
		
		assertEquals(0, this.size());
		
}
}