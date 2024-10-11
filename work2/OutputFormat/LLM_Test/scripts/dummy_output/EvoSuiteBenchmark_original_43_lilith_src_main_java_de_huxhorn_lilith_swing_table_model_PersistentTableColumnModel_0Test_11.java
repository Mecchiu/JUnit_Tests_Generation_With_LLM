// PersistentTableColumnModel_0Test.java
package de.huxhorn.lilith.swing.table.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PersistentTableColumnModel}.
* It contains one unit test case for the {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
*/
class PersistentTableColumnModel_0Test {
		/**
		* Checks visibility of all the columns.
		* 
		* @throws Exception if some error occurs
		*/
    @org.junit.jupiter.api.Test
    public void checkAllColumnVisibility() throws Exception {
    	// this test works only if no more tests are required
		// for more test case check the behaviour if an Iterator iterator is used
    	// but no default implementation is used (i.e. there is no error)

        // Check if at least one column is visible, otherwise it won't be visible
        int columnCount = getColumnCount();

        Iterator<TableColumn> columns = getColumnIterator();
        boolean isVisible = true;

        while (isVisible && columns.hasNext()) {

            TableColumn column = columns.next();

            isVisible = column.isVisible();

        }

        assertTrue("Column was not shown", isVisible);

    }

    /**
     * Check the visible list of columns.
     *
     * @throws Exception if some error occurs
     */
    @Test
    public void checkVisibleColumns() throws Exception {
        List<String> columnNames = new ArrayList<String>();

        columnNames.add("a");
        columnNames.add("b");
        columnNames.add("c");

        DefaultTableColumnModel columnModel = new DefaultTableColumnModel();

        for (String columnName : columnNames) {
            columnModel.addColumn(constructTableColumn(columnName));
        }

        Iterator<TableColumn> visibleColumns = getVisibleColumns();
        Iterator<TableColumn> columns = columnModel.getColumns();

        while (visibleColumns.hasNext() && columns.hasNext()) {
            assertEquals("Column should be visible", columnNames.contains(visibleColumns.next().getHeaderValue()),
                    columns.hasNext());
        }

        columnNames = new ArrayList<String>();

        columnNames.add("d");
        columnNames.add("e");
        columnNames.add("g");
        columnNames.add("f");

        columnModel = new DefaultTableColumnModel();

        for (String columnName : columnNames) {
            columnModel.addColumn(constructTableColumn(columnName));
        }

        columns = columnModel.getColumns();
        while (columns.hasNext()) {
            assertEquals("Column was not visible", columnNames.contains(columns.next().getHeaderValue()),
                    isColumnVisible(columns.next()));
        }

        columnNames = new ArrayList<String>();

        columnNames.add("h");
        columnNames.add("i");
        columnNames.add("j");
        columnNames.add("k");
        columnNames.add("l");
        columnNames.add("m");

        columnModel = new DefaultTableColumnModel();

        for (String columnName : columnNames) {
            columnModel.addColumn(constructTableColumn(columnName));
        }

        columns = columnModel.getColumns();

        while (columns.hasNext()) {
            assertEquals("Column was not visible", columnNames.contains(columns.next().getHeaderValue()),
                    isColumnVisible(columns.next()));
        }

        columnNames = new ArrayList<String>();

        columnNames.add("n");
        columnNames.add("o");
        columnNames.add("p");
        columnNames.add("q");
        columnNames.add("r");
        columnNames.add("s");

        columnModel = new DefaultTableColumnModel();

        for (String columnName : columnNames) {
            columnModel.addColumn(constructTableColumn(columnName));
        }

        columns = columnModel.getColumns();

        while (columns.hasNext()) {
            assertEquals("Column was not visible", columnNames.contains(columns.next().getHeaderValue()),
                    isColumnVisible(columns.next()));
        }

        columnNames = new ArrayList<String>();

        columnNames.add("t");
        columnNames.add("u");
        columnNames.add("v");
        columnNames.add("w");

        columnModel = new DefaultTableColumnModel();

        for (String columnName : columnNames) {
            columnModel.addColumn(constructTableColumn(columnName));
        }

        columns = columnModel.getColumns();
        while (columns.hasNext()) {
            assertEquals("Column was not visible", columnNames.contains(columns.next().getHeaderValue()),
                    isColumnVisible(columns.next()));
        }

        columnNames = new ArrayList<String>();

        columnNames.add("x");
        columnNames.add("y");
        columnNames.add("z");
        columnNames.add("A");

        columnModel = new DefaultTableColumnModel();

        for (String columnName : columnNames) {
            columnModel.addColumn(constructTableColumn(columnName));
        }

        columns = columnModel.getColumns();
        while (columns.hasNext()) {
            assertEquals("Column was not visible", columnNames.contains(columns.next().getHeaderValue()),
                    isColumnVisible(columns.next()));
        }

        columnNames = new ArrayList<String>();
        columnNames.add("Z");

        columnModel = new DefaultTableColumnModel();

        for (String columnName : columnNames) {
            columnModel.addColumn(constructTableColumn(columnName));
        }

        columns = columnModel.getColumns();
        while (columns.hasNext()) {
            assertEquals("Column was not visible", columnNames.contains(columns.next().getHeaderValue()),
                    isColumnVisible(columns.next()));
        }
    }

    /**
     * Constructs the TableColumn, setting the model value to the specified column's
     * value of the model itself.
     *
     * @param aColumn column to create a TableColumn from
     */
    private TableColumn constructorTableColumn(String aColumn) {
        TableColumn column = new TableColumn(aColumn);
        return column;
    }

}