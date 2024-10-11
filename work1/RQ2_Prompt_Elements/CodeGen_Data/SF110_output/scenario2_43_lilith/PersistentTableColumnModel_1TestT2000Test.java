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

    /**
     * Returns the total number of columns in this model.
     *
     * @param onlyVisible if set only visible columns will be counted
     * @return the number of columns in the <code>tableColumns</code> array
     * @see #getColumns
     */
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
		 * Performs a test case to establish an equality check between a list returned
		 * by a {@link PersistentTableColumnModel}, and an empty list.
		 * 
		 * @throws AssertionError Thrown if an attribute of a list does not return equal
		 *     to that of NO_LIST
		 */
		@Test
		void getsReturnNullListForEmptyListOfTableColumns() throws AssertionError {

				PersistentTableColumnModel model = new PersistentTableColumnModel(new List<TableColumn<?>>());

				assertFalse(model.equals(new List<TableColumn<?>>()));

				assertEquals(model.getColumnCount(true), 0);
				assertEquals(model.getColumnCount(), 0);
			}

	}



// PersistentTableColumnModel.java

//PersistentTableExtension_1Test.java
//        Extension of PersistentTable.  extends TableExtension and
//         has a getColumnCount method.
//        Implements TableExtension Interface
//
//        Package to test
//
package de.huxhorn.lilith.swing.table.model;
//
//      This class is based on code and ideas from Stephen Kelvin (mail to StephenKelvin.de) and Thomas Darimont.
//  Package to test
//  Implements TableExtension Interface
class PersistentTableExtension_1Test extends TableExtension {

    // Initialize method

	@Override
	public List<List<TableColumn<?>>> getListOfTableColumns() {
		return new ArrayList<List<TableColumn<?>>>();
	}

    // Method to get a column

    @Override
	public TableColumn<?> getColumn(final int i) {
		return (TableColumn<?>)super.getColumn(i);
	}

    @Override
	public int getColumnCount() {
		return (new ArrayList<TableColumn<?>>()).size(); // TableExtension.  returns a count.
	}
}