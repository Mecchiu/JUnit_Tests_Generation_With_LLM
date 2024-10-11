package de.huxhorn.lilith.swing.table.model;
java
class PersistentTableColumnModel_3Test {

    @Test
    void testGetColumnIndex_WhenIdentifierIsNull_ThenThrowIllegalArgumentException() {
        PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
        assertThrows(IllegalArgumentException.class, () -> {
            columnModel.getColumnIndex(null, true);
        });
    }

    @Test
    void testGetColumnIndex_WhenIdentifierNotFound_ThenThrowIllegalArgumentException() {
        PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        assertThrows(IllegalArgumentException.class, () -> {
            columnModel.getColumnIndex(column, true);
        });
    }

    @Test
    void testGetColumnIndex_WhenIdentifierFoundInVisibleColumns_ThenReturnCorrectIndex() {
        PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        columnModel.addColumn(column);
        int index = columnModel.getColumnIndex(column, true);
        assertEquals(0, index);
    }

    @Test
    void testGetColumnIndex_WhenIdentifierFoundInAllColumns_ThenReturnCorrectIndex() {
        PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        columnModel.addColumn(column);
        int index = columnModel.getColumnIndex(column, false);
        assertEquals(0, index);
    }

    @Test
    void testGetColumnIndex_WhenIdentifierFoundInAllColumnsButSearchingOnlyVisible_ThenThrowIllegalArgumentException() {
        PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        columnModel.addColumn(column);
        assertThrows(IllegalArgumentException.class, () -> {
            columnModel.getColumnIndex(column, true);
        });
    }

    @Test
    void testGetColumnIndex_WhenIdentifierFoundInVisibleColumnsButSearchingAllColumns_ThenReturnCorrectIndex() {
        PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        columnModel.addColumn(column);
        int index = columnModel.getColumnIndex(column, false);
        assertEquals(0, index);
    }

    @Test
    void testGetColumnIndex_WhenIdentifierFoundInVisibleColumnsButSearchingAllColumns_ThenReturnCorrectIndex() {
        PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        columnModel.addColumn(column);
        int index = columnModel.getColumnIndex(column, false);
        assertEquals(0, index);
    }

    @Test
    void testGetColumnIndex_WhenIdentifierFoundInAllColumnsButSearchingOnlyVisible_ThenThrowIllegalArgumentException() {
        PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        columnModel.addColumn(column);
        assertThrows(IllegalArgumentException.class, () -> {
            columnModel.getColumnIndex(column, true);
        });
    }

    @Test
    void testGetColumnIndex_WhenIdentifierFoundInVisibleColumnsButSearchingAllColumns_ThenReturnCorrectIndex() {
        PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        columnModel.addColumn(column);
        int index = columnModel.getColumnIndex(column, false);
        assertEquals(0, index);
    }
}
