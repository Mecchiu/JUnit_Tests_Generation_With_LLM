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
		
	private final String DATA_1 = "DATA 1";
	private final static String DATA_2 = "DATA 2";

    /**
     * This method tests the default implementation of <code>size()</code>.
     */
    @Test
    public void defaultSize()
    {
        assertEquals(2, size());
    }

    /**
     * This method tests the implementation using <code>addEventListener(Listener, Object)</code>
     *
     * @throws Exception
     */
    @Test
    public void testAddEventListener() throws Exception {
        AbstractNote foo = null;
        AbstractNote bar = null;
        AbstractNote baz = null;
        

        // This one adds a listener that adds all the existing ones
        assertNotNull(new DefaultNoteListModel().addEventListener(new NoteListDataEvent() {

            public void noteAdded(AbstractNote note) {
                foo = note;
            }

            public void noteChanged(Object source) {
                foo = null;
                bar = note;
            }
        }, AbstractNote.class, "testevent1"));        
        
        // This one adds a listener that adds the given listener
        assertNotNull(new DefaultNoteListModel().addEventListener(new NoteListDataEvent() {

            public void noteAdded(Object source) {
                foo = null;
                bar = null;
                baz = source;
            }

            public void noteChanged(Object source) {
                baz = null;
                bar = null;
            }
        }, AbstractNote.class, "testevent1"));                            

        assertNotNull(new DefaultNoteListModel().addEventListener(new NoteListDataEvent() {

            public void noteAdded(Object source) {
                foo = null;
                bar = null;
                baz = null;
            }

            public void noteChanged(Object source) {
                baz = source;
            }
        }, AbstractNote.class, "testevent1"));

        final DefaultNoteListModel model = new DefaultNoteListModel();
        final AbstractNote eventSource = new DefaultNote();
        final Object eventSourceObject1 = eventSource;
        final Object eventSourceObject2 = null;
        AbstractNote eventSource2 = null;
        AbstractNote eventSource3 = null;

        model.addEventListener(new NoteListDataListener() {

            public void noteAdded(AbstractNote note) {
                throw new UnsupportedOperationException();
            }

            public void noteChanged(Object source) {
                eventSourceObject1 = eventSource;
                eventSourceObject2 = null;
                eventSource = source;
            }

            public void noteRemoved(AbstractNote note) {
                throw new UnsupportedOperationException("remove");
            }            
        },AbstractNote.class, "testevent1"));          
        
        eventSourceObject3 = new DefaultNote();
        assertEquals(3, size());
        assertEquals(eventSourceObject1, eventSource);
    }
}