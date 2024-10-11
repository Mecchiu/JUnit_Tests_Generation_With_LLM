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
		@Test
		public void testGetElementAt(){
		List<T> list = new ArrayList<T>(10);
		list.add(11);
		assertEquals (1, list.size());

		// get element one
		T element = list.get(0);

		// the element should equal the element
		assertEquals (11, element);
		}
}