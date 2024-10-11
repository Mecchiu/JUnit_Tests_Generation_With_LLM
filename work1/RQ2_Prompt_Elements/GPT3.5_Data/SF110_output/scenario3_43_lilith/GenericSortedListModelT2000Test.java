// Here's an implementation of the GenericSortedListModelTest class:

public class GenericSortedListModelTest {

    @Test
    void testGetElementAt() {
        // Create a list of integers to use as test data
        List<Integer> testData = new ArrayList<>();
        testData.add(5);
        testData.add(2);
        testData.add(8);
        testData.add(1);
        testData.add(9);

        // Create a new GenericSortedListModel using the test data
        GenericSortedListModel<Integer> model = new GenericSortedListModel<>(testData);

        // Test that the model returns the correct elements in sorted order
        assertEquals(1, model.getElementAt(0));
        assertEquals(2, model.getElementAt(1));
        assertEquals(5, model.getElementAt(2));
        assertEquals(8, model.getElementAt(3));
        assertEquals(9, model.getElementAt(4));
    }
}