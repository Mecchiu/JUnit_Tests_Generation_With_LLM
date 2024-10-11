// DefaultNoteListModel_1Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#size()} method.
*/
class DefaultNoteListModel_1Test {
		
	/**
	 * Tests the {@link DefaultNoteListModel#size()} method.
	 */
	@Test
    void testSize() {
        assertNotNull(new DefaultNoteListModel(""));

		AbstractNote note;
        n = 7;
		note = new AbstractNote(n);
        note.data = "Test";
        n = 8;
		note = new AbstractNote(n);
        note.data = "Test";

        System.out.println("Size of DefaultNoteListModel is: " + nameListModel.size());

        assertEquals("The DefaultNoteListModel returns the wrong value.", n, nameListModel.size());

        // Test getData
        Collection names = nameListModel.getElements();
        assertNotNull(names);
        assertEquals(n, names.size());

        // Test removeData
        assertTrue("removed element is null.", nameListModel.remove(null));
        assertTrue("removed element was not null.", nameListModel.remove(7));

        Collection noteDataList = note.getDataList();		
        n = note.size();

        nameListModel = new DefaultListModel(noteDataList);

        assertEquals("Added element is not found.", noteDataList, nameListModel.getElements());

        // Test the size of the list
        String[] a = nameListModel.toArray(new String[0]);
        assertArrayEquals(new String[0], a);

        nameListModel = new DefaultListModel(new HashSet());

        Collection names2 = nameListModel.getElements();
        assertTrue("The DefaultListModel contains zero elements.", names.size() > 0);

        // Test the contents of the model
        Iterator iter = nameListModel.iterator();
        String[] b = new String[15];
        while (iter.hasNext()) {
            b[iter.nextIndex()] = (String) iter.next();
        }
        assertTrue("The DefaultListModel contains empty entry.", Arrays.equals(b, new String[14]));

        noteDataList = new Iterator((ArrayList) nameIterator);
        assertTrue("NameIterator returned invalid value.", nameIterator.hasNext());		
        n = noteDataList.nextIndex();
        assertArrayEquals(new String[6], ((Iterator) nameIterator).next());
        
        Collection names3 = nameListModel.getElements();
        n = nameListModel.size();

        n = ((AbstractNote)(note)).size();
        for (Iterator iter = ((AbstractNote)(note)).iterator();
         iter.hasNext();) {
            b = new String[7];
            noteDataList = (ArrayList) iter.next();
            Object temp1 = ((Iterator) nameIterator).next();
            Object temp2 = ((Iterator) nameIterator).next();
            b[0] = new String(temp1.toString());
            b[1] = new String(temp2.toString());
            assertTrue(new Iterator(testIterator(names3, "b[0]", b)));
        }

        // Test add element at position
        assertFalse("Added element at position is null.", nameListModel.addElement(null));
        assertFalse("Added element at position was not null.", nameListModel.addElement("Test"));

        // Test remove element
        assertFalse("Removed element was null.", nameListModel.removeElement(null));
        assertNull("Removed element is null.", nameListModel.removeElement(7));

        // Test remove entry
        assertFalse("Remove element was null.", nameListModel.removeElement(null));
        assertNull("Remove entry is null.", nameListModel.removeEntry(null));

        assertFalse("Remove at position is false.", nameListModel.remove(null));
        assertNull("Remove at position is null.", nameListModel.remove((long) 0));

        testMapElementId();
        testTableData();
        testEquals();
        testHashCode();

        testComparison();
    }

    /**
     * @return test mapEntry elementId
     */
    private void testMapElementId() {
        String[] a = nameListModel.toArray(new String[0]);
        try {
            Iterator iter = nameListModel.iterator();
            long id = next((long) 0);
            do {
                assertTrue("Element 1 is removed.", iter.next());
                iter.next();
                if (id!= next((long) 0)) {
                    fail("Element ID does not match.");
                }
            } while (iteratorNext((Iterator) (nameIterator)));
            a = nameListModel.toArray(new String[0]);
        }
        catch (Throwable t) {
            fail("To remove all element is not correct.");
        }
    }

    /**
     * @return test entry elementId
     */
    private void testEntryElementId() {
        String[] a = nameListModel.toArray(new String[0]);
        long id = next(0);
        Iterator iter = nameListModel.iterator();
        assertTrue("The test element ID does not match.", iter.next() == null? true : false);
        assertTrue("The remaining entry element ID does not match.", iter.next() == null? true : false);
        while (iter.hasNext()) {
            id = next((long) 0);
            if (iter.next() == null || iter.next() == null) {
                break;
            }
            assertEquals("Id does not match. ", id, next((long) 0)); 
        }
        a = nameListModel.toArray(new String[0]);
    }

    /**
     * @return test iterator
     */
    private void testIterator() {
        String[] a = nameListModel.toArray(new String[0]);
        Iterator iter = nameListModel.iterator();
        a = nameListModel.toArray(new String[0]);
        assertTrue("The test iterator has reached an element.", iter.hasNext());

        assertArrayEquals("The test iterator did not return all elements.", a, iter.nextArray());
        assertTrue("The test iterator did not return all elements.", iter.hasNext());
    }

    /**
     * @return test iterator
     */
    private void testIterator(Collection names, String key, Collection elements) {
        nameListModel = new DefaultListModel(names);
        Iterator iter = nameListModel.iterator();
        String tempName = null;
        while (iter.hasNext()) {
            String test = (String) iter.next();
            tempName = Key.join(Key.join(key), test);
            if (elements.contains(test)) {
                assertTrue("The test was not added to the iterator.", iter.hasNext());
            }
        }

        assertTrue("The test iterator did not remove elements.", iter.hasNext());
        Collection newElements = ((AbstractNote) (iter.next())).getDataList();
        assertTrue("The test iterator had some elements.", newElements.size() > 0);
        a = nameListModel.toArray(new String[0]);
        assertTrue("The test iterator had other elements.", iter.hasNext());
    }

    /**
     * Test next.
     * @param t
     * @return
     */
}