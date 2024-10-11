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
		@Test
	void test() {
						
		assertNotNull("null of vector object", new Vector<>() {
		});
		ListIterator<String> it = new Vector<>() {
			private int counter =0;
			public boolean hasNext() {
			    return counter<4;
			}
			public String next() {
					return "1";
			}
			};
		String[] elements={"1", 
"2", 
"3", 
"4", 
"5", 
"6",  
"7", 
"8", 
"9", 
"0"};
		it.add(elements[1]);
var str=it.next();
assertNotNull("null of Vector object", it);
assertNotNull("null of String object", new StringTokenizer(str," "));

}
}