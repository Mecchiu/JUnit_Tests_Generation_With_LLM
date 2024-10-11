@Test
void testCapacityWithEmptyList() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    assertEquals(10, model.capacity());
}

@Test
void testCapacityWithNonEmptyList() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    for (int i = 0; i < 15; i++) {
        model.add(new AbstractNote() {});
    }
    assertEquals(20, model.capacity());
}

@Test
void testCapacityWithCustomInitialCapacity() {
    DefaultNoteListModel model = new DefaultNoteListModel(5);
    assertEquals(5, model.capacity());
}

@Test
void testCapacityAfterTrimToSize() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    for (int i = 0; i < 5; i++) {
        model.add(new AbstractNote() {});
    }
    model.trimToSize();
    assertEquals(10, model.capacity());
}

@Test
void testCapacityAfterEnsureCapacity() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    model.ensureCapacity(30);
    assertEquals(30, model.capacity());
}

@Test
void testCapacityAfterAdd() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    for (int i = 0; i < 15; i++) {
        model.add(new AbstractNote() {});
    }
    assertEquals(20, model.capacity());
}

@Test
void testCapacityAfterInsert() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    for (int i = 0; i < 15; i++) {
        model.insertElementAt(new AbstractNote() {}, i);
    }
    assertEquals(20, model.capacity());
}

@Test
void testCapacityAfterRemove() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    for (int i = 0; i < 15; i++) {
        model.add(new AbstractNote() {});
    }
    for (int i = 0; i < 10; i++) {
        model.remove(0);
    }
    assertEquals(20, model.capacity());
}

@Test
void testCapacityAfterRemoveAll() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    for (int i = 0; i < 15; i++) {
        model.add(new AbstractNote() {});
    }
    model.removeAllElements();
    assertEquals(10, model.capacity());
}

@Test
void testCapacityAfterSetSize() {
    DefaultNoteListModel model = new DefaultNoteListModel();
    model.setSize(15);
    assertEquals(20, model.capacity());
}
}