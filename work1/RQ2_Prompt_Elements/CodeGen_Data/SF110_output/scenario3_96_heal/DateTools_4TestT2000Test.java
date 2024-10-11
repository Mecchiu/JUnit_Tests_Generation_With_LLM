// DateTools_4Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#isValidDate(String)} method.
*/
class DateTools_4Test {
/**
		 * @throws ParseException if String does not represent a
		 * 		{@link Date} that can be parsed.
		 */
        @Test
    public void parseTest() throws ParseException {
        String dateString = "2011/03/22/17:00:00.000000";
        dateString = "2011/03/22/17:00:00.000000";
        dateString = "2011/03/22/17%0.01";
        dateString = "2011/03/22/17.000000";
        dateString = "2011/03/22.1700";
        dateString = "2011/03/22.2345";
        dateString = "2011/03/22/17.000000";
        dateString = "2011/03/02/07 01:00";;
        dateString = "2011/03/22/-04-07 01:00";;
        dateString = "2011/03/22/16:03 -04";;
    }

    /**
     * @throws ParseException if String does not represent a
     * 		{@link Date} that can be parsed.
     */
    @Test
    public void parseTest_3() throws ParseException {
        String dateString = "15.09.2010 00:00:00";;
        dateString = "19.02.2010 00:00:";
        dateString = "-7.02.2010 00:00:00";;
        dateString = "-9.08.2010 00:00:00";;
        dateString = "8.09.2010 00:00:00";
        dateString = "-8.08.2010 9:00:00";
        dateString = "-8.02.2010";
        dateString = "9.02.2010 9:00:00";
        dateString = "15.04.2010 3:00:00";
        dateString = "16.0.2010";;
    }

    /**
     * Test that a {@link Date} is parsed correctly.
     */
    @Test
    public void parseTest_2() throws ParseException {
        String date = "2014-07-02 12:23:57.123";
        Date parsedDate = parse(date);
        assertEquals(new Date(2014, 4, 2, 12, 23, 57), parsedDate);

        date = "-12:27:17";
        parsedDate = parse(date);
        assertEquals(new Date(2012, 6, 14, 19, 17), parsedDate);
        
        date = "-30:42:50";
        parsedDate = parse(date);
        assertEquals(new Date(2010, 11, 1, 3, 20, 50), parsedDate);
    }

	/**
	 * Test that a {@link Date} can be parsed even if the start of the string
	 * is an illegal character.
	 */
	@Test
	public void testStartOfIllegalCharacter() throws ParseException {
		String date = "-3:22:50";
		Date parsed = parse(date);
		assertEquals(new Date(2010, 11, 1, 3, 22, 50), parsed);
	}

	/**
	 * Check that a {@link Date} can be parsed even if the end of the string
	 * is an illegal character.
	 */
	@Test
	public void testEndOfIllegalCharacter() throws ParseException {
		String date = "-3:22:50";
		Date parsed = parse(date);
		assertEquals(new Date(2010, 11, 1, 3, 22, 50), parsed);
	}

	@Test
	public void compareEqual() throws ParseException {
		Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse(
					"2011/03/22/17:00:00.000000");
		Date date2 = new SimpleDateFormat("yyyy/MM/dd").parse(
				"2011/03/22/17:00:00.000000");
    }

	@Test
	public void compareDifferent() throws ParseException {
		Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse("2011/10/21");
		Date date2 = new SimpleDateFormat("yyyy/MM/dd").parse("2011/06/11");
    }
}
