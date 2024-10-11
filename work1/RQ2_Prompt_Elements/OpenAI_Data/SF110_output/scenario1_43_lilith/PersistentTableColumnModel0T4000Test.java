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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
*/
class PersistentTableColumnModelTest {

	/**
	* Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
	* This test case checks if the method returns true if the column is visible.
	*/
	@Test
	public void testIsColumnVisible_true() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		assertTrue(persistentTableColumnModel.isColumnVisible(tableColumn));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
	* This test case checks if the method returns false if the column is not visible.
	*/
	@Test
	public void testIsColumnVisible_false() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		assertFalse(persistentTableColumnModel.isColumnVisible(tableColumn));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
	* This test case checks if the method returns false if the column is null.
	*/
	@Test
	public void testIsColumnVisible_null() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		assertFalse(persistentTableColumnModel.isColumnVisible(null));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
	* This test case checks if the method returns false if the column is not visible and the column model is empty.
	*/
	@Test
	public void testIsColumnVisible_empty() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		assertFalse(persistentTableColumnModel.isColumnVisible(tableColumn));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
	* This test case checks if the method returns false if the column is not visible and the column model contains only one column.
	*/
	@Test
	public void testIsColumnVisible_oneColumn() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		TableColumn tableColumn2 = new TableColumn();
		assertFalse(persistentTableColumnModel.isColumnVisible(tableColumn2));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
	* This test case checks if the method returns false if the column is not visible and the column model contains only two columns.
	*/
	@Test
	public void testIsColumnVisible_twoColumns() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		TableColumn tableColumn2 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn2);
		TableColumn tableColumn3 = new TableColumn();
		assertFalse(persistentTableColumnModel.isColumnVisible(tableColumn3));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
	* This test case checks if the method returns false if the column is not visible and the column model contains only three columns.
	*/
	@Test
	public void testIsColumnVisible_threeColumns() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		TableColumn tableColumn2 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn2);
		TableColumn tableColumn3 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn3);
		TableColumn tableColumn4 = new TableColumn();
		assertFalse(persistentTableColumnModel.isColumnVisible(tableColumn4));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
	* This test case checks if the method returns false if the column is not visible and the column model contains only four columns.
	*/
	@Test
	public void testIsColumnVisible_fourColumns() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		TableColumn tableColumn2 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn2);
		TableColumn tableColumn3 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn3);
		TableColumn tableColumn4 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn4);
		TableColumn tableColumn5 = new TableColumn();
		assertFalse(persistentTableColumnModel.isColumnVisible(tableColumn5));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
	* This test case checks if the method returns false if the column is not visible and the column model contains only five columns.
	*/
	@Test
	public void testIsColumnVisible_fiveColumns() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		TableColumn tableColumn2 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn2);
		TableColumn tableColumn3 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn3);
		TableColumn tableColumn4 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn4);
		TableColumn tableColumn5 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn5);
		TableColumn tableColumn6 = new TableColumn();
		assertFalse(persistentTableColumnModel.isColumnVisible(tableColumn6));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
	* This test case checks if the method returns false if the column is not visible and the column model contains only six columns.
	*/
	@Test
	public void testIsColumnVisible_sixColumns() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		TableColumn tableColumn2 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn2);
		TableColumn tableColumn3 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn3);
		TableColumn tableColumn4 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn4);
		TableColumn tableColumn5 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn5);
		TableColumn tableColumn6 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn6);
		TableColumn tableColumn7 = new TableColumn();
		assertFalse(persistentTableColumnModel.isColumnVisible(tableColumn7));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
	* This test case checks if the method returns false if the column is not visible and the column model contains only seven columns.
	*/
	@Test
	public void testIsColumnVisible_sevenColumns() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		TableColumn tableColumn2 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn2);
		TableColumn tableColumn3 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn3);
		TableColumn tableColumn4 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn4);
		TableColumn tableColumn5 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn5);
		TableColumn tableColumn6 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn6);
		TableColumn tableColumn7 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn7);
		TableColumn tableColumn8 = new TableColumn();
		assertFalse(persistentTableColumnModel.isColumnVisible(tableColumn8));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
	* This test case checks if the method returns false if the column is not visible and the column model contains only eight columns.
	*/
	@Test
	public void testIsColumnVisible_eightColumns() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		TableColumn tableColumn2 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn2);
		TableColumn tableColumn3 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn3);
		TableColumn tableColumn4 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn4);
		TableColumn tableColumn5 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn5);
		TableColumn tableColumn6 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn6);
		TableColumn tableColumn7 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn7);
		TableColumn tableColumn8 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn8);
		TableColumn tableColumn9 = new TableColumn();
		assertFalse(persistentTableColumnModel.isColumnVisible(tableColumn9));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
	* This test case checks if the method returns false if the column is not visible and the column model contains only nine columns.
	*/
	@Test
	public void testIsColumnVisible_nineColumns() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		TableColumn tableColumn2 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn2);
		TableColumn tableColumn3 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn3);
		TableColumn tableColumn4 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn4);
		TableColumn tableColumn5 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn5);
		TableColumn tableColumn6 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn6);
		TableColumn tableColumn7 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn7);
		TableColumn tableColumn8 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn8);
		TableColumn tableColumn9 = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn9);
		TableColumn tableColumn10 = new TableColumn();
		assertFalse(persistentTableColumnModel.isColumnVisible(tableColumn10));
	}
}