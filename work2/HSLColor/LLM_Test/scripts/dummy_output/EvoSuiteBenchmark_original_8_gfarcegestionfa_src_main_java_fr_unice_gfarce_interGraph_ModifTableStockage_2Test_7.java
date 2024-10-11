// ModifTableStockage_2Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains one unit test case for the {@link ModifTableStockage#selectMail()} method.
*/
class ModifTableStockage_2Test {
		
	/**
	* Test for method selectMail()
	* Fichier d'entrees: ModifTableTest.java
	* Fichier de type: ModifTableStockage
	*/
	@Test
	public void testSelectMail_1() {
		
		JOptionPane.showMessageDialog(null, new ModifTableStockage(
				new int[] {1,2,3}), "Enregistre ",
				JOptionPane.INFORMATION_MESSAGE);
		assertEquals("Renderez de l'etat est incorrect", "Fichier d'entrees", JOptionPane.showInputDialog(null, "Renderez de l'etat", "Enregistre"));
		assertEquals(true, JOptionPane.showConfirmDialog(null, "Appuyer de confirmation", "Veuillez entrer le changement de lien", JOptionPane.YES_NO_OPTION).equals(true));
		assertEquals(1 + 2 + 3, ModifTableStockage.getNumEte());
	}
	
	/**
	* Test for method selectMail()
	* Fichier d'entrees: ModifTableTest_2b.java
	* Fichier de type: ModifTableStockage
	*/
	@Test
	public void testSelectEmailStockage_2() {
		
		JOptionPane.showMessageDialog(null, new ModifTableStockage(
                new int[] {1,2,3}), "Enregistre ",
                JOptionPane.INFORMATION_MESSAGE);
		assertEquals("Renderez de l'etat est incorrect", "Fichier d'entrees", JOptionPane.showInputDialog(null, "Renderez de l'etat", "Enregistre"));
		assertEquals(true, JOptionPane.showConfirmDialog(null, "Appuyer de confirmation", "Veuillez entrer le changement de lien", JOptionPane.YES_NO_OPTION).equals(true));
		assertEquals(1 + 2 + 3, ModifTableStockage.getNumEte());
	}
	
	/**
	* Test for method selectMail()
	* Fichier d'entrees: ModifTableTest_2c.java
	* Fichier de type: ModifTableStockage
	*/
	@Test
	public void testSelectStockage_2() {
		
		JOptionPane.showMessageDialog(null, new ModifTableStockage(
                new int[] {1,2,3}), "Enregistre ",
                JOptionPane.INFORMATION_MESSAGE);
		assertEquals("Renderez de l'etat est incorrect", "Fichier d'entrees", JOptionPane.showInputDialog(null, "Renderez de l'etat", "Enregistre"));
		assertEquals(true, JOptionPane.showConfirmDialog(null, "Appuyer de confirmation", "Veuillez entrer le changement de lien", JOptionPane.YES_NO_OPTION).equals(true));

		assertEquals(1 + 2 + 3, ModifTableStockage.getNumEte());
	}
	
	/**
	* Test for method selectMail()
	* Fichier d'entrees: ModifTableStockage_21.java
	* Fichier de type: ModifTableStockage
	*/
	@Test
	public void testSelectMailStockage_21() {
		
		JOptionPane.showMessageDialog(null, new ModifTableStockage(
                new int[] {1,2,3}), "Enregistre ",
                JOptionPane.INFORMATION_MESSAGE);
		assertEquals("Renderez de l'etat est incorrect", "Fichier d'entrees", JOptionPane.showInputDialog(null, "Renderez de l'etat", "Enregistre"));
		assertEquals(true, JOptionPane.showConfirmDialog(null, "Appuyer de confirmation", "Veuillez entrer le changement de lien", JOptionPane.YES_NO_OPTION).equals(true));
	}
	
}