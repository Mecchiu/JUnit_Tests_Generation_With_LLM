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
	 * Test case for {@link HSSFDataFormat#getFormat(String)}
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetFormat() throws Exception {
		HSSFDataFormat dataFormat = new HSSFDataFormat(new Workbook());
		assertEquals(0, dataFormat.getFormat("General"));
		assertEquals(1, dataFormat.getFormat("0"));
		assertEquals(2, dataFormat.getFormat("0.00"));
		assertEquals(3, dataFormat.getFormat("#,##0"));
		assertEquals(4, dataFormat.getFormat("#,##0.00"));
		assertEquals(5, dataFormat.getFormat("($#,##0_);($#,##0)"));
		assertEquals(6, dataFormat.getFormat("($#,##0_);[Red]($#,##0)"));
		assertEquals(7, dataFormat.getFormat("($#,##0.00_);($#,##0.00)"));
		assertEquals(8, dataFormat.getFormat("($#,##0.00_);[Red]($#,##0.00)"));
		assertEquals(9, dataFormat.getFormat("0%"));
		assertEquals(10, dataFormat.getFormat("0.00%"));
		assertEquals(11, dataFormat.getFormat("0.00E+00"));
		assertEquals(12, dataFormat.getFormat("# ?/?"));
		assertEquals(13, dataFormat.getFormat("# ??/??"));
		assertEquals(14, dataFormat.getFormat("mm-dd-yy"));
		assertEquals(15, dataFormat.getFormat("d-mmm-yy"));
		assertEquals(16, dataFormat.getFormat("d-mmm"));
		assertEquals(17, dataFormat.getFormat("mmm-yy"));
		assertEquals(18, dataFormat.getFormat("h:mm AM/PM"));
		assertEquals(19, dataFormat.getFormat("h:mm:ss AM/PM"));
		assertEquals(20, dataFormat.getFormat("h:mm"));
		assertEquals(21, dataFormat.getFormat("h:mm:ss"));
		assertEquals(22, dataFormat.getFormat("m/d/yy h:mm"));
		assertEquals(37, dataFormat.getFormat("#,##0 ;(#,##0)"));
		assertEquals(38, dataFormat.getFormat("#,##0 ;[Red](#,##0)"));
		assertEquals(39, dataFormat.getFormat("#,##0.00;(#,##0.00)"));
		assertEquals(40, dataFormat.getFormat("#,##0.00;[Red](#,##0.00)"));
		assertEquals(45, dataFormat.getFormat("mm:ss"));
		assertEquals(46, dataFormat.getFormat("[h]:mm:ss"));
		assertEquals(47, dataFormat.getFormat("mmss.0"));
		assertEquals(48, dataFormat.getFormat("##0.0E+0"));
		assertEquals(49, dataFormat.getFormat("@"));
		assertEquals(27, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(30, dataFormat.getFormat("m/d/yy"));
		assertEquals(36, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(50, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(57, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(59, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(32, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(33, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(34, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(35, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(58, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(31, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(55, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(56, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(44, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(28, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(29, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(51, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(52, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(53, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(54, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(23, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(24, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(25, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(26, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(41, dataFormat.getFormat("_(* #,##0_);_(* (#,##0);_(* \"-\"_);_(@_)"));
		assertEquals(42, dataFormat.getFormat("_($* #,##0_);_($* (#,##0);_($* \"-\"_);_(@_)"));
		assertEquals(43, dataFormat.getFormat("_(* #,##0.00_);_(* (#,##0.00);_(* \"-\"??_);_(@_)"));
		assertEquals(63, dataFormat.getFormat("_(\"$\"* #,##0_);_(\"$\"* (#,##0);_(\"$\"* \"-\"_);_(@_)"));
		assertEquals(64, dataFormat.getFormat("_(* #,##0.00_);_(* (#,##0.00);_(* \"-\"??_);_(@_)"));
		assertEquals(65, dataFormat.getFormat("mm:ss.0"));
		assertEquals(66, dataFormat.getFormat("##0.0E+0"));
		assertEquals(67, dataFormat.getFormat("@"));
		assertEquals(68, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(69, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(70, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(71, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(72, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(73, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(74, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(75, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(76, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(77, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(78, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(79, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(80, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(81, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(82, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(83, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(84, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(85, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(86, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(87, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(88, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(89, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(90, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(91, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(92, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(93, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(94, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(95, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(96, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(97, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(98, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(99, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(100, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(101, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(102, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(103, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(104, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(105, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(106, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(107, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(108, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(109, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(110, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(111, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(112, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(113, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(114, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(115, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(116, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(117, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(118, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(119, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(120, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(121, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(122, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(123, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(124, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(125, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(126, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(127, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(128, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(129, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(130, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(131, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(132, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(133, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(134, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(135, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(136, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(137, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(138, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(139, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(140, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(141, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(142, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(143, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(144, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(145, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(146, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(147, dataFormat.getFormat("[$-404]e/m/d"));
		assertEquals(148, dataFormat.getFormat("[$-404]e/m/d"));
	