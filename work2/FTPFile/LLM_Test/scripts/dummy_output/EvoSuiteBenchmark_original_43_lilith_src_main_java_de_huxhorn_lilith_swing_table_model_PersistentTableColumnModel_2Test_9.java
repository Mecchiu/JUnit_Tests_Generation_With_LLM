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
     * This testcase exercises the method <code>getColumns(true)</code>.
     *<P>
     * The test runs <i>with</i> and <i>without</i> a table: a {@link DefaultTableModel} containing <code>three</code> columns.
     *
     */
	@Test
	public void testGetColumnsWhenOnlyVisibleIssetToTrue(){

    if(!(false) && true){
        fail("The test should not run when only visible is set to true");
    }

    DefaultTableColumnModel model = new DefaultTableColumnModel();
      /* Get a list of all the columns in the model with an enumeration containing all invisible columns.
      for(Iterator<TableColumn> it = model.getColumns(true); it.hasNext();)
      {
      it.next());
      {
      System.out.println("invisibleColumn");
    System.out.println(model.getColumn(it.next().getIdentifier()));
    }
      }*/
     
  assertContainsOnly(model, get("Three"), get("Four"), get("Five"));
}
}