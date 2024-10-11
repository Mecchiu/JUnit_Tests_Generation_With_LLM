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
		

    private static final IRequest request = new HtmlRequest();

    @Test
    public void test1() throws Exception {
        try {
            request.getParameterMap().put("d", "2010_12");
            request.setAttribute("a", "b");
            fail("Should not get here");
        } catch (TagLibException e) {
            // We expect a TagLibException here. Since 1.2
            LOG.trace(e);
            assertTrue("Should be a TagLibException.", e.getCause() instanceof JspTagException);
        }
    }

    @Test
    public void test2() throws Exception {
        try {
            request.getParameterMap().put("d", "2010_12");
            request.setAttribute("v", "2010_12_31");
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(new DecimalFormat("0000").format(100), ",");
            for (int count = 0; count < 100; count++) {
                sb.append(st.nextToken()).append("|");
            }
            request.setAttribute("v", sb.toString());
            fail("Should not get here");
        } catch (TagLibException e) {
            // We expect a TagLibException here. Since 1.2
            LOG.trace(e);
            assertTrue("Should be a TagLibException.", e.getCause() instanceof JspTagException);
        }
    }

    @Test
    public void test3() throws Exception {
        try {
            request.getParameterMap().put("d", "1_0_0");
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(new DecimalFormat("0000").format(100), ",");
            for (int count = 0; count < 100; count++) {
                sb.append(st.nextToken()).append("|");
            }
            request.setAttribute("v", sb.toString());
            fail("Should not get here");
        } catch (TagLibException e) {
            // We expect a TagLibException here. Since 1.2
            LOG.trace(e);
            assertTrue("Should be a TagLibException.", e.getCause() instanceof JspTagException);
        }
    }
}
// Functions_1Test.java
//