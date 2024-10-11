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

    /**
     * Test of getFormat function, of the {@link HSSFDataFormat#getFormat(String)} method.
     * Asserts that the method returns the correct number of entries.
     */
    @Test
    public void testGetFormat() {
        HSSFDataFormat format = new HSSFDataFormat();
        try {
            format.getFormat("TEST-");
        } catch (IllegalArgumentException e) {
            fail("IllegalFormatException should not be thrown");
        }
    }
    
    /**
     * Test of moveBuiltins function, of the {@link HSSFDataFormat#getFormat(String)} method.
     */
    @Test
    public void testMoveBuiltins() {
        HSSFDataFormat format = new HSSFDataFormat();
        Vector testVector = getFormats();
        Iterator i;
        i = testVector.listIterator();
        while (i.hasNext()) {
            format.moveBuiltins();
        }
        assertTrue(format.builtInsFormats.isEmpty());
    }
    
    /**
     * Test of getBuiltInFormats function, of the {@link HSSFDataFormat#getFormat(String)} method.
     */
    @Test
    public void testGetBuiltInFormats() {
        HSSFDataFormat format = new HSSFDataFormat();
        List testVector = getFormats();
        for (int i = 0; i < testVector.size(); i++) {
            format.getBuiltInFormats();
        }
    }
    
    /**
     * Test of moved fromFormats function, of the {@link HSSFDataFormat#getFormat(String)} function.
     */
    @Test
    public void testMovedFromFormats() {
        HSSFDataFormat format = new HSSFDataFormat();
        getFormats();
        String newFormat = "TEST-";
        format.moveFromFormats(newFormat);
        format.moveToFormats(newFormat);
        assertEquals(format.movedFormats.size() - 1, format.movedBuiltins.size());
    }
}
