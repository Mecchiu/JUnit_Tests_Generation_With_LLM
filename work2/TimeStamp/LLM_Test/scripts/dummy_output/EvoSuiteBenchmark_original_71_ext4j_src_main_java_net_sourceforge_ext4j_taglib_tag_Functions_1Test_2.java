// Functions_1Test.java
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
* It contains one unit test case for the {@link Functions#addS(String)} method.
*/
class Functions_1Test {
		public Functions_1Test() {
				// This is the simplest case of one unit test.
				// AddOneCase is a one case.
				// In this case we are not using the {@link #replaceCRWithBR(String)} method but just converting
				// between characters.
				for (int i = 0; i < 25; i++) {
						mLogger.debug(
								"Adding a word with the replacement { "
										+ ", " + replace(" ", "'", replace(" ", "'", i, replace(" ", "'")) + " ', '%").trim());
				}
				mLogger.debug("In the end of the processing, all words are added.");
				//assertEquals(3, wordsLength());
		}

		@Test
		public final void addOneCase() throws Exception {
				// assertTrue(wordsLength() == 1);
				String s = replace("-", " + ", ");
				assertEquals(4, i(s, 1));
		}

		@Test
		public final void addOneCaseNegativeOnePositive() throws Exception {
				String s = replace("-", " + ", " + replace(" ", "'", replace(" ", "'", 0, 0)) + "'");
				assertEquals(4, i(s, 1));
		}

		@Test
		public final void addOneCaseOnePosPosNegOne() throws Exception {
}
}