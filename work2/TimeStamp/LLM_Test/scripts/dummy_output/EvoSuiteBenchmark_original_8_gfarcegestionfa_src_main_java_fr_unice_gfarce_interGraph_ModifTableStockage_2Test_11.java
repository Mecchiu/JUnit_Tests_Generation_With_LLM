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
	 * Test of select mail method, of class fr.unice.gfarce.interGraph.ModifTableStockage_2Test.
	 * @throws java.lang.Exception if any.
	 */
    @Test
    public void testChooseMail() throws Exception {
	System.out.println("   test choose mail");
	TableStockage tableStockage1 = new TableStockage();
	assertEquals("", "");
	tableStockage1.chooser("@MOSGILIER@", 5);
	System.out.println("\ttableStockage1.printTable(");
	assertEquals("", "");
	
	String message = null;
	try {
	    message = JOptionPane.showInputDialog(javax.swing.JOptionPane.QUESTION_MESSAGE);
	} catch (Exception e) {
	    e.printStackTrace();
	}
	System.out.println("\t\tmessage :");
	assertEquals("", "");
	assertEquals("", message);
	
	String text = "derefuse@MOSGILIER@MOSGILIOE@";
	tableStockage1.chooser("derefuse@MOSGILIER@MOSGILIOE@"+"\n", text);
	System.out.println("\t\tedfuse :");
	assertEquals("", "");
	assertEquals("derefuse@MOSGILIER@MOSGILIOE@", text);
	
	
	tableStockage1.chooser("@MOSGILIER@", 4);
	System.out.println("\ttableStockage1.printTable(");
	assertEquals("\n\t", "");
	System.out.println("");
    }
}