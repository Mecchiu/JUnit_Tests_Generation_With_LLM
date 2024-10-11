package com.allenstudio.ir.ui;
java
class DefaultNoteListModel_4Test {

    @Test
    void testIndexOf_EmptyList() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote();
        int index = model.indexOf(note);
        assertEquals(-1, index);
    }

    @Test
    void testIndexOf_NoteInList() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);
        model.addElement(note2);
        int index = model.indexOf(note2);
        assertEquals(1, index);
    }

    @Test
    void testIndexOf_NoteNotInList() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);
        int index = model.indexOf(note2);
        assertEquals(-1, index);
    }

    @Test
    void testIndexOf_NullNote() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note = null;
        model.addElement(new AbstractNote());
        int index = model.indexOf(note);
        assertEquals(-1, index);
    }

    @Test
    void testIndexOf_FirstOccurrence() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote();
        model.addElement(note);
        model.addElement(note);
        int index = model.indexOf(note);
        assertEquals(0, index);
    }

    @Test
    void testIndexOf_StartIndex() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote();
        model.addElement(new AbstractNote());
        model.addElement(note);
        int index = model.indexOf(note, 1);
        assertEquals(1, index);
    }

    @Test
    void testIndexOf_StartIndex_NotFound() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote();
        model.addElement(new AbstractNote());
        int index = model.indexOf(note, 1);
        assertEquals(-1, index);
    }

    @Test
    void testIndexOf_LastOccurrence() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote();
        model.addElement(note);
        model.addElement(note);
        int index = model.lastIndexOf(note);
        assertEquals(1, index);
    }

    @Test
    void testIndexOf_LastOccurrence_Index() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote();
        model.addElement(note);
        model.addElement(new AbstractNote());
        int index = model.lastIndexOf(note, 0);
        assertEquals(0, index);
    }

    @Test
    void testIndexOf_LastOccurrence_Index_NotFound() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote();
        model.addElement(new AbstractNote());
        int index = model.lastIndexOf(note, 0);
        assertEquals(-1, index);
    }
}
