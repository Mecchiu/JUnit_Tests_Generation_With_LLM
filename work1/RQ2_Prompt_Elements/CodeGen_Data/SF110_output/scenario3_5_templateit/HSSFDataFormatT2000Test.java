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

    @Test public void testsGetFormat() {
        for (short format : new short[] {14, 15, 16, 17, 22, 17, 19, 14, 15, 16, 17}) {
            assertEquals(getFormat(String.valueOf(format)), format);
        }
    } 
    
    /**
	 * Test of getFormat method, of class HSSFDataFormat.
	 */
    @Test
    public void getFormatTest() {
        System.out.println("getFormat");
        

        final String[] formatTest = new String[] {"1", "2", "3", "4"};
        
        // get data format
        final HSSFDataFormat.HSSFDataFormat format = new HSSFDataFormat.HSSFDataFormat();
        
        // set data format to string
        format.setVersion(14);
        
        // create a format record
        final FormatRecord fr = new FormatRecord(format);
        
        // set the data format to string
        format.setVersion(formatTest[1]);
        
        /*
         * Make a list of strings that the
         * test will have to handle
         */
        final List list =new Vector();
        
        // add a new string
        list.add(new String(formatTest[0]));
        
        // add one more string
        list.add(new String(formatTest[2]));
        
        // add the list of strings
        list.add(list);
        
        // create the first record
        fr.setData(getFormatRecord(0,list, formatTest[1]));
        
        // add the second record
        fr.setData(getFormatRecord(1,list,formatTest[3]));
        
        // add a new list of strings
        final List list2 = new Vector();
        
        // add a new string
        list2.add(new String(formatTest[5]));
        
        // add one more string
        list2.add(new String(formatTest[2]));
        
        // add the list of strings
        list2.add(list);
        
        // create the first record
        fr.setData(getFormatRecord(0,list2,formatTest[2]));
        
        // set the data format to string
        format.setVersion(formatTest[2]);
        
        
        /*
         * Write the data format to a temporary file and then
         * compare the data structure of the data in the format
         * file with the data structure of the data stored
         * there was another test in this file (HSSFDataFormatTest)
         *    that would be used from there to test the
         *    same data structure (without the temporary file).
         *
         *     Here we'll test the difference in the structure, because
         *    there were some issues with the HSSFDataFormat to ensure
         *    the format file and the data format files are the same.
         */
        
        final HSSFDataFormatTest test = new HSSFDataFormatTest();
        final String filename = test.generateFileName();
       
        final HSSFFormat formatFile = HSSFFormat.create(filename, new HSSFSheet(), false);
        final FormatRecord testFormat = getFormatRecord(0,list, formatTest[0]);
        final HSSFDataFormat dft = HSSFDataFormat.create(format, null, true);
        
        dft.setVersion(formatTest[0]);
        
        assertEquals(format,dft);
        
        /*
         * Write data format and data structure,
         * but not the format file contents.
         */
        
        // write the data format and data structure files
        formatFile.write(dft);
        
        final String filename2 = test.generateFileName();
        
        formatFile.setVersion(getFormatRecord(1,list2,formatTest[2]));
        
        dft.setVersion(getFormatRecord(1,list2,formatTest[2] + "1"));
        
        formatFile.write(dft);
        
        final byte[] databes;
        
        try {
            databes = formatFile.read();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return;
        }
        
        /*
         * Compare data structures
         {
         System.out.println("data = " + new String(databes));
         System.out.println("format = " + dft);
         }
         */
        assertArrayEquals(databes,dft.getData());
        
        //compare the formatFile with the data structure
        String sdata, scopy;
        try {
            sdata = new String(formatFile.read());
            scopy = new String(dft.getData());
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return;
        }
        assertEquals(sdata, scopy);
        
        /*
         * compare the data structures to each other
         {
         assertTrue(new String(sdata).equals(new String(scopy)));
         }
         */
        System.out.println("comparing " + test.getFileName());
        //compare the data structures
        scopy = dft.getData();
        try {
            assertTrue(sdata.equals(scopy));
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        
        try {
            dft.getData();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        //compare the two data structures
        assertTrue(dft == new String(sdata));
            
    }

	private FormatRecord getFormatRecord(int numOfRels, List els, String svalue) {
        //create the first record
        FormatRecord fr = new FormatRecord(svalue);
        fr.setVersion(svalue);
        
        /*
         * Set the position of the first record to match the
         * position within the first record
         */
        
        int posRec = fr.getFirstRecord();
        
        /*
         * Iterate through the elements of the list
         * and create a data record
         */
        
         ListIterator it = els.listIterator(0);
        
         for (int i=0; it.hasNext(); i++) {
            FormatRecord rec = new FormatRecord(i);
            String recordValue = it.next().toString();
            String record = rec.getRecordString();
            
            //check for null record value
            if (record.equals("null")) {
                return fr;
            }
            
            /*
             * The following checks indicate the