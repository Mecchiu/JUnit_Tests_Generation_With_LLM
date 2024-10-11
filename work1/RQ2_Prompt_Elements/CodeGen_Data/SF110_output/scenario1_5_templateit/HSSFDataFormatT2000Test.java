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
   public void testGet() {
       HSSFDataFormat hsf = new HSSFDataFormat();
       assertThrows(IllegalArgumentException.class, () -> hsf.getFormat("notExists");
                             
    }
    
    @Test
   public void testGetFormat() {
       Iterator<FormatRecord> i = workbook.getFormatRecords();
       while(i.hasNext()) {
           System.out.println(i.next());
       }
       HSSFDataFormat hsf = new HSSFDataFormat();
       assertEquals("text", hsf.getFormat("TEXT"));
       assertSame(workbook.getFormatRecord(0), hsf.getFormatRecord(0));
       assertNull(hsf.getFormat("TEXT"));
       assertEquals(workbook.getFormatRecord(0).getNumber(), 0);
    }
    
    private Vector<FormatRecord> formats;
    private Vector<Integer> workbook_formats;
    
    public HSSFDataFormatTest() {
       workbook_formats = new Vector<>(2);
       workbook_formats.add(0, 1);
       workbook_formats.add(1, 3);
    }

    @Test
   public void testListIteratorNext() {
       assertListIteratorNextFail("TEXT", true);
       assertListIteratorNextFail("TEXT.FOLDERS", true);
   }

    private void assertListIteratorNextFail(String format, boolean moveNext) {
        try (FormatRecord formatRecord = workbook.getFormatRecord(0);
             Iterator<Integer> i = new ListIterator(format_formats.listIterator()) {
              @Override
              public boolean hasNext() {
                  return super.hasNext();
              }
              @Override
              public int next() {
                return super.next();
              }
            };
         ) {
            formatRecord.setDataSource(i);
            HSSFDataFormat hsf = new HSSFDataFormat();
            assertThrows(IndexOutOfBoundsException.class, () -> hsf.getFormat(format));
        }
        workbook_formats.add(0, 1);
        if (moveNext)
            workbook_formats.add(1, 2);
        else
            workbook_formats.add(1, 3);
    }

    @Test
   public void testListIteratorPrevious() {
      assertListIteratorPreviousFail("TEXT", true);
      assertListIteratorPreviousFail("TEXT.FOLDERS", true);
   }

    private void assertListIteratorPreviousFail(String format, boolean moveNext) {
        try (FormatRecord formatRecord = workbook.getFormatRecord(0);
             ListIterator<Integer> i = new ListIterator<Integer>(workbook_formats) {
                @Override
                public boolean hasNext() {
                    return super.hasNext();
                }
                @Override
                public Integer next() {
                    return super.next();
                }
            };
         ) {
            formatRecord.setDataSource(i);
            HSSFDataFormat hsf = new HSSFDataFormat();
            assertThrows(IndexOutOfBoundsException.class, () -> hsf.getFormat(format));
        }
        workbook_formats.add(0, 1);
        if (moveNext)
            workbook_formats.add(1, 2);
        else
            workbook_formats.add(1, 3);
    }
    
    @Test
   public void testBuilder() {
       HSSFDataFormat hsf = new HSSFDataFormat();
       Workbook book = hsf.build(workbook);
           
       assertNotNull(book);
       assertEquals(1, book.getNumberOfNames());
       System.out.println(book.getNumberOfSheetNames());
       System.out.println(book.getFormats());
       System.out.println(book.getNumSheets());
       assertTrue(book.getSheetAt(0).getNumberOfFirstSheet() == 1);
       System.out.println(book.getSheetAt(0).getDefaultSheet().getNumberOfFirstSheet());
       System.out.println(book.getSheetAt(0).getNumberOfVisibleSheets() == 1);
       list_workbook = book.getWorkbook();
           
   }
    
    Workbook list_workbook;
    Vector<Integer> test_workbook_formats;
    Vector<FormatRecord> workbook_formats;
	 Vector<FormatRecord> list_format;
    Vector<List<FormatRecord>> format_formats;
    
}
