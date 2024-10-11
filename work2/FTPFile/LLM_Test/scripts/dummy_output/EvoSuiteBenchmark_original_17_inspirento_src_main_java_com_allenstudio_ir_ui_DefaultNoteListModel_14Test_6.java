// DefaultNoteListModel_14Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#remove(int)} method.
*/
class DefaultNoteListModel_14Test {
		
	class Note {
		
		private final Map<AbstractNote, String> hash = new HashMap<>();
		
		public Note(AbstractNote note) {
			this.hash.put(note, "");
		}
		
		public String getNoteTitle() {
			return hash.get(this).split(" ")[1];
		}
		
		public void remove(AbstractNote note) {
			assertTrue(hash.remove(note) == null);
			//assertFalse("Not found: " + hash, note.equals(hash.tailMap("").headMap("").lastKey()));
		}
		
	}

	/**
	* Test method for
	* {@link DefaultNoteListModel#remove(java.lang.Object)}
	*/
	@Test
	public void testRemove() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        final int count = 100;
        final int size = count;
        List<Note> notes = new ArrayList<>(count);

        for (int i=0;i<count;i++) {
            AbstractNote n = new Note(i % 2 == 1? new Note(i*2) : new Note(i*3));
            notes.add(n);
            model.add(n);
        }

        final NoteListDataListener listener = new NoteListDataListener() {
                @Override
                public void dataChanged(NoteListDataEvent event) {
                    int size = event.getOldSize();
                    size = Math.min(size+1, size+notes.size());
                    if (size > 0) {
                        System.out.println(event.getChangeType());
                    }
                    checkListData(event.getOld(), event.getNew(), size);
                    count = size;

                    if (event.getChangeType() == NoteListDataEvent.DUPLICATE_ELEMENT) {
                    	assertEquals("Incorrect size", size, event.getBefore().size()+event.getAfter().size());
                    }
                }
            };

        AbstractNote head = new Note(0);
        model.add(head);
        model.remove(head);
        assertEquals("Non zero size, not the one we inserted", size-1, model.size());

        AbstractNote tail = new Note(Integer.MAX_VALUE);
        model.add(tail);
        model.remove(tail);
        assertEquals("Non zero size, not the one we added", size-1, model.size());

        model.remove(head);
        assertEquals("Only one element left, we must be equal", 1, model.size());

        for (int i=0;i<count;i++) {
            model.remove(notes.get(i));
            //model.remove(head.getNoteTitle());
        }

        final NoteListDataEvent firstEvent = new NoteListDataEvent(ListModel.ANY, null, ListModel.ANY, 100, 0);
        model.add(firstEvent);

        assertTrue("Only two elements left", Math.abs(model.size() - size) <= 1);
        assertFalse("There are no remaining items", model.size() > size);
        assertFalse("There are no remaining items when we need more", model.size() < size);
        assertFalse("Should not exist",  new HashSet<>(model.getKeys()).contains(Integer.MAX_VALUE));

        for (Note n : notes) {
            eventually(listener,n);
        }

        assertEquals("There should still be one element left", 1, model.size());
        assertEquals("The head should not be modified", -1, model.indexOf(Head.getKey()));
        assertEquals("The tail should not be modified", -size+1, model.indexOf(Tail.getKey()));
	}

	private void eventually(NoteListDataListener listener, Note n) {
		if (n.getNoteTitle().length()!= 0) {
            model.notifyResult(new NoteListDataEvent(n.getChangeType(), head.getNoteTitle()));
            notify(listener);
		}
	}

	private void notify(NoteListDataListener listener) {
		model.notifyResult(new NoteListDataEvent(head.getChangeType(), tail.getNoteTitle()));
		listener.dataChanged(new NoteListDataEvent(head.getChangeType(), tail.getNoteTitle()));
	}

	private void checkListData(Collection<String> expected, Collection<String> actual, int size) {
		assertEquals(size, actual.size());

		for (String p : expected) {
			if (!actual.contains(p)) {
				fail("Missing: " + p);
			}
		}
	}

}