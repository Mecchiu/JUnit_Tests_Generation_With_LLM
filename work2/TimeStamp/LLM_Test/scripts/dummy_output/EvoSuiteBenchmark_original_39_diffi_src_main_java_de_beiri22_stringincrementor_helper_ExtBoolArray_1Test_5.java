// ExtBoolArray_1Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains one unit test case for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArray_1Test {
		/**
		 * Testet den Konstruktor.
		 */
		@Test
		public void test01() {
				
				ExtBoolArray anzahl = new ExtBoolArray(2);
				// Die Anzahl der Füllen.
				assertEquals("Anzahl der Füllen der Füllen verhindert.", 2, anzahl.left());
				
				// Wie oft ein Array-Wert zu verhindert wird?
				assertFalse("Anzahl der Füllen der Füllen verhindert.", anzahl.isFalse(0, 1));
				
				// Alle Anzahl von 4-F.
				assertEquals("Anzahl der Array-Werte des Arrays: ", 4, anzahl.left());
				assertEquals("Wert anz. der Array-Werte: ", -1, anzahl.isTrue(0, 1, 4, 5));
}
}