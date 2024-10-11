// ModifTableStockage_1Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains one unit test case for the {@link ModifTableStockage#colonneMail()} method.
*/
class ModifTableStockage_1Test {
boolean ajouterMess = false;
		boolean verifierMess = false;
        /**
         * Generates a test for {@link ModifTableStockage#colonneMail()}.
         */
        ModifTableStockage_1Test (){
            ajouterMess = true;
            verifierMess = true;
        }

        /**
         * Generates a test for {@link ModifTableStockage#colonneMail()} with a new message to be added a
         * table with a String column named "E-Mail" and the TableStockage with a column named "Name".
         * @throws Exception Exception is thrown if an error occurs.
         */
        @Test void test_colonneTableStockageString_eMail_no_nouvelle_nom_eMail() throws Exception{

            JOptionPane.showMessageDialog(null, "Initialisation du TableStockage qui initialise l'origination de l'E-Mail à 0","L'ajout du TableStockage", JOptionPane.INFORMATION_MESSAGE);
            TableStockage tableStockage = new TableStockage(new String[][]{new String[]{"E-Mail"}});
            ModifTableStockage modifTableStockage = new ModifTableStockage(new String[][]{new String[]{"Nom"}});

            assertNotNull(modifTableStockage.colonneMail());
            assertNotNull(tableStockage);
            assertFalse(ajouterMess);
            assertFalse(verifierMess);
             
            assertEquals(new String(tableStockage.getRows()[0][1]), "E-Mail");
            assertEquals(new String(tableStockage.getSelectedRows()[0][1]), "0");

        }
        /**
         * Generates a test for {@link ModifTableStockage#colonneMail()} with a new message to be added a
         * table with a String column named "E-Mail" and the TableStockage with a ColumnModel with a List of
         * columns named "Nom" and "Date".
         * @throws Exception Exception is thrown if an error occurs.
         */
        @Test void test_colonneTableStockageString_eMail_date_no_nouvelle_nom_eMail() throws Exception{

            JOptionPane.showMessageDialog(null, "Initialisation du TableStockage qui initialise l'origination de l'E-Mail à 07-01-2015,","Confirme le table Stockage par défaut", JOptionPane.INFORMATION_MESSAGE);
            TableStockage tableStockage = new TableStockage(new String[][]{new String[]{"E-Mail"}});
            ModifTableStockage modifTableStockage = new ModifTableStockage(new String[][]{new String[]{"Nom"}, new String[]{"Date","dummy"}});
            assertNotNull(modifTableStockage.colonneMail());
            assertNotNull(tableStockage);
            assertFalse(ajouterMess);
            assertFalse(verifierMess);
             
            assertEquals(new String(tableStockage.getRows()[0][1]), "E-Mail (1)");
            assertEquals(new String(tableStockage.getSelectedRows()[0][1]), "07-01-2015");

        }
    }


