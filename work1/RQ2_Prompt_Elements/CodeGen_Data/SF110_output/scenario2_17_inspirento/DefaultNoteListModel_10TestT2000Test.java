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

	private DefaultNoteListModel delegate;

    /**
     * @see DefaultNoteListModel#DEFAULT_NOTE_LIST_MODEL
     * @throws NoSuchElementException If this vector has no components.
     * @throws IllegalAccessException If this vector is protected.
     */
    public DefaultNoteListModel_10Test() throws NoSuchElementException, IllegalAccessException {
        delegate = new DefaultNoteListModel();
        delegate.getDelegate().add(new DefaultNote("DefaultNote"));        
    }

    /**
     * This test sets up two instances of the delegate and a listener,
     * which runs during the initialization of this class.
     * The listener is also run on a test start.
     * Each time it runs, the vector is cleared, then when this class is
     * started, at least one of the listeners is notified.
     */
    @Test
    public void setup_test() throws Exception {
        AbstractNote[] notesArr = {new DefaultNote("DefaultNote0"), new DefaultNote("DefaultNote1"), new DefaultNote("DefaultNote2")};
        new DefaultNoteListModel_10Test_updateListeners(notesArr).initialize(delegate);
        
        // Run and wait for all events on the listeners...
	    Thread.sleep(2000);
	    assertTrue("Listener did not receive Notifcation", delegate.notifyListeners(new DefaultNoteListDataEvent(new DefaultNoteListDataListener() {
                public void notify(NoteListDataEvent event) throws Exception {
                    assertTrue(event.getId() == 1);
                    assertEquals(delegate.size(), 1);
                }
           	})));
        assertTrue("Listener did not receive Notifcation", delegate.notifyListeners(new NoteListDataEvent(new NoteListDataListener() {
                public void notify(NoteListDataEvent event) throws Exception {
                    assertEquals(2, event.getId());
                    assertEquals("DefaultNote0", event.getNotes().elementAt(0));
                    assertEquals("DefaultNote1", event.getNotes().elementAt(1));
                }
           	})));
    }

    /**
     * Update a list of the vector.
     * The event contains a list of <code>AbstractNote</code> objects.
     *
     * @param notesArr The array of objects which should be added to the vector.
     * @throws Exception If an error occurs or while the list is synchronized.
     * @see DefaultNoteListModel#DEFAULT_NOTE_LIST_MODEL
     */
    private void updateListeners(AbstractNote[] notesArr) throws Exception {
        synchronized(delegate) {
            delegate.setDelegate(new DefaultNoteListModel_10Test_updateListeners(notesArr));
        }
    }

    /**
    * The updateListeners (listeners) method is never used directly.
    * Instead call getDelegate method on this class.
    * The listeners object is a List
    *
    * @param notesArr The array of objects whose list of notes shall be populated in the vector.
     * @throws Exception The listener method takes no parameters and simply throws a
     * 		Notifcation for each object contained therein in the list.
     * @see #DEFAULT_NOTE_LIST_MODEL
    */    
    private abstract class DefaultNoteListModel_10Test_updateListeners extends DefaultNoteListModel {
        /**
         * Gets the listeners object.
         *
         * @return The listeners object.
         * @see DefaultNoteListModel#DEFAULT_NOTE_LIST_MODEL
         */
        protected abstract List<AbstractNote> getDelegate() throws Exception;
        
        /**
         * Called by the listeners.
         *
         * @param event The event which carries some or all information
         *	    about the notification.
         * @see com.allenstudio.ir.core.plugins.AbstractNote.event for an explanation.
         * @see #getDelegate
         * @see DefaultNoteListModel#updateListeners
         * @see AbstractNote#getUserData
         */
        public void notify(NoteListDataEvent event) throws Exception {
            getDelegate().clear();
            super.notify(event);
        }
    }
}
