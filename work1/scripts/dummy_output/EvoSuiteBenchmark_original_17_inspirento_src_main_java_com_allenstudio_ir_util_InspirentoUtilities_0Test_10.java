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
		 * Unit test.
		 * Method testTokenize() performs itself
		 * under the same test.
		 */
		private String[] tokenize(Vector<String> list) {
			StringBuffer buf1 = new StringBuffer();

			for (int index = 0; index < list.size(); index++) {
				String token1 = list.get(index);
				buf1.append(token1);
				for (int i = index; i < list.size(); i++) {
					String token2 = list.get(i);
					if (token1.equals(token2)) {
						break;
					}
				}
			}

			Vector<String> listcopy = new Vector<String> (list);
			for (int i = 0; i < listcopy.firstElementIndex(); i++) {
				listcopy.remove(i);
			}
			String[] array = new String[listcopy.size()];
			for (int i = 0; i < array.length; i++) {
				array[i] = listcopy.get(i);
			}
			return array;
		}
}