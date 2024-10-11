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
	* @throws Exception 
	* It is not possible to run the test.
	*/
	@Test
    public void testGenericSortedListModel() throws Exception {
        // we use a dummy model for testing purpose
        List<Integer> dummy = new ArrayList<>();

        // create new instance of GenericSortedListModel
        GenericSortedListModel<Integer> model = new GenericSortedListModel<>();

        // add all elements to the internal ListModel
        model.add(1);
        model.add(2);
        model.add(3);
        model.add(4);

        // test getElementAt()
        assertEquals(dummy.get(0), model.getElementAt(0));
        assertEquals(dummy.get(1), model.getElementAt(1));
        assertEquals(dummy.get(2), model.getElementAt(2));
        assertEquals(dummy.get(3), model.getElementAt(3));
        assertEquals(dummy.get(4), model.getElementAt(4));

        //test remove()
        model.remove(4);
        assertEquals(Collections.singletonList(4), model.getData());

        //test remove last
        model.remove(1);
        assertEquals(Collections.singletonList(3), model.getData());
    }
}