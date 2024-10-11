// GenericSortedListModelTest.java
package de.huxhorn.lilith.swing.preferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GenericSortedListModel}.
* It contains one unit test case for the {@link GenericSortedListModel#getElementAt(int)} method.
*/
class GenericSortedListModelTest {

		/**
		* It tests the {@link GenericSortedListModel#getElementAt(int)} method.
		*/
		@Test
        public void getElementAt_with_zero() {
            Object result = data.get(0);

            assertEquals(new Integer(-1), data.get(0));

            assertEquals(false, test_equal(1, result));
        }
        
        /**
        * It tests the {@link GenericSortedListModel#getElementAt(int)} method.
		*/
        @Test
            public void getElementAt_with_one() {
            data.add(new Integer(1));

            Object result = data.get(1);

            assertEquals((Integer)new Integer(1), data.get(1));

            assertEquals(true, test_equal(1, result));
        }
		
		/**
		* It tests the {@link GenericSortedListModel#getElementAt(int)} method.
		*/
        @Test
            public void getElementAt_with_two() {
            data.add(new Integer(2));
            data.add(new Integer(3));

            Object result = data.get(2);

            assertEquals((Integer)new Integer(3), data.get(2));

            assertEquals(false, test_equal(2, result));
        }
		
		/**
		* It tests the {@link GenericSortedListModel#getElementAt(int)} method.
		*/
        @Test
            public void getElementAt_with_three() {
            Object result = data.get(2);

            assertEquals((Integer)new Integer(2), data.get(2));

            assertEquals(true, test_equal(2, result));
        }
		
		/**
		* It tests the {@link GenericSortedListModel#getElementAt(int)} method.
		*/
        @Test
            public void getElementAt_with_four() {
            data.add(new Integer(4));

            Object result = data.get(4);

            assertEquals((Integer)new Integer(1), data.get(4));

            assertEquals(false, test_equal(4, result));
        }
		
		/**
		* It tests the {@link GenericSortedListModel#getElementAt(int)} method.
		*/
        @Test
            public void getElementAt_with_five() {
            Object result = data.get(4);

            assertEquals((Integer)new Integer(1), data.get(4));

            assertEquals(true, test_equal(4, result));
        }
		
		/**
		* It tests the {@link GenericSortedListModel#getElementAt(int)} method.
		*/
        @Test
            public void getElementAt_with_sixty() {
            data.add(new Integer(10));
            data.add(new Integer(45));
            data.add(new Integer(10));

            Object result = data.get(40);

            assertEquals((Integer)new Integer(45), data.get(20));

            assertEquals(false, test_equal(10, result));
        }
		
	private boolean test_equal(int compare, Object result) {
			
			if(! (result == null? compare == 1 : result.equals(compare)) ) {
				return false;
			}
			else {
				return true;
			}
		}

}