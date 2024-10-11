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
     * The default constructor for the {@link DefaultNoteListModel}.
     */
    public DefaultNoteListModel_1Test() {
    }

    // Test of {@link DefaultNoteListModel#size()} method, of class DefaultNoteListModel.
    @Test
    void test_default_size() {
    	
        DefaultNoteListModel instance = new DefaultNoteListModel();
        Collection<AbstractNote> value = instance.values();
        assertEquals(2,value.size());
    }

    // Test of {@link DefaultNoteListModel#size()} method, of class DefaultNoteListModel.

    @Test
    void test_iterator() {
        Collection<AbstractNote> value = new HashSet<>();
        DefaultNoteListModel.add(value, new DefaultNote());
        DefaultNoteListModel.add(value, new DefaultNote());
        DefaultNoteListModel.add(value, new DefaultNote());
        Collection<AbstractNote> values = new HashSet<AbstractNote>(value);
        DefaultNoteListModel instance = new DefaultNoteListModel();
        Collection<AbstractNote> values2 = instance.values();
        assertEquals(3,values2.size());
        value.removeAll(values2);
        Collection<AbstractNote> values2b = instance.values();
        assertSame(values2b, values);
    }
    

    // Test of {@link DefaultNoteListModel#setValue(AbstractNote)} and {@link DefaultNoteListModel#setValue(int)}.
//    @Test
//    void test_setValue() {
//        DefaultNoteListModel instance = new DefaultNoteListModel();
//        assertNull(instance.getValue(1));
//        AbstractNote element = new DefaultNote(1);
//        instance.setValue(1, element);
//        assertSame(element, instance.getValue(1));
//
//        Object old = instance.getValue(1);
//        System.out.println("OLD: " + old);
//        System.out.println("NEW: " + element);
//        instance.setValue(1, element);
//        assertSame(element, instance.getValue(1));
//
//        instance.setValue(0, null);
//        assertSame(null, instance.getValue(0));
//
//        instance.setValue(1, element);
//        assertSame(element, instance.getValue(1));
//
//        instance.setValue(0, null);
//        assertSame(null, instance.getValue(0));
//        assertSame(element, instance.getValue(1));
//    }
//
//    @Test
//    void test_setValue_int() {
//        DefaultNoteListModel instance = new DefaultNoteListModel();
//        Object value = new Integer(1);
//        instance.setValue(0, value);
//        assertSame(value, instance.getValue(0));
//
//        value = new Integer(2);
//        instance.setValue(0, value);
//        assertSame(value, instance.getValue(0));
//        assertSame(value, instance.getValue(1));
//    }

    // Test of {@link DefaultNoteListModel#iterator()} and {@link DefaultNoteListModel#listenerIterator()}.
//    @Test
//    void test_iterator() {
//        DefaultNoteListModel instance = new DefaultNoteListModel();
//        Collection<AbstractNote> values = new HashSet<AbstractNote>(instance.values());
//        Iterator<AbstractNote> iterator = instance.iterator();
//        AbstractNote element = null;
//        // Next element value.
//        while (iterator.hasNext()) {
//            element = iterator.next();
//        }
//        assertTrue(iterator.hasNext());
//        assertSame(element, instance.getValue(0));
//        assertTrue(iterator.hasNext());
//        assertSame(element, instance.getValue(1));
//        assertTrue(iterator.hasNext());
//        assertSame(element, instance.getValue(2));
//        assertFalse(iterator.hasNext());
//
//        assertEquals(2, instance.listenerIterator().next().size());
//        assertEquals(2, instance.listenerIterator().next().size());
//        assertEquals(2, instance.listenerIterator().next().size());
//
//        try {
//            assertSame(2, instance.listenerIterator().next().size());
//        } catch (NoSuchElementException nsee) {
//            assertEquals(nsee, new NoSuchElementException("should not be thrown at index 2"));
//        }
//
//    }

    // Test of {@link DefaultNoteListModel#listenerIterator()} and {@link DefaultNoteListModel#listenerListIterator()}.
    // There is no tests for the {@link DefaultNoteListModel#listenerIterator()} nor {@link DefaultNoteListModel#listenerListIterator()} here except that
    // there are some variations in the ordering of the collection.  One of the differences is that the listenerListIterator() method can be called only once, by the last listener added at the end.
//    @Test
//    void test_listenerIterator() {
//        DefaultNoteListModel instance = new DefaultNoteListModel();
//        if ( instance.size() == 0 ) {
//            System.out.println("TEST: empty list");
//        // the previous one was not removed.
//        }
//        HashSet<AbstractNote> values = new HashSet<AbstractNote>();
//        values.add(new DefaultNote(1));
//        HashSet<AbstractNote> allValues = new HashSet<AbstractNote>(values);
//        values.clear();
//        values.add(new DefaultNote(1));
//        values.add(new DefaultNote(2));
//        values.add(new DefaultNote(2));
//        instance.setValue(0, null);
//        instance.getValue(0);
//        if ( instance.size()!= 0 ) {
//            System.out.println("TEST: values = " + values); 
//        }
//
//        values.add(new DefaultNote(3));
//        // the previous one was not removed.
//        instance.getValue(0);
//        instance.setValue(1, null);
//        instance.setValue(2, values);
//        instance.getValue(2);
//        if ( instance.size() == 3 ) {
//            System.out.println("TEST: values = " + values); 
//        }
//        
//        System.out.println("The current list is " + values);
//        instance.listenerIterator();
//        if ( instance.getCount()!= 3 ) {
//            fail("There are not three elements in the list. Count=" + instance.getCount());
//        }
//        instance.listerIterator();
//        values.clear();
//        instance.listenerIterator();
//        instance.iterator();
//        if ( instance.size()!= 0 ) {
//            System.out.println("TEST: values = " + values); 
//        }
//
//        if ( allValues!= values ) {
//
}