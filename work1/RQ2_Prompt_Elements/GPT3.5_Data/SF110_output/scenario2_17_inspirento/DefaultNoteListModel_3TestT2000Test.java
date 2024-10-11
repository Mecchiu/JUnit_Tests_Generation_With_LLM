@Test
void testContainsWithNull() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    assertFalse(model.contains(null));
}

@Test
void testContainsWithEmptyList() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    assertFalse(model.contains(new AbstractNote()));
}

@Test
void testContainsWithOneElementList() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note = new AbstractNote();
    model.addElement(note);
    assertTrue(model.contains(note));
}

@Test
void testContainsWithMultipleElementList() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    AbstractNote note3 = new AbstractNote();
    model.addElement(note1);
    model.addElement(note2);
    model.addElement(note3);
    assertTrue(model.contains(note2));
}

@Test
void testContainsWithNonExistingElement() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    model.addElement(note1);
    assertFalse(model.contains(note2));
}

@Test
void testContainsWithSameObject() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note = new AbstractNote();
    model.addElement(note);
    assertTrue(model.contains(note));
}

@Test
void testContainsWithDifferentObjects() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    model.addElement(note1);
    assertFalse(model.contains(note2));
}

@Test
void testContainsWithNullList() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    model.delegate = null;
    assertFalse(model.contains(new AbstractNote()));
}

@Test
void testContainsWithNullElement() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    model.addElement(null);
    assertTrue(model.contains(null));
}

@Test
void testContainsWithNullElementAndNullList() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    model.delegate = null;
    assertTrue(model.contains(null));
}
}