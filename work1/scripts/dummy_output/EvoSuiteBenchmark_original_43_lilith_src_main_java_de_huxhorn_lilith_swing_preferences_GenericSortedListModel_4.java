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
		
    @junit.jupiter.Test
    public void testGetElementAt() {
        GenericSortedListModel<Integer> sm = new GenericSortedListModel<>(Integer.class);
        
        assertEquals(0, sm.getSize());
        assertEquals(0, sm.getSize());
        assertEquals(1, sm.getElementAt(0));

        assertEquals(0, sm.getSize());
        assertEquals(0, sm.getSize());

        List<Integer> data = new ArrayList<>();
        sm.addElement(Integer.MAX_VALUE);
        sm.addElement(1);
        sm.addElement(4);
        assertEquals(2, sm.getSize());
        assertEquals(2, sm.getSize());
        sm.removeElementAt(1);
        assertEquals(1, sm.getSize());
        assertEquals(0, sm.getSize());
        
        assertEquals(0, sm.getSize());
        assertEquals(0, sm.getSize());
        data.add(Integer.MIN_VALUE);
        assertEquals(2, sm.getSize());
        sm.addElement(Integer.MAX_VALUE);
        sm.addElement(Integer.MIN_VALUE);
        sm.addElement(4);
        assertEquals(5, sm.getSize());
        sm.removeElement(Integer.MAX_VALUE);
        assertEquals(4, sm.getSize());
        sm.removeElement(1);
        assertEquals(3, sm.getSize());
        assertEquals(0, sm.getSize());

        assertEquals(0, sm.getSize());
        assertEquals(0, sm.getSize());
        data.add(Integer.MIN_VALUE);
        assertEquals(4, sm.getSize());
        sm.addElement(Integer.MAX_VALUE);
        sm.addElement(Integer.MAX_VALUE);
        sm.addElement(4);
        assertEquals(6, sm.getSize());
        assertEquals(0, sm.getSize());
        sm.removeElement(Integer.MAX_VALUE);
        assertEquals(4, sm.getSize());
        assertEquals(0, sm.getSize());
        
        assertEquals(0, sm.getSize());
        sm.addElement(5);
        assertEquals(7, sm.getSize());
        assertEquals(1 + sm.getSize(), sm.size());
        sm.addElement(5);
        assertEquals(8, sm.getSize());
        assertEquals(1 + sm.getSize(), sm.size());
        sm.getElementAt(1);
        assertEquals(2 + sm.getSize(), sm.size());
        
        List<Integer> actual = Collections.sort(sm.data, sm.comparator);
        assertEquals(data, actual);
        assertEquals(data, sm.data);
        assertEquals(data, actual);
    }
}