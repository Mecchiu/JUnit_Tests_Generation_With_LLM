// ExtBoolArrayTest.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#isFalse(int, int)} method.
*/
class ExtBoolArrayTest {

	/**
	 * Test case 1:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich False-Werte enthaelt.
	 */
	@Test
	void testIsFalse1() {
		ExtBoolArray array = new ExtBoolArray(10);
		assertTrue(array.isFalse(0, 9));
	}
	
	/**
	 * Test case 2:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich True-Werte enthaelt.
	 */
	@Test
	void testIsFalse2() {
		ExtBoolArray array = new ExtBoolArray(10);
		for (int i = 0; i < 10; i++) {
			array.werte[i] = true;
		}
		assertFalse(array.isFalse(0, 9));
	}
	
	/**
	 * Test case 3:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich True-Werte enthaelt.
	 */
	@Test
	void testIsFalse3() {
		ExtBoolArray array = new ExtBoolArray(10);
		for (int i = 0; i < 10; i++) {
			array.werte[i] = true;
		}
		assertFalse(array.isFalse(0, 9));
	}
	
	/**
	 * Test case 4:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich True-Werte enthaelt.
	 */
	@Test
	void testIsFalse4() {
		ExtBoolArray array = new ExtBoolArray(10);
		for (int i = 0; i < 10; i++) {
			array.werte[i] = true;
		}
		assertFalse(array.isFalse(0, 9));
	}
	
	/**
	 * Test case 5:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich True-Werte enthaelt.
	 */
	@Test
	void testIsFalse5() {
		ExtBoolArray array = new ExtBoolArray(10);
		for (int i = 0; i < 10; i++) {
			array.werte[i] = true;
		}
		assertFalse(array.isFalse(0, 9));
	}
	
	/**
	 * Test case 6:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich True-Werte enthaelt.
	 */
	@Test
	void testIsFalse6() {
		ExtBoolArray array = new ExtBoolArray(10);
		for (int i = 0; i < 10; i++) {
			array.werte[i] = true;
		}
		assertFalse(array.isFalse(0, 9));
	}
	
	/**
	 * Test case 7:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich True-Werte enthaelt.
	 */
	@Test
	void testIsFalse7() {
		ExtBoolArray array = new ExtBoolArray(10);
		for (int i = 0; i < 10; i++) {
			array.werte[i] = true;
		}
		assertFalse(array.isFalse(0, 9));
	}
	
	/**
	 * Test case 8:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich True-Werte enthaelt.
	 */
	@Test
	void testIsFalse8() {
		ExtBoolArray array = new ExtBoolArray(10);
		for (int i = 0; i < 10; i++) {
			array.werte[i] = true;
		}
		assertFalse(array.isFalse(0, 9));
	}
	
	/**
	 * Test case 9:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich True-Werte enthaelt.
	 */
	@Test
	void testIsFalse9() {
		ExtBoolArray array = new ExtBoolArray(10);
		for (int i = 0; i < 10; i++) {
			array.werte[i] = true;
		}
		assertFalse(array.isFalse(0, 9));
	}
	
	/**
	 * Test case 10:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich True-Werte enthaelt.
	 */
	@Test
	void testIsFalse10() {
		ExtBoolArray array = new ExtBoolArray(10);
		for (int i = 0; i < 10; i++) {
			array.werte[i] = true;
		}
		assertFalse(array.isFalse(0, 9));
	}
}

// ExtBoolArray.java
package de.beiri22.stringincrementor.helper;

/**
 * @author Rico
 */
public final class ExtBoolArray {

    /**
     * prueft, ob der Bereich mit den Indexen a bis b ausschließlich False-Werte
     * enthaelt.
     *
     * @param a Startindex
     * @param b Endindex
     * @return True - wenn alles False-Werte sind.
     */
    public boolean isFalse(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (werte[i]) {
                return false;
            }
        }
        return true;
    }
}

// ExtBoolArrayTest.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#isFalse(int, int)} method.
*/
class ExtBoolArrayTest {
		
	/**
	 * Test case 1:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich False-Werte enthaelt.
	 */
	@Test
	void testIsFalse1() {
		ExtBoolArray array = new ExtBoolArray(10);
		assertTrue(array.isFalse(0, 9));
	}
	
	/**
	 * Test case 2:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich True-Werte enthaelt.
	 */
	@Test
	void testIsFalse2() {
		ExtBoolArray array = new ExtBoolArray(10);
		for (int i = 0; i < 10; i++) {
			array.werte[i] = true;
		}
		assertFalse(array.isFalse(0, 9));
	}
	
	/**
	 * Test case 3:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich True-Werte enthaelt.
	 */
	@Test
	void testIsFalse3() {
		ExtBoolArray array = new ExtBoolArray(10);
		for (int i = 0; i < 10; i++) {
			array.werte[i] = true;
		}
		assertFalse(array.isFalse(0, 9));
	}
	
	/**
	 * Test case 4:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich True-Werte enthaelt.
	 */
	@Test
	void testIsFalse4() {
		ExtBoolArray array = new ExtBoolArray(10);
		for (int i = 0; i < 10; i++) {
			array.werte[i] = true;
		}
		assertFalse(array.isFalse(0, 9));
	}
	
	/**
	 * Test case 5:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich True-Werte enthaelt.
	 */
	@Test
	void testIsFalse5() {
		ExtBoolArray array = new ExtBoolArray(10);
		for (int i = 0; i < 10; i++) {
			array.werte[i] = true;
		}
		assertFalse(array.isFalse(0, 9));
	}
	
	/**
	 * Test case 6:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich True-Werte enthaelt.
	 */
	@Test
	void testIsFalse6() {
		ExtBoolArray array = new ExtBoolArray(10);
		for (int i = 0; i < 10; i++) {
			array.werte[i] = true;
		}
		assertFalse(array.isFalse(0, 9));
	}
	
	/**
	 * Test case 7:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich True-Werte enthaelt.
	 */
	@Test
	void testIsFalse7() {
		ExtBoolArray array = new ExtBoolArray(10);
		for (int i = 0; i < 10; i++) {
			array.werte[i] = true;
		}
		assertFalse(array.isFalse(0, 9));
	}
	
	/**
	 * Test case 8:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich True-Werte enthaelt.
	 */
	@Test
	void testIsFalse8() {
		ExtBoolArray array = new ExtBoolArray(10);
		for (int i = 0; i < 10; i++) {
			array.werte[i] = true;
		}
		assertFalse(array.isFalse(0, 9));
	}
	
	/**
	 * Test case 9:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich True-Werte enthaelt.
	 */
	@Test
	void testIsFalse9() {
		ExtBoolArray array = new ExtBoolArray(10);
		for (int i = 0; i < 10; i++) {
			array.werte[i] = true;
		}
		assertFalse(array.isFalse(0, 9));
	}
	
	/**
	 * Test case 10:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich True-Werte enthaelt.
	 */
	@Test
	void testIsFalse10() {
		ExtBoolArray array = new ExtBoolArray(10);
		for (int i = 0; i < 10; i++) {
			array.werte[i] = true;
		}
		assertFalse(array.isFalse(0, 9));
	}
}

// ExtBoolArray.java
package de.beiri22.stringincrementor.helper;

/**
 * @author Rico
 */
public final class ExtBoolArray {

    /**
     * prueft, ob der Bereich mit den Indexen a bis b ausschließlich False-Werte
     * enthaelt.
     *
     * @param a Startindex
     * @param b Endindex
     * @return True - wenn alles False-Werte sind.
     */
    public boolean isFalse(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (werte[i]) {
                return false;
            }
        }
        return true;
    }
}

// ExtBoolArrayTest.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#isFalse(int, int)} method.
*/
class ExtBoolArrayTest {
		
	/**
	 * Test case 1:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich False-Werte enthaelt.
	 */
	@Test
	void testIsFalse1() {
		ExtBoolArray array = new ExtBoolArray(10);
		assertTrue(array.isFalse(0, 9));
	}
	
	/**
	 * Test case 2:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich True-Werte enthaelt.
	 */
	@Test
	void testIsFalse2() {
		ExtBoolArray array = new ExtBoolArray(10);
		for (int i = 0; i < 10; i++) {
			array.werte[i] = true;
		}
		assertFalse(array.isFalse(0, 9));
	}
	
	/**
	 * Test case 3:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich True-Werte enthaelt.
	 */
	@Test
	void testIsFalse3() {
		ExtBoolArray array = new ExtBoolArray(10);
		for (int i = 0; i < 10; i++) {
			array.werte[i] = true;
		}
		assertFalse(array.isFalse(0, 9));
	}
	
	/**
	 * Test case 4:
	 * 
	 * Testet, ob die Methode isFalse() korrekt funktioniert, wenn der Bereich
	 * ausschließlich True-Werte enthaelt.
	 */
	@Test
	void testIsFalse4() {
		ExtBoolArray array = new ExtBoolArray(10);
		for (int i = 0; i < 10; i++) {
			array.werte[i] = true;
