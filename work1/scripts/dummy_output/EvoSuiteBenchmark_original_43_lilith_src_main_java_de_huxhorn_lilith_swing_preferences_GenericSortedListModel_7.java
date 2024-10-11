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
		
    public GenericSortedListModelTest(Class<?> klass) {

    }

    @SuppressWarnings("nls")
	@Test
    public void testGetElementAt() {
        final GenericSortedListModel<String> model = new GenericSortedListModel<>();
        final String[] values = new String[2];
        values[0] = "Value 1";
        values[1] = "Value 2";
        final Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };
        model.add(values);
        final List<String> list = Collections.unmodifiableList(model.getData());
        assertArrayEquals(model.getData(), values);
        assertEquals(1, list.size());
        assertEquals(values[0], list.get(0));
		for (int i = 0; i < list.size(); i++) {
            assertTrue(comparator.compare(list.get(i), values[i]) < 0);
        }
    }
}