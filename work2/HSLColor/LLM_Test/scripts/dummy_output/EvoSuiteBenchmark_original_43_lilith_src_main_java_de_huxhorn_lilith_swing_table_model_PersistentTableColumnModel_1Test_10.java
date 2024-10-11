// PersistentTableColumnModel_1Test.java
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
* It contains one unit test case for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
*/
class PersistentTableColumnModel_1Test {
		@Test
		void getColumnCount_1Test() {
			final DefaultTableColumnModel tcm = new DefaultTableColumnModel();
			final List<TableColumn> col = new ArrayList<TableColumn>();
			col.add(new TableColumn());
			final TableColumn[] tca = col.toArray(new TableColumn[col.size()]);
			String[] names = {
					"First", "Second", "Third"
			};
			final List<String> namesList = new ArrayList<String>(col.size());
			for (final TableColumn t : col) {
				namesList.add(t.getText() + t.getHeaderValue());
			}
			assertTrue("There should be one column in " + col, col.size() == tca.length);
			assertEquals("The number of columns in the list " + col + " should be " + col.size() + "", col.size(), tca.length);
			assertEquals("The first column should be " + names[0] + ", the second column should be " + names[1] + ", and the third column should be " + names[2], names[0], namesList.get(0));
			assertEquals("The last column should be " + names[namesList.size()-1], namesList.get(namesList.size()-1), tca[namesList.length()-1].getText());
		}
}