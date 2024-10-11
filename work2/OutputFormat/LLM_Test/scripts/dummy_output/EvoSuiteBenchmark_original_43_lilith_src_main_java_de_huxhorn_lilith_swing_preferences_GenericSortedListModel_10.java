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
		private final List<String> items = new ArrayList<>();

		{
				items.add("A");
				items.add("B");
				items.add("C");
        }

    Test_GenericSortedListModel() {
        }

    Test_GenericSortedListModel(List<String> items) {
        this.items = items;
    }

	@Test
        public void testGetElementAt() {
/*
 *        int index = 0;
 *        assertEquals("should return the first element", 
        new GenericSortedListModel().getElementAt(index), items.get(index));     
	 * 			  */
            assertArrayEquals("should get the first element at the index", 
        items.get(0), new GenericSortedListModel().getElementAt(0).toString());
        int index = 1;
        assertEquals("should return the second element", 
        new GenericSortedListModel(items.subList(index, items.size())).getElementAt(index).toString(), items.get(index).toString());
        index = 3;
        assertEquals("should return the third element", 
        new GenericSortedListModel(items.subList(index, items.size())).getElementAt(index).toString(), 
        items.get(index).toString());        
    }
}