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

	
    /**
     * Test of ajoute le colonne en argument de jTableStockage.
     */
    @Test
    public void test_colonneMail() {
		System.out.println("test_colonneMail");
		TableStockageTable tableStockage = getTableStockage_1_1("Envoyer e-Mail a:", "Maile en valeur");
        JOptionPane.showMessageDialog(null,tableStockage,"Test du mode de colonne");
        assertNotNull(tableStockage);
    }

    /**
     * Retourne le table Stockage modifié.
     */
    static TableStockageTable getTableStockage_1_1(String ligne, String mail) {
        TableStockageTable tableStockage = new TableStockageTable(5, 2);
        for (int i = 0; i < 5; i++) {
            checkBox1(tableStockage.getRows()[i], i,ligne, mail);
        }
        checkBox2(tableStockage.getRows()[4], 4, ligne, mail);
        return tableStockage;
    }


    /**
     * Test of checkBox1.
     */
    @Test
    public void test_checkBox1() {
        System.out.println("Colonne 1 checkBox1");
        checkBox1(tableStockage.getRows()[4], tableStockage.getRows()[4], "maile", (String)null);
    }

    /**
     * Test of checkBox2.
     */
    @Test
    public void test_checkBox2() {
        System.out.println("Colonne 2 checkBox2");
        checkBox2(tableStockage.getRows()[6], 4, "maile", (String)null);
    }

    /**
     * Test of checkBox3.
     */
    @Test
    public void test_checkBox3() {
        System.out.println("Colonne 3 checkBox3");
        checkBox3(tableStockage.getRows()[7], 4, (String)null);
    }

    /**
     * Fait ce checbox4 ci-dessous.
     */
    @Test
    public void test_checkBox4() {
        System.out.println("Colonne 4 checkBox4");
        checkBox4(tableStockage.getRows()[8], 4, (String)null);
    }

    /**
     * Test of checkBox5.
     */
    @Test
    public void test_checkBox5() {
        System.out.println("Colonne 5 checkBox5");
        checkBox5(tableStockage.getRows()[9], 4, "maile", (String)null);
    }

    /**
     * Fait ce checbox6 ci-dessous.
     */
    @Test
    public void test_checkBox6() {
        System.out.println("Colonne 6 checkBox6");
        checkBox6(tableStockage.getRows()[10], 4, (String)null);
    }

    /**
     * Fait ce checbox7 ci-dessous.
     */
    @Test
    public void test_checkBox7() {
        System.out.println("Colonne 7 checkBox7");
        checkBox7(tableStockage.getRows()[11], 4, (String)null);
    }

    /**
     * Test of checkBox8.
     */
    @Test
    public void test_checkBox8() {
        System.out.println("Colonne 8 checkBox8");
        checkBox8(tableStockage.getRows()[12], 4, (String)null);
    }

    /**
     * Fait ce checbox9 ci-dessous.
     */
    @Test
    public void test_checkBox9() {
        System.out.println("Colonne 9 checkBox9");
        checkBox9(tableStockage.getRows()[13], 4, (String)null);
    }

    /**
     * Fait ce checkbox10 ci-dessous.
     */
    @Test
    public void test_checkBox10() {
        System.out.println("Colonne 10 checkBox10");
        checkBox10(tableStockage.getRows()[14], 4, (String)null);
    }
}