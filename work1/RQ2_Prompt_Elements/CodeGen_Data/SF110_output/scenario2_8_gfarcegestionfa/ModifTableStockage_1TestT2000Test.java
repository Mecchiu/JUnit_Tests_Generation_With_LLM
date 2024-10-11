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
     * Constructor.
     */
	@Test
    public void modifTST() {
    	assertNotNull(ColonneMail());
    }
}

// ModifTableStockage.java
class ModifTableStockage {
    
    private String ts;
    
    /**
     * Constructor.
     */
	public ModifTableStockage(String ts) {
		this.ts = ts;
	}
	
	public String modifTST() {
		assertEquals("The table should contains an empty table", 0, ts.length());
		return ts;
	}
}

// ModifTableStockage_1Test.java
class ModifTableStockage_1Test {
	
	@Test
	public void modifTST() {
		
		TableStockage tableS = new ModifTableStockage(ts);
		assertNotNull(tableS);
		assertFalse(tableS.getLength() == 0);
	}

}
