// DefaultNoteListModel_5Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#indexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_5Test {
		
	@Test
    public void indexOf_Null_returns_-1() {
        DefaultNoteListModel<AbstractNote> listModel = new DefaultNoteListModel<>();
        AbstractNote nullElem = null;
        final int index = -1;
        assertEquals(-1, listModel.indexOf(nullElem, index));
    }
	
	@Test
    public void indexOf_0_returns_0() {
        DefaultNoteListModel<AbstractNote> listModel = new DefaultNoteListModel<>();
        AbstractNote elem = new AbstractNote();
        final int index = 0;
        assertEquals(0, listModel.indexOf(elem, index));
    }
	
	@Test
    public void indexOf_2_returns_2() {
        DefaultNoteListModel<AbstractNote> listModel = new DefaultNoteListModel<>();
        AbstractNote elem1 = new AbstractNote();
        AbstractNote elem2 = new AbstractNote();
        final int index = 2;
        assertEquals(2, listModel.indexOf(elem1, index));
        assertEquals(2, listModel.indexOf(elem2, index));
    }
	
	@Test
    public void indexOf_3_returns_3() {
        DefaultNoteListModel<AbstractNote> listModel = new DefaultNoteListModel<>();
        AbstractNote elem1 = new AbstractNote();
        AbstractNote elem2 = new AbstractNote();
        final int index = 3;
        assertEquals(3, listModel.indexOf(elem1, index));
        assertEquals(3, listModel.indexOf(elem2, index));
    }
	
	@Test
    public void indexOf_4_returns_9() {
        DefaultNoteListModel<AbstractNote> listModel = new DefaultNoteListModel<>();
        AbstractNote elem1 = new AbstractNote();
        AbstractNote elem2 = new AbstractNote();
        final int index = 4;
        assertEquals(9, listModel.indexOf(elem1, index));
        assertEquals(9, listModel.indexOf(elem2, index));
    }
	
	@Test
    public void indexOf_5_returns_11() {
        DefaultNoteListModel<AbstractNote> listModel = new DefaultNoteListModel<>();
        AbstractNote elem1 = new AbstractNote();
        AbstractNote elem2 = new AbstractNote();
        final int index = 5;
        assertEquals(11, listModel.indexOf(elem1, index));
        assertEquals(11, listModel.indexOf(elem2, index));
    }
	
	@Test
    public void indexOf_6_returns_12() {
        DefaultNoteListModel<AbstractNote> listModel = new DefaultNoteListModel<>();
        AbstractNote elem1 = new AbstractNote();
        AbstractNote elem2 = new AbstractNote();
        final int index = 6;
        listModel.addListDataListener(new ListDataListener() {
            private int _index = -1;

            public void elementsReplaced(ListDataEvent event) {
                _index = (event.getIndex1() == index)? event.getIndex2() : event.getIndex2();
            }
            public void elementsAdded(ListDataEvent event) {
                assertEquals(-1, _index);
                _index = event.getIndex2();
            }
            public void elementsRemoved(ListDataEvent event) {
                assertEquals(-1, _index);
                _index = null;
            }
        });
        assertEquals(12, listModel.indexOf(elem1, index));
        assertEquals(12, listModel.indexOf(elem2, index));
    }
	
	@Test
    public void addAll_Null_returns_true() {
        DefaultNoteListModel<AbstractNote> listModel = new DefaultNoteListModel<>();
        final boolean addsAll = listModel.addAll(null);
        assertTrue(addsAll);
    }
	
	@Test
    public void addAll_0_returns_false() {
        DefaultNoteListModel<AbstractNote> listModel = new DefaultNoteListModel<>();
        final boolean addsAll = listModel.addAll(new AbstractNote[]{new AbstractNote(), new AbstractNote()});
        assertFalse(addsAll);
    }
	
	@Test
    public void addAll_2_returns_true() {
        DefaultNoteListModel<AbstractNote> listModel = new DefaultNoteListModel<>();
        final boolean addsAll = listModel.addAll(new AbstractNote[]{new AbstractNote(), new AbstractNote(), new AbstractNote()});
        assertTrue(addsAll);
    }
	
	@Test
    public void addAll_3_returns_true() {
        DefaultNoteListModel<AbstractNote> listModel = new DefaultNoteListModel<>();
        final boolean addsAll = listModel.addAll(new AbstractNote[]{new AbstractNote(), new AbstractNote(), new AbstractNote()});
        assertTrue(addsAll);
    }
	
	@Test
    public void addAll_4_returns_true() {
        DefaultNoteListModel<AbstractNote> listModel = new DefaultNoteListModel<>();
        final boolean addsAll = listModel.addAll(new AbstractNote[]{new AbstractNote(), new AbstractNote(), new AbstractNote()});
        assertTrue(addsAll);
    }
	
	@Test
    public void addAll_5_returns_true() {
        DefaultNoteListModel<AbstractNote> listModel = new DefaultNoteListModel<>();
        final boolean addsAll = listModel.addAll(new AbstractNote[]{new AbstractNote(), new AbstractNote(), new AbstractNote(), new AbstractNote()});
        assertTrue(addsAll);
    }
	
	@Test
    public void addAll_6_returns_true() {
        DefaultNoteListModel<AbstractNote> listModel = new DefaultNoteListModel<>();
        final boolean addsAll = listModel.addAll(new AbstractNote[]{new AbstractNote(), new AbstractNote(), new AbstractNote(), new AbstractNote()});
        assertTrue(addsAll);
    }
	
	@Test
    public void removeLast_0_returns_true() {
        DefaultNoteListModel<AbstractNote> listModel = new DefaultNoteListModel<>();
        final boolean removesLast = listModel.removeLast();
        assertTrue(removesLast);
    }
	
}