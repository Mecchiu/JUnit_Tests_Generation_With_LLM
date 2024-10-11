// ModifTableStockageTest.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#selectMail()} method.
*/
class ModifTableStockageTest {

	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* The test case is successful if the method returns a {@link TableStockage} object.
	*/
	@Test
	void testSelectMail() {
		TableStockage ts = new TableStockage(2, 2);
		ts.setColumnName(0, "Envoyer E-Mail a:");
		ts.setColumnName(1, "Nom");
		ts.setValueAt(true, 0, 0);
		ts.setValueAt("Dupont", 0, 1);
		ts.setValueAt(false, 1, 0);
		ts.setValueAt("Durand", 1, 1);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getValueAt(0, 0), true);
		assertEquals(ts2.getValueAt(0, 1), "Dupont");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* The test case is successful if the method returns a {@link TableStockage} object.
	*/
	@Test
	void testSelectMail2() {
		TableStockage ts = new TableStockage(2, 2);
		ts.setColumnName(0, "Envoyer E-Mail a:");
		ts.setColumnName(1, "Nom");
		ts.setValueAt(true, 0, 0);
		ts.setValueAt("Dupont", 0, 1);
		ts.setValueAt(false, 1, 0);
		ts.setValueAt("Durand", 1, 1);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getValueAt(0, 0), true);
		assertEquals(ts2.getValueAt(0, 1), "Dupont");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* The test case is successful if the method returns a {@link TableStockage} object.
	*/
	@Test
	void testSelectMail3() {
		TableStockage ts = new TableStockage(2, 2);
		ts.setColumnName(0, "Envoyer E-Mail a:");
		ts.setColumnName(1, "Nom");
		ts.setValueAt(true, 0, 0);
		ts.setValueAt("Dupont", 0, 1);
		ts.setValueAt(false, 1, 0);
		ts.setValueAt("Durand", 1, 1);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getValueAt(0, 0), true);
		assertEquals(ts2.getValueAt(0, 1), "Dupont");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* The test case is successful if the method returns a {@link TableStockage} object.
	*/
	@Test
	void testSelectMail4() {
		TableStockage ts = new TableStockage(2, 2);
		ts.setColumnName(0, "Envoyer E-Mail a:");
		ts.setColumnName(1, "Nom");
		ts.setValueAt(true, 0, 0);
		ts.setValueAt("Dupont", 0, 1);
		ts.setValueAt(false, 1, 0);
		ts.setValueAt("Durand", 1, 1);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getValueAt(0, 0), true);
		assertEquals(ts2.getValueAt(0, 1), "Dupont");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* The test case is successful if the method returns a {@link TableStockage} object.
	*/
	@Test
	void testSelectMail5() {
		TableStockage ts = new TableStockage(2, 2);
		ts.setColumnName(0, "Envoyer E-Mail a:");
		ts.setColumnName(1, "Nom");
		ts.setValueAt(true, 0, 0);
		ts.setValueAt("Dupont", 0, 1);
		ts.setValueAt(false, 1, 0);
		ts.setValueAt("Durand", 1, 1);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getValueAt(0, 0), true);
		assertEquals(ts2.getValueAt(0, 1), "Dupont");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* The test case is successful if the method returns a {@link TableStockage} object.
	*/
	@Test
	void testSelectMail6() {
		TableStockage ts = new TableStockage(2, 2);
		ts.setColumnName(0, "Envoyer E-Mail a:");
		ts.setColumnName(1, "Nom");
		ts.setValueAt(true, 0, 0);
		ts.setValueAt("Dupont", 0, 1);
		ts.setValueAt(false, 1, 0);
		ts.setValueAt("Durand", 1, 1);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getValueAt(0, 0), true);
		assertEquals(ts2.getValueAt(0, 1), "Dupont");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* The test case is successful if the method returns a {@link TableStockage} object.
	*/
	@Test
	void testSelectMail7() {
		TableStockage ts = new TableStockage(2, 2);
		ts.setColumnName(0, "Envoyer E-Mail a:");
		ts.setColumnName(1, "Nom");
		ts.setValueAt(true, 0, 0);
		ts.setValueAt("Dupont", 0, 1);
		ts.setValueAt(false, 1, 0);
		ts.setValueAt("Durand", 1, 1);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getValueAt(0, 0), true);
		assertEquals(ts2.getValueAt(0, 1), "Dupont");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* The test case is successful if the method returns a {@link TableStockage} object.
	*/
	@Test
	void testSelectMail8() {
		TableStockage ts = new TableStockage(2, 2);
		ts.setColumnName(0, "Envoyer E-Mail a:");
		ts.setColumnName(1, "Nom");
		ts.setValueAt(true, 0, 0);
		ts.setValueAt("Dupont", 0, 1);
		ts.setValueAt(false, 1, 0);
		ts.setValueAt("Durand", 1, 1);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getValueAt(0, 0), true);
		assertEquals(ts2.getValueAt(0, 1), "Dupont");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* The test case is successful if the method returns a {@link TableStockage} object.
	*/
	@Test
	void testSelectMail9() {
		TableStockage ts = new TableStockage(2, 2);
		ts.setColumnName(0, "Envoyer E-Mail a:");
		ts.setColumnName(1, "Nom");
		ts.setValueAt(true, 0, 0);
		ts.setValueAt("Dupont", 0, 1);
		ts.setValueAt(false, 1, 0);
		ts.setValueAt("Durand", 1, 1);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getValueAt(0, 0), true);
		assertEquals(ts2.getValueAt(0, 1), "Dupont");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* The test case is successful if the method returns a {@link TableStockage} object.
	*/
	@Test
	void testSelectMail10() {
		TableStockage ts = new TableStockage(2, 2);
		ts.setColumnName(0, "Envoyer E-Mail a:");
		ts.setColumnName(1, "Nom");
		ts.setValueAt(true, 0, 0);
		ts.setValueAt("Dupont", 0, 1);
		ts.setValueAt(false, 1, 0);
		ts.setValueAt("Durand", 1, 1);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getValueAt(0, 0), true);
		assertEquals(ts2.getValueAt(0, 1), "Dupont");
	}
}

// TableStockage.java
package fr.unice.gfarce.interGraph;

import javax.swing.table.AbstractTableModel;

public class TableStockage extends AbstractTableModel {

    private Object[][] data;
    private String[] columnNames;

    public TableStockage(int nbLignes, int nbColonnes) {
        data = new Object[nbLignes][nbColonnes];
        columnNames = new String[nbColonnes];
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    public boolean isCellEditable(int row, int col) {
        return true;
    }

    public void setValueAt(Object value, int row, int col) {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }

    public void setColumnName(int col, String name) {
        columnNames[col] = name;
    }
}

// TableStockageTest.java
package fr.unice.gfarce.interGraph;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TableStockage}.
* It contains ten unit test cases for the {@link TableStockage#getColumnCount()} method.
*/
class TableStockageTest {
		
	/**
	* Test case for the {@link TableStockage#getColumnCount()} method.
	* The test case is successful if the method returns an integer.
	*/
	@Test
	void testGetColumnCount() {
		TableStockage ts = new TableStockage(2, 2);
		ts.setColumnName(0, "Envoyer E-Mail a:");
		ts.setColumnName(1, "Nom");
		ts.setValueAt(true, 0, 0);
		ts.setValueAt("Dupont", 0, 1);
		ts.setValueAt(false, 1, 0);
		ts.setValueAt("Durand", 1, 1);
		assertEquals(ts.getColumnCount(), 2);
	}
	
	/**
	* Test case for the {@link TableStockage#getColumnCount()} method.
	* The test case is successful if the method returns an integer.
	*/
	@Test
	void testGetColumnCount2() {
		TableStockage ts = new TableStockage(2, 2);
		ts.setColumnName(0, "Envoyer E-Mail a:");
		ts.setColumnName(1, "Nom");
		ts.setValueAt(true, 0, 0);
		ts.setValueAt("Dupont", 0, 1);
		ts.setValueAt(false, 1, 0);
		ts.setValueAt("Durand", 1, 1);
		assertEquals(ts.getColumnCount(), 2);
	}
	
	/**
	* Test case for the {@link TableStockage#getColumnCount()} method.
	* The test case is successful if the method returns an integer.
	*/
	@Test
	void testGetColumnCount3() {
		TableStockage ts = new TableStockage(2, 2);
		ts.setColumnName(0, "Envoyer E-Mail a:");
		ts.setColumnName(1, "Nom");
		ts.setValueAt(true, 0, 0);
		ts.setValueAt("Dupont", 0, 1);
		ts.setValueAt(false, 1, 0);
		ts.setValueAt("Durand", 1, 1);
		assertEquals(ts.getColumnCount(), 2);
	}
	
	/**
	* Test case for the {@link TableStockage#getColumnCount()} method.
	* The test case is successful if the method returns an integer.
	*/
	@Test
	void testGetColumnCount4() {
		TableStockage ts = new TableStockage(2, 2);
		ts.setColumnName(0, "Envoyer E-Mail a:");
		ts.setColumnName(1, "Nom");
		ts.setValueAt(true, 0, 0);
		ts.setValueAt("Dupont", 0, 1);
		ts.setValueAt(false, 1, 0);
		ts.setValueAt("Durand", 1, 1);
		assertEquals(ts.getColumnCount(), 2);
	}
	
	/**
	* Test case for the {@link TableStockage#getColumnCount()} method.
	* The test case is successful if the method returns an integer.
	*/
	@Test
	void testGetColumnCount5() {
		TableStockage ts = new TableStockage(2, 2);
		ts.setColumnName(0, "Envoyer E-Mail a:");
		ts.setColumnName(1, "Nom");
		ts.setValueAt(true, 0, 0);
		ts.setValueAt("Dupont", 0, 1);
		ts.setValueAt(false, 1, 0);
		ts.setValueAt("Durand", 1, 1