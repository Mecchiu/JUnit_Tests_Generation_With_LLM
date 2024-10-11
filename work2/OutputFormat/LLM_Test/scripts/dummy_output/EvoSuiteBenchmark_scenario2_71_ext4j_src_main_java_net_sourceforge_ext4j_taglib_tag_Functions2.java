
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
 void testDateToMilliseconds_NullDate() {
  assertEquals(0, Functions.dateToMilliseconds(null));
 }
 @Test
 void testDateToMilliseconds_NotNullDate() {
  Calendar c = Calendar.getInstance();
  c.set(Calendar.YEAR, 2020);
  c.set(Calendar.MONTH, Calendar.JANUARY);
  c.set(Calendar.DAY_OF_MONTH, 1);
  c.set(Calendar.HOUR_OF_DAY, 0);
  c.set(Calendar.MINUTE, 0);
  c.set(Calendar.SECOND, 0);
  c.set(Calendar.MILLISECOND, 0);
  assertEquals(Long.parseLong("1577836800000"), Functions.dateToMilliseconds(c.getTime()));
 }
}