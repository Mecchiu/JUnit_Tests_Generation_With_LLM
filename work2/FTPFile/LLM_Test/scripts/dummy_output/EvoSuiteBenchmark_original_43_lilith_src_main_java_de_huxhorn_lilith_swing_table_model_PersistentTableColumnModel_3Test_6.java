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
		* Generates a table with three columns having two
		* empty cells.
		*/
        @Test
        public void getColumnIndexEmptyTable() {
                /** Get the index of the first table column */
                int index = 1;
                /** First element of the array is the empty cell */
                int elementEmpty = 11;

                /** All of the objects in the list are added to the array */
                List array = new ArrayList();
                array.add(elementEmpty);
                array.add(elementEmpty);
                array.add(elementEmpty);

		/* Generate the table model with the elements */
		DefaultTableColumnModel table = new DefaultTableColumnModel(2, array);

		/* Get the Index of the first column */
                int columnIndex = 5;
                assertSameEquals(columnIndex, table.getColumnIndex(elementEmpty, true));

		/* Add a column to the first column */
                table.addColumn(columnIndex);

		/* Get the Index of the table column */
                assertEquals(columnIndex, table.getColumnIndex(elementEmpty, true));

//		// Check the size of the list of arrays
//                assertEquals(2, table.getColumnCount());
        }

		/**
		* Generates a table with one
		* visible column having two empty cells.
		*/
        @Test
        public void getColumnIndexVisibleTable() {
                /** Get the index of the first table column */
                int index = 1;
                /** First element of the array is the empty cell */
                int elementEmpty = 11;

                /** All of the objects in the list are added to the array */
                List array = new ArrayList();
                array.add(elementEmpty);

		/** Create the first table model */
		DefaultTableColumnModel table = new DefaultTableColumnModel(2, array);

		/** Get the index of the first column */
                int columnIndex = 1;
                assertSameEquals(columnIndex, table.getColumnIndex(elementEmpty, true));

		/* Add a column to the first column */
                table.addColumn(columnIndex);

		/** Get the index of the table column */
                assertEquals(columnIndex, table.getColumnIndex(elementEmpty, true));

		/** Add a column to the second column */
                assertSameEquals(columnIndex, table.getColumnIndex(elementEmpty, true));

		/** Add a column to the third column */
                assertSameEquals(columnIndex, table.getColumnIndex(elementEmpty, true));
        }
}