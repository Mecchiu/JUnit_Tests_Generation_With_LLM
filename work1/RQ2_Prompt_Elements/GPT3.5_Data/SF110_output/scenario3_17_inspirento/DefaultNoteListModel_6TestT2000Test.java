// Test case 1: Test when the list is empty
@Test
public void testLastIndexOfEmptyList() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note = new AbstractNote();
    int index = model.lastIndexOf(note);
    assertEquals(-1, index);
}

// Test case 2: Test when the list contains only one element and it is not the desired element
@Test
public void testLastIndexOfOneElementNotMatch() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    model.add(note1);
    int index = model.lastIndexOf(note2);
    assertEquals(-1, index);
}

// Test case 3: Test when the list contains only one element and it is the desired element
@Test
public void testLastIndexOfOneElementMatch() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note = new AbstractNote();
    model.add(note);
    int index = model.lastIndexOf(note);
    assertEquals(0, index);
}

// Test case 4: Test when the list contains multiple elements and the desired element is not in the list
@Test
public void testLastIndexOfMultipleElementsNotMatch() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    AbstractNote note3 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    int index = model.lastIndexOf(note3);
    assertEquals(-1, index);
}

// Test case 5: Test when the list contains multiple elements and the desired element is the first element
@Test
public void testLastIndexOfMultipleElementsMatchFirst() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    AbstractNote note3 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    model.add(note3);
    int index = model.lastIndexOf(note1);
    assertEquals(0, index);
}

// Test case 6: Test when the list contains multiple elements and the desired element is the last element
@Test
public void testLastIndexOfMultipleElementsMatchLast() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    AbstractNote note3 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    model.add(note3);
    int index = model.lastIndexOf(note3);
    assertEquals(2, index);
}

// Test case 7: Test when the list contains multiple elements and the desired element is in the middle of the list
@Test
public void testLastIndexOfMultipleElementsMatchMiddle() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    AbstractNote note3 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    model.add(note3);
    int index = model.lastIndexOf(note2);
    assertEquals(1, index);
}

// Test case 8: Test when the list contains multiple occurrences of the desired element
@Test
public void testLastIndexOfMultipleOccurrences() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    model.add(note1);
    model.add(note2);
    model.add(note1);
    int index = model.lastIndexOf(note1);
    assertEquals(2, index);
}

// Test case 9: Test when the list contains null elements
@Test
public void testLastIndexOfNullElements() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    model.add(null);
    model.add(note1);
    model.add(null);
    int index = model.lastIndexOf(note1);
    assertEquals(1, index);
}

// Test case 10: Test when the desired element is null
@Test
public void testLastIndexOfNullElement() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    model.add(null);
    int index = model.lastIndexOf(null);
    assertEquals(0, index);
}
}