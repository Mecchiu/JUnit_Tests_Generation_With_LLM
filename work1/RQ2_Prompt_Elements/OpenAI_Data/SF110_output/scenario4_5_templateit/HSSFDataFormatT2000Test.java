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
* It contains ten unit test cases for the {@link HSSFDataFormat#getFormat(String)} method.
*/
class HSSFDataFormatTest {

	/**
	 * Test case for {@link HSSFDataFormat#getFormat(String)}
	 * 
	 * @author Andrew C. Oliver (acoliver at apache dot org)
	 */
	@Test
	public void testGetFormat() {
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFDataFormat df = wb.createDataFormat();
		assertEquals(0, df.getFormat("text"));
		assertEquals(1, df.getFormat("0"));
		assertEquals(2, df.getFormat("0.00"));
		assertEquals(3, df.getFormat("#,##0"));
		assertEquals(4, df.getFormat("#,##0.00"));
		assertEquals(5, df.getFormat("($#,##0_);($#,##0)"));
		assertEquals(6, df.getFormat("($#,##0_);[Red]($#,##0)"));
		assertEquals(7, df.getFormat("($#,##0.00_);($#,##0.00)"));
		assertEquals(8, df.getFormat("($#,##0.00_);[Red]($#,##0.00)"));
		assertEquals(9, df.getFormat("0%"));
		assertEquals(10, df.getFormat("0.00%"));
		assertEquals(11, df.getFormat("0.00E+00"));
		assertEquals(12, df.getFormat("# ?/?"));
		assertEquals(13, df.getFormat("# ??/??"));
		assertEquals(14, df.getFormat("mm-dd-yy"));
		assertEquals(15, df.getFormat("d-mmm-yy"));
		assertEquals(16, df.getFormat("d-mmm"));
		assertEquals(17, df.getFormat("mmm-yy"));
		assertEquals(18, df.getFormat("h:mm AM/PM"));
		assertEquals(19, df.getFormat("h:mm:ss AM/PM"));
		assertEquals(20, df.getFormat("h:mm"));
		assertEquals(21, df.getFormat("h:mm:ss"));
		assertEquals(22, df.getFormat("m/d/yy h:mm"));
		assertEquals(37, df.getFormat("#,##0 ;(#,##0)"));
		assertEquals(38, df.getFormat("#,##0 ;[Red](#,##0)"));
		assertEquals(39, df.getFormat("#,##0.00;(#,##0.00)"));
		assertEquals(40, df.getFormat("#,##0.00;[Red](#,##0.00)"));
		assertEquals(45, df.getFormat("mm:ss"));
		assertEquals(46, df.getFormat("[h]:mm:ss"));
		assertEquals(47, df.getFormat("mmss.0"));
		assertEquals(48, df.getFormat("##0.0E+0"));
		assertEquals(49, df.getFormat("@"));
		assertEquals(27, df.getFormat("[$-404]e/m/d"));
		assertEquals(30, df.getFormat("m/d/yy"));
		assertEquals(36, df.getFormat("[$-404]e/m/d"));
		assertEquals(50, df.getFormat("[$-404]e/m/d"));
		assertEquals(57, df.getFormat("[$-404]e/m/d"));
		assertEquals(59, df.getFormat("[$-404]e/m/d"));
		assertEquals(32, df.getFormat("[$-404]e/m/d"));
		assertEquals(33, df.getFormat("[$-404]e/m/d"));
		assertEquals(44, df.getFormat("[$-404]e/m/d"));
		assertEquals(31, df.getFormat("[$-404]e/m/d"));
		assertEquals(35, df.getFormat("[$-404]e/m/d"));
		assertEquals(58, df.getFormat("[$-404]e/m/d"));
		assertEquals(56, df.getFormat("[$-404]e/m/d"));
		assertEquals(55, df.getFormat("[$-404]e/m/d"));
		assertEquals(52, df.getFormat("[$-404]e/m/d"));
		assertEquals(53, df.getFormat("[$-404]e/m/d"));
		assertEquals(54, df.getFormat("[$-404]e/m/d"));
		assertEquals(26, df.getFormat("[$-404]e/m/d"));
		assertEquals(29, df.getFormat("[$-404]e/m/d"));
		assertEquals(28, df.getFormat("[$-404]e/m/d"));
		assertEquals(34, df.getFormat("[$-404]e/m/d"));
		assertEquals(51, df.getFormat("[$-404]e/m/d"));
		assertEquals(23, df.getFormat("[$-404]e/m/d"));
		assertEquals(24, df.getFormat("[$-404]e/m/d"));
		assertEquals(25, df.getFormat("[$-404]e/m/d"));
		assertEquals(41, df.getFormat("_(* #,##0_);_(* (#,##0);_(* \"-\"_);_(@_)"));
		assertEquals(42, df.getFormat("_($* #,##0_);_($* (#,##0);_($* \"-\"_);_(@_)"));
		assertEquals(43, df.getFormat("_(* #,##0.00_);_(* (#,##0.00);_(* \"-\"??_);_(@_)"));
		assertEquals(61, df.getFormat("_(\"$\"* #,##0.00_);_(\"$\"* (#,##0.00);_(\"$\"* \"-\"??_);_(@_)"));
		assertEquals(62, df.getFormat("mm:ss.0"));
		assertEquals(63, df.getFormat("##0.0E+0"));
		assertEquals(64, df.getFormat("@"));
		assertEquals(65, df.getFormat("[$-404]e/m/d"));
		assertEquals(66, df.getFormat("[$-404]e/m/d"));
		assertEquals(67, df.getFormat("[$-404]e/m/d"));
		assertEquals(68, df.getFormat("[$-404]e/m/d"));
		assertEquals(69, df.getFormat("[$-404]e/m/d"));
		assertEquals(70, df.getFormat("[$-404]e/m/d"));
		assertEquals(71, df.getFormat("[$-404]e/m/d"));
		assertEquals(72, df.getFormat("[$-404]e/m/d"));
		assertEquals(73, df.getFormat("[$-404]e/m/d"));
		assertEquals(74, df.getFormat("[$-404]e/m/d"));
		assertEquals(75, df.getFormat