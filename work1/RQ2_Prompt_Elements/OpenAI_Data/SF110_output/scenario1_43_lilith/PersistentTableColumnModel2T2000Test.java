// PersistentTableColumnModelTest.java
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#getColumns(boolean)} method.
*/
class PersistentTableColumnModelTest {

	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter is true.
	*/
	@Test
	void testGetColumns_true() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(true);
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn, iterator.next());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter is false.
	*/
	@Test
	void testGetColumns_false() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(false);
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn, iterator.next());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter is true and the tableColumns list is empty.
	*/
	@Test
	void testGetColumns_true_empty() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(true);
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter is false and the allTableColumns list is empty.
	*/
	@Test
	void testGetColumns_false_empty() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(false);
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter is true and the tableColumns list is null.
	*/
	@Test
	void testGetColumns_true_null() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.tableColumns = null;
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(true);
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter is false and the allTableColumns list is null.
	*/
	@Test
	void testGetColumns_false_null() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.allTableColumns = null;
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(false);
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter is true and the tableColumns list is not empty.
	*/
	@Test
	void testGetColumns_true_notEmpty() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.tableColumns = new ArrayList<TableColumn>();
		persistentTableColumnModel.tableColumns.add(tableColumn);
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(true);
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn, iterator.next());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter is false and the allTableColumns list is not empty.
	*/
	@Test
	void testGetColumns_false_notEmpty() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.allTableColumns = new ArrayList<TableColumn>();
		persistentTableColumnModel.allTableColumns.add(tableColumn);
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(false);
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn, iterator.next());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter is true and the tableColumns list is not empty.
	*/
	@Test
	void testGetColumns_true_notEmpty_two() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		TableColumn tableColumn2 = new TableColumn();
		persistentTableColumnModel.tableColumns = new ArrayList<TableColumn>();
		persistentTableColumnModel.tableColumns.add(tableColumn);
		persistentTableColumnModel.tableColumns.add(tableColumn2);
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(true);
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn2, iterator.next());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter is false and the allTableColumns list is not empty.
	*/
	@Test
	void testGetColumns_false_notEmpty_two() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		TableColumn tableColumn2 = new TableColumn();
		persistentTableColumnModel.allTableColumns = new ArrayList<TableColumn>();
		persistentTableColumnModel.allTableColumns.add(tableColumn);
		persistentTableColumnModel.allTableColumns.add(tableColumn2);
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(false);
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn2, iterator.next());
	}
}