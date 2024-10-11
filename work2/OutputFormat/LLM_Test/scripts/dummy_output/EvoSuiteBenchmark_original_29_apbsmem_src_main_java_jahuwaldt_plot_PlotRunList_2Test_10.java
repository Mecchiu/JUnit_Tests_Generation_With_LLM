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
		class mylist extends PlotRunList {
	    		
			
		    	/**
		     	* Test of remove method, of class PlotRunList.
		     * @throws  java.lang.IndexOutOfBoundsException
		     *             Thrown if the {@link PlotRunList#size()} or the index of the plot run list is out of bounds.
		     */
		    public void testRemove() throws java.lang.IndexOutOfBoundsException {
		    	
		    	System.out.println(this.getClass().getName() + ".testRemove - Start");
		
		     		this.remove(-1);
		    		
		     		// @@@ more sophisticated tests of iteration in the test case below

		     		System.out.println("Size = " + this.size());
		        }

		    	/**
		     	* Test of remove method, of class PlotRunList.
		     * @throws  java.lang.IndexOutOfBoundsException
		     *             Thrown if the {@link PlotRunList#size()} or the index of the plot run list is out of bounds.
		     */
		    public void testRemoveNonZeroIndex() throws java.lang.IndexOutOfBoundsException {

		    	
		    	System.out.println(this.getClass().getName() + ".testRemoveNonZeroIndex - Start");
		    	
		        	this.remove(1);
		    	
		        	// @@@ better way to test removal (not just index of runs)?
		        	// this.remove(1);
		        	
		        	System.out.println("Size = " + this.size());
		 	    }

		    /**
		     * Test of set.
		     */
		    public void testSet() {
		        Object o = this.remove(1);
		        assertEquals(o, this.set(1));
		        assertEquals(this.data.size(), this.size());
		    }

		    /**
		     * Test of add.
		     */
		    public void testAdd() {
			int index = this.size();

			System.out.println("Size = " + this.size());
		
			this.insert(index, 5);
			assertEquals(5, this.data.get(index).getX());
			assertEquals(5.5, this.data.get(index).getY());
		}

		    /**
		     * Test of replace.
		     * @throws java.lang.IndexOutOfBoundsException
		     */
}
}