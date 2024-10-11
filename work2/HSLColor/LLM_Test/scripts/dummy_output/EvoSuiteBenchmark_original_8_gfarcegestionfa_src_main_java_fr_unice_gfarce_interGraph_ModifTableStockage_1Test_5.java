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
		 * Test method for {@link java.util.Colour#ModifTableStockage.colonneMail()}.
		 */
    @Test
    public void testColonneMail() {
        // instance variable
        TableStockage origine = new ModifTableStockage.TableStockage();
        String[] colNames = {"Colonnee", "E-Mail"};        
        String[] vals = {"jm-1", "e3jmj01e"};
        
        TableStockage modified = new ModifTableStockage(origine, colNames, vals);
        
        Object[] result = modified.colonneMail();
        
        assertArrayEquals(colNames, result);
        assertArrayEquals(vals, result);

        // save modified
        original = origine;
        colNames = new String[]{"Colonnee", "E-Mail"};        
        vals = new String[]{"jm1", "e4jm01e"};
        modified = new ModifTableStockage(origine, colNames, vals);
        result = modified.colonneMail();
        
        assertArrayEquals(colNames, result);
        assertArrayEquals(vals, result);
    }
	
    /**
     * Instancier un objet de type {@link TableStockage}.
     */
    private static TableStockage original;

    /**
     * Constructor.
     */
    public ModifTableStockage_1Test() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return original.toString();
    }
	
    /**
     * Test method for {@link java.util.Colour#ModifTableStockage} in a method called from
     * {@link ModifTableStockage_1Test#testColonneMail()}. Here a table test is performed.
     */
	@Test
    public void testColonneMailFromClass() {
        assertNotNull(ModifTableStockage.colonneMail());
    }
}