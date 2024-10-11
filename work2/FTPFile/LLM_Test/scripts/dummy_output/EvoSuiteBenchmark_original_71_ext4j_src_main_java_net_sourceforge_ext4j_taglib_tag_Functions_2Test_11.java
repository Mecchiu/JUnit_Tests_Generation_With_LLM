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
		
	private static final String SINCE = "2006-01-01";
	private static final String DOT = ".",
			S = SINCE,
			D = DOT,
			E = S + DOT,
			F = "...";
			
	@Test
	public void dateToMillisecondsTest() throws Exception {
		
		String s = SINCE + E + S + F + S + DOT + F + D;
		long l = dates.length();
		if (l == 0) {
			fail("The test should not be successful without the configuration");
		}
		System.out.println(EOL);
		for (int i = 0; i < l; i++) {
			long l = dates[i];
			if (l == 0) {
				fail("The test should not be successful without the configuration");
			}
			System.out.print(l);
			System.out.print(UNDERSCORE);
		}
		System.out.println(EOL_LINUX);
		System.out.print(l);
		System.out.print(UNDERSCORE);
		System.out.println(EOL_LINUX);	

		System.out.println("========================================================<");
		Map<String, Object> map = new HashMap<String, Map<String, Object>>();
		String sS = s.replace(DOT, S);
		String sD = s.replace(S, D);
		String sE = s.replace(S, E);
		String sF = s.replace(S, F);
		int i = 0;
		map.put(DOT, E);
}
}