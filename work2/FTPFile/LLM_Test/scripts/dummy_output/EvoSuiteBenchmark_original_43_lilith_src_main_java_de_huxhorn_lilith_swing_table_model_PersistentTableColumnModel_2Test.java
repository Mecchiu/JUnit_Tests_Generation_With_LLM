package de.huxhorn.lilith.swing.table.model;
java
class PersistentTableColumnModel_2Test {

    @Test
    void testGetColumns_AllVisible() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        List<TableColumn> columns = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            TableColumn column = new TableColumn();
            model.addColumn(column);
            columns.add(column);
        }

        Iterator<TableColumn> iterator = model.getColumns(true);
        int count = 0;
        while (iterator.hasNext()) {
            TableColumn column = iterator.next();
            assertTrue(columns.contains(column));
            count++;
        }

        assertEquals(5, count);
    }

    @Test
    void testGetColumns_AllInvisible() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        List<TableColumn> columns = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            TableColumn column = new TableColumn();
            columns.add(column);
        }

        Iterator<TableColumn> iterator = model.getColumns(false);
        int count = 0;
        while (iterator.hasNext()) {
            TableColumn column = iterator.next();
            assertTrue(columns.contains(column));
            count++;
        }

        assertEquals(5, count);
    }

    @Test
    void testGetColumns_Mixed() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        List<TableColumn> visibleColumns = new ArrayList<>();
        List<TableColumn> allColumns = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            TableColumn column = new TableColumn();
            allColumns.add(column);
            if (i % 2 == 0) {
                model.addColumn(column);
                visibleColumns.add(column);
            }
        }

        Iterator<TableColumn> iterator = model.getColumns(false);
        int count = 0;
        while (iterator.hasNext()) {
            TableColumn column = iterator.next();
            assertTrue(allColumns.contains(column));
            count++;
        }

        assertEquals(5, count);

        iterator = model.getColumns(true);
        count = 0;
        while (iterator.hasNext()) {
            TableColumn column = iterator.next();
            assertTrue(visibleColumns.contains(column));
            count++;
        }

        assertEquals(3, count);
    }
}
