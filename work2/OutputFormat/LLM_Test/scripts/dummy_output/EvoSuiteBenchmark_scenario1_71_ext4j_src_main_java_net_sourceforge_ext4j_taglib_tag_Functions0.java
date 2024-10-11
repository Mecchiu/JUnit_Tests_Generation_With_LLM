
package net.sourceforge.ext4j.taglib.tag;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.servlet.jsp.JspTagException;
import net.sourceforge.ext4j.taglib.bo.IRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class FunctionsTest {
 @Test
 void testDateFormat_NullDate() {
  assertEquals("", Functions.dateFormat(null, "dd/MM/yyyy"));
 }
 @Test
 void testDateFormat_NullPattern() {
  assertEquals("", Functions.dateFormat(new Date(), null));
 }
 @Test
 void testDateFormat_NullDateAndPattern() {
  assertEquals("", Functions.dateFormat(null, null));
 }
 @Test
 void testDateFormat_Pattern_ddMMyyyy() {
  assertEquals("01/01/1970", Functions.dateFormat(new Date(0), "dd/MM/yyyy"));
 }
 @Test
 void testDateFormat_Pattern_ddMMyyyyHHmmss() {
  assertEquals("01/01/1970 00:00:00", Functions.dateFormat(new Date(0), "dd/MM/yyyy HH:mm:ss"));
 }
 @Test
 void testDateFormat_Pattern_ddMMyyyyHHmmssSSS() {
  assertEquals("01/01/1970 00:00:00.000", Functions.dateFormat(new Date(0), "dd/MM/yyyy HH:mm:ss.SSS"));
 }
 @Test
 void testDateFormat_Pattern_ddMMyyyyHHmmssSSS_WithMilliseconds() {
  assertEquals("01/01/1970 00:00:00.123", Functions.dateFormat(new Date(123), "dd/MM/yyyy HH:mm:ss.SSS"));
 }
 @Test
 void testDateFormat_Pattern_ddMMyyyyHHmmssSSS_WithMilliseconds2() {
  assertEquals("01/01/1970 00:00:00.123", Functions.dateFormat(new Date(1234), "dd/MM/yyyy HH:mm:ss.SSS"));
 }
 @Test
 void testDateFormat_Pattern_ddMMyyyyHHmmssSSS_WithMilliseconds3() {
  assertEquals("01/01/1970 00:00:00.123", Functions.dateFormat(new Date(12345), "dd/MM/yyyy HH:mm:ss.SSS"));
 }
 @Test
 void testDateFormat_Pattern_ddMMyyyyHHmmssSSS_WithMilliseconds4() {
  assertEquals("01/01/1970 00:00:00.123", Functions.dateFormat(new Date(123456), "dd/MM/yyyy HH:mm:ss.SSS"));
 }
 @Test
 void testDateFormat_Pattern_ddMMyyyyHHmmssSSS_WithMilliseconds5() {
  assertEquals("01/01/1970 00:00:00.123", Functions.dateFormat(new Date(1234567), "dd/MM/yyyy HH:mm:ss.SSS"));
 }
 @Test
 void testDateFormat_Pattern_ddMMyyyyHHmmssSSS_WithMilliseconds6() {
  assertEquals("01/01/1970 00:00:00.123", Functions.dateFormat(new Date(12345678), "dd/MM/yyyy HH:mm:ss.SSS"));
 }
 @Test
 void testDateFormat_Pattern_ddMMyyyyHHmmssSSS_WithMilliseconds7() {
  assertEquals("01/01/1970 00:00:00.123", Functions.dateFormat(new Date(123456789), "dd/MM/yyyy HH:mm:ss.SSS"));
 }
 @Test
 void testDateFormat_Pattern_ddMMyyyyHHmmssSSS_WithMilliseconds8() {
  assertEquals("01/01/1970 00:00:00.123", Functions.dateFormat(new Date(1234567890), "dd/MM/yyyy HH:mm:ss.SSS"));
 }
 @Test
 void testDateFormat_Pattern_ddMMyyyyHHmmssSSS_WithMilliseconds9() {
  assertEquals("01/01/1970 00:00:00.123", Functions.dateFormat(new Date(Long.parseLong("12345678901")), "dd/MM/yyyy HH:mm:ss.SSS"));
 }
 @Test
 void testDateFormat_Pattern_ddMMyyyyHHmmssSSS_WithMilliseconds10() {
  assertEquals("01/01/1970 00:00:00.123", Functions.dateFormat(new Date(Long.parseLong("123456789012")), "dd/MM/yyyy HH:mm:ss.SSS"));
 }
}