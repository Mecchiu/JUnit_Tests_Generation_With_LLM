// ParameterBeanTest.java
package org.heal.module.search;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterBean}.
* It contains one unit test case for the {@link ParameterBean#size()} method.
*/
class ParameterBeanTest {
		private ParameterBean pb;

		public ParameterBeanTest() {
		}

		/**
		 * Constructor
		 *
		 * @param pbe
		 *
		 * @throws Exception
		 */
		public ParameterBeanTest(ParameterBean pbe) throws Exception {
				pb = pbe;
		}

		/**
		 * accessor method, returns the parameterNode at specified position.
		 *
		 * @param position
		 *
		 * @return ParameterNode
		 */
		private ParameterNode getParameters(int position) throws Exception {
				return pb.getParameters(position);
		}

		/**
		 * accessor method, returns the searchParameter size.
		 *
		 * @return int
		 */
		private int size() {
				return pb.size();
		}

		/**
		 * tests the size() method.
		 *
		 */
		@Test
		public void testParameters() throws Exception {
				if (!parameterFound("1")) {
				assertTrue(false);
				} else {
				pb.size();
				}
		}
}