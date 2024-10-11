package com.allenstudio.ir.ui;
java
class DefaultNoteListModel_8Test {

    @Test
    void testElementAt_withValidIndex_returnsElement() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote();
        model.addElement(note);

        AbstractNote result = model.elementAt(0);

        assertEquals(note, result);
    }

    @Test
    void testElementAt_withNegativeIndex_throwsException() {
        DefaultNoteListModel model = new DefaultNoteListModel();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            model.elementAt(-1);
        });
    }

    @Test
    void testElementAt_withIndexOutOfRange_throwsException() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote();
        model.addElement(note);

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            model.elementAt(1);
        });
    }

    @Test
    void testElementAt_withEmptyList_throwsException() {
        DefaultNoteListModel model = new DefaultNoteListModel();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            model.elementAt(0);
        });
    }

    @Test
    void testElementAt_withValidIndex_returnsDifferentElement() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);
        model.addElement(note2);

        AbstractNote result = model.elementAt(1);

        assertEquals(note2, result);
    }

    @Test
    void testElementAt_withValidIndex_returnsLastElement() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);
        model.addElement(note2);

        AbstractNote result = model.elementAt(1);

        assertEquals(note2, result);
    }

    @Test
    void testElementAt_withValidIndex_returnsFirstElement() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);
        model.addElement(note2);

        AbstractNote result = model.elementAt(0);

        assertEquals(note1, result);
    }

    @Test
    void testElementAt_withValidIndex_returnsNull() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.addElement(null);

        AbstractNote result = model.elementAt(0);

        assertNull(result);
    }

    @Test
    void testElementAt_withValidIndex_returnsDifferentNull() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.addElement(null);
        model.addElement(new AbstractNote());

        AbstractNote result = model.elementAt(0);

        assertNull(result);
    }
}
