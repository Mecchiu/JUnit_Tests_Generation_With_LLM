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
        * Tests whether a column is visible.
        *
        * @j2ejml.jml-equijoin
		* @param aColumn the specified column
		* @return true if it is visible, false if it is not visible
        */
        @Test
        public void isColumnVisible_1Null_returnsFalse() {
            System.out.println("Testing whether a column is visible.");
            System.out.println("null == FALSE");

            assertFalse("Null == FALSE(A column cannot be null or empty)", PersistentTableColumnModel.isColumnVisible(null));
            assertFalse("Null == FALSE(A column cannot be null)", PersistentTableColumnModel.isColumnVisible(new TableColumn(0)));
            assertFalse("Null == FALSE(A column cannot be null)", PersistentTableColumnModel.isColumnVisible(new TableColumn(1)));
        }
		
        /**
        * Tests whether some column is visible.
        *
        * @j2ejml.jml-equijoin
		* @param aColumn the specified column
		* @return true if it is visible, false if it is not visible
        */
        @Test
        public void isColumnVisible_1NonEmpty_returnsTrue() {
            System.out.println("Testing whether a column is visible.");
            System.out.println("non empty == TRUE");

            assertTrue("non empty == TRUE(A column cannot not be empty)", PersistentTableColumnModel.isColumnVisible(new TableColumn(0)));
            assertTrue("non empty == TRUE(A column cannot not be empty)",!PersistentTableColumnModel.isColumnVisible(new TableColumn(1)));
        }

        /**
        * Tests whether nothing is visible.
        *
        * @j2ejml.jml-equijoin
		* @return true if nothing is visible, false if nothing is yet visible
        */
        @Test
        public void isEmpty() {
            System.out.println("Testing whether nothing is visible.");
            System.out.println("empty == FALSE");

            assertFalse("FALSE(no column), no column are visible at this point so nothing is yet visible.", PersistentTableColumnModel.isColumnVisible(new TableColumn(0)));
        }

		/**
		 * It tests checking a specified column.
		 *
		 * @j2ejml.jml-equijoin
		 * @param aColumn the table column where to check the visibility
		 * @return true if it is visible, false if not
		 */
		@Test
		public void check_1Null_ReturnsNull(TableColumn aColumn) {
			System.out.println("Testing check of table column (" + aColumn.getName() + ") which is null");
			assertNull("Null(Test tableColumn, no element which is null)", PersistentTableColumnModel.isColumnVisible(aColumn));
			assertNull("Null(Test tableColumn, no element which is null)", PersistentTableColumnModel.check(null, aColumn));
			assertNull("Null(Test tableColumn, no element which is null)", PersistentTableColumnModel.check(new TableColumn(), aColumn));
		}

		/**
		 * It tests checking a specified column.
		 *
		 * @j2ejml.jml-equijoin
		 * @param aColumn the table column to check the visibility of
		 * @return true if it is visible, false if not
		 */
		@Test
		public void check_1NotNull_ReturnsNotNull(TableColumn aColumn) {
			System.out.println("Testing check of table column (" + aColumn.getName() + ") which is NULL");
			assertNotNull("Test tableColumn, no element which is null", PersistentTableColumnModel.isColumnVisible(aColumn));
			assertNotNull("Test tableColumn, no element which is null", PersistentTableColumnModel.check(aColumn, null));
			assertNotNull("Test tableColumn, no element which is null", PersistentTableColumnModel.check(new TableColumn(), aColumn));
			assertNotNull("Test tableColumn, no element which is null", PersistentTableColumnModel.check(null, aColumn));
			assertNotNull("Test tableColumn, no element which is null", PersistentTableColumnModel.check(aColumn, aColumn));
			assertNotNull("Test tableColumn, no element which is null", PersistentTableColumnModel.check(new TableColumn(0), aColumn));
			assertNotNull("Test tableColumn, no element which is null", PersistentTableColumnModel.check(new TableColumn(1), aColumn));
		}

		/**
		 * It tests checking a specified column.
		 *
		 * @j2ejml.jml-equijoin
		 * @return true if it is visible, false if not
		 */
		@Test
		public void check_1NotVisible_ReturnsNull(TableColumn aColumn) {
			System.out.println("Testing check of table column (" + aColumn.getName() + ") which is NULL");
			assertNotNull("Test tableColumn, non existent element which is not visible", PersistentTableColumnModel.check(null, aColumn));
			assertNull("Test tableColumn, no element which is not visible", PersistentTableColumnModel.check(aColumn, null));
			assertNull("Test tableColumn, no element which is not visible", PersistentTableColumnModel.check(null, aColumn));
			assertNull("Test tableColumn, no element which is not visible", PersistentTableColumnModel.check(new TableColumn(), null));
			assertNotNull("Test tableColumn, no element which is not visible", PersistentTableColumnModel.check(aColumn, aColumn));
		}

		/**
		 * It tests checking another column.
		 *
		 * @j2ejml.jml-equijoin
		 * @param aColumn the other table column
		 *
		 * @j2ejml.jml-equijoin
		 * @return true if it is visible, false if it is not visible
		 */
		@Test
		public void check_2Null_ReturnsTrue(TableColumn aColumn) {
			System.out.println("Testing check of table column (" + aColumn.getName() + ") which is null");
			assertTrue("null == TRUE", PersistentTableColumnModel.isColumnVisible(aColumn));
			assertTrue("null == TRUE", PersistentTableColumnModel.check(null, aColumn));
			assertTrue("null == TRUE", PersistentTableColumnModel.check(new TableColumn(), aColumn));
		}

		/**
		 * It tests checking another column.
		 *
		 * @j2ejml.jml-equijoin
		 * @param aColumn the other table column
		 *
		 * @j2ejml.jml-equijoin
		 * @return true if it is visible, false if not
		 */
		@Test
		public void check_2NotNull_ReturnsFalse(TableColumn aColumn) {
}
}