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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
*/
class PersistentTableColumnModelTest {

	/**
	* Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* Test data: onlyVisible = true.
	* Expected result: the number of columns in the <code>tableColumns</code> array.
	*/
	@Test
	public void testGetColumnCount_onlyVisible_true() {
		// GIVEN
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		
		// WHEN
		int result = persistentTableColumnModel.getColumnCount(true);
		
		// THEN
		assertEquals(10, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* Test data: onlyVisible = false.
	* Expected result: the number of columns in the <code>tableColumns</code> array.
	*/
	@Test
	public void testGetColumnCount_onlyVisible_false() {
		// GIVEN
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		
		// WHEN
		int result = persistentTableColumnModel.getColumnCount(false);
		
		// THEN
		assertEquals(10, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* Test data: onlyVisible = true.
	* Expected result: the number of columns in the <code>tableColumns</code> array.
	*/
	@Test
	public void testGetColumnCount_onlyVisible_true_2() {
		// GIVEN
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		
		// WHEN
		int result = persistentTableColumnModel.getColumnCount(true);
		
		// THEN
		assertEquals(10, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* Test data: onlyVisible = false.
	* Expected result: the number of columns in the <code>tableColumns</code> array.
	*/
	@Test
	public void testGetColumnCount_onlyVisible_false_2() {
		// GIVEN
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		
		// WHEN
		int result = persistentTableColumnModel.getColumnCount(false);
		
		// THEN
		assertEquals(10, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* Test data: onlyVisible = true.
	* Expected result: the number of columns in the <code>tableColumns</code> array.
	*/
	@Test
	public void testGetColumnCount_onlyVisible_true_3() {
		// GIVEN
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		
		// WHEN
		int result = persistentTableColumnModel.getColumnCount(true);
		
		// THEN
		assertEquals(10, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* Test data: onlyVisible = false.
	* Expected result: the number of columns in the <code>tableColumns</code> array.
	*/
	@Test
	public void testGetColumnCount_onlyVisible_false_3() {
		// GIVEN
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		
		// WHEN
		int result = persistentTableColumnModel.getColumnCount(false);
		
		// THEN
		assertEquals(10, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* Test data: onlyVisible = true.
	* Expected result: the number of columns in the <code>tableColumns</code