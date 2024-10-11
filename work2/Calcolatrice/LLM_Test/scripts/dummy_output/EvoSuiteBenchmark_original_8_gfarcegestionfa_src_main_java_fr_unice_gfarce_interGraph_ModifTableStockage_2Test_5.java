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
		public final String test1 = ModifText.TEXT_TABLE_STOCKAGE_INITIATION;
		public final String test2 = ModifText.TEXT_NEXT_MESSAGE_INPUT;
	
		// MODIF TableStockage_2.clazz InitTableStockage_2, test01+test2
    /**
     * G&eacute;n&egrave;re en sortie la TableStockage a&ucirc;tiver des lignes d'origine &eacute;s si elles contenent un e-mail.
     */
    @Test
    public void test01() {
        JOptionPane.showInputDialog(null, "ModifTableStockage", test1 + test2);
        assertEquals(test1+test2, JOptionPane.showInputDialog(null, "Entrez votre commande "+test1+test2).trim());
    }

    // MODIF TableStockage_2.clazz InitTableStockage_2, test02+test2
    /**
     * G&eacute;n&egrave;re en sortie le TableStockage a&ucirc;tiver des lignes d'origine.
     */
    @Test
    public void test02() {
        assertEquals("" + test1 + test2, JOptionPane
           .showInputDialog(null, "Entrez votre commande "+test1+test2));
    }
}