package com.allenstudio.ir.ui;
java
public class DefaultNoteListModel_11Test {

    @Test
    void testRemoveElement_Success() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);
        model.addElement(note2);

        assertTrue(model.removeElement(note1));
        assertEquals(1, model.size());
    }

    @Test
    void testRemoveElement_NotFound() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);

        assertFalse(model.removeElement(note2));
        assertEquals(1, model.size());
    }

    @Test
    void testRemoveElement_FireItemRemoved() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        model.addElement(note1);

        NoteListDataListenerMock listener = new NoteListDataListenerMock();
        model.addNoteListDataListener(listener);

        model.removeElement(note1);

        assertTrue(listener.itemRemovedCalled);
        assertEquals(0, listener.removedIndex);
    }

    static class NoteListDataListenerMock implements NoteListDataListener {
        boolean itemRemovedCalled = false;
        int removedIndex = -1;

        @Override
        public void contentChanged(NoteListDataEvent event) {
        }

        @Override
        public void itemAdded(NoteListDataEvent event) {
        }

        @Override
        public void itemRemoved(NoteListDataEvent event) {
            itemRemovedCalled = true;
            removedIndex = event.getIndex();
        }
    }
}
