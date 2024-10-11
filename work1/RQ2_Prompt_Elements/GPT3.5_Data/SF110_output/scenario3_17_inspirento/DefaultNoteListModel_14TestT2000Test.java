// Test case 1: Test removing an element from an empty list
@Test
void testRemoveFromEmptyList() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    assertThrows(ArrayIndexOutOfBoundsException.class, () -> model.remove(0));
}

// Test case 2: Test removing an element at index 0 from a list with one element
@Test
void testRemoveFromListWithOneElement() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note = new AbstractNote();
    model.add(note);
    AbstractNote removedNote = model.remove(0);
    assertEquals(note, removedNote);
    assertEquals(0, model.getSize());
}

// Test case 3: Test removing an element at index 0 from a list with multiple elements
@Test
void testRemoveFirstElementFromListWithMultipleElements() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    AbstractNote note3 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    model.add(note3);
    AbstractNote removedNote = model.remove(0);
    assertEquals(note1, removedNote);
    assertEquals(2, model.getSize());
}

// Test case 4: Test removing an element at the last index from a list with multiple elements
@Test
void testRemoveLastElementFromListWithMultipleElements() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    AbstractNote note3 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    model.add(note3);
    AbstractNote removedNote = model.remove(2);
    assertEquals(note3, removedNote);
    assertEquals(2, model.getSize());
}

// Test case 5: Test removing an element at an index in the middle of a list with odd number of elements
@Test
void testRemoveMiddleElementFromListWithOddNumberOfElements() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    AbstractNote note3 = new AbstractNote();
    AbstractNote note4 = new AbstractNote();
    AbstractNote note5 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    model.add(note3);
    model.add(note4);
    model.add(note5);
    AbstractNote removedNote = model.remove(2);
    assertEquals(note3, removedNote);
    assertEquals(4, model.getSize());
}

// Test case 6: Test removing an element at an index in the middle of a list with even number of elements
@Test
void testRemoveMiddleElementFromListWithEvenNumberOfElements() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    AbstractNote note3 = new AbstractNote();
    AbstractNote note4 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    model.add(note3);
    model.add(note4);
    AbstractNote removedNote = model.remove(1);
    assertEquals(note2, removedNote);
    assertEquals(3, model.getSize());
}

// Test case 7: Test removing an element at an index greater than the size of the list
@Test
void testRemoveElementAtInvalidIndex() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    assertThrows(ArrayIndexOutOfBoundsException.class, () -> model.remove(2));
}

// Test case 8: Test removing an element at a negative index
@Test
void testRemoveElementAtNegativeIndex() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    assertThrows(ArrayIndexOutOfBoundsException.class, () -> model.remove(-1));
}

// Test case 9: Test removing an element and verifying that the correct event is fired
@Test
void testRemoveAndVerifyEvent() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    NoteListDataListenerMock listener = new NoteListDataListenerMock();
    model.addNoteListDataListener(listener);
    model.remove(0);
    assertTrue(listener.eventFired);
}

// Test case 10: Test removing an element and verifying that the correct event is fired with the correct source
@Test
void testRemoveAndVerifyEventSource() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    NoteListDataListenerMock listener = new NoteListDataListenerMock();
    model.addNoteListDataListener(listener);
    model.remove(0);
    assertEquals(model, listener.eventSource);
}

/**
 * A mock implementation of <code>NoteListDataListener</code> for testing purposes.
 */
private class NoteListDataListenerMock implements NoteListDataListener {
    public boolean eventFired = false;
    public Object eventSource = null;

    public void noteListChanged(NoteListDataEvent e) {
        eventFired = true;
        eventSource = e.getSource();
    }
}
}