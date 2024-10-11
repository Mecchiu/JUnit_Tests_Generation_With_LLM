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
		
	public static String addS(String pText) {
		return pText.replaceAll("\"", "''");
	}
	
	/**
	 * Add a unit test to the String.
	 * @param pText the String to be added to its own context.
	 */
	public static void addTests1(String pText) {
		
		StringTokenizer sT = new StringTokenizer(pText, "_");
		
		if (sT.countTokens() > 0) {
			
			assertEquals("Add a unit test that removes unit test from the String.",
	        		addS(sT.nextToken()),
	        		System.out.println(addS(pText.trim())));
	
		} else {
			
			// Add a simple unit test.
			String sTmp = addS(todo.addS(pText));
			assertEquals("Add a simple unit test.", sTmp, 
	        		System.out.println(addS(pText.replaceAll("\"", "''"))));
	
		}
	}
}