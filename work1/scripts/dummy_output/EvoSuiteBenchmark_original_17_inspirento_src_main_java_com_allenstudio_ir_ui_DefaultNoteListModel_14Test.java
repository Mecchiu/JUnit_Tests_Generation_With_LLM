package com.allenstudio.ir.ui;
java
class DefaultNoteListModel_14Test {

    @Test
    void testRemoveElementAt_IndexWithinBounds() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);
        model.addElement(note2);

        AbstractNote removedNote = model.removeElementAt(1);

        assertEquals(note2, removedNote);
        assertEquals(1, model.size());
        assertFalse(model.contains(note2));
    }

    @Test
    void testRemoveElementAt_IndexOutOfBounds() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        model.addElement(note1);

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            model.removeElementAt(1);
        });
    }

    @Test
    void testRemoveElementAt_EmptyList() {
        DefaultNoteListModel model = new DefaultNoteListModel();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            model.removeElementAt(0);
        });
    }

    @Test
    void testRemoveElementAt_NegativeIndex() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        model.addElement(note1);

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            model.removeElementAt(-1);
        });
    }

    @Test
    void testRemoveElementAt_IndexZero() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        model.addElement(note1);

        AbstractNote removedNote = model.removeElementAt(0);

        assertEquals(note1, removedNote);
        assertEquals(0, model.size());
        assertFalse(model.contains(note1));
    }

    @Test
    void testRemoveElementAt_LastIndex() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);
        model.addElement(note2);

        AbstractNote removedNote = model.removeElementAt(1);

        assertEquals(note2, removedNote);
        assertEquals(1, model.size());
        assertFalse(model.contains(note2));
    }

    @Test
    void testRemoveElementAt_MultipleRemovals() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        AbstractNote note3 = new AbstractNote();
        model.addElement(note1);
        model.addElement(note2);
        model.addElement(note3);

        AbstractNote removedNote1 = model.removeElementAt(1);
        AbstractNote removedNote2 = model.removeElementAt(0);

        assertEquals(note2, removedNote1);
        assertEquals(note1, removedNote2);
        assertEquals(1, model.size());
        assertFalse(model.contains(note1));
        assertFalse(model.contains(note2));
    }

    @Test
    void testRemoveElementAt_SingleElementList() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        model.addElement(note1);

        AbstractNote removedNote = model.removeElementAt(0);

        assertEquals(note1, removedNote);
        assertEquals(0, model.size());
        assertFalse(model.contains(note1));
    }

    @Test
    void testRemoveElementAt_MultipleElementList() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        AbstractNote note3 = new AbstractNote();
        model.addElement(note1);
        model.addElement(note2);
        model.addElement(note3);

        AbstractNote removedNote = model.removeElementAt(1);

        assertEquals(note2, removedNote);
        assertEquals(2, model.size());
        assertFalse(model.contains(note2));
    }
}
