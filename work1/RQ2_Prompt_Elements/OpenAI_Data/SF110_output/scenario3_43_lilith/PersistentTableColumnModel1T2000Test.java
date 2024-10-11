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
	 * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)}
	 * with onlyVisible set to true.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_true() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		column.setVisible(true);
		model.addColumn(column);
		assertEquals(1, model.getColumnCount(true));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)}
	 * with onlyVisible set to false.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_false() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		column.setVisible(false);
		model.addColumn(column);
		assertEquals(1, model.getColumnCount(false));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)}
	 * with onlyVisible set to true and no visible columns.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_true_noVisibleColumns() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		column.setVisible(false);
		model.addColumn(column);
		assertEquals(0, model.getColumnCount(true));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)}
	 * with onlyVisible set to false and no visible columns.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_false_noVisibleColumns() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		column.setVisible(false);
		model.addColumn(column);
		assertEquals(1, model.getColumnCount(false));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)}
	 * with onlyVisible set to true and multiple visible columns.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_true_multipleVisibleColumns() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		column.setVisible(true);
		model.addColumn(column);
		TableColumn column2 = new TableColumn();
		column2.setIdentifier("column2");
		column2.setVisible(true);
		model.addColumn(column2);
		assertEquals(2, model.getColumnCount(true));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)}
	 * with onlyVisible set to false and multiple visible columns.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_false_multipleVisibleColumns() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		column.setVisible(true);
		model.addColumn(column);
		TableColumn column2 = new TableColumn();
		column2.setIdentifier("column2");
		column2.setVisible(true);
		model.addColumn(column2);
		assertEquals(2, model.getColumnCount(false));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)}
	 * with onlyVisible set to true and multiple visible and invisible columns.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_true_multipleVisibleAndInvisibleColumns() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		column.setVisible(true);
		model.addColumn(column);
		TableColumn column2 = new TableColumn();
		column2.setIdentifier("column2");
		column2.setVisible(false);
		model.addColumn(column2);
		assertEquals(1, model.getColumnCount(true));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)}
	 * with onlyVisible set to false and multiple visible and invisible columns.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_false_multipleVisibleAndInvisibleColumns() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		column.setVisible(true);
		model.addColumn(column);
		TableColumn column2 = new TableColumn();
		column2.setIdentifier("column2");
		column2.setVisible(false);
		model.addColumn(column2);
		assertEquals(2, model.getColumnCount(false));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)}
	 * with onlyVisible set to true and multiple invisible columns.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_true_multipleInvisibleColumns() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		column.setVisible(false);
		model.addColumn(column);
		TableColumn column2 = new TableColumn();
		column2.setIdentifier("column2");
		column2.setVisible(false);
		model.addColumn(column2);
		assertEquals(0, model.getColumnCount(true));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)}
	 * with onlyVisible set to false and multiple invisible columns.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_false_multipleInvisibleColumns() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		column.setVisible(false);
		model.addColumn(column);
		TableColumn column2 = new TableColumn();
		column2.setIdentifier("column2");
		column2.setVisible(false);
		model.addColumn(column2);
		assertEquals(2, model.getColumnCount(false));
	}
}