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
	* It tests the case when the parameter <code>onlyVisible</code> is set to <code>true</code>.
	*/
	@Test
	public void testGetColumns_onlyVisible_true() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn1 = new TableColumn();
		TableColumn tableColumn2 = new TableColumn();
		TableColumn tableColumn3 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn1);
		persistentTableColumnModel.addColumn(tableColumn2);
		persistentTableColumnModel.addColumn(tableColumn3);
		persistentTableColumnModel.setColumnVisible(tableColumn1, false);
		persistentTableColumnModel.setColumnVisible(tableColumn2, true);
		persistentTableColumnModel.setColumnVisible(tableColumn3, true);
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(true);
		List<TableColumn> tableColumns = new ArrayList<TableColumn>();
		while (iterator.hasNext()) {
			tableColumns.add(iterator.next());
		}
		assertEquals(2, tableColumns.size());
		assertTrue(tableColumns.contains(tableColumn2));
		assertTrue(tableColumns.contains(tableColumn3));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter <code>onlyVisible</code> is set to <code>false</code>.
	*/
	@Test
	public void testGetColumns_onlyVisible_false() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn1 = new TableColumn();
		TableColumn tableColumn2 = new TableColumn();
		TableColumn tableColumn3 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn1);
		persistentTableColumnModel.addColumn(tableColumn2);
		persistentTableColumnModel.addColumn(tableColumn3);
		persistentTableColumnModel.setColumnVisible(tableColumn1, false);
		persistentTableColumnModel.setColumnVisible(tableColumn2, true);
		persistentTableColumnModel.setColumnVisible(tableColumn3, true);
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(false);
		List<TableColumn> tableColumns = new ArrayList<TableColumn>();
		while (iterator.hasNext()) {
			tableColumns.add(iterator.next());
		}
		assertEquals(3, tableColumns.size());
		assertTrue(tableColumns.contains(tableColumn1));
		assertTrue(tableColumns.contains(tableColumn2));
		assertTrue(tableColumns.contains(tableColumn3));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter <code>onlyVisible</code> is set to <code>true</code> and there are no visible columns.
	*/
	@Test
	public void testGetColumns_onlyVisible_true_noVisibleColumns() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn1 = new TableColumn();
		TableColumn tableColumn2 = new TableColumn();
		TableColumn tableColumn3 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn1);
		persistentTableColumnModel.addColumn(tableColumn2);
		persistentTableColumnModel.addColumn(tableColumn3);
		persistentTableColumnModel.setColumnVisible(tableColumn1, false);
		persistentTableColumnModel.setColumnVisible(tableColumn2, false);
		persistentTableColumnModel.setColumnVisible(tableColumn3, false);
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(true);
		List<TableColumn> tableColumns = new ArrayList<TableColumn>();
		while (iterator.hasNext()) {
			tableColumns.add(iterator.next());
		}
		assertEquals(0, tableColumns.size());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter <code>onlyVisible</code> is set to <code>false</code> and there are no columns.
	*/
	@Test
	public void testGetColumns_onlyVisible_false_noColumns() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(false);
		List<TableColumn> tableColumns = new ArrayList<TableColumn>();
		while (iterator.hasNext()) {
			tableColumns.add(iterator.next());
		}
		assertEquals(0, tableColumns.size());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter <code>onlyVisible</code> is set to <code>true</code> and there are no columns.
	*/
	@Test
	public void testGetColumns_onlyVisible_true_noColumns() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(true);
		List<TableColumn> tableColumns = new ArrayList<TableColumn>();
		while (iterator.hasNext()) {
			tableColumns.add(iterator.next());
		}
		assertEquals(0, tableColumns.size());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter <code>onlyVisible</code> is set to <code>false</code> and there are no visible columns.
	*/
	@Test
	public void testGetColumns_onlyVisible_false_noVisibleColumns() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn1 = new TableColumn();
		TableColumn tableColumn2 = new TableColumn();
		TableColumn tableColumn3 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn1);
		persistentTableColumnModel.addColumn(tableColumn2);
		persistentTableColumnModel.addColumn(tableColumn3);
		persistentTableColumnModel.setColumnVisible(tableColumn1, false);
		persistentTableColumnModel.setColumnVisible(tableColumn2, false);
		persistentTableColumnModel.setColumnVisible(tableColumn3, false);
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(false);
		List<TableColumn> tableColumns = new ArrayList<TableColumn>();
		while (iterator.hasNext()) {
			tableColumns.add(iterator.next());
		}
		assertEquals(3, tableColumns.size());
		assertTrue(tableColumns.contains(tableColumn1));
		assertTrue(tableColumns.contains(tableColumn2));
		assertTrue(tableColumns.contains(tableColumn3));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter <code>onlyVisible</code> is set to <code>true</code> and there are no columns.
	*/
	@Test
	public void testGetColumns_onlyVisible_true_noColumns() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(true);
		List<TableColumn> tableColumns = new ArrayList<TableColumn>();
		while (iterator.hasNext()) {
			tableColumns.add(iterator.next());
		}
		assertEquals(0, tableColumns.size());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter <code>onlyVisible</code> is set to <code>false</code> and there are no columns.
	*/
	@Test
	public void testGetColumns_onlyVisible_false_noColumns() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(false);
		List<TableColumn> tableColumns = new ArrayList<TableColumn>();
		while (iterator.hasNext()) {
			tableColumns.add(iterator.next());
		}
		assertEquals(0, tableColumns.size());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter <code>onlyVisible</code> is set to <code>true</code> and there are no visible columns.
	*/
	@Test
	public void testGetColumns_onlyVisible_true_noVisibleColumns() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn1 = new TableColumn();
		TableColumn tableColumn2 = new TableColumn();
		TableColumn tableColumn3 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn1);
		persistentTableColumnModel.addColumn(tableColumn2);
		persistentTableColumnModel.addColumn(tableColumn3);
		persistentTableColumnModel.setColumnVisible(tableColumn1, false);
		persistentTableColumnModel.setColumnVisible(tableColumn2, false);
		persistentTableColumnModel.setColumnVisible(tableColumn3, false);
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(true);
		List<TableColumn> tableColumns = new ArrayList<TableColumn>();
		while (iterator.hasNext()) {
			tableColumns.add(iterator.next());
		}
		assertEquals(0, tableColumns.size());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter <code>onlyVisible</code> is set to <code>false</code> and there are no visible columns.
	*/
	@Test
	public void testGetColumns_onlyVisible_false_noVisibleColumns() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn1 = new TableColumn();
		TableColumn tableColumn2 = new TableColumn();
		TableColumn tableColumn3 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn1);
		persistentTableColumnModel.addColumn(tableColumn2);
		persistentTableColumnModel.addColumn(tableColumn3);
		persistentTableColumnModel.setColumnVisible(tableColumn1, false);
		persistentTableColumnModel.setColumnVisible(tableColumn2, false);
		persistentTableColumnModel.setColumnVisible(tableColumn3, false);
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(false);
		List<TableColumn> tableColumns = new ArrayList<TableColumn>();
		while (iterator.hasNext()) {
			tableColumns.add(iterator.next());
		}
		assertEquals(3, tableColumns.size());
		assertTrue(tableColumns.contains(tableColumn1));
		assertTrue(tableColumns.contains(tableColumn2));
		assertTrue(tableColumns.contains(tableColumn3));
	}
	
}