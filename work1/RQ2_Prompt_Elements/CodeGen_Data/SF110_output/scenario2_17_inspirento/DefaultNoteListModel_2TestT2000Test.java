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

    private final ListModel delegate = new DefaultListModel();
    private AbstractNoteListModel model;
    private boolean eventListenerCalled;
    private NoteListDataEvent event;
    
    /**
     * Tests {@link DefaultNoteListModel#elements()} method. 
     */
    @Test
    void testElements() {
        model =  new DefaultNoteListModel(delegate.elements());
        assertFalse(eventListenerCalled);
        event = new DefaultNoteListDataEvent(new AbstractNote(0, 1, 0), false);
        delegate.addListDataListener(event, new NoteListDataListener() {
            public void eventOccured(NoteListDataEvent event) {
                eventListenerCalled = true;
            }
		});
        assertFalse("Should not be called", eventListenerCalled);
        model.addElement(new DefaultNote(0, 1, 0));
        event = new DefaultNoteListDataEvent(new AbstractNote(0, 1, 1), false);
        delegate.addListDataListener(event, new NoteListDataListener() {
            public void eventOccured(NoteListDataEvent event) {
                eventListenerCalled = true;
            }
		});
        model.addElement(new DefaultNote(1, 1, 1));
        event = new DefaultNoteListDataEvent(new AbstractNote(0, 1, 2), false);
        delegate.addListDataListener(event, new NoteListDataListener() {
            public void eventOccured(NoteListDataEvent event) {
                eventListenerCalled = true;
            }
		});
        model.addElement(new DefaultNote(1, 2, 3));
        event = new DefaultNoteListDataEvent(new AbstractNote(0, 2, 3), false);
        delegate.addListDataListener(event, new NoteListDataListener() {
            public void eventOccured(NoteListDataEvent event) {
                eventListenerCalled = true;
            }
		});
        model.addElement(new DefaultNote(1, 3, 4));
        
    }
}
