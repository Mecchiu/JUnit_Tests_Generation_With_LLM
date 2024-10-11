```java
class DefaultNoteListModel_10Test {

    @Test
    void testLastElement_EmptyList() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        assertThrows(NoSuchElementException.class, model::lastElement);
    }

    @Test
    void testLastElement_SingleElement() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote();
        model.addElement(note);
        assertEquals(note, model.lastElement());
    }

    @Test
    void testLastElement_MultipleElements() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);
        model.addElement(note2);
        assertEquals(note2, model.lastElement());
    }

    @Test
    void testLastElement_RemoveLastElement() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);
        model.addElement(note2);
        model.removeElement(note2);
        assertEquals(note1, model.lastElement());
    }

    @Test
    void testLastElement_RemoveAllElements() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);
        model.addElement(note2);
        model.removeElement(note1);
        model.removeElement(note2);
        assertThrows(NoSuchElementException.class, model::lastElement);
    }

    @Test
    void testLastElement_AddThenRemoveAllElements() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);
        model.addElement(note2);
        model.removeElement(note1);
        model.removeElement(note2);
        assertThrows(NoSuchElementException.class, model::lastElement);
    }

    @Test
    void testLastElement_AddThenRemoveLastElement() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);
        model.addElement(note2);
        model.removeElement(note2);
        assertEquals(note1, model.lastElement());
    }

    @Test
    void testLastElement_AddThenRemoveFirstElement() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        model.addElement(note1);
        model.addElement(note2);
        model.removeElement(note1);
        assertEquals(note2, model.lastElement());
    }

    @Test
    void testLastElement_AddThenRemoveMiddleElement() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        AbstractNote note3 = new AbstractNote();
        model.addElement(note1);
        model.addElement(note2);
        model.addElement(note3);
        model.removeElement(note2);
        assertEquals(note3, model.lastElement());
    }

    @Test
    void testLastElement_AddThenRemoveAllButOneElement() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote();
        AbstractNote note2 = new AbstractNote();
        AbstractNote note3 = new AbstractNote();
        model.addElement(note1);
        model.addElement(note2);
        model.addElement(note3);
        model.removeElement(note1);
        model.removeElement(note3);
        assertEquals(note2, model.lastElement());
    }
}
```
```