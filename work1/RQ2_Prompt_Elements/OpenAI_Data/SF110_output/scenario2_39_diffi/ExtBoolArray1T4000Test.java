// ExtBoolArrayTest.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArrayTest {

	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an empty array.
	 */
	@Test
	void testLeftEmpty() {
		ExtBoolArray array = new ExtBoolArray();
		assertEquals(0, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only one element.
	 */
	@Test
	void testLeftOneElement() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {false};
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only one element.
	 */
	@Test
	void testLeftOneElement2() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {true};
		assertEquals(0, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only two elements.
	 */
	@Test
	void testLeftTwoElements() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {false, false};
		assertEquals(2, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only two elements.
	 */
	@Test
	void testLeftTwoElements2() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {true, false};
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only two elements.
	 */
	@Test
	void testLeftTwoElements3() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {false, true};
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only two elements.
	 */
	@Test
	void testLeftTwoElements4() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {true, true};
		assertEquals(0, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {false, false, false};
		assertEquals(3, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements2() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {true, false, false};
		assertEquals(2, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements3() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {false, true, false};
		assertEquals(2, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements4() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {false, false, true};
		assertEquals(2, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements5() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {true, true, false};
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements6() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {true, false, true};
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements7() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {false, true, true};
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements8() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {true, true, true};
		assertEquals(0, array.left());
	}
}

// ExtStringArray.java
package de.beiri22.stringincrementor.helper;

/**
 * @author Rico
 */
public final class ExtStringArray {

    /**
     * Zahl die uebriggebliebenen False-Werte.
     *
     * @return Anzahl der False-Werte.
     */
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

// ExtStringArrayTest.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtStringArray}.
* It contains ten unit test cases for the {@link ExtStringArray#left()} method.
*/
class ExtStringArrayTest {
		
	/**
	 * Test case for {@link ExtStringArray#left()}.
	 * It tests the method with an empty array.
	 */
	@Test
	void testLeftEmpty() {
		ExtStringArray array = new ExtStringArray();
		assertEquals(0, array.left());
	}
	
	/**
	 * Test case for {@link ExtStringArray#left()}.
	 * It tests the method with an array containing only one element.
	 */
	@Test
	void testLeftOneElement() {
		ExtStringArray array = new ExtStringArray();
		array.werte = new boolean[] {false};
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtStringArray#left()}.
	 * It tests the method with an array containing only one element.
	 */
	@Test
	void testLeftOneElement2() {
		ExtStringArray array = new ExtStringArray();
		array.werte = new boolean[] {true};
		assertEquals(0, array.left());
	}
	
	/**
	 * Test case for {@link ExtStringArray#left()}.
	 * It tests the method with an array containing only two elements.
	 */
	@Test
	void testLeftTwoElements() {
		ExtStringArray array = new ExtStringArray();
		array.werte = new boolean[] {false, false};
		assertEquals(2, array.left());
	}
	
	/**
	 * Test case for {@link ExtStringArray#left()}.
	 * It tests the method with an array containing only two elements.
	 */
	@Test
	void testLeftTwoElements2() {
		ExtStringArray array = new ExtStringArray();
		array.werte = new boolean[] {true, false};
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtStringArray#left()}.
	 * It tests the method with an array containing only two elements.
	 */
	@Test
	void testLeftTwoElements3() {
		ExtStringArray array = new ExtStringArray();
		array.werte = new boolean[] {false, true};
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtStringArray#left()}.
	 * It tests the method with an array containing only two elements.
	 */
	@Test
	void testLeftTwoElements4() {
		ExtStringArray array = new ExtStringArray();
		array.werte = new boolean[] {true, true};
		assertEquals(0, array.left());
	}
	
	/**
	 * Test case for {@link ExtStringArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements() {
		ExtStringArray array = new ExtStringArray();
		array.werte = new boolean[] {false, false, false};
		assertEquals(3, array.left());
	}
	
	/**
	 * Test case for {@link ExtStringArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements2() {
		ExtStringArray array = new ExtStringArray();
		array.werte = new boolean[] {true, false, false};
		assertEquals(2, array.left());
	}
	
	/**
	 * Test case for {@link ExtStringArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements3() {
		ExtStringArray array = new ExtStringArray();
		array.werte = new boolean[] {false, true, false};
		assertEquals(2, array.left());
	}
	
	/**
	 * Test case for {@link ExtStringArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements4() {
		ExtStringArray array = new ExtStringArray();
		array.werte = new boolean[] {false, false, true};
		assertEquals(2, array.left());
	}
	
	/**
	 * Test case for {@link ExtStringArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements5() {
		ExtStringArray array = new ExtStringArray();
		array.werte = new boolean[] {true, true, false};
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtStringArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements6() {
		ExtStringArray array = new ExtStringArray();
		array.werte = new boolean[] {true, false, true};
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtStringArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements7() {
		ExtStringArray array = new ExtStringArray();
		array.werte = new boolean[] {false, true, true};
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtStringArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements8() {
		ExtStringArray array = new ExtStringArray();
		array.werte = new boolean[] {true, true, true};
		assertEquals(0, array.left());
	}
}

// ExtIntArray.java
package de.beiri22.stringincrementor.helper;

/**
 * @author Rico
 */
public final class ExtIntArray {

    /**
     * Zahl die uebriggebliebenen False-Werte.
     *
     * @return Anzahl der False-Werte.
     */
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

// ExtIntArrayTest.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtIntArray}.
* It contains ten unit test cases for the {@link ExtIntArray#left()} method.
*/
class ExtIntArrayTest {
		
	/**
	 * Test case for {@link ExtIntArray#left()}.
	 * It tests the method with an empty array.
	 */
	@Test
	void testLeftEmpty() {
		ExtIntArray array = new ExtIntArray();
		assertEquals(0, array.left());
	}
	
	/**
	 * Test case for {@link ExtIntArray#left()}.
	 * It tests the method with an array containing only one element.
	 */
	@Test
	void testLeftOneElement() {
		ExtIntArray array = new ExtIntArray();
		array.werte = new boolean[] {false};
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtIntArray#left()}.
	 * It tests the method with an array containing only one element.
	 */
	@Test
	void testLeftOneElement2() {
		ExtIntArray array = new ExtIntArray();
		array.werte = new boolean[] {true};
		assertEquals(0, array.left());
	}
	
	/**
	 * Test case for {@link ExtIntArray#left()}.
	 * It tests the method with an array containing only two elements.
	 */
	@Test
	void testLeftTwoElements() {
		ExtIntArray array = new ExtIntArray();
		array.werte = new boolean[] {false, false};
		assertEquals(2, array.left());
	}
	
	/**
	 * Test case for {@link ExtIntArray#left()}.
	 * It tests the method with an array containing only two elements.
	 */
	@Test
	void testLeftTwoElements2() {
		ExtIntArray array = new ExtIntArray();
		array.werte = new boolean[] {true, false};
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtIntArray#left()}.
	 * It tests the method with an array containing only two elements.