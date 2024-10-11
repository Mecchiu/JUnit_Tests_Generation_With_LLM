// HSSFDataFormatTest.java
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
* It contains ten unit test cases for the {@link HSSFDataFormat#getFormat(String)} method.
*/
class HSSFDataFormatTest {

	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * Test data: "General".
	 * Expected result: 0.
	 */
	@Test
	public void testGetFormat1() {
		HSSFDataFormat dataFormat = new HSSFDataFormat();
		short result = dataFormat.getFormat("General");
		assertEquals(0, result);
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * Test data: "0".
	 * Expected result: 1.
	 */
	@Test
	public void testGetFormat2() {
		HSSFDataFormat dataFormat = new HSSFDataFormat();
		short result = dataFormat.getFormat("0");
		assertEquals(1, result);
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * Test data: "0.00".
	 * Expected result: 2.
	 */
	@Test
	public void testGetFormat3() {
		HSSFDataFormat dataFormat = new HSSFDataFormat();
		short result = dataFormat.getFormat("0.00");
		assertEquals(2, result);
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * Test data: "#,##0".
	 * Expected result: 3.
	 */
	@Test
	public void testGetFormat4() {
		HSSFDataFormat dataFormat = new HSSFDataFormat();
		short result = dataFormat.getFormat("#,##0");
		assertEquals(3, result);
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * Test data: "#,##0.00".
	 * Expected result: 4.
	 */
	@Test
	public void testGetFormat5() {
		HSSFDataFormat dataFormat = new HSSFDataFormat();
		short result = dataFormat.getFormat("#,##0.00");
		assertEquals(4, result);
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * Test data: "$#,##0_);($#,##0)".
	 * Expected result: 5.
	 */
	@Test
	public void testGetFormat6() {
		HSSFDataFormat dataFormat = new HSSFDataFormat();
		short result = dataFormat.getFormat("$#,##0_);($#,##0)");
		assertEquals(5, result);
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * Test data: "$#,##0_);[Red]($#,##0)".
	 * Expected result: 6.
	 */
	@Test
	public void testGetFormat7() {
		HSSFDataFormat dataFormat = new HSSFDataFormat();
		short result = dataFormat.getFormat("$#,##0_);[Red]($#,##0)");
		assertEquals(6, result);
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * Test data: "$#,##0.00_);($#,##0.00)".
	 * Expected result: 7.
	 */
	@Test
	public void testGetFormat8() {
		HSSFDataFormat dataFormat = new HSSFDataFormat();
		short result = dataFormat.getFormat("$#,##0.00_);($#,##0.00)");
		assertEquals(7, result);
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * Test data: "$#,##0.00_);[Red]($#,##0.00)".
	 * Expected result: 8.
	 */
	@Test
	public void testGetFormat9() {
		HSSFDataFormat dataFormat = new HSSFDataFormat();
		short result = dataFormat.getFormat("$#,##0.00_);[Red]($#,##0.00)");
		assertEquals(8, result);
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * Test data: "0%".
	 * Expected result: 9.
	 */
	@Test
	public void testGetFormat10() {
		HSSFDataFormat dataFormat = new HSSFDataFormat();
		short result = dataFormat.getFormat("0%");
		assertEquals(9, result);
	}
}