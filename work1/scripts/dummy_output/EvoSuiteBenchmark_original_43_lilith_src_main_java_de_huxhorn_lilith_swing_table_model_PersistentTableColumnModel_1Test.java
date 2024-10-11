package de.huxhorn.lilith.swing.table.model;
java
class PersistentTableColumnModel_1Test {

    @Test
    void testGetColumnCount_AllColumns() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        assertEquals(model.getColumnCount(false), 0);
    }

    @Test
    void testGetColumnCount_VisibleColumns() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        assertEquals(model.getColumnCount(true), 0);
    }

    @Test
    void testGetColumnCount_AddColumn_AllColumns() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn());
        assertEquals(model.getColumnCount(false), 1);
    }

    @Test
    void testGetColumnCount_AddColumn_VisibleColumns() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn());
        assertEquals(model.getColumnCount(true), 1);
    }

    @Test
    void testGetColumnCount_RemoveColumn_AllColumns() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        model.addColumn(column);
        model.removeColumn(column);
        assertEquals(model.getColumnCount(false), 0);
    }

    @Test
    void testGetColumnCount_RemoveColumn_VisibleColumns() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        model.addColumn(column);
        model.removeColumn(column);
        assertEquals(model.getColumnCount(true), 0);
    }

    @Test
    void testGetColumnCount_MoveColumn_AllColumns() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column1 = new TableColumn();
        TableColumn column2 = new TableColumn();
        model.addColumn(column1);
        model.addColumn(column2);
        model.moveColumn(0, 1);
        assertEquals(model.getColumnCount(false), 2);
    }

    @Test
    void testGetColumnCount_MoveColumn_VisibleColumns() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column1 = new TableColumn();
        TableColumn column2 = new TableColumn();
        model.addColumn(column1);
        model.addColumn(column2);
        model.moveColumn(0, 1);
        assertEquals(model.getColumnCount(true), 2);
    }

    @Test
    void testGetColumnCount_SetAllColumnsVisible() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn());
        model.setAllColumnsVisible();
        assertEquals(model.getColumnCount(true), 1);
    }

    @Test
    void testGetColumnCount_ColumnVisibility() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        model.addColumn(column);
        model.setColumnVisible(column, false);
        assertEquals(model.getColumnCount(true), 0);
    }
}
