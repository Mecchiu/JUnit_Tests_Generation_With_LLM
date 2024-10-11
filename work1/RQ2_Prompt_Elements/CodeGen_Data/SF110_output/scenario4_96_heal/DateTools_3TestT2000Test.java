// DateTools_3Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#parse(String, String)} method.
*/
class DateTools_3Test {

	@Test
	void parseTest() {
		assertEquals(null, parse(""));		
		assertEquals("", parse(""));
		assertEquals("", parse(" "));
		assertEquals(" ", parse(" "));
		assertEquals("\t", parse("\t"));
		assertEquals("\t", parse(" \t"));
		assertEquals("\t \t", parse(" \t "));
					
		assertEquals(null, parse("    "));
		assertEquals("  ", parse("  "));
		assertEquals("\\", parse(" "));
		assertEquals("'", parse("'"));
				
		assertEquals("", parse("\n"));
		assertEquals("", parse("\r"));
		assertEquals("", parse("\r\n"));
		assertEquals("", parse("\r\r"));
		assertEquals("", parse("\r\r\r"));
		//System.out.println(parse(null));
	}	

	/**
	 * Test case for parsing a date with trailing
	 * whitespace and without a leading space will throw an exception.
	 */
	@Test(expected = ParseException.class)
	void testWSCase() {
		parse(null, "TEST");
	}

	/**
	 * Test case for parsing a date with leading space and without a leading space.
	 */
	@Test(expected = ParseException.class)
	void testLeadingSpaceNoTrailingSpace() {
		parse(null, "TEST ");
	}

	/**
	 * Test case for parsing a date with leading space and with a leading space.
	 */
	@Test(expected = ParseException.class)
	void testLeadingSpaceWithTrailingSpace() {
		parse(null, "TEST "+" ");
	}
	
	/**
	 * Test case for parsing a date with leading space and without a leading space,
	 * with a trailing space or null.
	 */
	@Test(expected = ParseException.class)
	void testLeadingSpaceNoTrailingSpaceNull() {
		parse(null, "TEST "+" ");
	}
	
	/**
	 * Test case for parsing a date with leading space and with a leading space,
	 * with a trailing space and a trailing whitespace.
	 */
	@Test(expected = ParseException.class)
	void testLeadingSpaceWithTrailingSpaceAndTrailingSpace() throws ParseException {
		parse(null, "TEST " + " " + " \t" + " ");
	}
	
	@Test
	void testLeadingSpaceWithTrailingSpaceWithoutLeadingSpace() {
		assertEquals(0xFFFF, Integer.parseInt(leadSpaceWithoutLeadingSpace));
	}
	
	@Test
	void testLeadingSpaceWithTrailingSpaceAndLeadingSpace() {
		assertEquals(parse("TEST \t "), leadSpaceWithTrailingSpace() + "\t");
	}
}
