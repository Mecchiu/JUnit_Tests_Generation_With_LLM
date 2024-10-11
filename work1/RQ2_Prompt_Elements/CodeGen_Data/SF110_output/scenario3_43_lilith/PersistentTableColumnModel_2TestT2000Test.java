// PersistentTableColumnModel_2Test.java
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
* It contains one unit test case for the {@link PersistentTableColumnModel#getColumns(boolean)} method.
*/
class PersistentTableColumnModel_2Test {
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// WARNING
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	/**
	* Empty constructor used only in case of <code>multipleTables</code>.
	*/
	public PersistentTableColumnModel_2Test() {}
	
	// PersistentTableColumnModel_2Test.java
	/**
	* Class constructor is used to instantize the instance with a single table-structure.
	* The <code>List</code> is populated with two TableColumns and the List is searched for
	* each Column, using first column for the visibility of the Visible Column and second column
	* for the Sortable Column.
	* Test-cases are in alphabetical order with each column the first the visible
	* and second the sortable.
	* @param data an object of the class {@link PersistentTableColumnModelData}.
	* @param tableData is a List of the objects that are created.
	* @param tableData is the list used for population.
	* @throws org.junit.jupiter.api.Assertions if a list is empty.
	*/
	public PersistentTableColumnModel_2Test(final PersistentTableColumnModelData data,
            final Iterable<List<TableColumn>> tableData) {
	    assertEquals(2, tableData.size());
            Set<TableColumn> visibleAndSortableColumns = new HashSet<>(2);
	    for (TableColumn t : tableData) {
	        visibleAndSortableColumns.add(t);
	    }
            List<TableColumn> listWithVisibleAndSortableColums = new ArrayList<>(2);
	    listWithVisibleAndSortableColums.add(new TableColumn("Name") {
	        public String getHeaderValue() {
	            List<TableColumn> columnList = tableData;
	            Iterator<TableColumn> iterator = columnList.iterator();
	            return iterator.next().getHeaderValue();
	        }

	        public Comparable getCellValue() {
	            List<TableColumn> columnList = tableData;
	            return iterator.next().getColumnModel().getColumn(0).getHeaderValue();
	        }

	        public TableColumnModel getColumnModel() {
	            return new DefaultTableColumnModel(tableData);
	        }
	    });
	    listWithVisibleAndSortableColums.add(new TableColumn("Sortable") {
	        public String getHeaderValue() {
	            List<TableColumn> columnList = tableData;
	            Iterator<TableColumn> iterator = columnList.iterator();
	            return iterator.next().getHeaderValue();
	        }

	        public Comparable getCellValue() {
	            List<TableColumn> columnList = tableData;
	            return iterator.next().getColumnModel().getColumn(1).getHeaderValue();
	        }

	        public TableColumnModel getColumnModel() {
	            return new DefaultTableColumnModel(tableData);
	        }
	    });
	    final List<TableColumn> tableWithVisibleAndSortableColum = new ArrayList<>(2);
	    tableWithVisibleAndSortableColum.add(new TableColumn("Name") {
	        public String getHeaderValue() {
	            List<TableColumn> columnList = tableData;
	            Iterator<TableColumn> iterator = columnList.iterator();
	            return iterator.next().getHeaderValue();
	        }

	        public Comparable getCellValue() {
	            List<TableColumn> columnList = tableData;
	            return iterator.next().getColumnModel().getColumn(0).getHeaderValue();
	        }

	        public TableColumnModel getColumnModel() {
	            return new DefaultTableColumnModel(tableData);
	        }
	    });
	    final List<TableColumn> tableWithSortableColum = new ArrayList<>(2);
	    tableWithSortableColum.add(new TableColumn("Name") {
	        public String getHeaderValue() {
	            List<TableColumn> columnList = tableData;
	            Iterator<TableColumn> iterator = columnList.iterator();
	            return iterator.next().getHeaderValue();
	        }

	        public Comparable getCellValue() {
	            List<TableColumn> columnList = tableData;
	            return iterator.next().getColumnModel().getColumn(1).getHeaderValue();
	        }

	        public TableColumnModel getColumnModel() {
	            return new DefaultTableColumnModel(tableData);
	        }
	    });

	    // add testcase
	    List<TableColumn> sortedTestCase = listWithVisibleAndSortableColums;
	    Collections.sort(tableWithVisibleAndSortableColum);
	    // check initial values
	    List<TableColumn> sortedTestCaseEmpty = new ArrayList<>(tableWithVisibleAndSortableColum);
	    assertEquals(sortedTestCase, sortedTestCaseEmpty);
	    // check initial values with new TableColumns and sortable-columns
	    sortedTestCase = tableWithSortableColum;
	    // check new values
	    List<TableColumn> sortedTestCaseDifferent = new ArrayList<>(tableWithSortableColum);
	    assertFalse(sortedTestCaseDifferent.isEmpty());
	    Collections.sort(sortedTestCase);
	    assertTrue(sortedTestCase.isEmpty());
	    
	}
}
