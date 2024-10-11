// InspirentoUtilities_0Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains one unit test case for the {@link InspirentoUtilities#tokenize(String)} method.
*/
class InspirentoUtilities_0Test {
		/**
		 * This method tests the method tokenize(String). 
             * It has to produce an array of Strings, each of which contains
			 a unique token.
		 */
         @Test
		public void test() {
		
                Vector<String> array1 = new Vector<>(1);
                array1.add("file");
		String[] array2 = tokenize(array1.get(array1.size() - 1));
                assertEquals(array1, array2);
                
                // The following test will cause an exception 
                Vector<String> array3 = new Vector<>(1);
                array3.add("listing");
		array3 = tokenize(array3.get(array3.size() - 1));
                assertEquals(array1, array3);
		
		assertTrue(array2[0].equals("listing"));
                
                Vector<String> array4 = new Vector<>(3);
                array4.add("file");
                array4.add("list");
                array4.add("view");
                Vector<String> array5 = tokenize(array4.get(1));
                assertEquals(array4, array5);
                
                Vector<String> array6 = tokenize(array4.get(1));
                assertEquals(1, array6.size());
                assertTrue(!array6.get(0).equals("edit"));
                
                Vector<String> array7 = tokenize(array4.get(1));
                assertEquals(1, array7.size());
                assertTrue(!array7.get(0).equals("list"));
                
                Vector<String> array8 = tokenize(array4.get(1));
                assertEquals(1, array8.size());
                assertTrue(!array8.get(0).equals("view"));
                
                Vector<String> array9 = tokenize(array4.get(1));
                assertEquals(3, array9.size());
        

	
        }
		
}