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
		
    // TODO: The methods need to be moved to a unit test.
    private static List builtinFormats = createBuiltinFormats();
    
    private static Vector buildFromRecords(List records) {
        Vector results = new Vector();
        for(Iterator iter = records.iterator(); iter.hasNext();)
            results.add(createBuiltinRecord((FormatRecord)iter.next()));
        return results;
    }
        
    private static FormatRecord createBuiltinRecord(FormatRecord formatRecord) {
        FormatRecord f = new FormatRecord(formatRecord.getRecordType());
        f.setNumFields(formatRecord.getNumFields());
        f.setDefaultFieldName(formatRecord.getDefaultFieldName());
        f.setDefaultFieldType(formatRecord.getDefaultFieldType());   
        for(Iterator iterator = builtinFormats.iterator(); iterator.hasNext();) {
        	FormatRecord rec = (FormatRecord)iterator.next();
            f.addField(rec.getFormatIndex(), rec.getRecordType());
        }
        return f;       	
    }

    /**
     * Test of {@link HSSFDataFormat#getFormat(String)}.
     */
    @Test
    public final void testGetFormat() {
        System.out.println("getFormat");

        List builtins = HSSFDataUtil.getBuiltinFormats();
                 
        ListIterator formatIter = builtins.listIterator();
        while (formatIter.hasNext()) {
        	FormatRecord format = (FormatRecord) formatIter.next();
            short formatIndex = format.getFormatIndex();
            assertTrue(
                "formatIndex=" +
                                            formatIndex  +
                                            " should be a built in format",
                formatIndex >= 0 && (format.getRecordType()==0)); // Asserting that the builtin one is returned. 
        }

            /* 
             * The tests below are to verify what format data record is inserted 
             * into the Workbook into the format record as it 
             * is being built.
             */ 
            Vector dataRecords = new Vector();
            Vector formatRecords = new Vector();

            List records=workbook.getSheetAt(1).getPhysicalSheet().getPhysicalRecordByFormat((short)0);

            for(int i = 0; i < records.size() ; i++) {
                FormatRecord record = (FormatRecord) records.get(i);
                dataRecords.add(record);
            }

            int i = 0;
            while(i < dataRecords.size()) {
                String dataRecordFormatIndex =(String)dataRecords.get(i++);
                FormatRecord dataFormatRecord = (FormatRecord) buildFromRecords( dataRecords ).get(0);
                if (dataRecordFormatIndex == null || dataRecordFormatIndex.equals("")) {
                    i++; 
                    dataRecordFormatIndex = "00000000";
                }
                String rawFormat = (String)dataFormatRecord.getField(0);
                short formatIndex=Integer.parseInt(rawFormat);
                FormatRecord formatRecord = new FormatRecord(dataFormatRecord.getRecordType());
                formatRecord.setRecordFormatIndex(formatIndex);



                for(Iterator iterator = builtinFormats.iterator(); iterator.hasNext();) {
                    FormatRecord builtinRecord = (FormatRecord)iterator.next();
                    short builtinRecordIndex = builtinRecord.getFormatIndex();
                    if (builtinRecordIndex == formatIndex) {
                        formatRecord.setRecordType(builtinRecord.getRecordType());
                        for(Iterator iiter = builtinFormats.iterator();
                        (iterator == builtinFormats.iterator() ||
                                builtinRecordIndex == (short)iiter.next()) && iiter.hasNext();
                        ) {
                                formatRecord = (FormatRecord)iiter.next();
                        }

                        formatRecords.add(formatRecord);
                        break;
                    }

                }
             }
             

       /*     TODO: Move the tests to a unit test  */
             
            assertEquals("Format records not equal",
                dataRecords,formatRecords);
        }  // end of format records
}