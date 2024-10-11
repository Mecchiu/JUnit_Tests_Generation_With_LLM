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
		column.setVisible(true);
		model.addColumn(column);
		assertEquals(1, model.getColumnCount(false));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)}
	 * with onlyVisible set to true and a column that is not visible.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_true_notVisible() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		column.setVisible(false);
		model.addColumn(column);
		assertEquals(0, model.getColumnCount(true));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)}
	 * with onlyVisible set to false and a column that is not visible.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_false_notVisible() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		column.setVisible(false);
		model.addColumn(column);
		assertEquals(1, model.getColumnCount(false));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)}
	 * with onlyVisible set to true and two columns, one of them is not visible.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_true_twoColumns_oneNotVisible() {
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
	 * with onlyVisible set to false and two columns, one of them is not visible.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_false_twoColumns_oneNotVisible() {
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
	 * with onlyVisible set to true and two columns, both of them are not visible.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_true_twoColumns_bothNotVisible() {
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
	 * with onlyVisible set to false and two columns, both of them are not visible.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_false_twoColumns_bothNotVisible() {
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
	
	/**
	 * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)}
	 * with onlyVisible set to true and two columns, both of them are visible.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_true_twoColumns_bothVisible() {
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
	 * with onlyVisible set to false and two columns, both of them are visible.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_false_twoColumns_bothVisible() {
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
	 * with onlyVisible set to true and three columns, one of them is not visible.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_true_threeColumns_oneNotVisible() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		column.setVisible(true);
		model.addColumn(column);
		TableColumn column2 = new TableColumn();
		column2.setIdentifier("column2");
		column2.setVisible(true);
		model.addColumn(column2);
		TableColumn column3 = new TableColumn();
		column3.setIdentifier("column3");
		column3.setVisible(false);
		model.addColumn(column3);
		assertEquals(2, model.getColumnCount(true));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)}
	 * with onlyVisible set to false and three columns, one of them is not visible.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_false_threeColumns_oneNotVisible() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		column.setVisible(true);
		model.addColumn(column);
		TableColumn column2 = new TableColumn();
		column2.setIdentifier("column2");
		column2.setVisible(true);
		model.addColumn(column2);
		TableColumn column3 = new TableColumn();
		column3.setIdentifier("column3");
		column3.setVisible(false);
		model.addColumn(column3);
		assertEquals(3, model.getColumnCount(false));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)}
	 * with onlyVisible set to true and three columns, two of them are not visible.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_true_threeColumns_twoNotVisible() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		column.setVisible(true);
		model.addColumn(column);
		TableColumn column2 = new TableColumn();
		column2.setIdentifier("column2");
		column2.setVisible(false);
		model.addColumn(column2);
		TableColumn column3 = new TableColumn();
		column3.setIdentifier("column3");
		column3.setVisible(false);
		model.addColumn(column3);
		assertEquals(1, model.getColumnCount(true));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)}
	 * with onlyVisible set to false and three columns, two of them are not visible.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_false_threeColumns_twoNotVisible() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		column.setVisible(true);
		model.addColumn(column);
		TableColumn column2 = new TableColumn();
		column2.setIdentifier("column2");
		column2.setVisible(false);
		model.addColumn(column2);
		TableColumn column3 = new TableColumn();
		column3.setIdentifier("column3");
		column3.setVisible(false);
		model.addColumn(column3);
		assertEquals(3, model.getColumnCount(false));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)}
	 * with onlyVisible set to true and three columns, all of them are not visible.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_true_threeColumns_allNotVisible() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		column.setVisible(false);
		model.addColumn(column);
		TableColumn column2 = new TableColumn();
		column2.setIdentifier("column2");
		column2.setVisible(false);
		model.addColumn(column2);
		TableColumn column3 = new TableColumn();
		column3.setIdentifier("column3");
		column3.setVisible(false);
		model.addColumn(column3);
		assertEquals(0, model.getColumnCount(true));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)}
	 * with onlyVisible set to false and three columns, all of them are not visible.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_false_threeColumns_allNotVisible() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		column.setVisible(false);
		model.addColumn(column);
		TableColumn column2 = new TableColumn();
		column2.setIdentifier("column2");
		column2.setVisible(false);
		model.addColumn(column2);
		TableColumn column3 = new TableColumn();
		column3.setIdentifier("column3");
		column3.setVisible(false);
		model.addColumn(column3);
		assertEquals(3, model.getColumnCount(false));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)}
	 * with onlyVisible set to true and three columns, all of them are visible.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_true_threeColumns_allVisible() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		column.setVisible(true);
		model.addColumn(column);
		TableColumn column2 = new TableColumn();
		column2.setIdentifier("column2");
		column2.setVisible(true);
		model.addColumn(column2);
		TableColumn column3 = new TableColumn();
		column3.setIdentifier("column3");
		column3.setVisible(true);
		model.addColumn(column3);
		assertEquals(3, model.getColumnCount(true));
	}
	
	/**
	 * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)}
	 * with onlyVisible set to false and three columns, all of them are visible.
	 */
	@Test
	public void testGetColumnCount_onlyVisible_false_threeColumns_allVisible() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		column.setVisible(true);
		model.addColumn(column);
		TableColumn column2 = new TableColumn();
		column2.setIdentifier("column2");
		column2.setVisible(true);
		model.addColumn(column2);
		TableColumn column3 = new TableColumn();
		column3.setIdentifier("column3");
		column3.setVisible(true);
		model.addColumn(column3);
		assertEquals(3, model.getColumnCount(false));
	}
}

// PersistentTableColumnModel.java
package de.huxhorn.lilith.swing.table.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

/**
 * This class is based on code and ideas from Stephen Kelvin (mail at StephenKelvin.de) and Thomas Darimont.
 */
