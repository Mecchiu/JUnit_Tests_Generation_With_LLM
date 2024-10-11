// ModifTableStockage.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;

public class ModifTableStockage {

    /**
     * Generates a TableStockage with a new column named "E-Mail" based on the original table.
     * Allows the user to choose who to send an email to for further communication.
     *
     * @return TableStockage
     */
    public TableStockage addEmailColumn();
}

// ModifTableStockage_1Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#addEmailColumn()} method.
*/
class ModifTableStockage_1Test {
		