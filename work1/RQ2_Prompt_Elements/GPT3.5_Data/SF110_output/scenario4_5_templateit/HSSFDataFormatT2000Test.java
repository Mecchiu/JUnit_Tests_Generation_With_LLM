// Test class of HSSFDataFormat
package org.apache.poi.hssf.usermodel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HSSFDataFormatTest {
    
    @Test
    void testGetFormat() {
        HSSFDataFormat dataFormat = new HSSFDataFormat(null);
        short index = dataFormat.getFormat("0.00");
        assertEquals(0x2, index);
        
        index = dataFormat.getFormat("#,##0.00");
        assertEquals(0x3, index);
        
        index = dataFormat.getFormat("0.00%");
        assertEquals(0xa, index);
        
        index = dataFormat.getFormat("0.00E+00");
        assertEquals(0x12, index);
        
        index = dataFormat.getFormat("##0.0E+0");
        assertEquals(0x11, index);
        
        index = dataFormat.getFormat("yyyy/mm/dd");
        assertEquals(0x2d, index);
        
        index = dataFormat.getFormat("d-mmm-yy");
        assertEquals(0x0e, index);
        
        index = dataFormat.getFormat("hh:mm:ss");
        assertEquals(0x16, index);
        
        index = dataFormat.getFormat("0.00_);[Red]\\(0.00\\)");
        assertEquals(0x10, index);
        
        index = dataFormat.getFormat("0.00_);\\(0.00\\)");
        assertEquals(0xf, index);
    }
}