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
public PersistentTableColumnModel_0Test() {
	}

	/**
	* Test to verify the tableColumns.java method.
	*/
	@Test
	public void test_tableColumns() {
		// given: a table model with a column named "COLUMN"

		// when: trying to get a column with a name that is already reserved
		assertEquals(tableColumns.get(0), tableColumns.get(0));

		// then: try to get the first column from the collection
		tableColumns.get(0);
		
		// when: trying to get the next column from the collection
		tableColumns.get(1);
		
		// then: an IllegalArgumentException is thrown
		fail("Not yet implemented");
	}

	/**
	* Test to verify the tableColumns.java method.
	*/
	@Test
	public void test_getColumnCount() {
		// given: a table model with a column named "COLUMN"

		// when: trying to get the number of columns
		assertEquals(tableColumns.getColumnCount(), tableColumns.getColumnCount());

		// then: a IllegalArgumentException is thrown
		fail("Not yet implemented");
	}

	/**
	* Test to verify the tableColumns.java method.
	*/
	@Test
	public void test_isColumnHidden() {
		// given: a table model with a column named "COLUMN"

		// when: trying to get the number of columns
		assertEquals(tableColumns.getColumnCount(), tableColumns.isColumnHidden(tableColumns.getColumn(0)));

		// then: a IllegalArgumentException is thrown
		fail("Not yet implemented");
	}

	/**
	* Test to verify the tableColumns.java method.
	*/
	@Test
	public void test_getVisibleColumns() {
		// given: a table model with a column named "COLUMN"
		
		// when: trying to retrieve a set of column names
		List columns = tableColumns.getVisibleColumns();
		assertNotNull(columns);
		assertFalse(columns.isEmpty());
		
		// then: the returned list has no duplicates
		assertEquals(columns, new ArrayList(tableColumns.getVisibleColumns()));
	}

	/**
	* Test to verify the tableColumns.java method.
	*/
	@Test
	public void test_indexOfColumn() {
		// given: a table model with a column named "COLUMN"
		
		// when: computing a table column's index
		int index = tableColumns.indexOf(tableColumns.getColumn(0));
		
		// then: the returned index is < -1
		assertEquals(-1, index);
	}

 public void testPersistentTableColumnModel() {
		/*
		Testing that a table with all columns visible does not cause errors
		when called after some other change of tables 
		*/
 	List tableColumns = new ArrayList();
  		
	    for (int i=0; i< 10; i++) {
	    	
	    	TableColumn column = new TableColumn("Column" + i, "Column" + i);
	    	tableColumns.add(column);
		}}

		/*
		This is testing the indexOfColumn method of tableColumns.java
		*/
	public void testIndexOfColumn() {
		List tableColumns = PersistentTableColumnModel.tableColumns;
		
		/*
		Testing the indexOfColumn method of tableColumns.java
		*/
	    int index = tableColumns.indexOf(tableColumns.getColumn(50));
	    System.out.println("index = "+index);
	    assertEquals(0, index); // no column visible
	    }

	public void testIndexOfTableColumnByName() {
		List tableColumns = PersistentTableColumnModel_0Test.tableColumns;
		
		/*
		This is testing the indexOfColumn method of tableColumns.java
		*/
	    int index = tableColumns.indexOf(new TableColumn("TableColumn", "Column"));
	    System.out.println("index= "+index);
	    assertEquals(0, index); // no column visible
	    }

		}