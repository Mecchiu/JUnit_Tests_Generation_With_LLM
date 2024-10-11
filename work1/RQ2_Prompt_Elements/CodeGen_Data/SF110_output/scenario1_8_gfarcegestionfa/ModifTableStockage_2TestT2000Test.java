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
// ModifTableStockage.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;

public class ModifTableStockage {

    public TableStockage selectMail() {
        int j = 0;
        Boolean bool;
        while ((j < this.nbColonnes) && (!ts.getColumnName(j).equals("Envoyer E-Mail a:"))) {
            // renverra la position de la colonne E-Mail si elle existe
            j++;
        }
        if (j!= this.nbColonnes) {
            // la colonne E-Mail (de type Booleen) existe bien
            int newNbLignes = 0;
            for (int i = 0; i < nbLignes - 1; i++) {
                bool = (Boolean) ts.getValueAt(i, j);
                if (bool) {
                    newNbLignes++;
                }
            }
            TableStockage tableS = new TableStockage(newNbLignes + 1, nbColonnes);
            int k = 0;
            for (int ind = 0; ind < nbColonnes; ind++) {
                tableS.setColumnName(ind, ts.getColumnName(ind));
            }
            for (int row = 0; row < nbLignes - 1; row++) {
                bool = (Boolean) ts.getValueAt(row, j);
                if (bool) {
                    for (int column = 0; column < nbColonnes; column++) {
                        tableS.setValueAt(ts.getValueAt(row, column), k, column);
                        bool = false;
                    }
                    k++;
                }
            }
            return tableS;
        } else {
            JOptionPane.showMessageDialog(null, "Le mail sera envoye a toute la liste", "Information", JOptionPane.INFORMATION_MESSAGE);
            return ts;
        }
    }
}

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
		* Unit test case for {@link ModifTableStockage#selectMail()}.
		*/
		@Test
		public void unit_test_1() {
                selectMail(); // si le message est ok, alors le mail sera envoyé dans un table
                // Sinon
                assertEquals(ts.getValueAt(0, 0), Boolean.TRUE);
        }
		/**
		* Unit test case for {@link ModifTableStockage#selectMail()}.
		*/
		@Test
		public void unit_test_2() {
                assertEquals(ts.getValueAt(0, 0), Boolean.TRUE);
                selectMail();
                assertEquals(ts.getValueAt(0, 0), Boolean.FALSE);
		}
		/**
		* Unit test case for {@link ModifTableStockage#selectMail()}.
		*/
		@Test
		public void unit_test_3() {
                JOptionPane.showMessageDialog(null, "La liste du mail sera envoyée!");
                assertEquals(ts.getValueAt(0, 0), Boolean.FALSE);
                assertTrue(ts.getValueAt(0, 0).equals(""));
		}
}
