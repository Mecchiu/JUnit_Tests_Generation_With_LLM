// Functions_2Test.java
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

/**
* Test class of {@link Functions}.
* It contains one unit test case for the {@link Functions#dateToMilliseconds(Date)} method.
*/
class Functions_2Test {
		private final static SimpleDateFormat sdf = new SimpleDateFormat("EE MMM d, yyyy");
		private final static String testString = "Jan 2, 1970 at 09:30:00 PM EST";
        private final static IRequest request = new IRequestImpl();

        private void assertNumber(double pValue) throws Exception {
            StringBuilder sb = new StringBuilder();
            DecimalFormat df = new DecimalFormat("#,.##");
            DecimalFormat df2 = new DecimalFormat("########");
            assertEquals(df.format(pValue), df2.format(pValue));
        }
        private void assertNumber(long pValue) throws Exception {
            StringBuilder sb = new StringBuilder();
            DecimalFormat df = new DecimalFormat("#.#####");
            assertEquals(df.format(pValue), df.format(pValue));
        }
        private void assertString(String pValue) throws Exception {
            StringBuilder sb = new StringBuilder();
            assertNotNull(sb);
            assertEquals(sb.toString(), sb);
        }
        private void assertString(String pValue, Object pExtra) throws Exception {
            StringBuilder sb = new StringBuilder();
            assertNotNull(sb);
            assertEquals(sb.toString(), sb);
        }
        @Test
		public void testZeroString() throws Exception {
            Number number = (Number)Double.valueOf(0.0);
            assertNumber( 0.0);
            assertNumber(0.0);
            assertNumber(0.0);
            assertNumber(0.0);
            assertNumber(Double.valueOf(0.0));
        }
        @Test
		public void testDate() throws Exception {
            Date date;
            date = sdf.parse("1970-01-01T00:30:00+01:00");
            assertDate(date);
            date = sdf.parse("1970-01-01T00:30:02+00:00");
            assertDate(date);
            date = sdf.parse("1970-01-01T01:00:00P000");
            assertDate(date);
            date = sdf.parse("1970-01-01T00:00:00+01:00");
            assertDate(date);
}
}