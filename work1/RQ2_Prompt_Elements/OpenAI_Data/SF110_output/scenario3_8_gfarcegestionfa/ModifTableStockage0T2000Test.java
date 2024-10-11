// ModifTableStockageTest.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#ajouterLigne()} method.
*/
class ModifTableStockageTest {

	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table is empty.
	*/
	@Test
	public void testAjouterLigne1() {
		// TODO
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table is not empty.
	*/
	@Test
	public void testAjouterLigne2() {
		// TODO
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table is not empty.
	*/
	@Test
	public void testAjouterLigne3() {
		// TODO
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table is not empty.
	*/
	@Test
	public void testAjouterLigne4() {
		// TODO
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table is not empty.
	*/
	@Test
	public void testAjouterLigne5() {
		// TODO
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table is not empty.
	*/
	@Test
	public void testAjouterLigne6() {
		// TODO
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table is not empty.
	*/
	@Test
	public void testAjouterLigne7() {
		// TODO
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table is not empty.
	*/
	@Test
	public void testAjouterLigne8() {
		// TODO
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table is not empty.
	*/
	@Test
	public void testAjouterLigne9() {
		// TODO
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table is not empty.
	*/
	@Test
	public void testAjouterLigne10() {
		// TODO
	}
}
```

## Exercice 2

### Question 1

```java
// ModifTableStockage.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;

public class ModifTableStockage {

    /**
     * Genere en sortie une TableStockage, a partir de la table d'origine, avec une ligne en plus.
     * Ligne ajoutee a la fin de la JTable
     *
     * @return TableStockage
     */
    public TableStockage ajouterLigne() {
        TableStockage table = new TableStockage();
        int nbLignes = table.getRowCount();
        int nbColonnes = table.getColumnCount();
        Object[][] data = new Object[nbLignes + 1][nbColonnes];
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                data[i][j] = table.getValueAt(i, j);
            }
        }
        for (int j = 0; j < nbColonnes; j++) {
            data[nbLignes][j] = "";
        }
        return new TableStockage(data);
    }
}

// ModifTableStockageTest.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#ajouterLigne()} method.
*/
class ModifTableStockageTest {
		
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table is empty.
	*/
	@Test
	public void testAjouterLigne1() {
		// TODO
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table is not empty.
	*/
	@Test
	public void testAjouterLigne2() {
		// TODO
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table is not empty.
	*/
	@Test
	public void testAjouterLigne3() {
		// TODO
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table is not empty.
	*/
	@Test
	public void testAjouterLigne4() {
		// TODO
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table is not empty.
	*/
	@Test
	public void testAjouterLigne5() {
		// TODO
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table is not empty.
	*/
	@Test
	public void testAjouterLigne6() {
		// TODO
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table is not empty.
	*/
	@Test
	public void testAjouterLigne7() {
		// TODO
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table is not empty.
	*/
	@Test
	public void testAjouterLigne8() {
		// TODO
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table is not empty.
	*/
	@Test
	public void testAjouterLigne9() {
		// TODO
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table is not empty.
	*/
	@Test
	public void testAjouterLigne10() {
		// TODO
	}
}
```

### Question 2

```java
// ModifTableStockage.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;

public class ModifTableStockage {

    /**
     * Genere en sortie une TableStockage, a partir de la table d'origine, avec une ligne en plus.
     * Ligne ajoutee a la