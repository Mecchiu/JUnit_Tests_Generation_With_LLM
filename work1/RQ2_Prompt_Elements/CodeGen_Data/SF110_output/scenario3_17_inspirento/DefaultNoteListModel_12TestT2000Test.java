// DefaultNoteListModel_12Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#toArray()} method.
*/
class DefaultNoteListModel_12Test {

    @Test
    public void testToArray() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.add(new Long(1));
        assertNotNull(model.toArray());
        Set<Long> set1 = new HashSet<Long>();
        set1.add(new Long(1));
        set1.add(new Long(2));
        Collection<Long> set2 = new HashSet<Long>();
        set2.add(new Long(3));
        set2.add(new Long(4));
        Set<Long> set3 = new HashSet<Long>();
        set3.add(new Long(5));
        set3.add(new Long(6));
        defaultSet(set1);
        defaultSet(set2);
        assertEquals(model.toArray(), set1.toArray());
        assertEquals(model.toArray(), set2.toArray());
        assertEquals(0, set3.size());
    }
    
    @Test
    public void testEquals() throws InterruptedException {
    	DefaultNoteListModel note = new DefaultNoteListModel();
    	DefaultNoteListModel note2 = new DefaultNoteListModel();
    	DefaultNoteListModel note4 = new DefaultNoteListModel();
    	DefaultNoteListModel note5 = new DefaultNoteListModel();
    	defaultSet(new Set<Long>());
    	defaultSet(new Set<Long>());
    	Set<Long> set = new HashSet<Long>();
    	defaultSet(set);
    	defaultSet(set);
    	note.add(new Long(1));
    	assertTrue(note.equals(note));
    	assertTrue(note2.equals(note));
    	assertFalse(note.equals(null));
    	if (note instanceof DefaultNoteListModel) {
    		assertTrue(note instanceof DefaultNoteListModel);
    	}
    	if (note2 instanceof DefaultNoteListModel) {
    		assertTrue(note2.equals(note));
    	}
    	note.add(new Long(2));
    	assertFalse(note.equals(note));
    	note2.add(new Long(1));
    	assertTrue(note.equals(note2));
    	if (note instanceof DefaultNoteListModel) {
    		assertTrue(note instanceof DefaultNoteListModel);
    	}
        note3.add(new Long(3));
        defaultSet(new Set<Long>());
        defaultSet(new Set<Long>());
        assertFalse(note3.equals(note2));
        note2.add(new Long(1));
        assertTrue(note3.equals(note2));
        if (note instanceof DefaultNoteListModel) {
        	assertFalse(note instanceof DefaultNoteListModel);
        }
    }
	
    private static void defaultSet(Set<Long> set) {
    	DefaultNoteListModel model = new DefaultNoteListModel();
    	defaultSet(model);
    	defaultSet(set).add(1);
    	defaultSet(set).add(2);
    }

    @Test
    public void testIterator() {
    	Set<AbstractNote> set1 = new HashSet<AbstractNote>();
    	set1.add(new Long(1));
    	set1.add(new Long(2));
    	defaultSet(set1);
    	final Iterator<AbstractNote> ith1 = set1.iterator();
    	defaultSet(set1);
    	assertTrue(ith1.hasNext());
    	assertTrue(ith1.next() == set1.iterator().next());
    	assertFalse(ith1.hasNext());
    	set1.clear();
    	defaultSet(set1);
    	assertNull(ith1.next());
    	assertNull(ith1.next());
    	
    	// add one more element
    	set1.add(new Long(3));
    	defaultSet(set1);
    	assertTrue(ith1.hasNext());
    	assertFalse(ith1.hasNext());
    	defaultSet(set1).add(new Long(4));
    	defaultSet(set1);
    	defaultSet(set1);
    	assertTrue(ith1.hasNext());
    	assertFalse(ith1.hasNext());
    }
}
