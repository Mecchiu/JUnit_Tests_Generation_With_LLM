// Test case 1: Test when the list is empty
@Test
void testLastIndexOfEmptyList() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    int index = model.lastIndexOf(new AbstractNote() {}, 0);
    assertEquals(-1, index);
}

// Test case 2: Test when the element is not in the list
@Test
void testLastIndexOfElementNotInList() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote() {};
    AbstractNote note2 = new AbstractNote() {};
    model.add(note1);
    int index = model.lastIndexOf(note2, 0);
    assertEquals(-1, index);
}

// Test case 3: Test when the element is at the beginning of the list
@Test
void testLastIndexOfElementAtBeginning() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote() {};
    AbstractNote note2 = new AbstractNote() {};
    model.add(note1);
    model.add(note2);
    int index = model.lastIndexOf(note1, 1);
    assertEquals(0, index);
}

// Test case 4: Test when the element is at the end of the list
@Test
void testLastIndexOfElementAtEnd() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote() {};
    AbstractNote note2 = new AbstractNote() {};
    model.add(note1);
    model.add(note2);
    int index = model.lastIndexOf(note2, 2);
    assertEquals(1, index);
}

// Test case 5: Test when the element is in the middle of the list
@Test
void testLastIndexOfElementInMiddle() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote() {};
    AbstractNote note2 = new AbstractNote() {};
    AbstractNote note3 = new AbstractNote() {};
    model.add(note1);
    model.add(note2);
    model.add(note3);
    int index = model.lastIndexOf(note2, 2);
    assertEquals(1, index);
}

// Test case 6: Test when the element is repeated in the list
@Test
void testLastIndexOfElementRepeated() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote() {};
    AbstractNote note2 = new AbstractNote() {};
    model.add(note1);
    model.add(note2);
    model.add(note1);
    int index = model.lastIndexOf(note1, 2);
    assertEquals(0, index);
}

// Test case 7: Test when the index is out of bounds
@Test
void testLastIndexOfIndexOutOfBounds() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote() {};
    model.add(note1);
    assertThrows(IndexOutOfBoundsException.class, () -> {
        model.lastIndexOf(note1, 2);
    });
}

// Test case 8: Test when the index is negative
@Test
void testLastIndexOfNegativeIndex() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote() {};
    model.add(note1);
    int index = model.lastIndexOf(note1, -1);
    assertEquals(0, index);
}

// Test case 9: Test when the list contains null elements
@Test
void testLastIndexOfNullElements() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote() {};
    model.add(null);
    model.add(note1);
    int index = model.lastIndexOf(null, 2);
    assertEquals(0, index);
}

// Test case 10: Test when the list contains only null elements
@Test
void testLastIndexOfOnlyNullElements() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    model.add(null);
    model.add(null);
    int index = model.lastIndexOf(null, 2);
    assertEquals(1, index);
}