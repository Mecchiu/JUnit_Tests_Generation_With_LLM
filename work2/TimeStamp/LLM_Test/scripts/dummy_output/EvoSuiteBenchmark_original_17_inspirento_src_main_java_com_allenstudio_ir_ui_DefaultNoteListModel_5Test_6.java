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
	public void indexOf_1() {
	DefaultNoteListModel model = new DefaultNoteListModel();

        model.addDataListener(new NoteListDataListener() {
            
            @Override
            public void dataChanged(NoteListDataEvent e) {
                assertEquals(e.getElement(), 0);
            }
        });

        List<AbstractNote> els = Arrays.asList(new AbstractNote("text"));
        model.addData("text", els);
        assertEquals(6, model.size());
        assertEquals(null, model.getData("empty"));

        Map<Integer, AbstractNote> m = new HashMap<>(els.size());

        List<AbstractNote> found = new LinkedList<>(model.getData("text",m));
        model.indexOf(model.getData("text",m),  1);
        assertEquals(els, found);

		try {
			model.indexOf(6, 1);// invalid index
			fail();
		} catch (Exception e) {
			assertTrue(true);
		}

		try {
			model.indexOf(null, 1);
			fail();
		} catch (Exception e) {
			assertTrue(true);
		}

	}

	@Test
	public void indexOf_2() {
		final DefaultNoteListModel m = new DefaultNoteListModel();
		final List<AbstractNote> expected = new ArrayList<>(2);
		expected.add(createNote(3, "1k"));
		expected.add(createNote(4, "1k"));


		m.addDataListener(new NoteListDataListener() {
            
            @Override
            public void dataChanged(NoteListDataEvent e) {
                boolean added = false;
                if (e.getNewSize() == 1) {
                    added = expected.equals(new ArrayList<>(Arrays.asList(e.getNotes())));
                    if (added) {
                        assertEquals(expected.size(), e.getNewCount());
                    } else {
                        assertEquals(expected.size(), 0);
                    }
                    added = expected.equals(m.getData("text", m.getData("empty", new HashMap<Integer, AbstractNote>()))) &&
                        expected.size() == m.size();
                    if (added) {
                        assertEquals(expected.size(), e.getNewCount());
                    } else {
                        assertEquals(expected.size(), 0);
                    }
                }
                if (!added) {
                    fail();
                }
            }
        });


        assertEquals(expected.size(), m.getSize());
        assertEquals(expected, m.getData("text", m.getData("empty", new HashMap<Integer, AbstractNote>())));
	}

    public AbstractNote createNote(int index, String text) {
        return new AbstractNote(text,index) {
            @Override
            public AbstractNote clone() {
                return super.clone();
            }
        };
    }
}