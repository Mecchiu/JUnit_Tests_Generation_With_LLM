package com.allenstudio.ir.ui;
java
class DefaultNoteListModel_12Test {

    @Test
    void testToArray_emptyList() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote[] expected = new AbstractNote[0];
        assertArrayEquals(expected, model.toArray());
    }

    @Test
    void testToArray_singleElement() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote();
        model.addElement(note);
        AbstractNote[] expected = {note};
        assertArrayEquals(expected, model.toArray());
    }

    @Test
    void testToArray_multipleElements() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);
        model.addElement(note2);
        AbstractNote[] expected = {note1, note2};
        assertArrayEquals(expected, model.toArray());
    }

    @Test
    void testToArray_nullElement() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note = null;
        model.addElement(note);
        AbstractNote[] expected = {null};
        assertArrayEquals(expected, model.toArray());
    }

    @Test
    void testToArray_mixedElements() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = null;
        model.addElement(note1);
        model.addElement(note2);
        AbstractNote[] expected = {note1, null};
        assertArrayEquals(expected, model.toArray());
    }

    @Test
    void testToArray_largeList() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote[] expected = new AbstractNote[1000];
        for (int i = 0; i < 1000; i++) {
            AbstractNote note = new AbstractNote();
            model.addElement(note);
            expected[i] = note;
        }
        assertArrayEquals(expected, model.toArray());
    }

    @Test
    void testToArray_sameElementRepeated() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote();
        for (int i = 0; i < 10; i++) {
            model.addElement(note);
        }
        AbstractNote[] expected = new AbstractNote[10];
        Arrays.fill(expected, note);
        assertArrayEquals(expected, model.toArray());
    }

    @Test
    void testToArray_removeElement() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);
        model.addElement(note2);
        model.removeElement(note1);
        AbstractNote[] expected = {note2};
        assertArrayEquals(expected, model.toArray());
    }

    @Test
    void testToArray_insertElement() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);
        model.insertElementAt(note2, 0);
        AbstractNote[] expected = {note2, note1};
        assertArrayEquals(expected, model.toArray());
    }

    @Test
    void testToArray_setElement() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);
        model.setElementAt(note2, 0);
        AbstractNote[] expected = {note2};
        assertArrayEquals(expected, model.toArray());
    }
}
