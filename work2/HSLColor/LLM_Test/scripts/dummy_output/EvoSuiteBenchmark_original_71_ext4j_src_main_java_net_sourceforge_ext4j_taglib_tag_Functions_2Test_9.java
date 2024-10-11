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
		/**
		 * Test method for {@link Functions#dateToMilliseconds(Date)}.
		 */
		@Test
		public void dateToMillisecondsTest() throws Exception {
			//TODO add test case
		}

		/**
		 * Test method for {@link Functions#formatNumber(double, String)}.
		 */
		@Test
		public void formatNumber_2Test() throws Exception {
			IRequest request =
			        new IRequest() {

						public String getParameter(String pName) {
							return (String) getRequestAttributes().get(
						            pName);
						};
					};

			String result = Functions.formatNumber(3.0, 5);

			assertEquals("{d='3,5'}", result);
		}

		/**
		 * Test method for {@link Functions#getWordCapacity(int)}.
		 */
		@Test
		public void getWordCapacity_1Test() throws Exception {
			//TODO add test case
		}

		/**
		 * Test method for {@link Functions#getNumberOfWordCapacity(int)}.
		 */
		@Test
		public void getNumberOfWordCapacity_1Test() throws Exception {
			//TODO add test case
		}

		/**
		 * Test method for {@link Functions#getLastDigit(int)}.
		 */
		@Test
		public void getLastDigit_1Test() throws Exception {
			//TODO add test case
		}

		/**
		 * Test method for {@link FunctionUtils#removeZeroFromName(String, Map)}
		 * @throws Exception
		 */
		@Test
		public void removeZeroFromName_2Test() throws Exception {
			//TODO add test case
		}

		/**
		 * Test method for {@link FunctionUtils#fillTens(String, int, int, int)}
		 * @throws Exception
		 */
		@Test
		public void fillTens_2Test() throws Exception {
			//TODO add test case
		}
}

// Functions_2Test.java