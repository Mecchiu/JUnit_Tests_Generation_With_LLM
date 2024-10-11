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
		
	public ParameterBeanTest() {}
	
	@Test
	public void test_size() {
		assertEquals(10, new ParameterBean().size());
	}
	
}