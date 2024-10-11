// ExtBoolArrayTest.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArrayTest {

	@Test
	void testLeft() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {true, true, true, true, true, true, true, true, true, true};
		assertEquals(0, array.left());
		array.werte = new boolean[] {false, false, false, false, false, false, false, false, false, false};
		assertEquals(10, array.left());
		array.werte = new boolean[] {true, false, true, false, true, false, true, false, true, false};
		assertEquals(5, array.left());
		array.werte = new boolean[] {false, true, false, true, false, true, false, true, false, true};
		assertEquals(5, array.left());
		array.werte = new boolean[] {true, true, false, false, true, true, false, false, true, true};
		assertEquals(4, array.left());
		array.werte = new boolean[] {false, false, true, true, false, false, true, true, false, false};
		assertEquals(4, array.left());
		array.werte = new boolean[] {true, false, false, true, true, false, false, true, true, false};
		assertEquals(4, array.left());
		array.werte = new boolean[] {false, true, true, false, false, true, true, false, false, true};
		assertEquals(4, array.left());
		array.werte = new boolean[] {true, true, true, false, false, false, true, true, true, false};
		assertEquals(3, array.left());
		array.werte = new boolean[] {false, false, false, true, true, true, false, false, false, true};
		assertEquals(3, array.left());
	}
}

// ExtBoolArray.java
package de.beiri22.stringincrementor.helper;

/**
 * @author Rico
 */
public final class ExtBoolArray {

    public int left() {
        int result = 0;
        for (int i = 0; i < werte.length; i++) {
            if (!werte[i]) {
                result++;
            }
        }
        return result;
    }
}

// ExtBoolArrayTest.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArrayTest {
		
	@Test
	void testLeft() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {true, true, true, true, true, true, true, true, true, true};
		assertEquals(0, array.left());
		array.werte = new boolean[] {false, false, false, false, false, false, false, false, false, false};
		assertEquals(10, array.left());
		array.werte = new boolean[] {true, false, true, false, true, false, true, false, true, false};
		assertEquals(5, array.left());
		array.werte = new boolean[] {false, true, false, true, false, true, false, true, false, true};
		assertEquals(5, array.left());
		array.werte = new boolean[] {true, true, false, false, true, true, false, false, true, true};
		assertEquals(4, array.left());
		array.werte = new boolean[] {false, false, true, true, false, false, true, true, false, false};
		assertEquals(4, array.left());
		array.werte = new boolean[] {true, false, false, true, true, false, false, true, true, false};
		assertEquals(4, array.left());
		array.werte = new boolean[] {false, true, true, false, false, true, true, false, false, true};
		assertEquals(4, array.left());
		array.werte = new boolean[] {true, true, true, false, false, false, true, true, true, false};
		assertEquals(3, array.left());
		array.werte = new boolean[] {false, false, false, true, true, true, false, false, false, true};
		assertEquals(3, array.left());
	}
}

// ExtBoolArray.java
package de.beiri22.stringincrementor.helper;

/**
 * @author Rico
 */
public final class ExtBoolArray {

    public int left() {
        int result = 0;
        for (int i = 0; i < werte.length; i++) {
            if (!werte[i]) {
                result++;
            }
        }
        return result;
    }
}

// ExtBoolArrayTest.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArrayTest {
		
	@Test
	void testLeft() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {true, true, true, true, true, true, true, true, true, true};
		assertEquals(0, array.left());
		array.werte = new boolean[] {false, false, false, false, false, false, false, false, false, false};
		assertEquals(10, array.left());
		array.werte = new boolean[] {true, false, true, false, true, false, true, false, true, false};
		assertEquals(5, array.left());
		array.werte = new boolean[] {false, true, false, true, false, true, false, true, false, true};
		assertEquals(5, array.left());
		array.werte = new boolean[] {true, true, false, false, true, true, false, false, true, true};
		assertEquals(4, array.left());
		array.werte = new boolean[] {false, false, true, true, false, false, true, true, false, false};
		assertEquals(4, array.left());
		array.werte = new boolean[] {true, false, false, true, true, false, false, true, true, false};
		assertEquals(4, array.left());
		array.werte = new boolean[] {false, true, true, false, false, true, true, false, false, true};
		assertEquals(4, array.left());
		array.werte = new boolean[] {true, true, true, false, false, false, true, true, true, false};
		assertEquals(3, array.left());
		array.werte = new boolean[] {false, false, false, true, true, true, false, false, false, true};
		assertEquals(3, array.left());
	}
}

// ExtBoolArray.java
package de.beiri22.stringincrementor.helper;

/**
 * @author Rico
 */
public final class ExtBoolArray {

    public int left() {
        int result = 0;
        for (int i = 0; i < werte.length; i++) {
            if (!werte[i]) {
                result++;
            }
        }
        return result;
    }
}

// ExtBoolArrayTest.java
