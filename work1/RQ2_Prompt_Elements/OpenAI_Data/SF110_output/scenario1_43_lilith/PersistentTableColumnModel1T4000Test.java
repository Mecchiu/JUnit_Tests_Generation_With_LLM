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
	* Expected result: The number of visible columns.
	*/
	@Test
	public void testGetColumnCount_onlyVisible_true() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.getColumn(0).setMinWidth(0);
		persistentTableColumnModel.getColumn(0).setMaxWidth(0);
		persistentTableColumnModel.getColumn(0).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(0).setWidth(0);
		persistentTableColumnModel.getColumn(1).setMinWidth(0);
		persistentTableColumnModel.getColumn(1).setMaxWidth(0);
		persistentTableColumnModel.getColumn(1).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(1).setWidth(0);
		persistentTableColumnModel.getColumn(2).setMinWidth(0);
		persistentTableColumnModel.getColumn(2).setMaxWidth(0);
		persistentTableColumnModel.getColumn(2).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(2).setWidth(0);
		assertEquals(3, persistentTableColumnModel.getColumnCount(true));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* Test data: onlyVisible = false.
	* Expected result: The number of all columns.
	*/
	@Test
	public void testGetColumnCount_onlyVisible_false() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.getColumn(0).setMinWidth(0);
		persistentTableColumnModel.getColumn(0).setMaxWidth(0);
		persistentTableColumnModel.getColumn(0).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(0).setWidth(0);
		persistentTableColumnModel.getColumn(1).setMinWidth(0);
		persistentTableColumnModel.getColumn(1).setMaxWidth(0);
		persistentTableColumnModel.getColumn(1).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(1).setWidth(0);
		persistentTableColumnModel.getColumn(2).setMinWidth(0);
		persistentTableColumnModel.getColumn(2).setMaxWidth(0);
		persistentTableColumnModel.getColumn(2).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(2).setWidth(0);
		assertEquals(3, persistentTableColumnModel.getColumnCount(false));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* Test data: onlyVisible = true.
	* Expected result: The number of visible columns.
	*/
	@Test
	public void testGetColumnCount_onlyVisible_true_2() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.getColumn(0).setMinWidth(0);
		persistentTableColumnModel.getColumn(0).setMaxWidth(0);
		persistentTableColumnModel.getColumn(0).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(0).setWidth(0);
		persistentTableColumnModel.getColumn(1).setMinWidth(0);
		persistentTableColumnModel.getColumn(1).setMaxWidth(0);
		persistentTableColumnModel.getColumn(1).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(1).setWidth(0);
		persistentTableColumnModel.getColumn(2).setMinWidth(0);
		persistentTableColumnModel.getColumn(2).setMaxWidth(0);
		persistentTableColumnModel.getColumn(2).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(2).setWidth(0);
		assertEquals(3, persistentTableColumnModel.getColumnCount(true));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* Test data: onlyVisible = false.
	* Expected result: The number of all columns.
	*/
	@Test
	public void testGetColumnCount_onlyVisible_false_2() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.getColumn(0).setMinWidth(0);
		persistentTableColumnModel.getColumn(0).setMaxWidth(0);
		persistentTableColumnModel.getColumn(0).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(0).setWidth(0);
		persistentTableColumnModel.getColumn(1).setMinWidth(0);
		persistentTableColumnModel.getColumn(1).setMaxWidth(0);
		persistentTableColumnModel.getColumn(1).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(1).setWidth(0);
		persistentTableColumnModel.getColumn(2).setMinWidth(0);
		persistentTableColumnModel.getColumn(2).setMaxWidth(0);
		persistentTableColumnModel.getColumn(2).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(2).setWidth(0);
		assertEquals(3, persistentTableColumnModel.getColumnCount(false));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* Test data: onlyVisible = true.
	* Expected result: The number of visible columns.
	*/
	@Test
	public void testGetColumnCount_onlyVisible_true_3() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.getColumn(0).setMinWidth(0);
		persistentTableColumnModel.getColumn(0).setMaxWidth(0);
		persistentTableColumnModel.getColumn(0).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(0).setWidth(0);
		persistentTableColumnModel.getColumn(1).setMinWidth(0);
		persistentTableColumnModel.getColumn(1).setMaxWidth(0);
		persistentTableColumnModel.getColumn(1).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(1).setWidth(0);
		persistentTableColumnModel.getColumn(2).setMinWidth(0);
		persistentTableColumnModel.getColumn(2).setMaxWidth(0);
		persistentTableColumnModel.getColumn(2).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(2).setWidth(0);
		assertEquals(3, persistentTableColumnModel.getColumnCount(true));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* Test data: onlyVisible = false.
	* Expected result: The number of all columns.
	*/
	@Test
	public void testGetColumnCount_onlyVisible_false_3() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.getColumn(0).setMinWidth(0);
		persistentTableColumnModel.getColumn(0).setMaxWidth(0);
		persistentTableColumnModel.getColumn(0).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(0).setWidth(0);
		persistentTableColumnModel.getColumn(1).setMinWidth(0);
		persistentTableColumnModel.getColumn(1).setMaxWidth(0);
		persistentTableColumnModel.getColumn(1).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(1).setWidth(0);
		persistentTableColumnModel.getColumn(2).setMinWidth(0);
		persistentTableColumnModel.getColumn(2).setMaxWidth(0);
		persistentTableColumnModel.getColumn(2).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(2).setWidth(0);
		assertEquals(3, persistentTableColumnModel.getColumnCount(false));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* Test data: onlyVisible = true.
	* Expected result: The number of visible columns.
	*/
	@Test
	public void testGetColumnCount_onlyVisible_true_4() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.getColumn(0).setMinWidth(0);
		persistentTableColumnModel.getColumn(0).setMaxWidth(0);
		persistentTableColumnModel.getColumn(0).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(0).setWidth(0);
		persistentTableColumnModel.getColumn(1).setMinWidth(0);
		persistentTableColumnModel.getColumn(1).setMaxWidth(0);
		persistentTableColumnModel.getColumn(1).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(1).setWidth(0);
		persistentTableColumnModel.getColumn(2).setMinWidth(0);
		persistentTableColumnModel.getColumn(2).setMaxWidth(0);
		persistentTableColumnModel.getColumn(2).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(2).setWidth(0);
		assertEquals(3, persistentTableColumnModel.getColumnCount(true));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* Test data: onlyVisible = false.
	* Expected result: The number of all columns.
	*/
	@Test
	public void testGetColumnCount_onlyVisible_false_4() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.getColumn(0).setMinWidth(0);
		persistentTableColumnModel.getColumn(0).setMaxWidth(0);
		persistentTableColumnModel.getColumn(0).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(0).setWidth(0);
		persistentTableColumnModel.getColumn(1).setMinWidth(0);
		persistentTableColumnModel.getColumn(1).setMaxWidth(0);
		persistentTableColumnModel.getColumn(1).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(1).setWidth(0);
		persistentTableColumnModel.getColumn(2).setMinWidth(0);
		persistentTableColumnModel.getColumn(2).setMaxWidth(0);
		persistentTableColumnModel.getColumn(2).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(2).setWidth(0);
		assertEquals(3, persistentTableColumnModel.getColumnCount(false));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* Test data: onlyVisible = true.
	* Expected result: The number of visible columns.
	*/
	@Test
	public void testGetColumnCount_onlyVisible_true_5() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.getColumn(0).setMinWidth(0);
		persistentTableColumnModel.getColumn(0).setMaxWidth(0);
		persistentTableColumnModel.getColumn(0).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(0).setWidth(0);
		persistentTableColumnModel.getColumn(1).setMinWidth(0);
		persistentTableColumnModel.getColumn(1).setMaxWidth(0);
		persistentTableColumnModel.getColumn(1).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(1).setWidth(0);
		persistentTableColumnModel.getColumn(2).setMinWidth(0);
		persistentTableColumnModel.getColumn(2).setMaxWidth(0);
		persistentTableColumnModel.getColumn(2).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(2).setWidth(0);
		assertEquals(3, persistentTableColumnModel.getColumnCount(true));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* Test data: onlyVisible = false.
	* Expected result: The number of all columns.
	*/
	@Test
	public void testGetColumnCount_onlyVisible_false_5() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.getColumn(0).setMinWidth(0);
		persistentTableColumnModel.getColumn(0).setMaxWidth(0);
		persistentTableColumnModel.getColumn(0).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(0).setWidth(0);
		persistentTableColumnModel.getColumn(1).setMinWidth(0);
		persistentTableColumnModel.getColumn(1).setMaxWidth(0);
		persistentTableColumnModel.getColumn(1).setPreferredWidth(0);
		persistentTableColumnModel.getColumn(1).setWidth(0);
		persistentTableColumnModel.