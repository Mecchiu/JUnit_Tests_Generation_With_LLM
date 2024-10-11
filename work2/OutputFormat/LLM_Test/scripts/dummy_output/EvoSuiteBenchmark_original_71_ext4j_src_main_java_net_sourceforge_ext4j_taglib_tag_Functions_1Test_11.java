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
		private static final String FILL_TENS = "00000123456789";

		private IRequest mRequest;

		private String mText;

	@Test
	public void test() throws Exception {
        StringBuffer result = new StringBuffer();

        mRequest = new IRequest(IRequest.REQUEST);
        mRequest.setParsedText(mText);

        result.append(mRequest.render(Functions_1Test.class.getName()));
        mRequest.cleanUp();

		assertEquals(result.toString(), FILL_TENS, mRequest.getParameter("fill"));

	}

	@Test
	public void test_invalidNumber() throws Exception {
        StringBuffer result = new StringBuffer();

        mRequest = new IRequest(IRequest.REQUEST);
        mRequest.setParsedText(mText);

        result.append(mRequest.render(Functions_1Test.class.getName()));
        mRequest.cleanUp();

        map(Functions_1Test.class.getName(), result);
	}

    private static void map(String module, StringBuffer result) {

            @SuppressWarnings("unchecked")
            Map<String, Map<String, String>> map =
                    (Map<String, Map<String, String>>)
                            Functions_1Test.this.getClass().getClassLoader().loadClass(module).newInstance();
            result.append(createLinkString(map));

            result.append("\n");

    }


	static String createLinkString(Map<String, Map<String, String>> map) {
		StringBuffer linkString = new StringBuffer();
		for (String key : map.keySet()) {
			linkString.append(map.get(key).get("url")).append(" ");
		}
		return linkString.toString();
	}

        private static String join(String[] params)
                throws NullPointerException {
                if (params == null) {
                    return "";
                }
                return params[0] + ":" + "\"" + params[1] + "\"";
        }

        private static String ordinal(int pValue)
                throws Exception {
            int value = pValue / 10;
}
}