@Test
void testCapacityReturnsCorrectValue() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    assertEquals(10, model.capacity());
}

@Test
void testCapacityReturnsCorrectValueAfterAddingElements() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    for (int i = 0; i < 5; i++) {
        model.add(new AbstractNote() {});
    }
    assertEquals(10, model.capacity());
}

@Test
void testCapacityReturnsCorrectValueAfterAddingMoreElements() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    for (int i = 0; i < 15; i++) {
        model.add(new AbstractNote() {});
    }
    assertEquals(20, model.capacity());
}

@Test
void testCapacityReturnsCorrectValueAfterRemovingElements() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    for (int i = 0; i < 5; i++) {
        model.add(new AbstractNote() {});
    }
    for (int i = 0; i < 3; i++) {
        model.remove(0);
    }
    assertEquals(10, model.capacity());
}

@Test
void testCapacityReturnsCorrectValueAfterRemovingMoreElements() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    for (int i = 0; i < 15; i++) {
        model.add(new AbstractNote() {});
    }
    for (int i = 0; i < 10; i++) {
        model.remove(0);
    }
    assertEquals(10, model.capacity());
}

@Test
void testCapacityReturnsCorrectValueAfterClearing() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    for (int i = 0; i < 5; i++) {
        model.add(new AbstractNote() {});
    }
    model.clear();
    assertEquals(10, model.capacity());
}

@Test
void testCapacityReturnsCorrectValueAfterSettingSize() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    model.setSize(15);
    assertEquals(20, model.capacity());
}

@Test
void testCapacityReturnsCorrectValueAfterSettingSizeSmaller() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    model.setSize(5);
    assertEquals(10, model.capacity());
}

@Test
void testCapacityReturnsCorrectValueAfterSettingSizeLarger() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    model.setSize(25);
    assertEquals(30, model.capacity());
}

@Test
void testCapacityReturnsCorrectValueAfterTrimming() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    for (int i = 0; i < 5; i++) {
        model.add(new AbstractNote() {});
    }
    model.trimToSize();
    assertEquals(5, model.capacity());
}
}