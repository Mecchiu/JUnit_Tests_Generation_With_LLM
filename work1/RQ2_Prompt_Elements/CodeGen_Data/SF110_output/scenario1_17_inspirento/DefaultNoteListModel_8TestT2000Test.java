// DefaultNoteListModel_8Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#elementAt(int)} method.
*/
class DefaultNoteListModel_8Test {

    private final AbstractNoteListModel<Object> delegate = new DefaultNoteListModel();
    private HashMap<Object, List<AbstractNote>> elementAt = new HashMap<Object, List<AbstractNote>>();
    private HashMap<Object, AbstractNote> element = new HashMap<Object, AbstractNote>();
    
    
    @Test
    void singleElement() {
        assertEquals(new LinkedList<Object>(), elementAt.keySet());
    }
    
    @Test
    void singleItem() {
        AbstractNote note = element.get(new Object());
        assertEquals(note, elementAt.get(new Object()));
    }
    
    @Test
    void multipleObjects() {
        List<Object> notes = new LinkedList<Object>();
        notes.addAll(2, Arrays.asList(new Object[]{new Object(), new Object()}));
        assertTrue(delegate.put(new Object(), notes));
        assertEquals(2, elementAt.size());
        assertTrue(elementAt.get(new Object()).equals(notes.get(0)));
        assertTrue(elementAt.get(new Object()).equals(notes.get(1)));
    }
    
    @Test
    void multipleItems() {
        List<AbstractNote> notes = new ArrayList<AbstractNote>();
        notes.addAll(new Object[]{new Object(), new Object()} );
        assertEquals(1, elementAt.size());
        assertEquals(new AbstractNote(1), elementAt.get(new Object()));
        
        assertFalse(delegate.put(new Object(), notes));
        assertEquals(1, elementAt.size());
        assertEquals(new AbstractNote(2), elementAt.get(new Object()));
        
        assertFalse(delegate.put(new Object(), Arrays.asList(new Object[]{new Object()})));
        assertEquals(1, elementAt.size());
        assertEquals(new AbstractNote(Arrays.asList(2).size()), elementAt.get(new Object()));
        
    }
    
    @Test
    void removeAll() {
        List<Object> notes = new LinkedList<Object>();
        notes.addAll(new Object[]{new Object(), new Object()});
        assertEquals(2, elementAt.size());
        assertTrue(elementAt.remove(new Object()));
        assertTrue(delegate.put(new Object(), notes));
        assertEquals(1, elementAt.size());
    }
    
    @Test
    void removeOne() {
        List<Object> notes = new LinkedList<Object>();
        notes.addAll(new Object[]{new Object(), new Object()});
        assertEquals(2, elementAt.size());
        assertTrue(elementAt.remove(new Object()));
        assertEquals(1, elementAt.size());
        assertFalse(elementAt.remove(new Object()));
        assertEquals(1, elementAt.size());
    }
    
    @Test
    void setElementAt() {
        assertEquals(new LinkedList<Object>(), elementAt.keySet());
        Map<Object, AbstractNote> newMap = new HashMap<Object, AbstractNote>();
        for (AbstractNote n: elementAt.values()) {
            newMap.put(n.getIdentifier(), n);
        }
        assertEquals(newMap, elementAt);
    }
}