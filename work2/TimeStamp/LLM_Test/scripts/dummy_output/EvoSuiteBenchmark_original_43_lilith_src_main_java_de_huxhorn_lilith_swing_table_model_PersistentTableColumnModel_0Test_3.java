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
     * Tests whether the specified column is currently visible.
     *
     * @param aColumn column to check
     * @return visibility of specified column (false if there is no such column at all. [It's not visible, right?])
     */
    public boolean isColumnVisible(TableColumn aColumn){
        return aColumn.isVisible();

    }

    /**
     * Tests whether the specified column can accept an additional row header.
     *
     * @param aColumn column to check
     * @return true if the column can accept an additional row header. [false otherwise]
     */
    public boolean isAddRowHeaderColumnVisible(TableColumn aColumn);

    /**
     * Tests whether the specified column can accept an additional column header.
     *
     * @param aColumn column to check
     * @return true if the column can accept an additional column header. [false otherwise]
     */
    public boolean isColumnHeaderVisible(TableColumn aColumn);

    /**
     * Tests whether the specified column can accept an additional column.
     *
     * @param aColumn column to check
     * @return true if the column can accept an additional column. [false otherwise]
     */
    public boolean isColumnVisible(TableColumn aColumn);

    /**
     * Tests whether the specified column can accept an additional column of specified size.
     *
     * @param aColumn column to check
     * @param aSize size of the column to check
     * @return true if the column can accept an additional column. [false otherwise].
     */
    public boolean isColumnVisibleWithSize(TableColumn aColumn, int aSize);

    /**
     * Tests whether the specified column can accept an additional column and all columns.
     *
     * @param aColumn column to check
     * @return true if the column can accept an additional column and all columns. [false otherwise]
     */
    public boolean isColumnVisibleWithAllColumnsVisible(TableColumn aColumn);

    /**
     * Tests whether the specified column can accept an additional column and all columns of specified size.
     *
     * @param aColumn column to check
     * @param aSize size of the column to check
     * @return true if the column can accept an additional column and all columns of specified size. [false otherwise]
     */
    public boolean isColumnVisibleWithSizeOfAllColumnsAndSize(TableColumn aColumn, int aSize);

    /**
     * Tests whether the specified column can accept a given column.
     *
     * @param aColumn column to check
     * @return true if the column can accept a given column. [false otherwise]
     */
    public boolean isColumnVisible(TableColumn aColumn);

    /**
     * Tests whether the first row of a table with name "First" has a column with name "First" as its header.
     * If there is no such column this method returns false, if the result of calling the other method
     * is non-zero; otherwise, this method does nothing. [] if there is more than one column in first row [it is a false-positive
     * if an additional column in first row of a table is visible]
     *
     * @param tableName name of the table on which to look for the first column of the first row [it is a false-positive if an additional column
     * in the first row of a table is visible]
     * @param headerName name of the column to look for in the first row [it is a false-positive if an additional column in the first row of
     * a table is visible]
     * @return true if the first row has a column with name "First" as its header. [False, if this method does not return false]
     */
    public boolean hasFirstColumn(String tableName, String headerName);

    /**
     * Tests whether the first row of a table with name "First" has a column with name "Second" as its header.
     *
     * @param tableName table where to look for the first column of the first row
     * @param headerName name of the column to look for in the first row
     * @return true if the first row has a column with name "Second" as its header. [False, if this method does not return false]
     */
    public boolean hasSecondColumn(String tableName, String headerName);

    /**
     * Tests whether the first row of a table has a column with a given name.
     *
     * @param tableName table to look for the column with name "First"
     * @param headerName name of column to look for in the first row of the first row
     * @return true if the first row has a column with the given name. [false otherwise]
     */
    public boolean hasColumn(String tableName, String headerName);

    /**
     * Tests whether the first row of a table with name "First" has a column with a given name and a certain width.
     *
     * @param tableName table to look for the column with name "First" with a certain width
     * @param headerName name of the column to look for in the first row of the first row with a certain width
     * @param width number of columns to test
     * @return true if the first row has a column with column with the given name and width of exactly this number.
     * [false, if no such column exists, in this case, it is not possible to use any more columns]
     */
    public boolean isColumnVisibleWithWidth(String tableName, String headerName, int width);

    /**
     * Tests whether the first row of a table with name "First" has a column with a given name and a certain width of given number.
     *
     * @param tableName table to look for the column with name "First" with a certain width
     * @param headerName name of the column to look for in the first row of the first row with a certain width
     * @param height number of columns to test
     * @return true if the first row has a column with column with the given name and width of exactly this number.
     * [false, if no such column exists, in this case, it is not possible to use any more columns]
     */
    public boolean isColumnVisibleWithWidth(String tableName, String headerName, int width, int height);

    /**
     * Tests whether the first row of a table has a column with a given name and a certain width of given number.
     *
     * @param tableName table to look for the column with name "First" with a certain width
     * @param headerName name of the column to look for in the first row of the first row with a certain width
     * @param width number of columns to test
     * @return true if the first row has a column with column with the given name and width of exactly this number.
     * [false, if no such column exists, in this case, it is not possible to use any more columns]
     */
    public boolean isColumnVisibleWithWidthOf(String tableName, String headerName, int width);

}