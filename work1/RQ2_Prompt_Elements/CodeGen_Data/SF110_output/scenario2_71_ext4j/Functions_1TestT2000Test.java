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
// Functions.java
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

/**
 * @author luc
 */
public class Functions {

    /**
     * Add's or'at the end of the text, for example "James'" for "James" or "Daniel's" for "Daniel"
     *
     * @param pText the text
     * @return the text with's or '
     */
    public static String addS(String pText) {
        if (pText == null || pText.trim().equals(""))
            return "";
        if (pText.charAt(pText.length() - 1) =='s')
            return pText + "'";
        else
            return pText + "'s";
    }
}

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
		
	/*
	public static Test suite() throws Exception {
		return new TestSuite(Functions_1Test.class);
	}
    */

    /*
     * Test case(s) of {@link Functions#addS(String)}
     */
    @Test
    public void testAddS1() {
        Functions_2 f = new Functions_2();
        String s = "James";
        String result = f.addS(s);
        assertEquals("",s);
        if (result.length() > 1)
            assertTrue(result.endsWith("s"));
        else
            assertTrue(result.endsWith("s "));
    }

    /**
	* Test case for 'add s in string'
	*/
	public static class Functions_2 {
		
		/*
		 * Test case for 'adds s in string'
		 */
		
		@RequestMapping
		public void testAddSInString(String pText) {
			
			try {
				Functions_1.addS(pText);
				fail();
			}
			catch (JspTagException e) {
			    assertEquals(Constants.ERR_ATTR_MISSING,e.getError());
			}
		}
		
	}
}

// Functions_2Test.java
package net.sourceforge.ext4j.taglib.tag;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import net.sourceforge.ext4j.util.Ext4JUtil;

/**
* Testing <code>Functions.addS(String)</code> constructor.
*/
public class Functions_1Test {

	/**
	* Test case for <code>Functions.addS(String)</code>
	*/
	@Test
    public void testAddStrings1() {
		
		Functions_1 s1 = new Functions_1();
		String s = "James";
		
		String resultStr = "James is a functioal";
		
		String result2 = s1.addS(s);
		
		assertEquals(resultStr, result2);

	    if (s2 == null || s2.equals(s.toString())) {
	        // No error expected;
	    }
		else if (s.toString().endsWith("s "))
			assertEquals(resultStr, s.toString().remove(resultStr.length() - 3, 3));

		assertTrue(Ext4JUtil.isEquivalentString(resultStr, s));
	}

	/**
	* Test case for <code>adds s in string</code>
	*/
	@Test
    public void testAddStrings2() {

		Functions_1 s1 = new Functions_1();
		String s = "James";

		List resStrings = s1.addStrings(new String[] { s });
        assertEquals(1, resStrings.size());
        Iterator it = resStrings.iterator();
        String s2 = null;
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            if (entry.getValue().equals(s)) {
                s2 = (String) entry.getKey();
            }
        }

	    if (s2 == null || s2.equals(s.toString())) {
	        // No error expected;
	    }
		else if (s.toString().endsWith("s "))
			assertEquals(s, s2);

	    List resStrings2 = s1.addStrings(new String[]{s});
        assertEquals(1, resStrings2.size());
        assertEquals(s, s2);

	    // No error expected;
        Collection resStrings2Collection = resStrings2.size() > 1? s1.findStrings(s2, true, true): new ArrayList(resStrings2);
        assertEquals(1, resStrings2Collection.size());
        assertEquals(s, ((String) resStrings2Collection.get(0)));

        if (resStrings2Collection.size() == 1)
            assertEquals(s, ((String) resStrings2Collection.get(0)));
        else if (resStrings2Collection.size() > 1)
            assertEquals(s2, ((String) resStrings2Collection.get(0))); /* No error expected */

    }

	@Test
    public void testMergeValues() {
        // This test will fail for non-existent items.

        functions_1.addStrings(_);
        Map map = new HashMap();
        map.put("f1", f1);

        Map result = functions_1.mergeValues(map);

	    functions_1_1.addStrings(result);
	    result = functions_1.mergeValues(map);

		assertEquals(true, result.equals(functions_1_1));
	}

    /**
	* Test of the String to String class method.
	*/
    @Test
    public void testStringArray() {

        functions_1.addStrings(new String[] { "f1", "f2", "f3" });

        Map map = new HashMap();
        map.put("f1", f1);
        map.put("f2", f2);
        map.put("f3", f3);

        functions_1_1.addStrings(map);
        map.clear();

        String s = functions_1.getStringArray('[');

        assertEquals(String.class, s.getClass());
        assertEquals(String.valueOf(f2), s.indexOf("f2"));
        assertEquals(String.valueOf(f3), s.indexOf("f3"));
    }

    @Test
    public void testAddArray() {
        // This test will fail for non-existent items.

        new ArrayList();
        new HashMap();
        new SimpleDateFormat();
    }

    @Test
    public void testAddDate() {
        new Date();
    }
}