// DefaultNoteListModel_2Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#elements()} method.
*/
class DefaultNoteListModel_2Test {
		/**
		* Default implementation of <code>NoteListModel</code>'s elements(@throws ArrayConversionEx)
		* for method <code>getComponent(int)</code>.
		*/
    @Test
    public void testGetComponent_1() {
        AbstractNote first = new AbstractNote("Foo", new Vector<String>(), 0);
        AbstractNote second =
            new AbstractNote("Bar", new Vector<String>(), 0);

        AbstractNoteListModel listModel = new DefaultNoteListModel();
        listModel.addElement(first);
        listModel.addElement(second);

		// assert the contents of the two components is sorted by
        // component
        Enumeration<AbstractNote> elements = listModel.elements();
        Vector<AbstractNote> found = new Vector<AbstractNote>();
        AbstractNote found1 = elements.nextElement();
        AbstractNote found2 = elements.nextElement();

        Vector<AbstractNote> component1 = found1.getComponent(1);
        Vector<AbstractNote> component2 = found2.getComponent(1);
        assertTrue(1 == component1.size());
        assertTrue(2 == component2.size());
        assertTrue(found1.equalComponent(component1));
        assertTrue(found2.equalComponent(component2));

        // assert the contents of the two components are equal
        assertTrue(found1.compareTo(found2) == 0);
        assertFalse(found1.compareTo(found) == 0);
    }

    /**
	 * Default implementation of <code>NoteListModel</code>'s elements(@throws ArrayConversionEx)
	 * for method <code>addElement(Note)</code>.
	 */
    @Test
    public void testAddElement_1() {
        AbstractNote first = new AbstractNote("Foo", new Vector<String>(), 0);
        AbstractNote second =
            new AbstractNote("Bar", new Vector<String>(), 0);

        AbstractNoteListModel listModel = new DefaultNoteListModel();
        listModel.addElement(first);
        listModel.addElement(second);

        // assert the contents of the two components is sorted by
        // component
        Enumeration<AbstractNote> elements = listModel.elements();
        Vector<AbstractNote> found = new Vector<AbstractNote>();
        AbstractNote found1 = elements.nextElement();
        AbstractNote found2 = elements.nextElement();

        // assert the contents of the two components are equal
        assertTrue(1 == found1.getComponent(1).getText().length());
        assertTrue(2 == found2.getComponent(1).getText().length());
        assertTrue(found1.equalComponent(found2));
        assertTrue(found2.equalComponent(found1));

        // assert the contents of the two components are equal
        assertTrue(found1.compareTo(found2) == 0);


    }

    /**
	 * Default implementation of <code>NoteListModel</code>'s elements(@throws ArrayConversionEx)
	 * for method <code>removeElement(Note)</code>.
	 */
    @Test
    public void testRemoveElement_1() {
        AbstractNote first = new AbstractNote("Foo", new Vector<String>(), 0);
        AbstractNote second =
            new AbstractNote("Bar", new Vector<String>(), 0);

        AbstractNoteListModel listModel = new DefaultNoteListModel();
        listModel.addElement(first);
        listModel.addElement(second);

        // assert the contents of the two components is sorted by
        // component
        Enumeration<AbstractNote> elements = listModel.elements();
        Vector<AbstractNote> found = new Vector<AbstractNote>();
        AbstractNote found1 = elements.nextElement();
        AbstractNote found2 = elements.nextElement();

        // assert the contents of the two components are equal
        assertTrue(1 == found1.getComponent(1).getText().length());
        assertTrue(2 == found2.getComponent(1).getText().length());
        assertTrue(found1.equalComponent(found2));

        assertFalse(found1 == found);

        // assert the contents of the two components are equal
        assertTrue(found1.compareTo(found2) == 0);

        // assert no elements remain in list
        assertFalse(elements.hasMoreElements());

        // iterate again
        elements = listModel.elements();

        found = new Vector<AbstractNote>();
        AbstractNote found3 = elements.nextElement();
        AbstractNote found4 = elements.nextElement();

        found = new Vector<AbstractNote>();

        List<AbstractNote> found6 = new LinkedList<AbstractNote>();
        found6.add(first);
        found6.add(second);

        AbstractNoteListModel found7 = new DefaultNoteListModel();
        found7.addElement(found6);
        AbstractNoteListModel found8 = new DefaultNoteListModel();
        found8.addElement(found6);

        assertTrue(found3 == found8.removeElement(found3));
        assertTrue(found4 == found8.removeElement(found4));
        assertTrue(found7 == found8.removeElement(found7));

    }
}