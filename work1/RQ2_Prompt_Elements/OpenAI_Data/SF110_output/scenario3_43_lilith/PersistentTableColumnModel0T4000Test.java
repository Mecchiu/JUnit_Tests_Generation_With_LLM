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
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with a null value.
	 */
	@Test
	public void testIsColumnVisibleNull() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		assertFalse(model.isColumnVisible(null));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with a column that is not in the model.
	 */
	@Test
	public void testIsColumnVisibleNotInModel() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		assertFalse(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with a column that is in the model but not visible.
	 */
	@Test
	public void testIsColumnVisibleInModelNotVisible() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		assertFalse(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with a column that is in the model and visible.
	 */
	@Test
	public void testIsColumnVisibleInModelVisible() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.moveColumn(0, 0);
		assertTrue(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with a column that is in the model and visible but not the first column.
	 */
	@Test
	public void testIsColumnVisibleInModelVisibleNotFirst() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.moveColumn(0, 1);
		assertTrue(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with a column that is in the model and visible but not the last column.
	 */
	@Test
	public void testIsColumnVisibleInModelVisibleNotLast() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.moveColumn(0, model.getColumnCount()-1);
		assertTrue(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with a column that is in the model and visible but not the first column.
	 */
	@Test
	public void testIsColumnVisibleInModelVisibleNotFirstNotLast() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.moveColumn(0, 1);
		assertTrue(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with a column that is in the model and visible but not the first column.
	 */
	@Test
	public void testIsColumnVisibleInModelVisibleNotFirstNotLast2() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.moveColumn(0, model.getColumnCount()-1);
		assertTrue(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with a column that is in the model and visible but not the first column.
	 */
	@Test
	public void testIsColumnVisibleInModelVisibleNotFirstNotLast3() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.moveColumn(0, 1);
		assertTrue(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with a column that is in the model and visible but not the first column.
	 */
	@Test
	public void testIsColumnVisibleInModelVisibleNotFirstNotLast4() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.moveColumn(0, model.getColumnCount()-1);
		assertTrue(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with a column that is in the model and visible but not the first column.
	 */
	@Test
	public void testIsColumnVisibleInModelVisibleNotFirstNotLast5() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.moveColumn(0, 1);
		assertTrue(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with a column that is in the model and visible but not the first column.
	 */
	@Test
	public void testIsColumnVisibleInModelVisibleNotFirstNotLast6() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.moveColumn(0, model.getColumnCount()-1);
		assertTrue(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with a column that is in the model and visible but not the first column.
	 */
	@Test
	public void testIsColumnVisibleInModelVisibleNotFirstNotLast7() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.moveColumn(0, 1);
		assertTrue(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with a column that is in the model and visible but not the first column.
	 */
	@Test
	public void testIsColumnVisibleInModelVisibleNotFirstNotLast8() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.moveColumn(0, model.getColumnCount()-1);
		assertTrue(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with a column that is in the model and visible but not the first column.
	 */
	@Test
	public void testIsColumnVisibleInModelVisibleNotFirstNotLast9() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.moveColumn(0, 1);
		assertTrue(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with a column that is in the model and visible but not the first column.
	 */
	@Test
	public void testIsColumnVisibleInModelVisibleNotFirstNotLast10() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.moveColumn(0, model.getColumnCount()-1);
		assertTrue(model.isColumnVisible(column));
	}
}