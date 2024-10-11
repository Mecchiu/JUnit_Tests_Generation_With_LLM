// HSSFDataFormat_2Test.java
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
* It contains ten unit test cases for the {@link HSSFDataFormat#getFormat(String)} method.
*/
class HSSFDataFormat_2Test {

	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is null.
	 */
	@Test
	public void testGetFormat_Null() {
		Workbook workbook = new Workbook();
		HSSFDataFormat dataFormat = new HSSFDataFormat(workbook);
		assertEquals(-1, dataFormat.getFormat(null));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is empty.
	 */
	@Test
	public void testGetFormat_Empty() {
		Workbook workbook = new Workbook();
		HSSFDataFormat dataFormat = new HSSFDataFormat(workbook);
		assertEquals(-1, dataFormat.getFormat(""));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty() {
		Workbook workbook = new Workbook();
		HSSFDataFormat dataFormat = new HSSFDataFormat(workbook);
		assertEquals(0, dataFormat.getFormat("General"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty2() {
		Workbook workbook = new Workbook();
		HSSFDataFormat dataFormat = new HSSFDataFormat(workbook);
		assertEquals(1, dataFormat.getFormat("0"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty3() {
		Workbook workbook = new Workbook();
		HSSFDataFormat dataFormat = new HSSFDataFormat(workbook);
		assertEquals(2, dataFormat.getFormat("0.00"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty4() {
		Workbook workbook = new Workbook();
		HSSFDataFormat dataFormat = new HSSFDataFormat(workbook);
		assertEquals(3, dataFormat.getFormat("#,##0"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty5() {
		Workbook workbook = new Workbook();
		HSSFDataFormat dataFormat = new HSSFDataFormat(workbook);
		assertEquals(4, dataFormat.getFormat("#,##0.00"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty6() {
		Workbook workbook = new Workbook();
		HSSFDataFormat dataFormat = new HSSFDataFormat(workbook);
		assertEquals(5, dataFormat.getFormat("$#,##0_);($#,##0)"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty7() {
		Workbook workbook = new Workbook();
		HSSFDataFormat dataFormat = new HSSFDataFormat(workbook);
		assertEquals(6, dataFormat.getFormat("$#,##0_);[Red]($#,##0)"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty8() {
		Workbook workbook = new Workbook();
		HSSFDataFormat dataFormat = new HSSFDataFormat(workbook);
		assertEquals(7, dataFormat.getFormat("$#,##0.00_);($#,##0.00)"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty9() {
		Workbook workbook = new Workbook();
		HSSFDataFormat dataFormat = new HSSFDataFormat(workbook);
		assertEquals(8, dataFormat.getFormat("$#,##0.00_);[Red]($#,##0.00)"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty10() {
		Workbook workbook = new Workbook();
		HSSFDataFormat dataFormat = new HSSFDataFormat(workbook);
		assertEquals(9, dataFormat.getFormat("0%"));
	}
}

// HSSFDataFormat_3Test.java
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
* It contains ten unit test cases for the {@link HSSFDataFormat#getFormat(String)} method.
*/
class HSSFDataFormat_3Test {
		
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is null.
	 */
	@Test
	public void testGetFormat_Null() {
		Workbook workbook = new Workbook();
		HSSFDataFormat dataFormat = new HSSFDataFormat(workbook);
		assertEquals(-1, dataFormat.getFormat(null));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is empty.
	 */
	@Test
	public void testGetFormat_Empty() {
		Workbook workbook = new Workbook();
		HSSFDataFormat dataFormat = new HSSFDataFormat(workbook);
		assertEquals(-1, dataFormat.getFormat(""));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty() {
		Workbook workbook = new Work