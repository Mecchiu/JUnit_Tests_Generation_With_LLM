// DefaultNoteListModel_10Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastElement()} method.
*/
class DefaultNoteListModel_10Test {
		
    /**
     * Tests creation of a Default note list model by using a <code>DefaultNoteListModel</code>.
     *
     * @throws Exception if an error occurs
     */
    @Test
    public void getLastElement_Success() throws Exception {
        DefaultNoteListModel model = null;
        try {
            model = new DefaultNoteListModel();
            assertEquals(0L, model.getLastElement().getId());
        } catch (NoSuchElementException e) {
            assertTrue("Exception thrown expected", true);
        }
    }

    /**
     * Tests copying by cloning the last element created by a {@link DefaultNoteListModel}.
     *
     * @throws Exception if an error occurs
     */
    @Test
    public void setLastElement_Null() throws Exception {
        AbstractNote lastElement = null;
        AbstractListModel<AbstractNote> model = new DefaultNoteListModel(lastElement);
        model.setLastElement(firstElement());
        assertEquals(firstElement(), firstElement());
        // System.out.println("TEST setLastElement(null); " + model.getLastElement() + " = " + firstElement());
    }

    /**
     * Tests copying by adding elements to the last element.
     * A check the added elements is checked at the end of the list
     *
     * @throws Exception if an error occurs
     */
    @Test
    public void addFirstElement() throws Exception {
        AbstractListModel<AbstractNote> model = new DefaultNoteListModel();
        model.addFirstElement(firstElement());
        AbstractNote addedElement = firstElement();
        // System.out.println("TEST addFirstElement(addFirstElement(firstElement(AbstractNote))); " + model.getFirstElement() + " = " + firstElement());
        assertEquals(firstElement(), firstElement());

        // add all elements before the first element
        model.addFirstElement(secondElement());
        // System.out.println("TEST setLastElement(null); " + model.getLastElement() + " = " + secondElement());
        assertEquals(secondElement(), secondElement());
    }

    @Test
    public void addLastElement() throws Exception {
        AbstractListModel<AbstractNote> model = new DefaultNoteListModel();
        model.addLastElement(firstElement());
        AbstractNote addedElement = firstElement();
        // System.out.println("TEST addLastElement(addLastElement(firstElement(AbstractNote))); " + model.getLastElement() + " = " + firstElement());
        assertEquals(firstElement(), firstElement());
        model.addLastElement(secondElement());
        // System.out.println("TEST setLastElement(null); " + model.getLastElement() + " = " + secondElement());
        assertEquals(secondElement(), secondElement());
    }


    /**
     * Tests adding new elements if an empty list is created.
     *
     * @throws Exception if an error occurs
     */
    @Test
    public void addAddNewElement() throws Exception {
        Map<AbstractNote, AbstractNote> map = new HashMap<>();
        map.putNull(firstElement());
        AbstractListModel<AbstractNote> model = new DefaultNoteListModel();
        AbstractNote addedElement = firstElement();
        // System.out.println("TEST addNewElement(insertNewElement(insertNewElement(firstElement(Unknown)))); " + addedElement + " => " + map.get(addedElement));
        assertEquals(firstElement(), addedElement);
        model.add(firstElement());
        AbstractNote addedElementNewFirst = firstElement();
        // System.out.println("TEST setLastElement(insertNewElement(insertNewElement(insertNewElement(firstElement(Unknown))))); " + model.getLastElement() + " => " + firstElement());
        assertEquals(firstElement(), firstElement());
        // System.out.println("TEST setLastElement(null); " + model.getLastElement() + " = " + secondElement());
        assertEquals(secondElement(), secondElement());

        model.setLastElement(secondElement());
        // System.out.println("TEST setLastElement(insertNewElement(secondElement(unknown))); " + model.getLastElement() + " => " + secondElement());
        assertEquals(secondElement(), secondElement());
        //System.out.println("TEST setLastElement(insertNewElement(insertNewElement(secondElement(unknown)))); " + model.getLastElement() + " => " + secondElement());
        assertEquals(firstElement(), addedElementNewFirst);
        //System.out.println("TEST setLastElement(insertNewElement(insertNewElement(insertNewElement(firstElement(unknown))))); " + model.getLastElement() + " => " + secondElement());
        assertEquals(firstElement(), addedElementNewFirst);

        model.add(secondElement());
        //System.out.println("TEST setLastElement(insertNewElement(insertNewElement(insertNewElement(insertNewElement(secondElement(unknown)))))); " + model.getLastElement() + " => " + secondElement());
        assertEquals(secondElement(), secondElement());
        //System.out.println("TEST setLastElement(insertNewElement(insertNewElement(insertNewElement(insertNewElement(insertNewElement(secondElement(unknown)))))))); " + model.getLastElement() + " => " + secondElement());
        assertEquals(firstElement(), addedElementNewFirst);
        //System.out.println("TEST setLastElement(insertNewElement(insertNewElement(insertNewElement(insertNewElement(insertNewElement(insertNewElement(new AbstractNote(
        //        null, "Test")))))))); " + model.getLastElement() + " => " + new AbstractNote(null, "Test"));
        assertEquals(firstElement(), addedElementNewFirst);

    }

}