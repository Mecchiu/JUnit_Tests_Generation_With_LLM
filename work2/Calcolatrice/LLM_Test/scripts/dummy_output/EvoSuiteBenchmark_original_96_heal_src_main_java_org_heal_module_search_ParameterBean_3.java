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
		
		@Test
        public void test() 
		{
		    assertNull(ParameterBean.getParameters(0));
		    assertNull(ParameterBean.getParameters(999));
		    
		    ParameterBean.size();
		}	
}