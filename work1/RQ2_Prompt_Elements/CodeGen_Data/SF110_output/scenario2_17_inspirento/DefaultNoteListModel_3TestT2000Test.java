// DefaultNoteListModel_3Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#contains(AbstractNote)} method.
*/
class DefaultNoteListModel_3Test {

    @Test
	public void testContains_0(){
        final DefaultNoteListModel model = new DefaultNoteListModel();

        assertFalse(model.contains(new AbstractNote(0, null)));
    }

    @Test
	public void testContains_1(){
        final DefaultNoteListModel model = new DefaultNoteListModel();
        
        model.addEventListener(new NoteListDataListener() {
            @Override
            public void onDataEvent(NoteListDataEvent event){
                assertNotNull(event.getObject());
                assertTrue(event.getObject() instanceof AbstractNote);
                //assertEquals(event, event.getOldDataEvent());
                assertEquals(event, event.getDataEvent());
                assertFooEquals(event.getDataEvent().getFoo(), 1);
            }
        });
        assertTrue(model.contains(new AbstractNote(1, 1)));
    }

    @Test
	public void testContains_2(){
        final DefaultNoteListModel model = new DefaultNoteListModel();
        
        model.addEventListener(new NoteListDataListener() {
            @Override
            public void onDataEvent(NoteListDataEvent event){
                assertNotNull(event.getObject());
                assertTrue(event.getObject() instanceof AbstractNote);
                //assertEquals(event, event.getOldDataEvent());
                assertEquals(event, event.getDataEvent());
                assertBarEquals(event.getDataEvent().getBar(), 1);
            }
        });
        assertFalse(model.contains(new AbstractNote(1, 1)));
    }
    
    @Test
	public void testContains_3(){
        final DefaultNoteListModel model = new DefaultNoteListModel();
        
        model.addEventListener(new NoteListDataListener() {
            @Override
            public void onDataEvent(NoteListDataEvent event){
                assertNotNull(event.getObject());
                assertTrue(event.getObject() instanceof AbstractNote);
                //assertEquals(event, event.getOldDataEvent());
                assertEquals(event, event.getDataEvent());
                assertBarEquals(event.getDataEvent().getBar(), 1);
            }
        });
        assertTrue(model.contains(new AbstractNote(1, 1)));
        assertTrue(model.contains(new AbstractNote(2, 2)));
    }

    @Test
	public void testAdd_1(){
        final DefaultNoteListModel model = new DefaultNoteListModel();
        
        model.addEventListener(new NoteListDataListener() {
            @Override
            public void onDataEvent(NoteListDataEvent event){
                assertNotNull(event.getObject());
                assertTrue(event.getObject() instanceof AbstractNote);
                //assertEquals(event, event.getOldDataEvent());
                assertEquals(event, event.getDataEvent());
                assertBarEquals(event.getDataEvent().getBar(), 1);
            }
        });
        assertFooEquals(new AbstractNote(1, 1).getBar(), 1);
        
        assertTrue(model.contains(new AbstractNote(1, 1)));
        assertFalse(model.contains(new AbstractNote(2, 2)));
    }

    @Test
	public void testAdd_2(){
        final DefaultNoteListModel model = new DefaultNoteListModel();
        
        model.addEventListener(new NoteListDataListener() {
            @Override
            public void onDataEvent(NoteListDataEvent event){
                assertNotNull(event.getObject());
                assertTrue(event.getObject() instanceof AbstractNote);
                //assertEquals(event, event.getOldDataEvent());
                assertEquals(event, event.getDataEvent());
                assertBarEquals(event.getDataEvent().getBar(), 2);
            }
        });
        assertBarEquals(new AbstractNote(2, 2).getBar(), 1);
        assertBarEquals(new AbstractNote(1, 1).getBar(), 2);
    }

    private void assertFooEquals(AbstractNote foo, int bar){
        assertEquals(1, bar);
        assertEquals(1, foo, "Foo should have the same value as the specified value. ("+(foo)+" -> "+bar)+"");
    }

    private void assertBarEquals(int bar, int obj) {
        assertEquals(bar, obj);
    }
    
}