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
     * Test if generic method getElementAt returns the correct value.
     */
    @Test
    public void getElementAt() {
		
		GenericSortedListModel<String> model = new GenericSortedListModel<>();
		
		model.add(Collections.singletonList("Element1"));
		
		assertNotNull(model.getElementAt(1));
		assertSame(model.getElementAt(1), model.getElementAt(0));
		
		model.add(new String[] {"Element2", null, null});
		model.add(Collections.singletonList("Element3"));
		
		assertNotNull(model.getElementAt(0));
		assertSame(model.getElementAt(0), model.getElementAt(2));
		
		assertNull(model.getElementAt(2));
		assertSame(model.getElementAt(3), model.getElementAt(1));
		
		assertTrue("getElementAt(4) => element: " + model.getElementAt(4) + ", should be: element: " + model.getElementAt(5), model.getElementAt(5) == model.getElementAt(4));
		assertFalse("getElementAt(5) => element: " + model.getElementAt(5) + ", should be: element: " + model.getElementAt(4), (model.getElementAt(5) == model.getElementAt(4)));
	}
	
	/**
     * Test if getElementAt returns a correct value from a list with the given index.
     */
    @Test
    public void getElementAt(int index) {
		
		List<T> elements = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			elements.add(index + i, i + "element:" + i);
			elements.add(index + i, element1);
		}		
		
		GenericSortedListModel<String> model = new GenericSortedListModel<>(elements);
		
		assertNotNull(model.getElementAt(index));
		int i = index;
		for (int c = 0; c < elements.size(); c++) {
			assertFalse("getElementAt(n) => element: " + model.getElementAt(i) + ", should be: element: " + elements.get(c), (model.getElementAt(i) == elements.get(c)));
			i++;
		}		

    	assertTrue("getElementAt(n) => element: " + model.getElementAt(index) + ", should be: element: " + elements.get(index));
    	i--;
    	for (int c = 0; c < elements.size(); c++) {
    		assertTrue("getElementAt(n) => element: " + model.getElementAt(i) + ", should be: element: " + elements.get(index + c));
			i--;
    	}	
    }
}