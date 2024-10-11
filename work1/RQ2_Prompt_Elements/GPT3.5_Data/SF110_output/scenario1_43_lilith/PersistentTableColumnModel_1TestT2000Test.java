// Here's an example implementation of the test cases for the getColumnCount method:

@Test
void testGetColumnCount() {
    PersistentTableColumnModel model = new PersistentTableColumnModel();
    TableColumn column1 = new TableColumn(0);
    TableColumn column2 = new TableColumn(1);
    TableColumn column3 = new TableColumn(2);
    model.addColumn(column1);
    model.addColumn(column2);
    model.addColumn(column3);

    // Test case 1: Only visible columns
    assertEquals(3, model.getColumnCount(true));

    // Test case 2: All columns
    assertEquals(3, model.getColumnCount(false));

    // Test case 3: No columns
    model = new PersistentTableColumnModel();
    assertEquals(0, model.getColumnCount(true));
    assertEquals(0, model.getColumnCount(false));

    // Test case 4: One visible column
    model = new PersistentTableColumnModel();
    model.addColumn(column1);
    assertEquals(1, model.getColumnCount(true));
    assertEquals(1, model.getColumnCount(false));

    // Test case 5: One hidden column
    model = new PersistentTableColumnModel();
    model.addColumn(column1);
    assertEquals(0, model.getColumnCount(true));
    assertEquals(1, model.getColumnCount(false));

    // Test case 6: Two visible columns
    model = new PersistentTableColumnModel();
    model.addColumn(column1);
    model.addColumn(column2);
    assertEquals(2, model.getColumnCount(true));
    assertEquals(2, model.getColumnCount(false));

    // Test case 7: Two hidden columns
    model = new PersistentTableColumnModel();
    model.addColumn(column1);
    model.addColumn(column2);
    assertEquals(0, model.getColumnCount(true));
    assertEquals(2, model.getColumnCount(false));

    // Test case 8: One visible, one hidden column
    model = new PersistentTableColumnModel();
    model.addColumn(column1);
    model.addColumn(column2);
    assertEquals(1, model.getColumnCount(true));
    assertEquals(2, model.getColumnCount(false));

    // Test case 9: Three visible columns, one hidden column
    model = new PersistentTableColumnModel();
    model.addColumn(column1);
    model.addColumn(column2);
    model.addColumn(column3);
    assertEquals(3, model.getColumnCount(true));
    assertEquals(4, model.getColumnCount(false));

    // Test case 10: Three hidden columns, one visible column
    model = new PersistentTableColumnModel();
    model.addColumn(column1);
    model.addColumn(column2);
    model.addColumn(column3);
    assertEquals(1, model.getColumnCount(true));
    assertEquals(4, model.getColumnCount(false));
}