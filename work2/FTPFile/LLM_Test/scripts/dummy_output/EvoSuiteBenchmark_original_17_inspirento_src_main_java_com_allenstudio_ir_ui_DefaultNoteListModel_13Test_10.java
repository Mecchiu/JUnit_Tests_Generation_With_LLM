
package com.allenstudio.ir.ui;
import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class DefaultNoteListModel_13Test {
    @Test
    public void testInvoke_ThrowsArrayIndexOutOfBoundsException() {
        AbstractNote note = new DefaultNote(0, 1002);
        try {
            boolean thrown = false;
            AbstractNote temp = DefaultNoteListModel_13Test.this.get(0);
            this.assertNotNull(temp);
            thrown = false;
            NoteListDataListener noteDataListener = new NoteListDataListenerImpl();
            temp.addNoteDataListener(noteDataListener);
            try {
                thrown = true;
                temp.get(1);
            }
            catch (IndexOutOfBoundsException e) {
                assertTrue(e.getMessage(), thrown);
            }
            thrown = true;
            temp.get(1);
            boolean set = false;
            set = temp.setNote(500);
            assertTrue(set);
            temp.get(1);
        }
        catch (InvalidParameterException | IllegalArgumentException | IndexOutOfBoundsException ex) {
            Fail the test
        }
    }
    private static class  AbstractNote implements  AbstractNoteDataListener {
  private static final long serialVersionUID = Long.parseLong("6782455286977109024");
        private LinkedList notes = new LinkedList();
        public void addNoteDataListener(NoteListDataListener listener) {
            notes.addLast(listener);
        }
        public void setNote(int size, String note) {
            assertNotNull(size);
            Note newNote = new DefaultNote(0, size);
            newNote.setNote(note);
            newNote.addNoteDataListener(this);
            newNote.setNote(500);
            notes.setHead(newNote);
        }
        public AbstractNote getNote() {
            return notes.getHead();
        }
        @Override
        public boolean  equals(AbstractNoteData other, AbstractNoteData data) {
            assertNotNull(other);
            assertNotNull(data);
            return false;
        }
    }
}