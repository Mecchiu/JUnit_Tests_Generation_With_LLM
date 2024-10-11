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
	void testIsColumnVisibleNull() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		assertFalse(model.isColumnVisible(null));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with a non-existing column.
	 */
	@Test
	void testIsColumnVisibleNonExisting() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		assertFalse(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with an existing column.
	 */
	@Test
	void testIsColumnVisibleExisting() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		assertTrue(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with an existing column that is not visible.
	 */
	@Test
	void testIsColumnVisibleExistingNotVisible() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.removeColumn(column);
		assertFalse(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with an existing column that is not visible.
	 */
	@Test
	void testIsColumnVisibleExistingNotVisible2() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.moveColumn(0, 1);
		assertFalse(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with an existing column that is not visible.
	 */
	@Test
	void testIsColumnVisibleExistingNotVisible3() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.moveColumn(0, 1);
		model.moveColumn(1, 0);
		assertTrue(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with an existing column that is not visible.
	 */
	@Test
	void testIsColumnVisibleExistingNotVisible4() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.moveColumn(0, 1);
		model.moveColumn(1, 0);
		model.removeColumn(column);
		assertFalse(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with an existing column that is not visible.
	 */
	@Test
	void testIsColumnVisibleExistingNotVisible5() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.moveColumn(0, 1);
		model.moveColumn(1, 0);
		model.removeColumn(column);
		model.addColumn(column);
		assertTrue(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with an existing column that is not visible.
	 */
	@Test
	void testIsColumnVisibleExistingNotVisible6() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.moveColumn(0, 1);
		model.moveColumn(1, 0);
		model.removeColumn(column);
		model.addColumn(column);
		model.moveColumn(0, 1);
		assertFalse(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with an existing column that is not visible.
	 */
	@Test
	void testIsColumnVisibleExistingNotVisible7() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.moveColumn(0, 1);
		model.moveColumn(1, 0);
		model.removeColumn(column);
		model.addColumn(column);
		model.moveColumn(0, 1);
		model.moveColumn(1, 0);
		assertTrue(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with an existing column that is not visible.
	 */
	@Test
	void testIsColumnVisibleExistingNotVisible8() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.moveColumn(0, 1);
		model.moveColumn(1, 0);
		model.removeColumn(column);
		model.addColumn(column);
		model.moveColumn(0, 1);
		model.moveColumn(1, 0);
		model.removeColumn(column);
		assertFalse(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with an existing column that is not visible.
	 */
	@Test
	void testIsColumnVisibleExistingNotVisible9() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.moveColumn(0, 1);
		model.moveColumn(1, 0);
		model.removeColumn(column);
		model.addColumn(column);
		model.moveColumn(0, 1);
		model.moveColumn(1, 0);
		model.removeColumn(column);
		model.addColumn(column);
		assertTrue(model.isColumnVisible(column));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
	 * with an existing column that is not visible.
	 */
	@Test
	void testIsColumnVisibleExistingNotVisible10() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		model.addColumn(column);
		model.moveColumn(0, 1);
		model.moveColumn(1, 0);
		model.removeColumn(column);
		model.addColumn(column);
		model.moveColumn(0, 1);
		model.moveColumn(1, 0);
		model.removeColumn(column);
		model.addColumn(column);
		model.moveColumn(0, 1);
		assertFalse(model.isColumnVisible(column));
	}
}