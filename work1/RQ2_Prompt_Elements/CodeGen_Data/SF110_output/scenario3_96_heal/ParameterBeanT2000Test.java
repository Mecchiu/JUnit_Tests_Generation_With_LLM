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
/**
		 * Test calling the {@link String#trim()} method.
		 *
		 * @throws Exception if the method fails.
		 *
		 * @see {@link ParameterBean#TRIM} for the test description
		 */
		@Test
		void trimTest() {
			List<String> list = new ArrayList<String>(0);
			ParameterBean bean = new ParameterBean();
			bean.trim();
			assertTrue( "List contains elements as expected.",
						list.isEmpty());
		}

        
		/**
		 * Test calling the {@link String#trim()} method.
		 *
		 * @throws Exception if the method fails.
		 *
		 * @see {@link ParameterBean#TRIM} for the test description
		 */
		@Test
		void trim2Test() {
			ParameterBean bean = new ParameterBean();
			List<String> list = new ArrayList<String>(0);
			list.add( bean.TRIM.get(0)+"");

			System.out.println("List: " + list);
			bean.trim();
			assertTrue( "List contains elements as expected.",
						list.isEmpty());
		}
}