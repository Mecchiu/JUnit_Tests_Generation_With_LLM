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
		array.add(false);
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only one element.
	 */
	@Test
	void testLeftOneElement2() {
		ExtBoolArray array = new ExtBoolArray();
		array.add(true);
		assertEquals(0, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only one element.
	 */
	@Test
	void testLeftOneElement3() {
		ExtBoolArray array = new ExtBoolArray();
		array.add(false);
		array.set(0, true);
		assertEquals(0, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only one element.
	 */
	@Test
	void testLeftOneElement4() {
		ExtBoolArray array = new ExtBoolArray();
		array.add(true);
		array.set(0, false);
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only one element.
	 */
	@Test
	void testLeftOneElement5() {
		ExtBoolArray array = new ExtBoolArray();
		array.add(false);
		array.set(0, false);
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only one element.
	 */
	@Test
	void testLeftOneElement6() {
		ExtBoolArray array = new ExtBoolArray();
		array.add(true);
		array.set(0, true);
		assertEquals(0, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only one element.
	 */
	@Test
	void testLeftOneElement7() {
		ExtBoolArray array = new ExtBoolArray();
		array.add(false);
		array.add(true);
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only one element.
	 */
	@Test
	void testLeftOneElement8() {
		ExtBoolArray array = new ExtBoolArray();
		array.add(true);
		array.add(false);
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only one element.
	 */
	@Test
	void testLeftOneElement9() {
		ExtBoolArray array = new ExtBoolArray();
		array.add(false);
		array.add(false);
		assertEquals(2, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only one element.
	 */
	@Test
	void testLeftOneElement10() {
		ExtBoolArray array = new ExtBoolArray();
		array.add(true);
		array.add(true);
		assertEquals(0, array.left());
	}
}

// ExtBoolArray.java
package de.beiri22.stringincrementor.helper;

/**
 * @author Rico
 */
public final class ExtBoolArray {

    /**
     * Zahl die uebriggebliebenen False-Werte.
     *
     * @return Anzahl der False-Werte.
     */
    public int left() {
        int left = 0;
        for (boolean b : array) {
            if (!b) {
                left++;
            }
        }
        return left;
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
		array.add(false);
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only one element.
	 */
	@Test
	void testLeftOneElement2() {
		ExtBoolArray array = new ExtBoolArray();
		array.add(true);
		assertEquals(0, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only one element.
	 */
	@Test
	void testLeftOneElement3() {
		ExtBoolArray array = new ExtBoolArray();
		array.add(false);
		array.set(0, true);
		assertEquals(0, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only one element.
	 */
	@Test
	void testLeftOneElement4() {
		ExtBoolArray array = new ExtBoolArray();
		array.add(true);
		array.set(0, false);
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only one element.
	 */
	@Test
	void testLeftOneElement5() {
		ExtBoolArray array = new ExtBoolArray();
		array.add(false);
		array.set(0, false);
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only one element.
	 */
	@Test
	void testLeftOneElement6() {
		ExtBoolArray array = new ExtBoolArray();