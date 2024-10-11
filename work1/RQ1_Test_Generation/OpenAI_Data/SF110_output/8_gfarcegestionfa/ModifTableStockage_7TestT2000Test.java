// ModifTableStockage_7Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#selectMail()} method.
*/
class ModifTableStockage_7Test {

	/**
	 * Test case for the {@link ModifTableStockage#selectMail()} method.
	 * It tests the case where the table contains a column named "Envoyer E-Mail a:"
	 * and where the user has selected some rows.
	 */
	@Test
	void testSelectMail_1() {
		TableStockage ts = new TableStockage(3, 3);
		ts.setColumnName(0, "Nom");
		ts.setColumnName(1, "Prenom");
		ts.setColumnName(2, "Envoyer E-Mail a:");
		ts.setValueAt("Dupont", 0, 0);
		ts.setValueAt("Jean", 0, 1);
		ts.setValueAt(new Boolean(true), 0, 2);
		ts.setValueAt("Durand", 1, 0);
		ts.setValueAt("Pierre", 1, 1);
		ts.setValueAt(new Boolean(false), 1, 2);
		ts.setValueAt("Martin", 2, 0);
		ts.setValueAt("Paul", 2, 1);
		ts.setValueAt(new Boolean(true), 2, 2);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.selectMail();
		assertEquals(2, tableS.getRowCount());
		assertEquals(3, tableS.getColumnCount());
		assertEquals("Nom", tableS.getColumnName(0));
		assertEquals("Prenom", tableS.getColumnName(1));
		assertEquals("Envoyer E-Mail a:", tableS.getColumnName(2));
		assertEquals("Dupont", tableS.getValueAt(0, 0));
		assertEquals("Jean", tableS.getValueAt(0, 1));
		assertEquals(new Boolean(true), tableS.getValueAt(0, 2));
		assertEquals("Martin", tableS.getValueAt(1, 0));
		assertEquals("Paul", tableS.getValueAt(1, 1));
		assertEquals(new Boolean(true), tableS.getValueAt(1, 2));
	}
	
	/**
	 * Test case for the {@link ModifTableStockage#selectMail()} method.
	 * It tests the case where the table contains a column named "Envoyer E-Mail a:"
	 * and where the user has not selected any row.
	 */
	@Test
	void testSelectMail_2() {
		TableStockage ts = new TableStockage(3, 3);
		ts.setColumnName(0, "Nom");
		ts.setColumnName(1, "Prenom");
		ts.setColumnName(2, "Envoyer E-Mail a:");
		ts.setValueAt("Dupont", 0, 0);
		ts.setValueAt("Jean", 0, 1);
		ts.setValueAt(new Boolean(false), 0, 2);
		ts.setValueAt("Durand", 1, 0);
		ts.setValueAt("Pierre", 1, 1);
		ts.setValueAt(new Boolean(false), 1, 2);
		ts.setValueAt("Martin", 2, 0);
		ts.setValueAt("Paul", 2, 1);
		ts.setValueAt(new Boolean(false), 2, 2);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.selectMail();
		assertEquals(0, tableS.getRowCount());
		assertEquals(3, tableS.getColumnCount());
		assertEquals("Nom", tableS.getColumnName(0));
		assertEquals("Prenom", tableS.getColumnName(1));
		assertEquals("Envoyer E-Mail a:", tableS.getColumnName(2));
	}
	
	/**
	 * Test case for the {@link ModifTableStockage#selectMail()} method.
	 * It tests the case where the table does not contain a column named "Envoyer E-Mail a:".
	 */
	@Test
	void testSelectMail_3() {
		TableStockage ts = new TableStockage(3, 3);
		ts.setColumnName(0, "Nom");
		ts.setColumnName(1, "Prenom");
		ts.setColumnName(2, "Age");
		ts.setValueAt("Dupont", 0, 0);
		ts.setValueAt("Jean", 0, 1);
		ts.setValueAt(new Integer(20), 0, 2);
		ts.setValueAt("Durand", 1, 0);
		ts.setValueAt("Pierre", 1, 1);
		ts.setValueAt(new Integer(30), 1, 2);
		ts.setValueAt("Martin", 2, 0);
		ts.setValueAt("Paul", 2, 1);
		ts.setValueAt(new Integer(40), 2, 2);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.selectMail();
		assertEquals(3, tableS.getRowCount());
		assertEquals(3, tableS.getColumnCount());
		assertEquals("Nom", tableS.getColumnName(0));
		assertEquals("Prenom", tableS.getColumnName(1));
		assertEquals("Age", tableS.getColumnName(2));
		assertEquals("Dupont", tableS.getValueAt(0, 0));
		assertEquals("Jean", tableS.getValueAt(0, 1));
		assertEquals(new Integer(20), tableS.getValueAt(0, 2));
		assertEquals("Durand", tableS.getValueAt(1, 0));
		assertEquals("Pierre", tableS.getValueAt(1, 1));
		assertEquals(new Integer(30), tableS.getValueAt(1, 2));
		assertEquals("Martin", tableS.getValueAt(2, 0));
		assertEquals("Paul", tableS.getValueAt(2, 1));
		assertEquals(new Integer(40), tableS.getValueAt(2, 2));
	}
	
	/**
	 * Test case for the {@link ModifTableStockage#selectMail()} method.
	 * It tests the case where the table contains a column named "Envoyer E-Mail a:"
	 * and where the user has selected some rows.
	 * The table contains a column named "Envoyer E-Mail a:"
	 * and where the user has selected some rows.
	 */
	@Test
	void testSelectMail_4() {
		TableStockage ts = new TableStockage(3, 3);
		ts.setColumnName(0, "Nom");
		ts.setColumnName(1, "Prenom");
		ts.setColumnName(2, "Envoyer E-Mail a:");
		ts.setValueAt("Dupont", 0, 0);
		ts.setValueAt("Jean", 0, 1);
		ts.setValueAt(new Boolean(true), 0, 2);
		ts.setValueAt("Durand", 1, 0);
		ts.setValueAt("Pierre", 1, 1);
		ts.setValueAt(new Boolean(false), 1, 2);
		ts.setValueAt("Martin", 2, 0);
		ts.setValueAt("Paul", 2, 1);
		ts.setValueAt(new Boolean(true), 2, 2);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.selectMail();
		assertEquals(2, tableS.getRowCount());
		assertEquals(3, tableS.getColumnCount());
		assertEquals("Nom", tableS.getColumnName(0));
		assertEquals("Prenom", tableS.