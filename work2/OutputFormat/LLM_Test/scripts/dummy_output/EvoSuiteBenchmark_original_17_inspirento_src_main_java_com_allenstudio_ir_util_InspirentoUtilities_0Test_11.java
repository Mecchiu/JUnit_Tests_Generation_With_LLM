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
		public static final String[][] TEST_STRATEGY = {
					{"test1", null}, {"test2"}, 
                  {"test3", "test4", "test5"},
                  {"", null}
	};
		private Vector<String[]> test_Strategy_Vector = null;
		public InspirentoUtilities() {
				test_Strategy_Vector = new Vector<String[]>(5, 2);
				test_Strategy_Vector.addElement(TEST_STRATEGY);
        }
}