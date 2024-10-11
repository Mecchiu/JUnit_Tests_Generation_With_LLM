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
	* The test case tests the {@link PersistentTableColumnModel#getColumnCount(boolean)} method with the following parameters:
	* <ul>
	* <li>onlyVisible: true</li>
	* </ul>
	* The test case expects the following result:
	* <ul>
	* <li>The method returns the number of visible columns.</li>
	* </ul>
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
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		int result = persistentTableColumnModel.getColumnCount(true);
		assertEquals(0, result);
	}
	
	/**
	* Test case for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* The test case tests the {@link PersistentTableColumnModel#getColumnCount(boolean)} method with the following parameters:
	* <ul>
	* <li>onlyVisible: false</li>
	* </ul>
	* The test case expects the following result:
	* <ul>
	* <li>The method returns the number of all columns.</li>
	* </ul>
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
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		int result = persistentTableColumnModel.getColumnCount(false);
		assertEquals(10, result);
	}
	
	/**
	* Test case for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* The test case tests the {@link PersistentTableColumnModel#getColumnCount(boolean)} method with the following parameters:
	* <ul>
	* <li>onlyVisible: true</li>
	* </ul>
	* The test case expects the following result:
	* <ul>
	* <li>The method returns the number of visible columns.</li>
	* </ul>
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
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
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
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		int result = persistentTableColumnModel.getColumnCount(true);
		assertEquals(0, result);
	}
	
	/**
	* Test case for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* The test case tests the {@link PersistentTableColumnModel#getColumnCount(boolean)} method with the following parameters:
	* <ul>
	* <li>onlyVisible: false</li>
	* </ul>
	* The test case expects the following result:
	* <ul>
	* <li>The method returns the number of all columns.</li>
	* </ul>
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
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
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
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		int result = persistentTableColumnModel.getColumnCount(false);
		assertEquals(20, result);
	}
	
	/**
	* Test case for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
	* The test case tests the {@link PersistentTableColumnModel#getColumnCount(boolean)} method with the following parameters:
	* <ul>
	* <li>onlyVisible: true</li>
	* </ul>
	* The test case expects the following result:
	* <ul>
	* <li>The method returns the number of visible columns.</li>
	* </ul>
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
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
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
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
		persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
	