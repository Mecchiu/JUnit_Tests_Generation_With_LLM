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
		
    @Test
    public void testGetFormat() {
        HSSFDataFormat hsf = new HSSFDataFormat();
        ListIterator formatIterator = hsf.getFormatIterator();
        formatIterator.set(-1);
        assertEquals("", hsf.getFormat(0));
        assertEquals("text", hsf.getFormat(1));
        assertEquals("image/png", hsf.getFormat(2));
        System.out.println(hsf.toString());
    }
    
    public class HSSFDataFormatTest2 {
        
        @Test(expected=UnsupportedOperationException.class)
        public void testFormatToString() {
            HSSFDataFormatTests.testFormatToString(false);
        }
        
        @Test(expected=UnsupportedOperationException.class)
        public void testFormatToString1() {
            HSSFDataFormatTests.testFormatToString(true);
        }
        
        @Test(expected=UnsupportedOperationException.class)
        public void testFormatToString2() {
            HSSFDataFormatTests.testFormatToString(true);
        }
        
        @Test(expected=UnsupportedOperationException.class)
        public void testFormatToString3() {
            HSSFDataFormatTests.testFormatToString(true);
        }
        
        /**
         * Test the case where a HSSFDataFormat is set to 2, but has a format that is 3.
         * @throws UnsupportedOperationException
         */
        @Test(expected = UnsupportedOperationException.class)
        public void testFormatToString4() {
            HSSFDataFormatTests.testFormatToString(true);
        }
        
        /**
         * Test the case where a HSSFDataFormat is set to 1, but has a format that is 2.
         * @throws UnsupportedOperationException
         */
        @Test(expected = UnsupportedOperationException.class)
        public void testFormatToString5() {
            HSSFDataFormatTests.testFormatToString(true);
        }
        
        /**
         * Testing the case where a HSSFDataFormat is set to 1, but has 2 formats that are
         * Text formats
         */
        @Test(expected = UnsupportedOperationException.class)
        public void testFormatToString6() {
            HSSFDataFormatTests.testFormatToString(true);
        }
        
        /**
         * Test the case where a HSSFDataFormat is set to 1, but has only 2 formats that are Text.
         */
        @Test(expected = UnsupportedOperationException.class)
        public void testFormatToString7() {
            HSSFDataFormatTests.testFormatToString(true);
        }
    }
}