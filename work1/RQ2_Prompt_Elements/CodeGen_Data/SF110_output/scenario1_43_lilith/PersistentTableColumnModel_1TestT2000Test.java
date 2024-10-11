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

    public int getColumnCount(boolean onlyVisible) {
        return (onlyVisible? tableColumns.size() : allTableColumns.size());
    }
}

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
		/**
		 * This method performs
		 *     {@link PersistentTableColumnModel#getColumnCount(boolean)}
		 * for {@code true}
		 *     {@link PersistentTableColumnModel#getColumnCount(boolean)}
		 * and {@link PersistentTableColumnModel#getColumnCount(boolean)}
		 *     {@link PersistentTableColumnModel#getColumnCount(boolean)} and
		 *     {@link PersistentTableColumnModel#getColumnCount(boolean)}
		 */
	@Test
    public void getColumnCount_TrueForNonEmptyTable() {
        tableColumnsTest("Test", true);
        tableColumnsTest("Test", true);
        tableColumnsTest("Test", false);
    }

    private final static List<TableColumn> tableColumns = new ArrayList<TableColumn>();

    private void tableColumnsTest(String title, boolean includeVisible) {
        test(title, tableColumns, includeVisible);
    }

    public void test(String title, List<TableColumn> tColumns) {
        tableColumns(tColumns)
           .get(tableColumns.size() - 1)
           .addColumn(new PersistentTableColumnModel_1Test_1Test(), "T", title, PersistentTableColumnModel.TYPE_TREE, true);
    }

    public PersistentTableColumnModel tableColumns(List<TableColumn> tColumns) {
        if (tColumns.isEmpty()) {
            tColumns.add(new PersistentTableColumnModel_1Test_1Test());
        }
        return new PersistentTableColumnModel(tColumns);
    }

    private static PersistentTableColumnModel_1Test_1Test tableColumnsTest;

	public static void test(String title, List<TableColumn> tColumns, boolean includeVisible) {
        tableColumnsTest(title, includeVisible);
        int tColumnsize = tColumns.get(0).getModel().getColumnCount(includeVisible);
        System.out.println(title + ":" + tColumnsize);
        for(int i = 1; i < tColumnsize; i++) {
            int colsize;
            colsize = tColumns.get(i).getModel().getColumnCount(includeVisible);
            if (colsize == tColumns.size()) {
                assertEquals(tColumns.get(i).getName(), "T");
                assertEquals(title, title + ":" + i);
            } else {
                assertEquals(tColumns.get(i).getName(), String.valueOf(i - 1));
                assertEquals(tColumns.get(i).getModel().getColumnCount(includeVisible), colsize);
            }
        }
        testRow(tColumns.get(0));
        testRow(tColumns.get(colsize - 1));
    }

    private static final class PersistentTableColumnModel_1Test_1Test extends DefaultTableColumnModel {
	    private static final TableColumn tColumn = tableColumnAdd(PersistentTableColumnModel.TABLE_COLUMN_TYPE.TREE,
	            PersistentTableColumnModel.COLUMN_CLASS.NAME, "T");

        public TableColumn treeColumnAdd(String columnID, int columnClass, String title) {
            tColumn.setHeaderValue(title);
            return tColumn;
        }

        public int treeColumnAddWithColInfo1(List<String> names, List<Class<? extends RuntimeException>> exceptions) {
            return treeColumnAdd(names, exceptions.get(0), PersistentTableColumnModel.COLUMN_CLASS.NAME);
        }
    }

    private static final class PersistentTableColumnModel_1Test_1Test_1 extends DefaultTableColumnModel {
        private static final TableColumn tColumn = tableColumnAdd(PersistentTableColumnModel.TABLE_COLUMN_TYPE.TREE,
                PersistentTableColumnModel.COLUMN_CLASS.NAME, "T");
	}
}

