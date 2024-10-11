// PersistentTableColumnModel_2Test.java
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
* It contains one unit test case for the {@link PersistentTableColumnModel#getColumns(boolean)} method.
*/
class PersistentTableColumnModel_2Test {
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
public class PersistentTableColumnModel extends DefaultTableColumnModel {

    public Iterator<TableColumn> getColumns(boolean onlyVisible) {
        return (onlyVisible? tableColumns.iterator() : allTableColumns.iterator());
    }
}

// PersistentTableColumnModel_2Test.java
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
* It contains one unit test case for the {@link PersistentTableColumnModel#getColumns(boolean)} method.
*/
class PersistentTableColumnModel_2Test {
		/**
		 * This method is called.
		 */
	@Test
	public void getColumns_is_available_to_all_subclasses() throws ClassNotFoundException {
			List<TableColumn> tableColumn = new ArrayList<TableColumn>();
		int tableColumnLength = tableColumn.size();

		List<TableColumn> allTableColumn = new ArrayList<TableColumn>();
		int allTableColumnLength = allTableColumns.size();

		tableColumn.add(new TableColumn("test", 0, TableColumn.CENTER, TableColumn.LEADING));
		List<TableColumn> tableColumn_1 = new ArrayList<TableColumn>();
		List<TableColumn> tableColumn_2 = new ArrayList<TableColumn>();
		List<TableColumn> tableColumn_3 = new ArrayList<TableColumn>();
		TableColumn[] tableColumnArray = (TableColumn[]) tableColumn.toArray(new TableColumn[tableColumnLength+1]);
		for (int i=0; i < tableColumnLength + 1; i++) {
				tableColumnArray[i] = new TableColumn("table" + i, 0, TableColumn.LEADING);
				tableArrayColumns.add(i, tableColumnArray[i]);
				tableArrayColumns.add(tableColumnArray[i].getModelIndex(), tableColumnArray[i].getModel());
				allTableColumn.add(i);
				tableColumnArray[i].setModel(null);
				allTableColumn = new ArrayList<TableColumn>(tableColumns.contains(i)? tableArrayColumns.get(Math.min(tableColumns.indexOf(i), Math.max(tableColumns.indexOf(i), 0))) : tableColumns.get(Math.min(tableColumns.indexOf(i), 0)));
		}
				// Iterator is empty.
				// assertTrue(tableColumn.size() == allTableColumns.size());

		tableArrayColumns.add(allTableColumnLength, tableColumnArray[allTableColumnLength]);
		allTableColumns = new ArrayList<TableColumn>(allTableColumnLength);
		allTableColumns.addAll(allTableColumn);
		tableArrayColumns.add(tableArrayColumns.get(tableArrayColumns.size() - 1), tableColumnArray[0]);

		assertEquals(allTableColumn.size(), tableArrayColumns.size());

		List<TableColumn> columns = new ArrayList<TableColumn>();
		tableColumns.addAll(columns);
		allTableColumns.addAll(2, tableColumns);

		TableColumn tableColumn_4 = tableColumnArray[tableArrayColumns.size() - 1];
		TableColumn tableColumn_5 = tableColumnArray[tableColumns.indexOf(tableArrayColumns.get(0))];

		assertTrue(columns.contains(tableColumn_4));
		assertTrue(columns.contains(tableColumn_5));

		columns.set(0, tableColumnArray[tableArrayColumns.indexOf(tableColumnArray[tableArrayColumns.indexOf(tableArrayColumns.get(0))])]);
		tableColumns.remove(tableColumns.indexOf(tableColumnArray[tableArrayColumns.indexOf(tableArrayColumns.get(0))]));
		assertEquals(tableColumns.get(tableColumns.size() - 1), tables.get(tableColumns.size() - 1));

		//assertTrue(allTableColumns.contains(tableColumn_4));
		//assertTrue(allTableColumns.contains(tableColumn_5));
		//assertEquals(tableColumns.size() - 1, allTableColumn.size());
	}
}
