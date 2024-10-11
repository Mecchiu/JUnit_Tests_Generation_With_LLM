// ExtBoolArray_1Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains one unit test case for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArray_1Test {

	//Test Method
   @Test
   void testThatLeft_Werten_Sucherung_Zu_Ergebnis_false() {
        ExtBoolArray werte = new ExtBoolArray(5);
        werte.setTrue(0, true);
        werte.setTrue(1, false);
        werte.setTrue(2, true);
        werte.setTrue(3, false);
        try {
			assertEquals(3, ExtBoolArray.left(werte));
		} catch (AssertionError e) {
			e.printStackTrace();
			assertTrue(false);
	    }
	    werte.setTrue(4, true);
    }
   @Test
   void testThatLeft_Werten_Sucherung_Zu_Ergebnis_true() {
        ExtBoolArray werte = new ExtBoolArray(5);
        werte.setTrue(0, true);
        werte.setTrue(1, true);
        werte.setTrue(2, false);
        werte.setTrue(3, true);
        werte.setTrue(4, true);
        try {
			assertEquals(3, ExtBoolArray.left(werte));
		} catch (AssertionError e) {
			e.printStackTrace();
			assertTrue(true);
	    }
	    werte.setTrue(5, true);
    }
}// ExtBoolArray_1Test.java