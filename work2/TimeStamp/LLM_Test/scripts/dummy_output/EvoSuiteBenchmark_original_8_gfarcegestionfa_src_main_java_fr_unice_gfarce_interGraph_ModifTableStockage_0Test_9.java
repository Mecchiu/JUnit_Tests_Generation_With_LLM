// ModifTableStockage_0Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains one unit test case for the {@link ModifTableStockage#ajouterLigne()} method.
*/
class ModifTableStockage_0Test {
		
    /**
     * Test of aajouterLigne method, of class fr.unice.gfarce.interGraph.ModifTableStockage.
     * We should accept an input of "table"
     */
    @Test
    public void testJOptionPane_String() {
        System.out.println("testJOptionPane_String");
        
        final ModifTableStockage instance = new ModifTableStockage();;
        
        // Check that we can convert a string to an instance.
        //
        assertNotNull(instance.ajouterLigne().convert(new ArrayList("table")));
    }
	
	@Test
	public void testJOptionPane_String_int() {
		
		final ModifTableStockage instance = new ModifTableStockage();;
		
		// Check that we can convert a string to an instance.
		//
		assertNotNull(instance.ajouterLigne().convert(new int[]{2}));
	}
}