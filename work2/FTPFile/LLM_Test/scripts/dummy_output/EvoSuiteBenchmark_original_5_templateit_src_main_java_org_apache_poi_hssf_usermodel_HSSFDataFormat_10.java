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
		 * Test that the methods work as configured.
		 */
		@Test
    public void testGetFormat() {
            HSSFDataFormat format = new HSSFDataFormat();
			assertTrue(format.getFormat(null) == null);
            assertEquals(0, format.getBuildInTypes().length);
			assertTrue(format.getBuiltInFormat(null) == null);

            format.addFormat(null);

            List newFormats = newVector();
            assertEquals(1, new FormatsAdapter(format).length);

            format.addBuiltInFormat(this, null);

            assertEquals(2, newFormats.size());
            newFormats.add(newHSSFInternalizedFormat("test1"));
            newFormats.add(newHSSFInternalizedFormat("test2"));
            assertEquals(newFormats.get(0), newHSSFInternalizedFormat("test1", null));  // Test a null.
            assertEquals(newFormats.get(1), newHSSFInternalizedFormat("test2", null));  // Test a null.
            assertEquals(1, newFormats.indexOf(newHSSFInternalizedFormat("test1", null)));
            assertEquals(1, newFormats.indexOf(newHSSFInternalizedFormat("test2", null)));

            newFormats.clear();
            format.addBuiltInFormat(null, null);
            assertEquals(1, newFormats.length());
            newFormats.add(newHSSFInternalizedFormat("test1"));
            assertEquals(newFormats.get(0), newHSSFInternalizedFormat("test1"));

            // Verify the count of formats

            if(format.getNumberOfBuiltinBuiltinFormats() > 0) {
              // If we are adding builtin formats, test the size before adding the builtin ones.
              assertEquals(2, format.getNumberOfBuiltinBuiltinFormats());
            } else {
              // If not add both builtin formats, test that the sizes are the same.
              assertEquals(1, newFormats.get(0).length);
              assertEquals(1, newFormats.get(1).length);
	          System.out.println("New Formats before " + newFormats.get(0) + ", "+ newFormats.get(1));
	  }
            
            newFormats.clear();
            newFormats.add(new HSSFDataFormat("test"));
            newFormats.add(new HSSFDataFormat("test3"));
            newFormats.add(new HSSFDataFormat("test3", null));
            newFormats.add(new HSSFDataFormat("test3", null));
            assertEquals(2, newFormats.length());
            assertEquals(newFormats, newFormats); // Make sure we add all
        }
    }

/**
 * Customization of builtin formats to work with data.
 * @author  Dario Managers
 * @since   0.7
 */
class HSSFDataFormatImpl extends HSSFDataFormat {

    public Object getFormat( String formatName ){
    if(formatName.equalsIgnoreCase("Text")){
      return new TextFormat(null);
    } else if(formatName.equalsIgnoreCase("Blob")){
      return new BlobFormat(null);
    } else if(formatName.equalsIgnoreCase("Hyperlink")){
      return new HSSFHyperlinkFormat(null);
    } else if(formatName.equalsIgnoreCase("PivotAware")){
      return new PivotAwareFormat(null);
    } else if(formatName.equalsIgnoreCase("FormattedText")){
    return new FormattedTextFormat(null);
    } else if(formatName.equalsIgnoreCase("Excel")){
      return new ExcelFormat(null);
    } else {
      HSSFDataFormat v = new HSSFDataFormatImpl(new Workbook(null) );
      System.out.println("HSSFDataFormatImpl.getFormat() " + v.getFormat(null));// DEBUG
      return v.getFormat(null);
    }
  }
}