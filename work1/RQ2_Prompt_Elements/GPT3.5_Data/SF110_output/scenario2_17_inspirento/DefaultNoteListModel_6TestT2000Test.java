@Test
void testLastIndexOfWithExistingElement() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    int index = model.lastIndexOf(note1);
    assertEquals(0, index);
}

@Test
void testLastIndexOfWithNonExistingElement() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    model.add(note1);
    int index = model.lastIndexOf(note2);
    assertEquals(-1, index);
}

@Test
void testLastIndexOfWithNullElement() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    model.add(note1);
    int index = model.lastIndexOf(null);
    assertEquals(-1, index);
}

@Test
void testLastIndexOfWithEmptyList() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    int index = model.lastIndexOf(note1);
    assertEquals(-1, index);
}

@Test
void testLastIndexOfWithMultipleOccurrences() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    model.add(note1);
    model.add(note1);
    int index = model.lastIndexOf(note1);
    assertEquals(1, index);
}

@Test
void testLastIndexOfWithDifferentTypes() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    String str = "test";
    model.add(note1);
    model.add(str);
    int index = model.lastIndexOf(str);
    assertEquals(1, index);
}

@Test
void testLastIndexOfWithSameObject() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    model.add(note1);
    int index = model.lastIndexOf(note1);
    assertEquals(0, index);
}

@Test
void testLastIndexOfWithNullList() {
    DefaultNoteListModel model = null;
    AbstractNote note1 = new AbstractNote();
    int index = -1;
    try {
        index = model.lastIndexOf(note1);
    } catch (NullPointerException e) {
        assertNull(model);
    }
    assertEquals(-1, index);
}

@Test
void testLastIndexOfWithNullElementAndNullList() {
    DefaultNoteListModel model = null;
    int index = -1;
    try {
        index = model.lastIndexOf(null);
    } catch (NullPointerException e) {
        assertNull(model);
    }
    assertEquals(-1, index);
}

@Test
void testLastIndexOfWithSameObjectMultipleTimes() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    model.add(note1);
    model.add(note1);
    model.add(note1);
    int index = model.lastIndexOf(note1);
    assertEquals(2, index);
}

@Test
void testLastIndexOfWithDifferentObjects() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    int index = model.lastIndexOf(note2);
    assertEquals(1, index);
}
}