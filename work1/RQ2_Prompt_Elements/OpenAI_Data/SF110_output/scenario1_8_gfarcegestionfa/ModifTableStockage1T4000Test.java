// ModifTableStockageTest.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#colonneMail()} method.
*/
class ModifTableStockageTest {

	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* This test case checks if the method returns a {@link TableStockage} object.
	*/
	@Test
	void testColonneMail() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertTrue(tableS instanceof TableStockage);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* This test case checks if the method returns a {@link TableStockage} object with the right number of columns.
	*/
	@Test
	void testColonneMail2() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(nbColonnes + 1, tableS.getColumnCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* This test case checks if the method returns a {@link TableStockage} object with the right number of rows.
	*/
	@Test
	void testColonneMail3() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(nbLignes, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* This test case checks if the method returns a {@link TableStockage} object with the right number of columns and rows.
	*/
	@Test
	void testColonneMail4() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(nbColonnes + 1, tableS.getColumnCount());
		assertEquals(nbLignes, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* This test case checks if the method returns a {@link TableStockage} object with the right number of columns and rows.
	*/
	@Test
	void testColonneMail5() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(nbColonnes + 1, tableS.getColumnCount());
		assertEquals(nbLignes, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* This test case checks if the method returns a {@link TableStockage} object with the right number of columns and rows.
	*/
	@Test
	void testColonneMail6() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(nbColonnes + 1, tableS.getColumnCount());
		assertEquals(nbLignes, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* This test case checks if the method returns a {@link TableStockage} object with the right number of columns and rows.
	*/
	@Test
	void testColonneMail7() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(nbColonnes + 1, tableS.getColumnCount());
		assertEquals(nbLignes, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* This test case checks if the method returns a {@link TableStockage} object with the right number of columns and rows.
	*/
	@Test
	void testColonneMail8() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(nbColonnes + 1, tableS.getColumnCount());
		assertEquals(nbLignes, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* This test case checks if the method returns a {@link TableStockage} object with the right number of columns and rows.
	*/
	@Test
	void testColonneMail9() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(nbColonnes + 1, tableS.getColumnCount());
		assertEquals(nbLignes, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* This test case checks if the method returns a {@link TableStockage} object with the right number of columns and rows.
	*/
	@Test
	void testColonneMail10() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(nbColonnes + 1, tableS.getColumnCount());
		assertEquals(nbLignes, tableS.getRowCount());
	}
}

// ModifTableStockage.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;

public class ModifTableStockage {

    public TableStockage colonneMail() {
        this.nbColonnes++;
        ModifTableStockage mt = new ModifTableStockage(ts);
        TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
        tableS = mt.ajouterColonne("Envoyer E-Mail a:", Boolean.class);
        for (int i = 0; i < nbLignes - 1; i++) {
            // on ajoute un checkbox (par defaut)
            tableS.setValueAt(new Boolean(true), i, nbColonnes - 1);
        }
        return tableS;
    }
}

// ModifTableStockageTest.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#colonneMail()} method.
*/
class ModifTableStockageTest {
		
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* This test case checks if the method returns a {@link TableStockage} object.
	*/
	@Test
	void testColonneMail() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertTrue(tableS instanceof TableStockage);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* This test case checks if the method returns a {@link TableStockage} object with the right number of columns.
	*/
	@Test
	void testColonneMail2() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(nbColonnes + 1, tableS.getColumnCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* This test case checks if the method returns a {@link TableStockage} object with the right number of rows.
	*/
	@Test
	void testColonneMail3() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(nbLignes, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* This test case checks if the method returns a {@link TableStockage} object with the right number of columns and rows.
	*/
	@Test
	void testColonneMail4() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(nbColonnes + 1, tableS.getColumnCount());
		assertEquals(nbLignes, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* This test case checks if the method returns a {@link TableStockage} object with the right number of columns and rows.
	*/
	@Test
	void testColonneMail5() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(nbColonnes + 1, tableS.getColumnCount());
		assertEquals(nbLignes, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* This test case checks if the method returns a {@link TableStockage} object with the right number of columns and rows.
	*/
	@Test
	void testColonneMail6() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(nbColonnes + 1, tableS.getColumnCount());
		assertEquals(nbLignes, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* This test case checks if the method returns a {@link TableStockage} object with the right number of columns and rows.
	*/
	@Test
	void testColonneMail7() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(nbColonnes + 1, tableS.getColumnCount());
		assertEquals(nbLignes, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* This test case checks if the method returns a {@link TableStockage} object with the right number of columns and rows.
	*/
	@Test
	void testColonneMail8() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(nbColonnes + 1, tableS.getColumnCount());
		assertEquals(nbLignes, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* This test case checks if the method returns a {@link TableStockage} object with the right number of columns and rows.
	*/
	@Test
	void testColonneMail9() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(nbColonnes + 1, tableS.getColumnCount());
		assertEquals(nbLignes, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* This test case checks if the method returns a {@link TableStockage} object with the right number of columns and rows.
	*/
	@Test
	void testColonneMail10() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(nbColonnes + 1, tableS.getColumnCount());
		assertEquals(nbLignes, tableS.getRowCount());
	}
}

// ModifTableStockage.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;

public class ModifTableStockage {

    public TableStockage colonneMail() {
        this.nbColonnes++;
        ModifTableStockage mt = new ModifTableStockage(ts);
        TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
        tableS = mt.ajouterColonne("Envoyer E-Mail a:", Boolean.class);
        for (int i = 0; i < nbLignes - 1; i++) {
            // on ajoute un checkbox (par defaut)
            tableS.setValueAt(new Boolean(true), i, nbColonnes - 1);
        }
        return tableS;
    }
}

// ModifTableStockageTest.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#colonneMail()} method.
*/
class ModifTableStockageTest {
		
	/**
	* Test case for the {@link ModifTableStockage#colonneMail