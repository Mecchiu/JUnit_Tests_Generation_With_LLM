// InspirentoUtilities_1Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains one unit test case for the {@link InspirentoUtilities#escapeText(String)} method.
*/
class InspirentoUtilities_1Test {
		
	/**
	 * @return a string that represents
	 * no quotes and the following sequence:
	 * "The &'s are escaped", etc.
	 */
    public String escapeText(String str) {
        Vector<String> tokens = new Vector<String>();
        String newStr = "";
        StringBuffer bf = new StringBuffer();
        StringTokenizer st = new StringTokenizer(str,"\n\r\a");
	int nextToken = 0;

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if ((nextToken == 0)) {
                bf.append(token);
            } else if ((nextToken == 1)) {
                int pos = token.indexOf('"');
                bf.append(token);
                // if ((pos == -1))
                bf.append("\\\"");
                if (pos > 0) {
                    bf.insert(pos, "\n");
                }
                nextToken = 0;
            } else if ((nextToken == 2)) {
                String newToken = "\\b("+token+")\\b";
                bf.append(newToken);
                bf.setLength(bf.length()-2);
                bf.append(" ");
                bf.append(token);
                //
                nextToken = 0;
                bf.append("\\n");
            }
	}

        // tokenize
        while (bf.length() > 0) {
            newStr = bf.append(" ").toString();
            StringTokenizer st = new StringTokenizer(newStr);
            while (st.hasMoreTokens()) {
                String token = st.nextToken();
                tokens.addElement(token);
            }
            bf.setLength(bf.length()-1);
        }

        if (bf.length() == 0) {
            bf.append("The & must be escaped");
        }

        // convert escape sequences to HTML entities
        for (String elem : tokens) {
	    // the html code format can look like: <br/>
            String htmlCode = "";
            synchronized (bw.getStagedBuffer()) {
                htmlCode = bw.getStagedBuffer().toString();
                final int len = htmlCode.length();
                synchronized (bw.getStagedBuffer()) {
                    if (len == 0) {
                        bw.getStagedBuffer().append("<br/>");
                    } else {
                        bw.getStagedBuffer().append(htmlCode.substring(len - 3));
                    }
                }
            }
            bw.setInput(bw.getStagedBuffer().toString());
            bw.flush();
            if (!bw.getStagedBuffer().equals("\r\n\r\n")) {
                assertEquals("Non-empty html buffer does not contain the right number of escaped chars", e, bw.getStagedBuffer().substring(0, len).trim());
                assertEquals("Non-empty html buffer does not contain the right number of escaped chars", htmlCode, bw.getStagedBuffer().substring(len - 3).trim());
            }
        }

        return newStr;
    }
}

// ============================================================================
// InspirentoUtilities_1Test.java
// ============================================================================