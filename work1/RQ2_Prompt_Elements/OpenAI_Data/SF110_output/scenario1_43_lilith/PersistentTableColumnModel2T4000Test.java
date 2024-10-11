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
	* It tests if the method returns an iterator with all columns.
	*/
	@Test
	void testGetColumns_all() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column1 = new TableColumn(1);
		TableColumn column2 = new TableColumn(2);
		TableColumn column3 = new TableColumn(3);
		model.addColumn(column1);
		model.addColumn(column2);
		model.addColumn(column3);
		Iterator<TableColumn> iterator = model.getColumns(false);
		assertTrue(iterator.hasNext());
		assertEquals(column1, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(column2, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(column3, iterator.next());
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with all visible columns.
	*/
	@Test
	void testGetColumns_visible() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column1 = new TableColumn(1);
		TableColumn column2 = new TableColumn(2);
		TableColumn column3 = new TableColumn(3);
		model.addColumn(column1);
		model.addColumn(column2);
		model.addColumn(column3);
		column2.setMinWidth(0);
		column2.setMaxWidth(0);
		column2.setWidth(0);
		column2.setPreferredWidth(0);
		Iterator<TableColumn> iterator = model.getColumns(true);
		assertTrue(iterator.hasNext());
		assertEquals(column1, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(column3, iterator.next());
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with all columns.
	*/
	@Test
	void testGetColumns_all_empty() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		Iterator<TableColumn> iterator = model.getColumns(false);
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with all visible columns.
	*/
	@Test
	void testGetColumns_visible_empty() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		Iterator<TableColumn> iterator = model.getColumns(true);
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with all columns.
	*/
	@Test
	void testGetColumns_all_null() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		model.addColumn(null);
		Iterator<TableColumn> iterator = model.getColumns(false);
		assertTrue(iterator.hasNext());
		assertNull(iterator.next());
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with all visible columns.
	*/
	@Test
	void testGetColumns_visible_null() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		model.addColumn(null);
		Iterator<TableColumn> iterator = model.getColumns(true);
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with all columns.
	*/
	@Test
	void testGetColumns_all_null_null() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		model.addColumn(null);
		model.addColumn(null);
		Iterator<TableColumn> iterator = model.getColumns(false);
		assertTrue(iterator.hasNext());
		assertNull(iterator.next());
		assertTrue(iterator.hasNext());
		assertNull(iterator.next());
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with all visible columns.
	*/
	@Test
	void testGetColumns_visible_null_null() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		model.addColumn(null);
		model.addColumn(null);
		Iterator<TableColumn> iterator = model.getColumns(true);
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with all columns.
	*/
	@Test
	void testGetColumns_all_null_null_null() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		model.addColumn(null);
		model.addColumn(null);
		model.addColumn(null);
		Iterator<TableColumn> iterator = model.getColumns(false);
		assertTrue(iterator.hasNext());
		assertNull(iterator.next());
		assertTrue(iterator.hasNext());
		assertNull(iterator.next());
		assertTrue(iterator.hasNext());
		assertNull(iterator.next());
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with all visible columns.
	*/
	@Test
	void testGetColumns_visible_null_null_null() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		model.addColumn(null);
		model.addColumn(null);
		model.addColumn(null);
		Iterator<TableColumn> iterator = model.getColumns(true);
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with all columns.
	*/
	@Test
	void testGetColumns_all_null_null_null_null() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		model.addColumn(null);
		model.addColumn(null);
		model.addColumn(null);
		model.addColumn(null);
		Iterator<TableColumn> iterator = model.getColumns(false);
		assertTrue(iterator.hasNext());
		assertNull(iterator.next());
		assertTrue(iterator.hasNext());
		assertNull(iterator.next());
		assertTrue(iterator.hasNext());
		assertNull(iterator.next());
		assertTrue(iterator.hasNext());
		assertNull(iterator.next());
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with all visible columns.
	*/
	@Test
	void testGetColumns_visible_null_null_null_null() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		model.addColumn(null);
		model.addColumn(null);
		model.addColumn(null);
		model.addColumn(null);
		Iterator<TableColumn> iterator = model.getColumns(true);
		assertFalse(iterator.hasNext());
	}
}

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
	* It tests if the method returns an iterator with all columns.
	*/
	@Test
	void testGetColumns_all() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column1 = new TableColumn(1);
		TableColumn column2 = new TableColumn(2);
		TableColumn column3 = new TableColumn(3);
		model.addColumn(column1);
		model.addColumn(column2);
		model.addColumn(column3);
		Iterator<TableColumn> iterator = model.getColumns(false);
		assertTrue(iterator.hasNext());
		assertEquals(column1, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(column2, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(column3, iterator.next());
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with all visible columns.
	*/
	@Test
	void testGetColumns_visible() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column1 = new TableColumn(1);
		TableColumn column2 = new TableColumn(2);
		TableColumn column3 = new TableColumn(3);
		model.addColumn(column1);
		model.addColumn(column2);
		model.addColumn(column3);
		column2.setMinWidth(0);
		column2.setMaxWidth(0);
		column2.setWidth(0);
		column2.setPreferredWidth(0);
		Iterator<TableColumn> iterator = model.getColumns(true);
		assertTrue(iterator.hasNext());
		assertEquals(column1, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(column3, iterator.next());
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with all columns.
	*/
	@Test
	void testGetColumns_all_empty() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		Iterator<TableColumn> iterator = model.getColumns(false);
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with all visible columns.
	*/
	@Test
	void testGetColumns_visible_empty() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		Iterator<TableColumn> iterator = model.getColumns(true);
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with all columns.
	*/
	@Test
	void testGetColumns_all_null() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		model.addColumn(null);
		Iterator<TableColumn> iterator = model.getColumns(false);
		assertTrue(iterator.hasNext());
		assertNull(iterator.next());
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with all visible columns.
	*/
	@Test
	void testGetColumns_visible_null() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		model.addColumn(null);
		Iterator<TableColumn> iterator = model.getColumns(true);
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with all columns.
	*/
	@Test
	void testGetColumns_all_null_null() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		model.addColumn(null);
		model.addColumn(null);
		Iterator<TableColumn> iterator = model.getColumns(false);
		assertTrue(iterator.hasNext());
		assertNull(iterator.next());
		assertTrue(iterator.hasNext());
		assertNull(iterator.next());
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with all visible columns.
	*/
	@Test
	void testGetColumns_visible_null_null() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		model.addColumn(null);
		model.addColumn(null);
		Iterator<TableColumn> iterator = model.getColumns(true);
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with all columns.
	*/
	@Test
	void testGetColumns_all_null_null_null() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		model.addColumn(null);
		model.addColumn(null);
		model.addColumn(null);
		Iterator<TableColumn> iterator = model.getColumns(false);
		assertTrue(iterator.hasNext());
		assertNull(iterator.next());
		assertTrue(iterator.hasNext());
		assertNull(iterator.next());
		assertTrue(iterator.hasNext());
		assertNull(iterator.next());
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with all visible columns.
	*/
	@Test
	void testGetColumns_visible_null_null_null() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		model.addColumn(null);
		model.addColumn(null);
		model.addColumn(null);
		Iterator<TableColumn> iterator = model.getColumns(true);
		assertFalse(