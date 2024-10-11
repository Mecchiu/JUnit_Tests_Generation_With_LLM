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
     * Test constructor
     */
    @Test
    public void testConstructor() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        Integer[] expected = new Integer[] { 0, 1, 2, 3, 4 };
        assertSame("size", Integer.class, model.size());
        assertEquals("size", expected.length, model.size());
        assertEquals("0", expected[0], model.get(0));
        assertEquals("1", expected[1], model.get(1));
        assertEquals("2", expected[2], model.get(2));
        assertEquals("3", expected[3], model.get(3));
        assertEquals("4", expected[4], model.get(4));
	
	for (int i = 0; i < getArraySize(); ++i) {
	    if (expected[i]!= get(i)) {
	        fail("get(i) not as expected");
	    }
	}
	
	Set<Object> keys = new HashSet<>(model.keySet());
	Iterator<Object> it = keys.iterator();
	Object key;
	while (it.hasNext()) {
	    set(it.next(), key);
	}
	assertEquals(model.keySet().size(), keys.size() + model.size());
        for (int i = 0; i < keys.size(); ++i) {
            Object key2 = keys.iterator().next();
            assertNotNull("Null key " + i, key2);
            assertEquals("value at index " + i, model.get(i), get(key2));
        }
	for (int i = 0; i < keys.size(); ++i) {
	    Object key2 = keys.iterator().next();
	    assertNotNull("Null key " + i, key2);
            try {
                get(key);
                throw new AssertionError("Set should contain no entries");
            } catch (NullPointerException e) {}
        }
    }
    
    /**
     * Unit test for {@link DefaultNoteListModel#get(Object)} and
     * {@link DefaultNoteListModel#put(Object, Object)}
     */
    @Test
    public void testGetput() {
        final int firstId = 0;
        final int secondId = 1;
        final DefaultNote dummyNote = new DefaultNote("Test");
        
        Model model = new DefaultNoteListModel();
        AbstractNoteListDataAdapter adapter =
            new GenericListDataAdapter(dummyNote);
        model.put(firstId, dummyNote);
        model.put(secondId, dummyNote);
        model.addDataListener(adapter);
        
        adapter.reload();
        assertNotNull("Null value", model.get(firstId));
        AbstractNote dummy = adapter.get();
        assertNotNull("Null value", model.get(firstId));
        assertNotNull("Null value", dummy.get());
        adapter.put(dummy);
        adapter.reload();
        
        // try to access entry that is already set
        try {
            model.put(firstId, dummyNote);
            adapter.reload();
        } catch (Exception e) {
            fail();
        }

        assertFalse(dummyNote.equals(dummy));
        assertTrue(dummyNote.equals(dummy));

        adapter.remove(dummy);
	try {
	    model.put(firstId, dummyNote);
	    adapter.reload();
	    fail("Should have thrown an exception");
	} catch (Exception e) {
	    // ok
	}
        
    }
    
    /**
     * Test the case where all entry are loaded, nothing happen.
     */
    @Test
    public void testLoadedAll() {
        final String data = "My Data";
        DefaultNoteListModel listModel = new DefaultNoteListModel();
        listModel.put("someKey", data);
        
        assertTrue(listModel.get("someKey") == data, "Incorrect value");

        DefaultNoteListDataListener listener = 
            new DefaultNoteListDataAdapter(listModel);
        listModel.addDataListener(listener);
        
        listModel.get("someKey");
        listModel.put(listModel.get("someKey"));

        // make sure model is still in loaded state
        listModel.get("someKey");
        listModel.put(listModel.get("someKey"));

        listener.reload();
        
        assertNotNull(listModel.get("someKey"));
        assertTrue(listModel.get("someKey") == data);
    }

}