// Test case for PersistentTableColumnModel.isColumnVisible() method
class PersistentTableColumnModel_0Test {

    @Test
    void testIsColumnVisibleWithVisibleColumn() {
        // Create a new column model with two columns
        PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
        TableColumn column1 = new TableColumn(0);
        TableColumn column2 = new TableColumn(1);
        columnModel.addColumn(column1);
        columnModel.addColumn(column2);

        // Check if the first column is visible
        assertTrue(columnModel.isColumnVisible(column1));
    }

    @Test
    void testIsColumnVisibleWithInvisibleColumn() {
        // Create a new column model with two columns
        PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
        TableColumn column1 = new TableColumn(0);
        TableColumn column2 = new TableColumn(1);
        columnModel.addColumn(column1);
        columnModel.addColumn(column2);

        // Remove the first column
        columnModel.removeColumn(column1);

        // Check if the first column is invisible
        assertFalse(columnModel.isColumnVisible(column1));
    }

    @Test
    void testIsColumnVisibleWithNonExistingColumn() {
        // Create a new column model with two columns
        PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
        TableColumn column1 = new TableColumn(0);
        TableColumn column2 = new TableColumn(1);
        columnModel.addColumn(column1);
        columnModel.addColumn(column2);

        // Create a new column that is not part of the column model
        TableColumn column3 = new TableColumn(2);

        // Check if the new column is invisible
        assertFalse(columnModel.isColumnVisible(column3));
    }

    @Test
    void testIsColumnVisibleWithEmptyColumnModel() {
        // Create a new empty column model
        PersistentTableColumnModel columnModel = new PersistentTableColumnModel();

        // Create a new column that is not part of the column model
        TableColumn column1 = new TableColumn(0);

        // Check if the new column is invisible
        assertFalse(columnModel.isColumnVisible(column1));
    }

    @Test
    void testIsColumnVisibleWithNullColumn() {
        // Create a new column model with two columns
        PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
        TableColumn column1 = new TableColumn(0);
        TableColumn column2 = new TableColumn(1);
        columnModel.addColumn(column1);
        columnModel.addColumn(column2);

        // Check if null column is invisible
        assertFalse(columnModel.isColumnVisible(null));
    }

    @Test
    void testIsColumnVisibleWithSameColumnInstance() {
        // Create a new column model with two columns
        PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
        TableColumn column1 = new TableColumn(0);
        TableColumn column2 = new TableColumn(1);
        columnModel.addColumn(column1);
        columnModel.addColumn(column2);

        // Check if the same column instance is visible
        assertTrue(columnModel.isColumnVisible(column1));
    }

    @Test
    void testIsColumnVisibleWithDifferentColumnInstance() {
        // Create a new column model with two columns
        PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
        TableColumn column1 = new TableColumn(0);
        TableColumn column2 = new TableColumn(1);
        columnModel.addColumn(column1);
        columnModel.addColumn(column2);

        // Create a new column with the same identifier as column1
        TableColumn column3 = new TableColumn(0);

        // Check if the new column is invisible
        assertFalse(columnModel.isColumnVisible(column3));
    }

    @Test
    void testIsColumnVisibleAfterMovingColumn() {
        // Create a new column model with three columns
        PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
        TableColumn column1 = new TableColumn(0);
        TableColumn column2 = new TableColumn(1);
        TableColumn column3 = new TableColumn(2);
        columnModel.addColumn(column1);
        columnModel.addColumn(column2);
        columnModel.addColumn(column3);

        // Move the first column to the end
        columnModel.moveColumn(0, 2);

        // Check if the first column is invisible
        assertFalse(columnModel.isColumnVisible(column1));
    }

    @Test
    void testIsColumnVisibleAfterRemovingAllColumns() {
        // Create a new column model with two columns
        PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
        TableColumn column1 = new TableColumn(0);
        TableColumn column2 = new TableColumn(1);
        columnModel.addColumn(column1);
        columnModel.addColumn(column2);

        // Remove all columns
        columnModel.removeColumn(column1);
        columnModel.removeColumn(column2);

        // Check if the first column is invisible
        assertFalse(columnModel.isColumnVisible(column1));
    }

    @Test
    void testIsColumnVisibleAfterAddingNewColumn() {
        // Create a new column model with two columns
        PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
        TableColumn column1 = new TableColumn(0);
        TableColumn column2 = new TableColumn(1);
        columnModel.addColumn(column1);
        columnModel.addColumn(column2);

        // Add a new column
        TableColumn column3 = new TableColumn(2);
        columnModel.addColumn(column3);

        // Check if the new column is visible
        assertTrue(columnModel.isColumnVisible(column3));
    }
}