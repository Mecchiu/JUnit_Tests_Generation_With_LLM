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
		 * Create a new test format with the given filename.
		 * @param filename the filename used for this test
		 */
		public HSSFDataFormatTest(String filename) {
			// If the workbook contains references to "Built-in" formats, these should be used instead
			readFile(filename);
		}
	 
 	/**
     * Reads the file with name filename and tests that the contents of that file match expected.
     * 
     * @param filename the name used for logging
     */
		private static void readFile(String filename) {
			try {
				System.out.println(filename);
				Vector testData = new Vector();
                ListFormatRecord record = null;

				FileTypeHandler handler = new FileTypeHandler();
				handler.setFormatSpecification(filename);
				if (null == handler.getHandler()) {
					throw new IOException("Failure getting file type handler");
				}	

				if (null == handler.readFile(null)) {
					System.out.println("Error not identified by content of " + filename);
				}   	
				file = handler.getFile();
				workbook = new Workbook(file);

				reader = new FileTypeHandlerReader(workbook);
				reader.parse();
				workbook.close();

				formatCount = reader.getContentFormatCount();
				if (formatCount < 4) {
					System.out.println("Format test of " + filename + " has " + formatCount + " format records, expected <= " + 4);
					// throw new NoSuchOptionException("Trying to parse more format records in a test case");
					throw new NoSuchOptionException("File of " + filename + " doesn't contain any format records");
				}	
 
				String[][] formats = reader.getContentFormats();
				
				for (int i = 0; i < formatCount; i++) {
					list = formats[i];
					for(int j = 0; j<list.length;j++){
						
						//System.out.println("i=" + i + " formatSpec=" + listener.listener.format_spec + " list = " +list[j] );
						assertEquals("formatIndex " + i + " not equal to expected formatIndex " +  list.length, i, list.length);
						if( reader.getContentType(list[j].trim()) == null ) {	
							System.out.println("formatIndex " + i + "<formatSpec=" + list[j] +  " list format=" + reader.listener.format + " getContentType()="+ reader.getContentType( list[j].trim()) );
							if( i == list.length-1) {
								assertEquals("Format " + list[j].trim() + " has the wrong format type",list[j].trim(), reader.listener.format);			
							}
						}
						else {
							System.out.println("Content type " + list[j].trim() + " not the same");	
						}
					}
					list = reader.getContentRecordTypes();

				}

				reader = new FileTypeHandlerReader(workbook);			

				formatCount = reader.getContentFormatCount();
				System.out.println("There are " + formatCount + " formatRecord in the first " + 
						" format specification for file " + filename + 
						" (expecting " + 
						reader.getContentFormatCount() + " format record):");	
				formatCount = reader.getContentFormatCount();

				if (!movedBuiltins) {
					System.out.println("This file contains no " + builtinFormats.size() + " builtin ");
				}	
 
				if (formatCount > builtinFormats.size()) { // This should happen for file "file"
					throw new IOException("FormatCount=" + formatCount + " > " + builtinFormats.size());
				}	
 
				for (int i = 0; i < formatCount; i++) {
					//System.out.println("formatIndex " + formatIndex + " record=" + formatRecordIndex);
					try {
                        FormatRecord record = reader.getContentFormat(reader.readLineLine( "formatRecordIndex" ));
						assertNotNull("Shouldn't be returning null", record);
						//System.out.println("formatIndex " + formatIndex + "\n" + record + "\n");
						assertEquals("Format " + record.getFormat() + " not equal to expected " +  record.getFormat(),
								record.getFormat(), formatIndex);

						// System.out.println("formatIndex = " + formatIndex + "\n" + record);	
						//  list = record.getContentRecordTypes();
						if(record.getFormat().startsWith("text") && record.getContentRecordTypes().size() > 0 ) {
							//System.out.println("Found the text format record");
							try {
								formatIndex = record.getFormatIndex();
								list = record.getContentRecordTypes();
								for (int j = 0; j < list.length;j++) {				                        
									System.out.println("list[j]" +list[j] + "(" + formatIndex + ")");
								        assertEquals("List should have content type " + record.getContentType() + " for " + formatIndex, 
											list[j].trim(), record.getContentType().trim());					 
									
								} // end for content record
							} catch (Exception e) {
								System.out.println(e.getMessage());
							}		
						}
						else {
							System.out.println("No text format record");
						}
					}
					catch (Exception e) {
						//System.out.println("Expected reader to return format record with " + i);

						throw e;
					}
				}

				reader.close();

			}
			catch(Exception e) {
				e.printStackTrace();
				fail("Unexpected IOException reading " + filename);
			}
}
}