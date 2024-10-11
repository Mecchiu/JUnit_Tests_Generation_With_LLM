// JCLO_0Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains one unit test case for the {@link JCLO#getValue(String)} method.
*/
class JCLO_0Test {
		
	/**
	 * Test the method {@link JCLO#init(String, Object)};
	 * 	that does nothing. {@code init} is called just
	 * one time, no further calls are made.
	*/
	@Test
    public void testJCLO_0init_1() {
        JCLO jclo = new JCLO("");
    }
	
    /**
	 * Test the method {@link JCLO#init(String, Object, Object)};
	 * 	that takes an argument {@code field}, a prefix string,
     * 	and a boolean value that defines whether single or double
     * dashes. {@code init} is called with two more than two.
	 */
	@Test
    public void test_JCLO_0init_2() {
        JCLO jclo = new JCLO("");
    }
	
    /**
	 * Test the method {@link JCLO#init(String, Object, Object, Object)};
	 * 	that takes an argument {@code field}, a prefix string,
     * 	and a boolean value that defines whether single or double
     * dashes. {@code init} is called with the two arguments
     * {@code fields[1], fields[2], fields[3]} and {@code aliases[1]}.
	 */
	@Test
    public void test_JCLO_0init_4() {
        JCLO jclo = new JCLO("");
    }
	
}