// PersistentTableColumnModel_1Test.java
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
class PersistentTableColumnModel_1Test {

	/**
	* Test case for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* <p>
	* This test case tests the {@link PersistentTableColumnModel#getColumnCount(boolean)} method
	* with the following parameters:
	* <ul>
	* <li>onlyVisible: true</li>
	* </ul>
	* <p>
	* The expected result is that the method returns the number of visible columns.
	*/
	@Test
	public void testGetColumnCount_1() {
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
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(0), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(1), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(2), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(3), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(4), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(5), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(6), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(7), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(8), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(9), false);
		int result = persistentTableColumnModel.getColumnCount(true);
		assertEquals(0, result);
	}
	
	/**
	* Test case for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* <p>
	* This test case tests the {@link PersistentTableColumnModel#getColumnCount(boolean)} method
	* with the following parameters:
	* <ul>
	* <li>onlyVisible: false</li>
	* </ul>
	* <p>
	* The expected result is that the method returns the number of columns.
	*/
	@Test
	public void testGetColumnCount_2() {
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
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(0), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(1), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(2), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(3), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(4), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(5), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(6), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(7), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(8), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(9), false);
		int result = persistentTableColumnModel.getColumnCount(false);
		assertEquals(10, result);
	}
	
	/**
	* Test case for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* <p>
	* This test case tests the {@link PersistentTableColumnModel#getColumnCount(boolean)} method
	* with the following parameters:
	* <ul>
	* <li>onlyVisible: true</li>
	* </ul>
	* <p>
	* The expected result is that the method returns the number of visible columns.
	*/
	@Test
	public void testGetColumnCount_3() {
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
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(0), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(1), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(2), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(3), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(4), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(5), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(6), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(7), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(8), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(9), false);
		int result = persistentTableColumnModel.getColumnCount(true);
		assertEquals(0, result);
	}
	
	/**
	* Test case for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* <p>
	* This test case tests the {@link PersistentTableColumnModel#getColumnCount(boolean)} method
	* with the following parameters:
	* <ul>
	* <li>onlyVisible: false</li>
	* </ul>
	* <p>
	* The expected result is that the method returns the number of columns.
	*/
	@Test
	public void testGetColumnCount_4() {
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
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(0), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(1), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(2), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(3), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(4), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(5), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(6), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(7), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(8), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(9), false);
		int result = persistentTableColumnModel.getColumnCount(false);
		assertEquals(10, result);
	}
	
	/**
	* Test case for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* <p>
	* This test case tests the {@link PersistentTableColumnModel#getColumnCount(boolean)} method
	* with the following parameters:
	* <ul>
	* <li>onlyVisible: true</li>
	* </ul>
	* <p>
	* The expected result is that the method returns the number of visible columns.
	*/
	@Test
	public void testGetColumnCount_5() {
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
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(0), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(1), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(2), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(3), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(4), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(5), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(6), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(7), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(8), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(9), false);
		int result = persistentTableColumnModel.getColumnCount(true);
		assertEquals(0, result);
	}
	
	/**
	* Test case for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* <p>
	* This test case tests the {@link PersistentTableColumnModel#getColumnCount(boolean)} method
	* with the following parameters:
	* <ul>
	* <li>onlyVisible: false</li>
	* </ul>
	* <p>
	* The expected result is that the method returns the number of columns.
	*/
	@Test
	public void testGetColumnCount_6() {
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
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(0), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(1), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(2), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(3), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(4), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(5), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(6), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(7), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(8), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(9), false);
		int result = persistentTableColumnModel.getColumnCount(false);
		assertEquals(10, result);
	}
	
	/**
	* Test case for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* <p>
	* This test case tests the {@link PersistentTableColumnModel#getColumnCount(boolean)} method
	* with the following parameters:
	* <ul>
	* <li>onlyVisible: true</li>
	* </ul>
	* <p>
	* The expected result is that the method returns the number of visible columns.
	*/
	@Test
	public void testGetColumnCount_7() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(new TableColumn());
		persistentTableColumnModel.addColumn(