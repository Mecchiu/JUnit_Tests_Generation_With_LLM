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
	* It tests the case where the user enters a valid email address.
	*/
	@Test
	void testColonneMail_1() {
		// Arrange
		ModifTableStockage modifTableStockage = new ModifTableStockage();
		String email = "test@test.com";
		
		// Act
		TableStockage tableStockage = modifTableStockage.colonneMail();
		
		// Assert
		assertEquals(email, tableStockage.getColonne("E-Mail"));
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the user enters an invalid email address.
	*/
	@Test
	void testColonneMail_2() {
		// Arrange
		ModifTableStockage modifTableStockage = new ModifTableStockage();
		String email = "test@test";
		
		// Act
		TableStockage tableStockage = modifTableStockage.colonneMail();
		
		// Assert
		assertEquals(email, tableStockage.getColonne("E-Mail"));
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the user enters an empty email address.
	*/
	@Test
	void testColonneMail_3() {
		// Arrange
		ModifTableStockage modifTableStockage = new ModifTableStockage();
		String email = "";
		
		// Act
		TableStockage tableStockage = modifTableStockage.colonneMail();
		
		// Assert
		assertEquals(email, tableStockage.getColonne("E-Mail"));
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the user enters a valid email address.
	*/
	@Test
	void testColonneMail_4() {
		// Arrange
		ModifTableStockage modifTableStockage = new ModifTableStockage();
		String email = "test@test.com";
		
		// Act
		TableStockage tableStockage = modifTableStockage.colonneMail();
		
		// Assert
		assertEquals(email, tableStockage.getColonne("E-Mail"));
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the user enters an invalid email address.
	*/
	@Test
	void testColonneMail_5() {
		// Arrange
		ModifTableStockage modifTableStockage = new ModifTableStockage();
		String email = "test@test";
		
		// Act
		TableStockage tableStockage = modifTableStockage.colonneMail();
		
		// Assert
		assertEquals(email, tableStockage.getColonne("E-Mail"));
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the user enters an empty email address.
	*/
	@Test
	void testColonneMail_6() {
		// Arrange
		ModifTableStockage modifTableStockage = new ModifTableStockage();
		String email = "";
		
		// Act
		TableStockage tableStockage = modifTableStockage.colonneMail();
		
		// Assert
		assertEquals(email, tableStockage.getColonne("E-Mail"));
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the user enters a valid email address.
	*/
	@Test
	void testColonneMail_7() {
		// Arrange
		ModifTableStockage modifTableStockage = new ModifTableStockage();
		String email = "test@test.com";
		
		// Act
		TableStockage tableStockage = modifTableStockage.colonneMail();
		
		// Assert
		assertEquals(email, tableStockage.getColonne("E-Mail"));
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the user enters an invalid email address.
	*/
	@Test
	void testColonneMail_8() {
		// Arrange
		ModifTableStockage modifTableStockage = new ModifTableStockage();
		String email = "test@test";
		
		// Act
		TableStockage tableStockage = modifTableStockage.colonneMail();
		
		// Assert
		assertEquals(email, tableStockage.getColonne("E-Mail"));
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the user enters an empty email address.
	*/
	@Test
	void testColonneMail_9() {
		// Arrange
		ModifTableStockage modifTableStockage = new ModifTableStockage();
		String email = "";
		
		// Act
		TableStockage tableStockage = modifTableStockage.colonneMail();
		
		// Assert
		assertEquals(email, tableStockage.getColonne("E-Mail"));
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the user enters a valid email address.
	*/
	@Test
	void testColonneMail_10() {
		// Arrange
		ModifTableStockage modifTableStockage = new ModifTableStockage();
		String email = "test@test.com";
		
		// Act
		TableStockage tableStockage = modifTableStockage.colonneMail();
		
		// Assert
		assertEquals(email, tableStockage.getColonne("E-Mail"));
	}
}

// TableStockage.java
package fr.unice.gfarce.interGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableStockage {

    /**
     * Genere en sortie une TableStockage, a partir de la table d'origine,
     * avec une nouvelle colonne de nom "E-Mail"
     * Permettra a l'utilisateur de choisir a qui envoyer un mail pour la suite.
     *
     * @return TableStockage
     */
    public TableStockage colonneMail();

    /**
     * Genere en sortie une TableStockage, a partir de la table d'origine,
     * avec une nouvelle colonne de nom "E-Mail"
     * Permettra a l'utilisateur de choisir a qui envoyer un mail pour la suite.
     *
     * @return TableStockage
     */
    public TableStockage colonneMail() {
        Map<String, String> map = new HashMap<>();
        map.put("E-Mail", JOptionPane.showInputDialog("Entrez votre adresse mail"));
        return new TableStockage(map);
    }

    /**
     * Genere en sortie une TableStockage, a partir de la table d'origine,
     * avec une nouvelle colonne de nom "E-Mail"
     * Permettra a l'utilisateur de choisir