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
	 * Tests the call of {@link PersistentTableColumnModel#clear()} method.
	 */
	@Test
	public void test_clear() {
		List<TableColumn> columns = new ArrayList<>();
		DefaultTableColumnModel columnModel = new DefaultTableColumnModel( columns );
		PersistentTableColumnModel pcm = new PersistentTableColumnModel( columnModel );
		pcm.clear();
		assertEquals( table.getColumnModel().getColumnCount(), 0 );
		assertTrue( table.getColumnModel().isColumnGroupSet() );
		assertEquals( table.getColumnModel().getNumberOfGroupColumns(), 0 );
		assertEquals( table.getColumnModel().getNumberOfGroups(), 0 );
		assertTrue(! columnModel.isColumnGroupSet() );
	}


	/**
	 * Tests the call of {@link PersistentTableColumnModel#addColumn(TableColumn)} method.
	 */
	  @Test
	  public void test_addColumn() {
	     List<TableColumn> columns = new ArrayList<>();
	     DefaultTableColumnModel columnModel = new DefaultTableColumnModel( columns );
	     PersistentTableColumnModel pcm = new PersistentTableColumnModel( columnModel );

	     List<TableColumn> columns1 = new ArrayList<>(); 
	     table.addColumn(columns1);

	     List<TableColumn> columns2 = new ArrayList<>(); 
	     table.addColumn(columns2);

	     List<TableColumn> columns3 = new ArrayList<>(); 
	     table.addColumn(columns3);

	     List<TableColumn> columns4 = new ArrayList<>(); 
	     table.addColumn(columns4);

	     List<TableColumn> columns5 = new ArrayList<>(); 
	     table.addColumn(columns5);

	     table.getColumnModel().addColumn(columns3);
	     table.getColumnModel().addColumn( columns5);

	     List<TableColumn> columns6 = new ArrayList<>(); 
	     table.addColumn(columns6);

	     table.getColumnModel().addColumn(columns4);
	     table.getColumnModel().addColumn( columns6);

	     table.getColumnModel().addColumn(columns2);
	     table.getColumnModel().addColumn(columns2);

	     table.addColumn(columns1);
	     table.addColumn( columns1 );
	     table.addColumn( columns1 );

	     assertEquals(table.getColumnModel().getColumnCount(), 5 );
	     assertEquals(table.getColumnModel().getColumnCount(), 9 );

	     DefaultTableColumnModel columnModel2 = new DefaultTableColumnModel( columns );
	     table.addColumn( columnModel2 );

	     assertEquals(table.getColumnModel().getColumns(), columns2 );

	     assertEquals(table.getColumnModel().getNumberOfColumns(), 6 );
	     assertEquals( table.getColumnModel().getNumberOfGroups(), 0 );

	     assertEquals( table.getColumnModel().getColumnCount( 0 ), columns3.size() );
	     assertTrue(table.getColumnModel().isColumnGroupSet() );
	     assertEquals(table.getColumnModel().getNumberOfGroupColumns(), 3 );
	     assertEquals(table.getColumnModel().getNumberOfGroups(), 3 );

	     assertEquals( table.getColumnModel().getColumnCount( 1 ), columns4.size() );
	     assertTrue(table.getColumnModel().isColumnGroupSet() );
	     assertEquals( table.getColumnModel().getNumberOfGroupColumns(), 4 );
	     assertEquals( table.getColumnModel().getNumberOfGroups(), 4 );

	     assertEquals( table.getColumnModel().getColumnCount( 2 ), columns5.size() );
	     assertTrue(! table.getColumnModel().isColumnGroupSet() );
	     assertEquals( table.getColumnModel().getNumberOfGroupColumns(), 5 );
	     assertEquals( table.getColumnModel().getNumberOfGroups(), 5 );

	     assertEquals( table.getColumnModel().getColumnCount( 3 ), columns6.size() );
	    assertTrue( table.getColumnModel().isColumnGroupSet() );
	     assertEquals( table.getColumnModel().getNumberOfGroupColumns(), 5 );
	     assertEquals( table.getColumnModel().getNumberOfGroups(), 5 );
	  }

}