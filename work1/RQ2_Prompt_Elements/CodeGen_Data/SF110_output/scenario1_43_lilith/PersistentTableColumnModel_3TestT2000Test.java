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

    public int getColumnIndex(Object identifier, boolean onlyVisible) {
        if (identifier == null) {
            throw new IllegalArgumentException("Identifier is null");
        }
        List<TableColumn> columns = (onlyVisible? tableColumns : allTableColumns);
        int noColumns = columns.size();
        TableColumn column;
        for (int columnIndex = 0; columnIndex < noColumns; ++columnIndex) {
            column = columns.get(columnIndex);
            if (identifier.equals(column.getIdentifier())) {
                return columnIndex;
            }
        }
        throw new IllegalArgumentException("Identifier not found");
    }
}

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
		
	@Test
	void indexWithAllColumns() {
	
		TestCase[] testCases = new TestCase[]{
			
				new TestCase(Integer.class, PersistentTableColumnModel_3Test.allTestCases[1][0],true),
				new TestCase(Integer.class, PersistentTableColumnModel_3Test.allTestCases[2][0],false),
				new TestCase(String.class, PersistentTableColumnModel_3Test.allTestCases[3][0],true),
				new TestCase(Integer.class, PersistentTableColumnModel_3Test.allTestCases[4][0],true),
				new TestCase(Integer.class, PersistentTableColumnModel_3Test.allTestCases[5][0],true),
				new TestCase(String.class, PersistentTableColumnModel_3Test.allTestCases[6][0],false),
				new TestCase(String.class, PersistentTableColumnModel_3Test.allTestCases[7][0],true),
				new TestCase(Integer.class, PersistentTableColumnModel_3Test.allTestCases[8][0],true)};
	
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		
	}
			
	@Test
	void index() {
	
		ArrayList<Integer> persistentTestCases = new ArrayList<Integer>(allTestCases.length);
		boolean found = false;
		for (Iterator<TestCases[]> it = allTestCases.iterator(); it.hasNext(); ) {
			
			TestCases[] test = it.next();
			Object columnIdentifier = test[0].getIdentifier();
			int persistentColumn = getColumnIndex(columnIdentifier, test[1].isVisible());
			if (found == false && persistentColumn == persistentTestCases.size()) {
				persistentTestCases.add(test[0].getIndex());
			}
			found = persistentColumn!= persistentTestCases.size();
		}
		assertTrue("ArrayList<Integer> was not found", found);
		
	}
	
	
	static class TestCases {
	
		TestCases(Object identifier, int persisted, boolean visible) {
			
			this.identifier = identifier;
			this.persisted = persisted;
			this.visible = visible;
			
		}
		
		int getIdentifier() {
			return persisted;
		}
		
		boolean isVisible() {
			return visible;
		}
		
	}
	
	static final TestCases allTestCases[] = new TestCases[] {
		new TestCases(Integer.class, false, true),
		new TestCases(String.class, true, true),
		new TestCases(String.class, true, false),
		new TestCases(String.class, false, true),
		new TestCases(Integer.class, true, true)};

}