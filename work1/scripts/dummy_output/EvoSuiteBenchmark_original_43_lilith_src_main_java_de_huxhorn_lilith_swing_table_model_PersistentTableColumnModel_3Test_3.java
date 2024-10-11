// PersistentTableColumnModel_3Test.java
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
* It contains one unit test case for the {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
*/
class PersistentTableColumnModel_3Test {
		/**
		 * Test method for {@link de.huxhorn.lilith.swing.table.model.PersistentTableColumnModel#getColumnIndex(Object, boolean)}
		*/
		@Test
		public void testPersistentTableColumnModel_3() {
			// Create a TableColumn with a position equal to the column with which we want to search
			TableColumn column = new TableColumn(0);
			assertEquals(1, getColumnIndex(column, false));

			// Retrieve a List of visible TableColumn objects of this model
			List<TableColumn> testTableColumns = getTestTableColumns();
			// Check if the second column in the List is the TableColumn with index < 0
			assertEquals(0, getColumnIndex(testTableColumns.get(testTableColumns.size() - 1), false));
		}

		/**
		 * Test method for {@link de.huxhorn.lilith.swing.table.model.PersistentTableColumnModel#getNumberOfColumns()}.
		*/
		@Test
		public void testPersistentTableColumnModel_4() {
			assertEquals(2, getNumberOfColumns());
		}

		/**
		 * Test method for {@link java.util.Collection#iterator()}.
		 */
		@Test
		public void testPersistentTableColumnModel_5() {
			assertTrue(getNumberOfColumns() > 0);
			assertTrue(iterator() instanceof PersistentIterator);
		}

		/**
		 * Constructor for a test case.
		 * @return constructor for test case
		 * @throws IllegalArgumentException if the test case is invalid
		 */
		private PersistentTableColumnModel_3Test testCase() {
			Iterator<TableColumn> iterator = getTestTableColumns().iterator();
			return new PersistentTableColumnModel_3Test(iterator);
		}

		/**
		 * Test method for {@link java.util.Collection#size(de.huxhorn.lilith.swing.table.model.TableColumn)}
		 */
		@Test
		public void testPersistentTableColumnModel_6() {
			PersistentTableColumnModel test = testCase();
			Iterator<TableColumn> iterator = test.getTableColumns().iterator();
			int size = test.getNumberOfColumns();
			assertEquals(size, iterator.next() instanceof TableColumn);
		}

		private List<TableColumn> getTestTableColumns() {
			List<TableColumn> testTableColumns = new ArrayList<>();
			TableColumn firstColumn = new TableColumn();
			TestData.addTableColumn(testTableColumns, firstColumn);
			testTableColumns.add(firstColumn);
			TableColumn secondColumn = new TableColumn();
			testTableColumns.add(secondColumn);
			return testTableColumns;
		}

		/**
		 * Test constructor for a test case.
		 * @return constructor for test case
		 * @return constructor for test case class
		 */
		private PersistentTableColumnModel_4Test testCase_getTestTableColumns() {
			List<TableColumn> testTableColumns = getTestTableColumns();
			Iterator<TableColumn> iterator = testTableColumns.iterator();
			assertTrue(iterator.hasNext());
			TableColumn testLastColumn = iterator.next();
			return new PersistentTableColumnModel_4Test(iterator, testLastColumn);
		}

		private PersistentTableColumnModel_4Test getTestTableColumnModel_4Test() {
			List<TableColumn> testTableColumns = getTestTableColumns();
			Iterator<TableColumn> iterator = testTableColumns.iterator();
			assertTrue(iterator.hasNext());
			TableColumn testLastColumn = iterator.next();

			// create an instance of the test table column model and assign
			List<TableColumn> testLastTableColumns = new ArrayList<>();
			testLastTableColumns.add(testLastColumn);
			TableColumnTableModel testTableColumns = new TableColumnTableModel(testTableColumns, 0);
			testTableColumnModel = testTableColumns.get(testTableColumns.size() - 1);
			return new PersistentTableColumnModel_4Test(iterator, testLastColumn);
		}

		private PersistentTableColumnModel_4Test testCase_getTestTableColumnModel() {
			List<TableColumn> testTableColumns = getTestTableColumns();
			Iterator<TableColumn> iterator = testTableColumns.iterator();

			// create an instance of the test table column model and assign
			List<TableColumn> testLastTableColumns = new ArrayList<>();
			testLastTableColumns.add(testLastColumn);
			TableColumnTableModel testTableColumns2 = new TableColumnTableModel(testTableColumns, 0);
			testTableColumnModel = testLastTableColumns.get(testLastTableColumns.size() - 1);
			return new PersistentTableColumnModel_4Test(iterator, testLastColumn);
		}

		private List<TableColumn> getNonPersistentTableColumns() {
			List<TableColumn> testTableColumns = new ArrayList<>();
			List<TableColumn> nonPersistentTableColumns = new ArrayList<>();
			Iterator<TableColumn> iterator = getColumns().iterator();
			while (iterator.hasNext()) {
				if (!iterator.next().isPersistent()) {
					nonPersistentTableColumns.add(iterator.next());
				}
			}
			return nonPersistentTableColumns;
		}
}