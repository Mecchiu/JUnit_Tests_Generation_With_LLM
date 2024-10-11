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
		private HSSFDataFormat hssfDataFormat;

	/**
	 * Test for the case for the builtin font formats
	 */
    @Test
    public void testGetFormat() {
        hssfDataFormat = new HSSFDataFormat(null);
        assertNotNull(hssfDataFormat.getFormat(null));
	}

    /**
     * Generate a format record and return it.
     */
	private FormatRecord createFormatRecord() {
        return new FormatRecord(DataFormat11.getBuiltinFormatArray(),
                                false,
                                true);
    }
	/**
	* Tests that the builtin format list is unchanged.
	*/
    @Test
    public void testGetBuiltinBuiltinFormat() {
        hssfDataFormat = new HSSFDataFormat(null);
        assertNotNull(hssfDataFormat.getBuiltinBuiltinFormats());
	}
	
	/**
	* Tests that getBuiltinFormatIndex works as expected.
	*/
    @Test
    public void testBuiltinFormatsGetBuiltinFormatIndex() {
        hssfDataFormat = new HSSFDataFormat(null);
        if(hssfDataFormat.builtinFormats!= null) {
            assertNotNull(hssfDataFormat.getBuiltinBuiltinFormats().get(0));
        }
    }
	/**
	* Tests that getFormat returns a formatted builtin.
	*/
	@Test
    public void testGetBuiltinFormatReturnsBuiltinFormat() {
		hssfDataFormat = new HSSFDataFormat(null);
		List builtinBuiltinFormats = hssfDataFormat.builtinFormats;
        if(this.movedBuiltins) {
			builtinBuiltinFormats.remove(0);
		}
		Iterator builtinIts = builtinBuiltinFormats.listIterator();
		String myFormat;
		int formatIndex;
		// do some sanity testing to ensure we have at least one one entry
		String format = null;
		do {
			builtinIts.hasNext(); // This should throw an exception.
			formatIndex = (Integer)builtinIts.next();
			assertNotNull(format);
			assertEquals("getFormat", "A", format);
		} while(!"A".equals(formatIndex));
		format = hssfDataFormat.getFormat(formatIndex);
		assertEquals("getFormat", "A", format);
	}

	/**
	* Tests that formatting the format records works.
	*/
    @Test
    public void testFormatRecordsPut() {
        hssfDataFormat = new HSSFDataFormat(null);
        hssfDataFormat.putFormat(createFormatRecord());
	}

    @Test
    public void testFormatRecordsIsEmpty() {
        hssfDataFormat = new HSSFDataFormat(null);
        hssfDataFormat.putFormat(createFormatRecord());
        hssfDataFormat.putFormat(createFormatRecord());
        hssfDataFormat.putFormat(createFormatRecord());
        assertFalse(hssfDataFormat.formatRecordsIsEmpty());
    }

    //TODO:  should this go through the test?
    @Test
    public void testFormatRecordsIsEmpty_andPut() {
        hssfDataFormat = new HSSFDataFormat(null);
        hssfDataFormat.putFormat(createFormatRecord());
    }

    /**
     * Tests whether a data format is properly constructed with the builtin format values.
     * @throws Exception
     */
    @Test
    public void testBuildFormatRecord() {
        hssfDataFormat.putFormat(createFormatRecord());
        if(this.movedBuiltins) {
            hssfDataFormat.builtinFormats.add(0);
        }
    }

    //TODO: this doesn't get executed yet so can't get it run when we build the
    //List of builtin formats.
    /**
     * Tests whether the list of builtin builtin formats is not corrupted.
     * @throws Exception
     */
    @Test
    public void testListIterableDoesNotCorruptResultList() throws Exception {
        Vector builtinBuiltinFormats;
        //Create a list of builtin builtin formats and put it in a vector.
        builtinBuiltinFormats = new Vector();
        builtinBuiltinFormats.add(DataFormat11.getBuiltinFormatArray()[0].toString());
        builtinBuiltinFormats.add(DataFormat11.getBuiltinFormatArray()[2].toString());
        builtinBuiltinFormats.add(DataFormat11.getBuiltinFormatArray()[4].toString());
        builtinBuiltinFormats.add(DataFormat11.getBuiltinFormatArray()[6].toString());
        builtinBuiltinFormats.add(DataFormat11.getBuiltinFormatArray()[8].toString());
                                                                           //build a string format record
        hssfDataFormat = new HSSFDataFormat(null);
        //Create format record and put it in a vector
        FormatRecord formatRecord = createFormatRecord();
        hssfDataFormat.putFormat(formatRecord);
        List builtinBuiltinFormats = hssfDataFormat.builtinFormats;
        builtinBuiltinFormats.add(DataFormat11.getBuiltinFormatArray()[0].toString());
        builtinBuiltinFormats.add(DataFormat11.getBuiltinFormatArray()[2].toString());
        builtinBuiltinFormats.add(DataFormat11.getBuiltinFormatArray()[4].toString());
        builtinBuiltinFormats.add(DataFormat11.getBuiltinFormatArray()[6].toString());
        builtinBuiltinFormats.add(DataFormat11.getBuiltinFormatArray()[8].toString());
      //  System.out.println("Builtin builtin built in formats");
	int i = 0;
}
}