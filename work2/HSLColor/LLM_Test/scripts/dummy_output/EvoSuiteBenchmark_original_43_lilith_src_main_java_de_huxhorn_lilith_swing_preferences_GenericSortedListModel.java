package de.huxhorn.lilith.swing.preferences;
java
class GenericSortedListModelTest {

    @Test
    void testGetElementAt_withEmptyModel_returnsNull() {
        GenericSortedListModel<String> model = new GenericSortedListModel<>();
        assertNull(model.getElementAt(0));
    }

    @Test
    void testGetElementAt_withNonEmptyModel_returnsElement() {
        GenericSortedListModel<String> model = new GenericSortedListModel<>();
        model.add("Element 1");
        model.add("Element 2");
        assertEquals("Element 1", model.getElementAt(0));
        assertEquals("Element 2", model.getElementAt(1));
    }

    @Test
    void testGetElementAt_withIndexOutOfBounds_returnsNull() {
        GenericSortedListModel<String> model = new GenericSortedListModel<>();
        model.add("Element 1");
        assertNull(model.getElementAt(1));
    }

    @Test
    void testGetElementAt_withNegativeIndex_returnsNull() {
        GenericSortedListModel<String> model = new GenericSortedListModel<>();
        model.add("Element 1");
        assertNull(model.getElementAt(-1));
    }

    @Test
    void testGetElementAt_withSortedModel_returnsElement() {
        GenericSortedListModel<Integer> model = new GenericSortedListModel<>();
        model.add(3);
        model.add(1);
        model.add(2);
        assertEquals(1, model.getElementAt(0));
        assertEquals(2, model.getElementAt(1));
        assertEquals(3, model.getElementAt(2));
    }

    @Test
    void testGetElementAt_withComparator_returnsElement() {
        Comparator<String> lengthComparator = Comparator.comparing(String::length);
        GenericSortedListModel<String> model = new GenericSortedListModel<>(lengthComparator);
        model.add("Element 1");
        model.add("Element 22");
        model.add("Element 333");
        assertEquals("Element 1", model.getElementAt(2));
        assertEquals("Element 22", model.getElementAt(0));
        assertEquals("Element 333", model.getElementAt(1));
    }

    @Test
    void testGetElementAt_withNullElement_returnsNull() {
        GenericSortedListModel<String> model = new GenericSortedListModel<>();
        model.add("Element 1");
        model.add(null);
        assertNull(model.getElementAt(1));
    }

    @Test
    void testGetElementAt_withDuplicateElements_returnsElement() {
        GenericSortedListModel<String> model = new GenericSortedListModel<>();
        model.add("Element 1");
        model.add("Element 1");
        assertEquals("Element 1", model.getElementAt(0));
        assertEquals("Element 1", model.getElementAt(1));
    }

    @Test
    void testGetElementAt_withRemovedElement_returnsNull() {
        GenericSortedListModel<String> model = new GenericSortedListModel<>();
        model.add("Element 1");
        model.remove("Element 1");
        assertNull(model.getElementAt(0));
    }
}
