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
		private final List<TableColumn> aList;
		private TableColumn aTCTol;

		/**
		 * Constructor.
		 */
		public PersistentTableColumnModel_0Test() {
			// Initialize list of columns
			TableColumn tableColumn = new TableColumn("columnName");

			tableColumn.setHeaderValue(tableColumn.getHeaderValue());

			aList = new ArrayList<TableColumn>();
			aList.add(tableColumn);
		}

		/**
		 * Adds the specified table column.
		 *
		 * @param aTCTol table column to add
		 */
		public void addTableColumn(TableColumn aTCTol) {
			assertNotNull(aTCTol);
			assertTrue(!aList.contains(aTCTol));

			aTCTol.setHeaderValue(aTCTol.getHeaderValue());
			aTCTol.setHeaderWidth(aTCTol.getHeaderWidth());
			aList.add(aTCTol);

			//TODO : fix this implementation
		}

		/**
		 * Ensures that the specified table column is added to the model.
		 *
		 * @param aTCTol table column to add (not null)
		 * @throws IllegalArgumentException if aTCTol is null
		 */
		public void ensureAdded(TableColumn aTCTol) {
			assertNotNull(aTCTol);
			assertTrue(!aList.contains(aTCTol));

			aTCTol.setHeaderValue(aTCTol.getHeaderValue());
			aTCTol.setHeaderWidth(aTCTol.getHeaderWidth());
			aList.add(aTCTol);
		}

		/**
		 * Removes the specified table column.
		 *
		 * @param aTCTol table column to remove
		 */
		public void removeTableColumn(TableColumn aTCTol) {
			assertNotNull(aTCTol);
			assertTrue(aList.contains(aTCTol));
			aTCTol.setHeaderValue(null);
			aList.remove(aTCTol);
		}
}