// Test case 1: Test when the list is empty
@Test
void testIndexOfEmptyList() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note = new AbstractNote();
    int index = model.indexOf(note);
    assertEquals(-1, index);
}

// Test case 2: Test when the list contains only one element and it matches the search element
@Test
void testIndexOfOneElementListMatch() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note = new AbstractNote();
    model.add(note);
    int index = model.indexOf(note);
    assertEquals(0, index);
}

// Test case 3: Test when the list contains only one element and it does not match the search element
@Test
void testIndexOfOneElementListNoMatch() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    model.add(note1);
    int index = model.indexOf(note2);
    assertEquals(-1, index);
}

// Test case 4: Test when the list contains multiple elements and the search element is in the middle
@Test
void testIndexOfMultipleElementsMiddle() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    AbstractNote note3 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    model.add(note3);
    int index = model.indexOf(note2);
    assertEquals(1, index);
}

// Test case 5: Test when the list contains multiple elements and the search element is at the beginning
@Test
void testIndexOfMultipleElementsBeginning() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    AbstractNote note3 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    model.add(note3);
    int index = model.indexOf(note1);
    assertEquals(0, index);
}

// Test case 6: Test when the list contains multiple elements and the search element is at the end
@Test
void testIndexOfMultipleElementsEnd() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    AbstractNote note3 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    model.add(note3);
    int index = model.indexOf(note3);
    assertEquals(2, index);
}

// Test case 7: Test when the list contains multiple elements and the search element is not in the list
@Test
void testIndexOfMultipleElementsNoMatch() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    AbstractNote note3 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    int index = model.indexOf(note3);
    assertEquals(-1, index);
}

// Test case 8: Test when the list contains multiple elements and the search element is null
@Test
void testIndexOfMultipleElementsNull() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = null;
    AbstractNote note3 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    model.add(note3);
    int index = model.indexOf(note2);
    assertEquals(1, index);
}

// Test case 9: Test when the list contains multiple elements and the search element is the same object but not equal
@Test
void testIndexOfMultipleElementsSameObject() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = note1;
    AbstractNote note3 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    model.add(note3);
    int index = model.indexOf(note2);
    assertEquals(0, index);
}

// Test case 10: Test when the list contains multiple elements and the search element is equal but not the same object
@Test
void testIndexOfMultipleElementsEqual() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    note2.setTitle(note1.getTitle());
    note2.setContent(note1.getContent());
    AbstractNote note3 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    model.add(note3);
    int index = model.indexOf(note2);
    assertEquals(1, index);
}
}