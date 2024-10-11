// HSSFDataFormatTest.java
/*
 * HSSFDataFormat.java
 *
 * Created on December 18, 2001, 12:42 PM
 */
package org.apache.poi.hssf.usermodel;

import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.hssf.record.FormatRecord;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSSFDataFormat}.
* It contains one unit test case for the {@link HSSFDataFormat#getFormat(String)} method.
*/
class HSSFDataFormatTest {
		// the class that tests
		public final static HSSFDataFormat TEST_CLASS = new HSSFDataFormat();

    private String[] data = {
            "A1", "B10", "C5", "D30", "E5", "F10", "G10", "H30","I5", "J10", "K10", "L5", "M10",
            "P10", "Q10"
    };

    /**
     * Constructor of {@link HSSFDataFormatTest}.
     * It takes no parameters and the list of formats as returned by {@link HSSFWorkbook#getDataFormat}.
     */
    public HSSFDataFormatTest() {
    }

    /**
     * Tests the getFormat method
     * @throws java.lang.AssertionError if test fails.
     */
    @Test
    public void testGetFormat()  throws AssertionError {
        short formatCount = TEST_CLASS.getNumberOfBuiltinBuiltinFormats();
        // check for the proper formatting
        String[] formats = TEST_CLASS.getBuiltinFormats();
        // check the first item
        assertEquals(getFormat(data[0]), formats[0]);
        if ( formatCount > 1 ) {
            // check the second item
            assertEquals(getFormat(data[1]), formats[1]);
            // check the last item
            assertEquals(getFormat(data[formatCount-1]), formats[formatCount-1]);
        }
    }

	/**
     * If the working book is empty and no data is passed the data format record is looked for
     * @throws java.lang.AssertionError if test fails.
     */
    @Test
    public void testGetFormatInEmptyBook()  throws AssertionError {
		// test
		short formatCount = TEST_CLASS.getNumberOfBuiltinBuiltinFormats();
		Workbook book = new Workbook();
		HSSFFormat format = book.getFormatRecord(getBuiltinFormat(data[0].hashCode()),0);
		assertFalse("There was an empty format entry", book.getFormatRecord(format,0) == null);

    }
    /**
	 * If the working book is empty a null check is made to see if the format
	 *  list is empty.
	 * @throws java.lang.AssertionError if test fails.
	 */
    @Test
	public void testGetFormatInEmptyBookWithNull() throws Exception {
	     // test
		short formatCount = TEST_CLASS.getNumberOfBuiltinBuiltinFormats();
		Workbook book = new Workbook();
		HSSFFormat format = book.getFormatRecord(getBuiltinFormat(data[0].hashCode()),0);
		assertNull("There should be an empty format entry",
				format);

		// check the null list
        format = book.getFormatRecord(getBuiltinFormat(data[0].hashCode()), 1);
		assertNull("There should be no format entry by this record",
				format);
	}

    /**
	 * It checks the formatting as written by {@link #TEST_CLASS.getFormat(short)}
	 * for a given format string.  Since there is no way of getting it yet
	 * using any other format it returns the value as string.
	 * @throws java.lang.AssertionError if test fails.
	 */
    @Test
	public void testGetFormatAsString()  throws AssertionError {
		// test
	    short formatIndex = getBuiltinFormat(data[0].hashCode());
	    String string = TEST_CLASS.getFormat(formatIndex);
	    if (string.equals("")) {
	        string = "A1";
	    }
	    assertEquals(string, TEST_CLASS.getFormat(formatIndex));
	}

    /**
	 * It checks getFormat method with a list of data strings to match the index
	 *  position of the format.
	 */
    @Test
    public void testGetFormatWithData()  throws AssertionError {
		// test
		short formatIndex = getBuiltinFormat(data[0].hashCode());
		String [] strs = {"0", "1", "12", "15", "A1", "B10", "D5", "E5", "F10", "G10", "H30","K10", "L5", "O5", "P10", "Q10"};
		String [] expected = {
			strs[0],
			strs[1],
			strs[2],
			strs[3],
			strs[4],
			strs[5],
			strs[6],
			strs[7],
			strs[8],
			strs[9],
			strs[10],
			strs[11],
			strs[12],
			strs[13],
			strs[14]
		};
		assertEquals(getFormat(formatIndex), expected);
	}

}