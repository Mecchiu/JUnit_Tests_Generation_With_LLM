package com.allenstudio.ir.ui;
java
class DefaultNoteListModel_5Test {

    @Test
    void testIndexOf_withExistingElement() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);
        model.addElement(note2);

        int index = model.indexOf(note2, 0);

        assertEquals(1, index);
    }

    @Test
    void testIndexOf_withNonExistingElement() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);

        int index = model.indexOf(note2, 0);

        assertEquals(-1, index);
    }

    @Test
    void testIndexOf_withExistingElementStartingFromIndex() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);
        model.addElement(note2);

        int index = model.indexOf(note1, 1);

        assertEquals(-1, index);
    }

    @Test
    void testIndexOf_withNonExistingElementStartingFromIndex() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);

        int index = model.indexOf(note2, 1);

        assertEquals(-1, index);
    }

    @Test
    void testIndexOf_withExistingElementAtLastIndex() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);
        model.addElement(note2);

        int index = model.indexOf(note2, 1);

        assertEquals(1, index);
    }

    @Test
    void testIndexOf_withNonExistingElementAtLastIndex() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);

        int index = model.indexOf(note2, 1);

        assertEquals(-1, index);
    }

    @Test
    void testIndexOf_withEmptyModel() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote();

        int index = model.indexOf(note, 0);

        assertEquals(-1, index);
    }

    @Test
    void testIndexOf_withNullElement() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note = null;

        int index = model.indexOf(note, 0);

        assertEquals(-1, index);
    }

    @Test
    void testIndexOf_withNegativeIndex() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote();

        int index = model.indexOf(note, -1);

        assertEquals(-1, index);
    }

    @Test
    void testIndexOf_withIndexGreaterThanSize() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote();

        int index = model.indexOf(note, 1);

        assertEquals(-1, index);
    }
}
