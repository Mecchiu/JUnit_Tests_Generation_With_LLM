package com.allenstudio.ir.ui;
java
class DefaultNoteListModel_1Test {

    @Test
    void testSizeEmptyList() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        assertEquals(0, model.size());
    }

    @Test
    void testSizeNonEmptyList() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.addElement(new AbstractNote());
        assertEquals(1, model.size());
    }

    @Test
    void testSizeMultipleElements() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.addElement(new AbstractNote());
        model.addElement(new AbstractNote());
        model.addElement(new AbstractNote());
        assertEquals(3, model.size());
    }

    @Test
    void testSizeAfterRemove() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote();
        model.addElement(note);
        model.addElement(new AbstractNote());
        model.removeElement(note);
        assertEquals(1, model.size());
    }

    @Test
    void testSizeAfterInsert() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.addElement(new AbstractNote());
        model.insertElementAt(new AbstractNote(), 0);
        assertEquals(2, model.size());
    }

    @Test
    void testSizeAfterSet() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.addElement(new AbstractNote());
        model.setElementAt(new AbstractNote(), 0);
        assertEquals(1, model.size());
    }

    @Test
    void testSizeAfterAdd() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.add(0, new AbstractNote());
        assertEquals(1, model.size());
    }

    @Test
    void testSizeAfterRemoveAt() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.addElement(new AbstractNote());
        model.removeElementAt(0);
        assertEquals(0, model.size());
    }

    @Test
    void testSizeAfterClear() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.addElement(new AbstractNote());
        model.addElement(new AbstractNote());
        model.addElement(new AbstractNote());
        model.removeAllElements();
        assertEquals(0, model.size());
    }
}
