@Test
void testElementAtWithValidIndex() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    assertEquals(note1, model.elementAt(0));
    assertEquals(note2, model.elementAt(1));
}

@Test
void testElementAtWithNegativeIndex() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
        model.elementAt(-1);
    });
}

@Test
void testElementAtWithIndexEqualToSize() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    model.add(note1);
    assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
        model.elementAt(1);
    });
}

@Test
void testElementAtWithIndexGreaterThanSize() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    model.add(note1);
    assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
        model.elementAt(2);
    });
}

@Test
void testElementAtWithEmptyModel() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
        model.elementAt(0);
    });
}

@Test
void testElementAtWithNullModel() {
    DefaultNoteListModel model = null;
    assertThrows(NullPointerException.class, () -> {
        model.elementAt(0);
    });
}

@Test
void testElementAtWithNullNote() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    model.add(null);
    assertNull(model.elementAt(0));
}

@Test
void testElementAtWithMultipleNullNotes() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    model.add(null);
    model.add(null);
    assertNull(model.elementAt(0));
    assertNull(model.elementAt(1));
}

@Test
void testElementAtWithMixedNotes() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    model.add(note1);
    model.add(null);
    model.add(note2);
    assertEquals(note1, model.elementAt(0));
    assertNull(model.elementAt(1));
    assertEquals(note2, model.elementAt(2));
}
}