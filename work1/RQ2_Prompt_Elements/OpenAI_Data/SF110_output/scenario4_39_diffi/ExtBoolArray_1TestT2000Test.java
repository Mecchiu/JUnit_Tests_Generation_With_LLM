// ExtBoolArray_1Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArray_1Test {

	/**
	* Test case for {@link ExtBoolArray#left()}
	* with the following input values:
	* <ul>
	* <li>len = 1</li>
	* </ul>
	* <p>
	* Expected return value: 1
	* </p>
	*/
	@Test
	public void testLeft_1() {
		ExtBoolArray eba = new ExtBoolArray(1);
		assertEquals(1, eba.left());
	}
	
	/**
	* Test case for {@link ExtBoolArray#left()}
	* with the following input values:
	* <ul>
	* <li>len = 2</li>
	* </ul>
	* <p>
	* Expected return value: 2
	* </p>
	*/
	@Test
	public void testLeft_2() {
		ExtBoolArray eba = new ExtBoolArray(2);
		assertEquals(2, eba.left());
	}
	
	/**
	* Test case for {@link ExtBoolArray#left()}
	* with the following input values:
	* <ul>
	* <li>len = 3</li>
	* </ul>
	* <p>
	* Expected return value: 3
	* </p>
	*/
	@Test
	public void testLeft_3() {
		ExtBoolArray eba = new ExtBoolArray(3);
		assertEquals(3, eba.left());
	}
	
	/**
	* Test case for {@link ExtBoolArray#left()}
	* with the following input values:
	* <ul>
	* <li>len = 4</li>
	* </ul>
	* <p>
	* Expected return value: 4
	* </p>
	*/
	@Test
	public void testLeft_4() {
		ExtBoolArray eba = new ExtBoolArray(4);
		assertEquals(4, eba.left());
	}
	
	/**
	* Test case for {@link ExtBoolArray#left()}
	* with the following input values:
	* <ul>
	* <li>len = 5</li>
	* </ul>
	* <p>
	* Expected return value: 5
	* </p>
	*/
	@Test
	public void testLeft_5() {
		ExtBoolArray eba = new ExtBoolArray(5);
		assertEquals(5, eba.left());
	}
	
	/**
	* Test case for {@link ExtBoolArray#left()}
	* with the following input values:
	* <ul>
	* <li>len = 6</li>
	* </ul>
	* <p>
	* Expected return value: 6
	* </p>
	*/
	@Test
	public void testLeft_6() {
		ExtBoolArray eba = new ExtBoolArray(6);
		assertEquals(6, eba.left());
	}
	
	/**
	* Test case for {@link ExtBoolArray#left()}
	* with the following input values:
	* <ul>
	* <li>len = 7</li>
	* </ul>
	* <p>
	* Expected return value: 7
	* </p>
	*/
	@Test
	public void testLeft_7() {
		ExtBoolArray eba = new ExtBoolArray(7);
		assertEquals(7, eba.left());
	}
	
	/**
	* Test case for {@link ExtBoolArray#left()}
	* with the following input values:
	* <ul>
	* <li>len = 8</li>
	* </ul>
	* <p>
	* Expected return value: 8
	* </p>
	*/
	@Test
	public void testLeft_8() {
		ExtBoolArray eba = new ExtBoolArray(8);
		assertEquals(8, eba.left());
	}
	
	/**
	* Test case for {@link ExtBoolArray#left()}
	* with the following input values:
	* <ul>
	* <li>len = 9</li>
	* </ul>
	* <p>
	* Expected return value: 9
	* </p>
	*/
	@Test
	public void testLeft_9() {
		ExtBoolArray eba = new ExtBoolArray(9);
		assertEquals(9, eba.left());
	}
	
	/**
	* Test case for {@link ExtBoolArray#left()}
	* with the following input values:
	* <ul>
	* <li>len = 10</li>
	* </ul>
	* <p>
	* Expected return value: 10
	* </p>
	*/
	@Test
	public void testLeft_10() {
		ExtBoolArray eba = new ExtBoolArray(10);
		assertEquals(10, eba.left());
	}
	
}

// ExtBoolArray_2Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#isFalse(int, int)} method.
*/
class ExtBoolArray_2Test {
		
	/**
	* Test case for {@link ExtBoolArray#isFalse(int, int)}
	* with the following input values:
	* <ul>
	* <li>a = 0</li>
	* <li>b = 0</li>
	* </ul>
	* <p>
	* Expected return value: true
	* </p>
	*/
	@Test
	public void testIsFalse_1() {
		ExtBoolArray eba = new ExtBoolArray(1);
		assertTrue(eba.isFalse(0, 0));
	}
	
	/**
	* Test case for {@link ExtBoolArray#isFalse(int, int)}
	* with the following input values:
	* <ul>
	* <li>a = 0</li>
	* <li>b = 1</li>
	* </ul>
	* <p>
	* Expected return value: true
	* </p>
	*/
	@Test
	public void testIsFalse_2() {
		ExtBoolArray eba = new ExtBoolArray(2);
		assertTrue(eba.isFalse(0, 1));
	}
	
	/**
	* Test case for {@link ExtBoolArray#isFalse(int, int)}
	* with the following input values:
	* <ul>
	* <li>a = 0</li>
	* <li>b = 2</li>
	* </ul>
	* <p>
	* Expected return value: true
	* </p>
	*/
	@Test
	public void testIsFalse_3() {
		ExtBoolArray eba = new ExtBoolArray(3);
		assertTrue(eba.isFalse(0, 2));
	}
	
	/**
	* Test case for {@link ExtBoolArray#isFalse(int, int)}
	* with the following input values:
	* <ul>
	* <li>a = 0</li>
	* <li>b = 3</li>
	* </ul>
	* <p>
	* Expected return value: true
	* </p>
	*/
	@Test
	public void testIsFalse_4() {
		ExtBoolArray eba = new ExtBoolArray(4);
		assertTrue(eba.isFalse(0, 3));
	}
	
	/**
	* Test case for {@