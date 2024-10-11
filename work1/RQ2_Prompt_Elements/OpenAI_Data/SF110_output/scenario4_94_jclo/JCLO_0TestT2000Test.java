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
	* @throws Exception
	*/
	@Test
	void testGetValue_0() throws Exception {
		JCLO jclo = new JCLO(new JCLO_0Test_0(), null);
		jclo.parse(new String[] { "--a=1", "--b=2", "--c=3", "--d=4", "--e=5", "--f=6", "--g=7", "--h=8", "--i=9", "--j=10" });
		assertEquals(1, jclo.getInt("a"));
		assertEquals(2, jclo.getInt("b"));
		assertEquals(3, jclo.getInt("c"));
		assertEquals(4, jclo.getInt("d"));
		assertEquals(5, jclo.getInt("e"));
		assertEquals(6, jclo.getInt("f"));
		assertEquals(7, jclo.getInt("g"));
		assertEquals(8, jclo.getInt("h"));
		assertEquals(9, jclo.getInt("i"));
		assertEquals(10, jclo.getInt("j"));
	}
	
	/**
	* Test case for {@link JCLO#getValue(String)}
	*
	* @throws Exception
	*/
	@Test
	void testGetValue_1() throws Exception {
		JCLO jclo = new JCLO(new JCLO_0Test_1(), null);
		jclo.parse(new String[] { "--a=1", "--b=2", "--c=3", "--d=4", "--e=5", "--f=6", "--g=7", "--h=8", "--i=9", "--j=10" });
		assertEquals(1, jclo.getInt("a"));
		assertEquals(2, jclo.getInt("b"));
		assertEquals(3, jclo.getInt("c"));
		assertEquals(4, jclo.getInt("d"));
		assertEquals(5, jclo.getInt("e"));
		assertEquals(6, jclo.getInt("f"));
		assertEquals(7, jclo.getInt("g"));
		assertEquals(8, jclo.getInt("h"));
		assertEquals(9, jclo.getInt("i"));
		assertEquals(10, jclo.getInt("j"));
	}
	
	/**
	* Test case for {@link JCLO#getValue(String)}
	*
	* @throws Exception
	*/
	@Test
	void testGetValue_2() throws Exception {
		JCLO jclo = new JCLO(new JCLO_0Test_2(), null);
		jclo.parse(new String[] { "--a=1", "--b=2", "--c=3", "--d=4", "--e=5", "--f=6", "--g=7", "--h=8", "--i=9", "--j=10" });
		assertEquals(1, jclo.getInt("a"));
		assertEquals(2, jclo.getInt("b"));
		assertEquals(3, jclo.getInt("c"));
		assertEquals(4, jclo.getInt("d"));
		assertEquals(5, jclo.getInt("e"));
		assertEquals(6, jclo.getInt("f"));
		assertEquals(7, jclo.getInt("g"));
		assertEquals(8, jclo.getInt("h"));
		assertEquals(9, jclo.getInt("i"));
		assertEquals(10, jclo.getInt("j"));
	}
	
	/**
	* Test case for {@link JCLO#getValue(String)}
	*
	* @throws Exception
	*/
	@Test
	void testGetValue_3() throws Exception {
		JCLO jclo = new JCLO(new JCLO_0Test_3(), null);
		jclo.parse(new String[] { "--a=1", "--b=2", "--c=3", "--d=4", "--e=5", "--f=6", "--g=7", "--h=8", "--i=9", "--j=10" });
		assertEquals(1, jclo.getInt("a"));
		assertEquals(2, jclo.getInt("b"));
		assertEquals(3, jclo.getInt("c"));
		assertEquals(4, jclo.getInt("d"));
		assertEquals(5, jclo.getInt("e"));
		assertEquals(6, jclo.getInt("f"));
		assertEquals(7, jclo.getInt("g"));
		assertEquals(8, jclo.getInt("h"));
		assertEquals(9, jclo.getInt("i"));
		assertEquals(10, jclo.getInt("j"));
	}
	
	/**
	* Test case for {@link JCLO#getValue(String)}
	*
	* @throws Exception
	*/
	@Test
	void testGetValue_4() throws Exception {
		JCLO jclo = new JCLO(new JCLO_0Test_4(), null);
		jclo.parse(new String[] { "--a=1", "--b=2", "--c=3", "--d=4", "--e=5", "--f=6", "--g=7", "--h=8", "--i=9", "--j=10" });
		assertEquals(1, jclo.getInt("a"));
		assertEquals(2, jclo.getInt("b"));
		assertEquals(3, jclo.getInt("c"));
		assertEquals(4, jclo.getInt("d"));
		assertEquals(5, jclo.getInt("e"));
		assertEquals(6, jclo.getInt("f"));
		assertEquals(7, jclo.getInt("g"));
		assertEquals(8, jclo.getInt("h"));
		assertEquals(9, jclo.getInt("i"));
		assertEquals(10, jclo.getInt("j"));
	}
	
	/**
	* Test case for {@link JCLO#getValue(String)}
	*
	* @throws Exception
	*/
	@Test
	void testGetValue_5() throws Exception {
		JCLO jclo = new JCLO(new JCLO_0Test_5(), null);
		jclo.parse(new String[] { "--a=1", "--b=2", "--c=3", "--d=4", "--e=5", "--f=6", "--g=7", "--h=8", "--i=9", "--j=10" });
		assertEquals(1, jclo.getInt("a"));
		assertEquals(2, jclo.getInt("b"));
		assertEquals(3, jclo.getInt("c"));
		assertEquals(4, jclo.getInt("d"));
		assertEquals(5, jclo.getInt("e"));
		assertEquals(6, jclo.getInt("f"));
		assertEqu