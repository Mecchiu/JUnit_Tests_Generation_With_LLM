@Test
void testGetWithValidIndex() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    assertEquals(note1, model.get(0));
    assertEquals(note2, model.get(1));
}

@Test
void testGetWithInvalidIndex() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    assertThrows(ArrayIndexOutOfBoundsException.class, () -> model.get(-1));
    assertThrows(ArrayIndexOutOfBoundsException.class, () -> model.get(0));
    assertThrows(ArrayIndexOutOfBoundsException.class, () -> model.get(1));
}

@Test
void testGetWithEmptyModel() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    assertThrows(ArrayIndexOutOfBoundsException.class, () -> model.get(0));
}

@Test
void testGetWithNullElement() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    model.add(null);
    assertNull(model.get(0));
}

@Test
void testGetWithMultipleNullElements() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    model.add(null);
    model.add(null);
    assertNull(model.get(0));
    assertNull(model.get(1));
}

@Test
void testGetWithMixedElements() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    model.add(note1);
    model.add(null);
    AbstractNote note2 = new AbstractNote();
    model.add(note2);
    assertNull(model.get(1));
    assertEquals(note1, model.get(0));
    assertEquals(note2, model.get(2));
}

@Test
void testGetWithDuplicateElements() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    model.add(note1);
    model.add(note1);
    assertEquals(note1, model.get(0));
    assertEquals(note1, model.get(1));
}

@Test
void testGetWithLargeModel() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    for (int i = 0; i < 100000; i++) {
        AbstractNote note = new AbstractNote();
        model.add(note);
    }
    assertNotNull(model.get(99999));
}

@Test
void testGetWithConcurrentModification() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    Iterator<AbstractNote> iterator = model.iterator();
    iterator.next();
    model.add(new AbstractNote());
    assertThrows(ConcurrentModificationException.class, () -> iterator.next());
}

@Test
void testGetWithUnsupportedOperation() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    model.add(note1);
    Iterator<AbstractNote> iterator = model.iterator();
    iterator.next();
    iterator.remove();
    assertThrows(UnsupportedOperationException.class, () -> model.get(0));
}
}