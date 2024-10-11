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
		ts