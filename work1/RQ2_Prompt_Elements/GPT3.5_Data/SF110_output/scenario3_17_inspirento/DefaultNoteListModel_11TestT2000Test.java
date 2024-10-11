@Test
void testRemoveElement() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    AbstractNote note1 = new AbstractNote();
    AbstractNote note2 = new AbstractNote();
    AbstractNote note3 = new AbstractNote();
    model.addElement(note1);
    model.addElement(note2);
    model.addElement(note3);
    
    // Test removing an existing element
    assertTrue(model.removeElement(note2));
    assertFalse(model.contains(note2));
    assertEquals(2, model.getSize());
    
    // Test removing a non-existing element
    assertFalse(model.removeElement(new AbstractNote()));
    assertEquals(2, model.getSize());
    
    // Test removing the first element
    assertTrue(model.removeElement(note1));
    assertFalse(model.contains(note1));
    assertEquals(1, model.getSize());
    
    // Test removing the last element
    assertTrue(model.removeElement(note3));
    assertFalse(model.contains(note3));
    assertEquals(0, model.getSize());
    
    // Test removing all elements
    model.addElement(note1);
    model.addElement(note2);
    model.addElement(note3);
    assertTrue(model.removeElement(note1));
    assertTrue(model.removeElement(note2));
    assertTrue(model.removeElement(note3));
    assertEquals(0, model.getSize());
    
    // Test removing an element from an empty list
    assertFalse(model.removeElement(note1));
    assertEquals(0, model.getSize());
    
    // Test removing null
    assertFalse(model.removeElement(null));
    assertEquals(0, model.getSize());
}