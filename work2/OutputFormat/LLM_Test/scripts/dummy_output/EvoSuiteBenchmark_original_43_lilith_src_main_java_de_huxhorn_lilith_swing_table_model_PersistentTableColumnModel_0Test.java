package de.huxhorn.lilith.swing.table.model;
java
class PersistentTableColumnModel_0Test {

    @Test
    void testIsColumnVisible_ColumnIsVisible() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        model.addColumn(column);
        assertTrue(model.isColumnVisible(column));
    }

    @Test
    void testIsColumnVisible_ColumnIsNotVisible() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        assertFalse(model.isColumnVisible(column));
    }

    @Test
    void testIsColumnVisible_ColumnNotInModel() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column1 = new TableColumn();
        TableColumn column2 = new TableColumn();
        model.addColumn(column1);
        assertFalse(model.isColumnVisible(column2));
    }

    @Test
    void testIsColumnVisible_EmptyModel() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        assertFalse(model.isColumnVisible(column));
    }

    @Test
    void testIsColumnVisible_NullColumn() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        assertFalse(model.isColumnVisible(null));
    }

    @Test
    void testIsColumnVisible_MultipleColumns() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column1 = new TableColumn();
        TableColumn column2 = new TableColumn();
        model.addColumn(column1);
        model.addColumn(column2);
        assertTrue(model.isColumnVisible(column1));
        assertTrue(model.isColumnVisible(column2));
    }

    @Test
    void testIsColumnVisible_ColumnRemoved() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        model.addColumn(column);
        model.removeColumn(column);
        assertFalse(model.isColumnVisible(column));
    }

    @Test
    void testIsColumnVisible_ColumnMoved() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        model.addColumn(column);
        model.moveColumn(0, 1);
        assertTrue(model.isColumnVisible(column));
    }

    @Test
    void testIsColumnVisible_ColumnNotMoved() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        model.addColumn(column);
        model.moveColumn(0, 0);
        assertTrue(model.isColumnVisible(column));
    }

    @Test
    void testIsColumnVisible_ColumnIndex() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        model.addColumn(column);
        assertEquals(0, model.getColumnIndex(column.getIdentifier(), true));
    }
}
