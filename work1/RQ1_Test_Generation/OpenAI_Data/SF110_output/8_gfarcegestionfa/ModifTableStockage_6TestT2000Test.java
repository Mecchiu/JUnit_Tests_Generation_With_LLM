// ModifTableStockage_6Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#colonneMail()} method.
*/
class ModifTableStockage_6Test {

	/**
	 * Test case for the {@link ModifTableStockage#colonneMail()} method.
	 * It tests the case where the table is empty.
	 */
	@Test
	void testColonneMail_1() {
		TableStockage ts = new TableStockage(1, 0);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.colonneMail();
		assertEquals(1, tableS.getRowCount());
		assertEquals(1, tableS.getColumnCount());
		assertEquals("Envoyer E-Mail a:", tableS.getColumnName(0));
		assertEquals(Boolean.class, tableS.getColumnClass(0));
		assertEquals(true, tableS.getValueAt(0, 0));
	}
	
	/**
	 * Test case for the {@link ModifTableStockage#colonneMail()} method.
	 * It tests the case where the table has one column.
	 */
	@Test
	void testColonneMail_2() {
		TableStockage ts = new TableStockage(1, 1);
		ts.setColumnName(0, "Nom");
		ts.setValueAt("Dupont", 0, 0);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.colonneMail();
		assertEquals(1, tableS.getRowCount());
		assertEquals(2, tableS.getColumnCount());
		assertEquals("Nom", tableS.getColumnName(0));
		assertEquals("Envoyer E-Mail a:", tableS.getColumnName(1));
		assertEquals(String.class, tableS.getColumnClass(0));
		assertEquals(Boolean.class, tableS.getColumnClass(1));
		assertEquals("Dupont", tableS.getValueAt(0, 0));
		assertEquals(true, tableS.getValueAt(0, 1));
	}
	
	/**
	 * Test case for the {@link ModifTableStockage#colonneMail()} method.
	 * It tests the case where the table has two columns.
	 */
	@Test
	void testColonneMail_3() {
		TableStockage ts = new TableStockage(1, 2);
		ts.setColumnName(0, "Nom");
		ts.setColumnName(1, "Prenom");
		ts.setValueAt("Dupont", 0, 0);
		ts.setValueAt("Jean", 0, 1);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.colonneMail();
		assertEquals(1, tableS.getRowCount());
		assertEquals(3, tableS.getColumnCount());
		assertEquals("Nom", tableS.getColumnName(0));
		assertEquals("Prenom", tableS.getColumnName(1));
		assertEquals("Envoyer E-Mail a:", tableS.getColumnName(2));
		assertEquals(String.class, tableS.getColumnClass(0));
		assertEquals(String.class, tableS.getColumnClass(1));
		assertEquals(Boolean.class, tableS.getColumnClass(2));
		assertEquals("Dupont", tableS.getValueAt(0, 0));
		assertEquals("Jean", tableS.getValueAt(0, 1));
		assertEquals(true, tableS.getValueAt(0, 2));
	}
	
	/**
	 * Test case for the {@link ModifTableStockage#colonneMail()} method.
	 * It tests the case where the table has three columns.
	 */
	@Test
	void testColonneMail_4() {
		TableStockage ts = new TableStockage(1, 3);
		ts.setColumnName(0, "Nom");
		ts.setColumnName(1, "Prenom");
		ts.setColumnName(2, "Age");
		ts.setValueAt("Dupont", 0, 0);
		ts.setValueAt("Jean", 0, 1);
		ts.setValueAt(new Integer(20), 0, 2);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.colonneMail();
		assertEquals(1, tableS.getRowCount());
		assertEquals(4, tableS.getColumnCount());
		assertEquals("Nom", tableS.getColumnName(0));
		assertEquals("Prenom", tableS.getColumnName(1));
		assertEquals("Age", tableS.getColumnName(2));
		assertEquals("Envoyer E-Mail a:", tableS.getColumnName(3));
		assertEquals(String.class, tableS.getColumnClass(0));
		assertEquals(String.class, tableS.getColumnClass(1));
		assertEquals(Integer.class, tableS.getColumnClass(2));
		assertEquals(Boolean.class, tableS.getColumnClass(3));
		assertEquals("Dupont", tableS.getValueAt(0, 0));
		assertEquals("Jean", tableS.getValueAt(0, 1));
		assertEquals(new Integer(20), tableS.getValueAt(0, 2));
		assertEquals(true, tableS.getValueAt(0, 3));
	}
	
	/**
	 * Test case for the {@link ModifTableStockage#colonneMail()} method.
	 * It tests the case where the table has four columns.
	 */
	@Test
	void testColonneMail_5() {
		TableStockage ts = new TableStockage(1, 4);
		ts.setColumnName(0, "Nom");
		ts.setColumnName(1, "Prenom");
		ts.setColumnName(2, "Age");
		ts.setColumnName(3, "Sexe");
		ts.setValueAt("Dupont", 0, 0);
		ts.setValueAt("Jean", 0, 1);
		ts.setValueAt(new Integer(20), 0, 2);
		ts.setValueAt("M", 0, 3);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.colonneMail();
		assertEquals(1, tableS.getRowCount());
		assertEquals(5, tableS.getColumnCount());
		assertEquals("Nom", tableS.getColumnName(0));
		assertEquals("Prenom", tableS.getColumnName(1));
		assertEquals("Age", tableS.getColumnName(2));
		assertEquals("Sexe", tableS.getColumnName(3));
		assertEquals("Envoyer E-Mail a:", tableS.getColumnName(4));
		assertEquals(String.class, tableS.getColumnClass(0));
		assertEquals(String.class, tableS.getColumnClass(1));
		assertEquals(Integer.class, tableS.getColumnClass(2));
		assertEquals(String.class, tableS.getColumnClass(3));
		assertEquals(Boolean.class, tableS.getColumnClass(4));
		assertEquals("Dupont", tableS.getValueAt(0, 0));
		assertEquals("Jean", tableS.getValueAt(0, 1));
		assertEquals(new Integer(20), tableS.getValueAt(0, 2));
		assertEquals("M", tableS.getValueAt(0, 3));
		assertEquals(true, tableS.getValueAt(0, 4));
	}
	
	/**
	 * Test case for the {@link ModifTableStockage#colonne