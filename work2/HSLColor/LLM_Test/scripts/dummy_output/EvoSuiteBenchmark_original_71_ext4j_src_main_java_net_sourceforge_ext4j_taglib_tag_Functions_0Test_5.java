// Functions_0Test.java
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
* It contains one unit test case for the {@link Functions#dateFormat(Date, String)} method.
*/
class Functions_0Test {
		@Test
		void test() throws Exception {
			final double d = 2.54;
			final String s = "hello";

			/**
			 * Format a duration
			 *
			 *     <p>The following line is fine: "30s";
			 */
			final SimpleDateFormat formatter = new SimpleDateFormat("hh:m:ss");
			final String s1 = Formatter.formatDuration(formatter, d);

			/**
			 * Format the seconds as a duration
			 *
			 *     <p>The following line is fine: "3.10s";
			 */
			final SimpleDateFormat formatter1 = new SimpleDateFormat("hh:m:s");
			final String s2 = Formatter.formatSeconds(formatter1, d);

			/**
			 * Formatter without spaces. Format a string.
			 *
			 *     <p>The following line is fine: "hello world";
			 */
			final SimpleDateFormat formatter2 = new SimpleDateFormat("");
			final String s3 = Formatter.formatString(formatter2, s);

			/**
			 * Formats a duration in the past.
			 *
			 *     <p>The following line is fine: "30s";
			 */
			final SimpleDateFormat formatter3 = new SimpleDateFormat("hms");
			final String s4 = Formatter.formatDuration(formatter3, -3.10d);

			/**
			 * Formats a duration in the future.
			 *
			 *     <p>The following line is fine: "3.10s";
			 */
			final SimpleDateFormat formatter4 = new SimpleDateFormat("hms");
			final String s5 = Formatter.formatDuration(formatter4, 3.10d);

			/**
			 * Formats a duration in the past.
			 *
			 *     <p>The following line is fine: "3.10s";
			 */
			final SimpleDateFormat formatter5 = new SimpleDateFormat("ss");
			final String s6 = Formatter.formatDuration(formatter5, 3.10d);

			/**
			 * Formats a duration in the future.
			 *
			 *     <p>The following line is fine: "3.10s";
			 */
			final SimpleDateFormat formatter6 = new SimpleDateFormat("ss");
}
}