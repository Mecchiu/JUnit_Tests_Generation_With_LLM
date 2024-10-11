// Test case for removing an element at a valid index
@Test
void testRemoveValidIndex() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    AbstractNote removedNote = model.remove(1);
    assertEquals(note2, removedNote);
    assertEquals(1, model.getSize());
}

// Test case for removing an element at an invalid index
@Test
void testRemoveInvalidIndex() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    model.add(note1);
    assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
        model.remove(1);
    });
}

// Test case for removing the only element in the list
@Test
void testRemoveOnlyElement() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    model.add(note1);
    AbstractNote removedNote = model.remove(0);
    assertEquals(note1, removedNote);
    assertEquals(0, model.getSize());
}

// Test case for removing the first element in the list
@Test
void testRemoveFirstElement() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    AbstractNote removedNote = model.remove(0);
    assertEquals(note1, removedNote);
    assertEquals(1, model.getSize());
}

// Test case for removing the last element in the list
@Test
void testRemoveLastElement() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    AbstractNote removedNote = model.remove(1);
    assertEquals(note2, removedNote);
    assertEquals(1, model.getSize());
}

// Test case for removing multiple elements from the list
@Test
void testRemoveMultipleElements() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    AbstractNote note3 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    model.add(note3);
    AbstractNote removedNote1 = model.remove(0);
    AbstractNote removedNote2 = model.remove(1);
    assertEquals(note1, removedNote1);
    assertEquals(note3, removedNote2);
    assertEquals(1, model.getSize());
}

// Test case for removing elements from an empty list
@Test
void testRemoveFromEmptyList() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
        model.remove(0);
    });
}

// Test case for removing elements from a list with null elements
@Test
void testRemoveNullElements() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    model.add(null);
    assertThrows(NullPointerException.class, () -> {
        model.remove(0);
    });
}

// Test case for removing elements from a list with duplicate elements
@Test
void testRemoveDuplicateElements() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    model.add(note1);
    model.add(note1);
    AbstractNote removedNote = model.remove(1);
    assertEquals(note1, removedNote);
    assertEquals(1, model.getSize());
}

// Test case for removing elements from a list with non-AbstractNote elements
@Test
void testRemoveNonAbstractNoteElements() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    model.add("not an AbstractNote");
    assertThrows(ClassCastException.class, () -> {
        model.remove(0);
    });
}

// Test case for removing elements from a list with a negative index
@Test
void testRemoveNegativeIndex() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    model.add(note1);
    assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
        model.remove(-1);
    });
}
}