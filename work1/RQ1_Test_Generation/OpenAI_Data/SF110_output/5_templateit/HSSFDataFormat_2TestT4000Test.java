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
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(-1, dataFormat.getFormat(null));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is empty.
	 */
	@Test
	public void testGetFormat_Empty() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(-1, dataFormat.getFormat(""));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(0, dataFormat.getFormat("General"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty2() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(1, dataFormat.getFormat("0"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty3() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(2, dataFormat.getFormat("0.00"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty4() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(3, dataFormat.getFormat("#,##0"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty5() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(4, dataFormat.getFormat("#,##0.00"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty6() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(5, dataFormat.getFormat("$#,##0_);($#,##0)"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty7() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(6, dataFormat.getFormat("$#,##0_);[Red]($#,##0)"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty8() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(7, dataFormat.getFormat("$#,##0.00_);($#,##0.00)"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty9() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(8, dataFormat.getFormat("$#,##0.00_);[Red]($#,##0.00)"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty10() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(9, dataFormat.getFormat("0%"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty11() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(10, dataFormat.getFormat("0.00%"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty12() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(11, dataFormat.getFormat("0.00E+00"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty13() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(12, dataFormat.getFormat("# ?/?"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty14() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(13, dataFormat.getFormat("# ??/??"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty15() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(14, dataFormat.getFormat("m/d/yy"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty16() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(15, dataFormat.getFormat("d-mmm-yy"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty17() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(16, dataFormat.getFormat("d-mmm"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty18() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(17, dataFormat.getFormat("mmm-yy"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty19() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(18, dataFormat.getFormat("h:mm AM/PM"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty20() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(19, dataFormat.getFormat("h:mm:ss AM/PM"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty21() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(20, dataFormat.getFormat("h:mm"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty22() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(21, dataFormat.getFormat("h:mm:ss"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty23() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(22, dataFormat.getFormat("m/d/yy h:mm"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty24() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(23, dataFormat.getFormat("0x17"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty25() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(24, dataFormat.getFormat("0x18"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty26() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(25, dataFormat.getFormat("0x19"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty27() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(26, dataFormat.getFormat("0x1a"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty28() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(27, dataFormat.getFormat("0x1b"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty29() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(28, dataFormat.getFormat("0x1c"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty30() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(29, dataFormat.getFormat("0x1d"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty31() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(30, dataFormat.getFormat("0x1e"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty32() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(31, dataFormat.getFormat("0x1f"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty33() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(32, dataFormat.getFormat("0x20"));
	}
	
	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)} method.
	 * It tests the case when the format string is not empty and not null.
	 */
	@Test
	public void testGetFormat_NotEmpty34() {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
	