// ExtBoolArray_0Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#isFalse(int, int)} method.
*/
class ExtBoolArray_0Test {

	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * with the following input:
	 * <ul>
	 * <li>a = 0</li>
	 * <li>b = 0</li>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = true</li>
	 * </ul>
	 */
	@Test
	public void testCase0() {
		ExtBoolArray eba = new ExtBoolArray(1);
		boolean expected = true;
		boolean actual = eba.isFalse(0, 0);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * with the following input:
	 * <ul>
	 * <li>a = 0</li>
	 * <li>b = 1</li>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = true</li>
	 * </ul>
	 */
	@Test
	public void testCase1() {
		ExtBoolArray eba = new ExtBoolArray(2);
		boolean expected = true;
		boolean actual = eba.isFalse(0, 1);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * with the following input:
	 * <ul>
	 * <li>a = 0</li>
	 * <li>b = 2</li>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = true</li>
	 * </ul>
	 */
	@Test
	public void testCase2() {
		ExtBoolArray eba = new ExtBoolArray(3);
		boolean expected = true;
		boolean actual = eba.isFalse(0, 2);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * with the following input:
	 * <ul>
	 * <li>a = 0</li>
	 * <li>b = 3</li>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = true</li>
	 * </ul>
	 */
	@Test
	public void testCase3() {
		ExtBoolArray eba = new ExtBoolArray(4);
		boolean expected = true;
		boolean actual = eba.isFalse(0, 3);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * with the following input:
	 * <ul>
	 * <li>a = 0</li>
	 * <li>b = 4</li>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = true</li>
	 * </ul>
	 */
	@Test
	public void testCase4() {
		ExtBoolArray eba = new ExtBoolArray(5);
		boolean expected = true;
		boolean actual = eba.isFalse(0, 4);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * with the following input:
	 * <ul>
	 * <li>a = 0</li>
	 * <li>b = 5</li>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = true</li>
	 * </ul>
	 */
	@Test
	public void testCase5() {
		ExtBoolArray eba = new ExtBoolArray(6);
		boolean expected = true;
		boolean actual = eba.isFalse(0, 5);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * with the following input:
	 * <ul>
	 * <li>a = 0</li>
	 * <li>b = 6</li>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = true</li>
	 * </ul>
	 */
	@Test
	public void testCase6() {
		ExtBoolArray eba = new ExtBoolArray(7);
		boolean expected = true;
		boolean actual = eba.isFalse(0, 6);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * with the following input:
	 * <ul>
	 * <li>a = 0</li>
	 * <li>b = 7</li>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = true</li>
	 * </ul>
	 */
	@Test
	public void testCase7() {
		ExtBoolArray eba = new ExtBoolArray(8);
		boolean expected = true;
		boolean actual = eba.isFalse(0, 7);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * with the following input:
	 * <ul>
	 * <li>a = 0</li>
	 * <li>b = 8</li>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = true</li>
	 * </ul>
	 */
	@Test
	public void testCase8() {
		ExtBoolArray eba = new ExtBoolArray(9);
		boolean expected = true;
		boolean actual = eba.isFalse(0, 8);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * with the following input:
	 * <ul>
	 * <li>a = 0</li>
	 * <li>b = 9</li>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = true</li>
	 * </ul>
	 */
	@Test
	public void testCase9() {
		ExtBoolArray eba = new ExtBoolArray(10);
		boolean expected = true;
		boolean actual = eba.isFalse(0, 9);
		assertEquals(expected, actual);
	}
}

// ExtBoolArray_1Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#isFalse(int, int)} method.
*/
class ExtBoolArray_1Test {
		
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * with the following input:
	 * <ul>
	 * <li>a = 0</li>
	 * <li>b = 0</li>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = false</li>
	 * </ul>
	 */
	@Test
	public