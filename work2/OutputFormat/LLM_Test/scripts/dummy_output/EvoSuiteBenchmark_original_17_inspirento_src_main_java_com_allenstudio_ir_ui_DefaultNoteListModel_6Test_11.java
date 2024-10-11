// DefaultNoteListModel_6Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
*/
class DefaultNoteListModel_6Test {
		static final int NUM_ITEMS = 5;
		
		/**
		 * Returns an array containing the numbers of the last 5 items in <code>items</code>.
		 *
		 * @param items the components whose elements are to have the last number of items in their array
		 * @return an array of numbers
		 */
		static int[][] create(AbstractNote[][]  items) {
			int[][] n = new int[NUM_ITEMS][];
			for (int i=0; i<NUM_ITEMS; i++) {
				n[i] = new int[items[i].length];
				
				for (int j=0; j<n[i].length; j++) {
					n[i][j] = items[i][j].getNoteNumber();
				}
			}
			return n;
		}
		
		/**
		 * Returns an array containing the array of numbers of <code>items</code> with the last
		 * 2 items, and empty arrays afterwards.
		 *
		 * @param items the components whose elements are to have the last number of items in each array
		 * @return an array of numbers
		 */
		static int[][] findLast(AbstractNote[][]  items) {
			int[][] ret = new int[2][];
			int last_num_of = -1;
			for (int i = 0; last_num_of == -1 || last_num_of!=  items[i].length; i++) {
				int[] first = new int[items[i].length];
				int[] last = new int[items[i].length];
				int[] next = new int[items[i].length];
				
				for (int j=0; j<items[i].length; j++) {
					first[j] = items[i][j].getNoteNumber();
				}
				
				System.arraycopy(items[i].clone(), 0, last, 0, items[i].length);
				
				System.arraycopy(first, 0, next, 0, first.length);
				
				ret[0] = first;
				ret[1] = last;
				ret[2] = next;
				
				last_num_of = items[i].length;	
			}
			if (last_num_of!= items[0].length) {
				throw new IllegalStateException("Last index of the items array is not equal to number of items");
			}
			return ret;
		}
		
		@Test
		void lastIndexOf_withArray_returns_the_last_index_of_the_item() throws Exception {
			try {
				ArrayList<Object> items = new ArrayList<Object>();
   				items.add("a");
   				items.add("b");
  				try {
					items.lastIndexOf("g");
					fail("No exception expected");
				} 
				catch(AssertionError ae) {
					// Expected exception not raised
				}
			}
			catch(Exception e) {
				if ((e.getMessage().equals("Arrays have different length")) && 
					(e.getCause()!= null) && (e.getCause() instanceof IllegalArgumentException)) {
					// OK: Arrays have different length
				}
				else {
					throw e;
				}
			}
        }
		
		@Test
		void findLast_returns_the_last_item_with_equal_length() throws Exception {
			ArrayList<Object>[] items = new ArrayList<Object>[] { 
    				new ArrayList<Object>(),
    				new ArrayList<Object>() };
    			
			for (int i=0; i<NUM_ITEMS; i++) {
				items[i].add("a");
				items[i].add(i);
			}
    		
    		try {
    			items.lastIndexOf("a");
    			fail("No exception expected");
    		} 
    		catch(AssertionError ae) {
    			// Expected exception not raised
    		}
    		ItemsEventListEvent[] eventListeners = { 
        		   new ItemsEventListEvent(new AbstractNote(0, 1)),
        		   new ItemsEventListEvent(new AbstractNote(0, NUM_ITEMS-1)) };
        	
    		ModelTestUtils.testFindLast(
    				new DefaultNoteListModel(items, null, eventListeners, false));
    		
    		try {
    			items.lastIndexOf("g");
    			fail("No exception expected");
    		} 
    		catch(AssertionError ae) {
    			// Expected exception not raised
    		}
    		
    		try {
    			items.lastIndexOf("ae");
    			fail("No exception expected");
    		} 
    		catch(AssertionError ae) {
    			// Expected exception not raised
    		}
    		
    		try {
    			items[0].lastIndexOf("a");
    			fail("No exception expected");
    		} 
    		catch(AssertionError ae) {
    			// Expected exception not raised
    		}
    		
    		try {
    			items[0].lastIndexOf(new Object());
    			fail("No exception expected");
    		} 
    		catch(AssertionError ae) {
    			// Expected exception not raised
    		}
    	}
    	
}