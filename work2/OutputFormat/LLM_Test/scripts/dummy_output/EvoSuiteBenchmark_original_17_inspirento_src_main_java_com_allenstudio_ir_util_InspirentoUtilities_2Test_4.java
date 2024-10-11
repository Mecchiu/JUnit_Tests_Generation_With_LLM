// InspirentoUtilities_2Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains one unit test case for the {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)} method.
*/
class InspirentoUtilities_2Test {
		@Test()
		public void testStringReplaceAll() {
				// TODO Auto-generated method stub
				assertEquals("Hello", "Hello".replaceAll("c", 'e'));

		}
}
// /*static inline String substitute(String in, char c)
//     * substitutes "c", which is a backslash character
//     * with `c'
//     *
//     * If substitution is successful, the contents of
//     * the input `in' will be returned unchanged. In that
//     * case, return the result string unchanged
//     */
// static String substitute(String in) {
// char inChar = in.charAt(0);
// switch (inChar) {
// case 'c':
// return "c";

// // case 'e':
// return "e";

// default:
// return in;
// }
// }
/* static abstract class Substitute 
     * { public static abstract String substitute(String in) {
            StringBuffer buffer = new StringBuffer();
            String temp = in;
            String res = temp;
            while (true) {
                int i = temp.indexOf("/");
                if (i == -1)
                    break;
                String toSub = temp.substring(0, i);
                if (toSub.equals(""))
                        break;
                temp = temp.substring(i + 1);
                buffer.append(substitute(toSub));
                res = buffer.toString();
                buffer = new StringBuffer();
            }
            return res; 
        }}
*/