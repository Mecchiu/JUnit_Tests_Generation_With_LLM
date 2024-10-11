// JCLO_0Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#getValue(String)} method.
*/
class JCLO_0Test {

	/**
	* Test case for {@link JCLO#getValue(String)}
	*
	* @see JCLO#getValue(String)
	*/
	@Test
	void testGetValue_0() {
		JCLO jclo = new JCLO(new JCLO_0Test_0(), null);
		jclo.parse(new String[] {});
		assertEquals(0, jclo.getInt("int"));
		assertEquals(0, jclo.getInt("intArray"));
		assertEquals(0, jclo.getInt("intArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArrayArray"));
	}
	
	/**
	* Test case for {@link JCLO#getValue(String)}
	*
	* @see JCLO#getValue(String)
	*/
	@Test
	void testGetValue_1() {
		JCLO jclo = new JCLO(new JCLO_0Test_1(), null);
		jclo.parse(new String[] {});
		assertEquals(0, jclo.getInt("int"));
		assertEquals(0, jclo.getInt("intArray"));
		assertEquals(0, jclo.getInt("intArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArrayArray"));
	}
	
	/**
	* Test case for {@link JCLO#getValue(String)}
	*
	* @see JCLO#getValue(String)
	*/
	@Test
	void testGetValue_2() {
		JCLO jclo = new JCLO(new JCLO_0Test_2(), null);
		jclo.parse(new String[] {});
		assertEquals(0, jclo.getInt("int"));
		assertEquals(0, jclo.getInt("intArray"));
		assertEquals(0, jclo.getInt("intArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArrayArray"));
	}
	
	/**
	* Test case for {@link JCLO#getValue(String)}
	*
	* @see JCLO#getValue(String)
	*/
	@Test
	void testGetValue_3() {
		JCLO jclo = new JCLO(new JCLO_0Test_3(), null);
		jclo.parse(new String[] {});
		assertEquals(0, jclo.getInt("int"));
		assertEquals(0, jclo.getInt("intArray"));
		assertEquals(0, jclo.getInt("intArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArrayArray"));
	}
	
	/**
	* Test case for {@link JCLO#getValue(String)}
	*
	* @see JCLO#getValue(String)
	*/
	@Test
	void testGetValue_4() {
		JCLO jclo = new JCLO(new JCLO_0Test_4(), null);
		jclo.parse(new String[] {});
		assertEquals(0, jclo.getInt("int"));
		assertEquals(0, jclo.getInt("intArray"));
		assertEquals(0, jclo.getInt("intArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArrayArray"));
	}
	
	/**
	* Test case for {@link JCLO#getValue(String)}
	*
	* @see JCLO#getValue(String)
	*/
	@Test
	void testGetValue_5() {
		JCLO jclo = new JCLO(new JCLO_0Test_5(), null);
		jclo.parse(new String[] {});
		assertEquals(0, jclo.getInt("int"));
		assertEquals(0, jclo.getInt("intArray"));
		assertEquals(0, jclo.getInt("intArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArrayArray"));
	}
	
	/**
	* Test case for {@link JCLO#getValue(String)}
	*
	* @see JCLO#getValue(String)
	*/
	@Test
	void testGetValue_6() {
		JCLO jclo = new JCLO(new JCLO_0Test_6(), null);
		jclo.parse(new String[] {});
		assertEquals(0, jclo.getInt("int"));
		assertEquals(0, jclo.getInt("intArray"));
		assertEquals(0, jclo.getInt("intArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArrayArray"));
	}
	
	/**
	* Test case for {@link JCLO#getValue(String)}
	*
	* @see JCLO#getValue(String)
	*/
	@Test
	void testGetValue_7() {
		JCLO jclo = new JCLO(new JCLO_0Test_7(), null);
		jclo.parse(new String[] {});
		assertEquals(0, jclo.getInt("int"));
		assertEquals(0, jclo.getInt("intArray"));
		assertEquals(0, jclo.getInt("intArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArrayArray"));
	}
	
	/**
	* Test case for {@link JCLO#getValue(String)}
	*
	* @see JCLO#getValue(String)
	*/
	@Test
	void testGetValue_8() {
		JCLO jclo = new JCLO(new JCLO_0Test_8(), null);
		jclo.parse(new String[] {});
		assertEquals(0, jclo.getInt("int"));
		assertEquals(0, jclo.getInt("intArray"));
		assertEquals(0, jclo.getInt("intArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArrayArray"));
	}
	
	/**
	* Test case for {@link JCLO#getValue(String)}
	*
	* @see JCLO#getValue(String)
	*/
	@Test
	void testGetValue_9() {
		JCLO jclo = new JCLO(new JCLO_0Test_9(), null);
		jclo.parse(new String[] {});
		assertEquals(0, jclo.getInt("int"));
		assertEquals(0, jclo.getInt("intArray"));
		assertEquals(0, jclo.getInt("intArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArrayArray"));
	}
	
	/**
	* Test case for {@link JCLO#getValue(String)}
	*
	* @see JCLO#getValue(String)
	*/
	@Test
	void testGetValue_10() {
		JCLO jclo = new JCLO(new JCLO_0Test_10(), null);
		jclo.parse(new String[] {});
		assertEquals(0, jclo.getInt("int"));
		assertEquals(0, jclo.getInt("intArray"));
		assertEquals(0, jclo.getInt("intArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArrayArray"));
	}
	
	/**
	* Test case for {@link JCLO#getValue(String)}
	*
	* @see JCLO#getValue(String)
	*/
	@Test
	void testGetValue_11() {
		JCLO jclo = new JCLO(new JCLO_0Test_11(), null);
		jclo.parse(new String[] {});
		assertEquals(0, jclo.getInt("int"));
		assertEquals(0, jclo.getInt("intArray"));
		assertEquals(0, jclo.getInt("intArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArray"));
		assertEquals(0, jclo.getInt("intArrayArrayArrayArrayArrayArrayArrayArray"));
