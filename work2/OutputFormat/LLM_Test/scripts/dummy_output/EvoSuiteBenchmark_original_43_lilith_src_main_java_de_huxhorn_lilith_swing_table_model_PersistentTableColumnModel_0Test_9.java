// PersistentTableColumnModel_0Test.java
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
* It contains one unit test case for the {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
*/
class PersistentTableColumnModel_0Test {
		/**
		* This tests the <code>isColumnVisible()</code> method for the <code>ColumnInfo</code>.
		*/
@Test
		public void testSetColumn() {
			List<TableColumn> list = new ArrayList<TableColumn>();
			list.add(new TableColumn("TestColumn", null, false));
			String str = "TestColumn";
			PersistentTableColumnModel tableColumnModel = new PersistentTableColumnModel(str);
            assertNotNull(tableColumnModel.getColumnInfo(str));

            list.add(new TableColumn("New Column", "New Column", false));
			assertTrue(tableColumnModel.isColumnVisible(new TableColumn("New Column", "New Column", false)));
            assertFalse(tableColumnModel.isColumnVisible(new TableColumn("New Column", null, false)));

            list.add(new TableColumn("New Column 2", null, true));
			assertTrue(tableColumnModel.isColumnVisible(new TableColumn("New Column 2", "New Column 2", false)));
            assertFalse(tableColumnModel.isColumnVisible(new TableColumn("New Column 2", null, true)));

		}

		/**
		* This tests the isColumnInsertable(TableColumn) method for the
		* <code>addColumn</code> method.
		*/
@Test
		public void testAddColumn() {
            List<TableColumn> list = new ArrayList<TableColumn>();
            list.add(new TableColumn("New Column 1", "New Column 1", false));
			list.add(new TableColumn("New Column 2", "New Column 2", false));
			list.add(new TableColumn("New Column 3", "New Column 3", false));
			assertTrue(list.isEmpty());

            list.add(new TableColumn(null, "New Column 4", false));
			assertEquals(1, list.size());
            assertEquals(new TableColumn(null, "New Column 4", false), list.get(0));

            list.add(new TableColumn("New Column 5", "New Column 5", false));
			assertEquals(2, list.size());
			assertEquals(new TableColumn("New Column 1", "New Column 1", false), list.get(0));
            assertEquals(new TableColumn("New Column 3", "New Column 3", false), list.get(1));

            list.clear();
            list.add(new TableColumn("new_column_name", null, true));
			assertEquals(list.size(), 1);
			assertEquals(new TableColumn("new_column_name", "new_column_name", true), list.get(0));
		}

		/**
		* This tests the equals(TableColumn) and hashCode() for the
		* <code>List</code>.
		*/
@Test
		public void testListEqualsHashCode() {
            assertEquals(list().hashCode() == list().hashCode(), false);
            List<TableColumn> list1 = new ArrayList<TableColumn>();
            list1.add(new TableColumn(null, "TestColumn", true));
            assertEquals(list1, list1);
            assertEquals(list1.hashCode() == list1.hashCode(), true);
            List<TableColumn> list2 = new ArrayList<TableColumn>();
            list2.add(new TableColumn("TestColumn", null, false));
            assertEquals(list2, list2);
            assertEquals(list2.hashCode() == list2.hashCode(), true);
            assertEquals(list2.hashCode() == list2.hashCode(), false);
            List<TableColumn> list3 = new ArrayList<TableColumn>();
            list3.add(new TableColumn("TestColumn", "TestColumn", false));
            assertEquals(list3, list3);
            assertEquals(list3.hashCode() == list3.hashCode(), true);
            assertEquals(list3.hashCode() == list3.hashCode(), false);
        }

		/**
		* This tests the addColumn(TableColumn) for the <code>List</code>.
		*/
@Test
		public void testAddColumn_newColumn() {
            List<TableColumn> list = new ArrayList<TableColumn>();
            list.add(new TableColumn("testColumn", null, false));
            assertEquals(new TableColumn("testColumn", null, false), list.get(0));
        }

        /**
        * This tests the hasInsertable() method for the <code>List</code>.
        */
@Test
        public void testHasInsertable() {
            List<TableColumn> list = new ArrayList<TableColumn>();
            list.add(new TableColumn("TestColumn", "TestColumn", false));
            list.add(new TableColumn("New Column", null, true));
            assertTrue(list.hasInsertable(list.get(0)));
        }

		/**
		* Tests the list iterator, for the <code>List</code>.
		*/
@Test
		public void testListIterator() {

			List<TableColumn> list = new ArrayList<TableColumn>();
			list.set("TestColumn 1");
			list.set("New Column 2");
			list.add(new TableColumn("New Column 3", null, false));
			list.add(new TableColumn("New Column 4"));
            List<TableColumn> newList = new ArrayList<TableColumn>();
            Iterator<TableColumn> it = list.iterator();
            while (it.hasNext()) {
                newList.add(it.next());
            }

            // Verify
			assertEquals(0, newList.size());
			assertEquals(0, list.size());
			assertEquals(1, newList.size());

            // Change
            list.remove(0);

            // Verify
			assertEquals(1, newList.size());
			assertEquals(1, list.size());
            assertEquals(2, newList.size());

            // Change
            list.add(4);

            // Verify
			assertEquals(2, newList.size());
			assertEquals(3, list.size());
            assertEquals(2, newList.size());

            // Remove first
            list.remove(0);

            // Verify
			assertEquals(3, newList.size());
			assertEquals(2, list.size());

            // Remove last
            list.remove(newList.get(newList.size() - 1));
            assertEquals(2, list.size());

            // Add second
            list.add(newList.get(2));

            // Verify
			assertEquals(3, list.size());
			assertEquals(2, newList.size());
        }
}