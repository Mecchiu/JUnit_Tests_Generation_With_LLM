// ParameterAttributes_0Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains one unit test case for the {@link ParameterAttributes#valueFor(int)} method.
*/
class ParameterAttributes_0Test {
		
	@Test
    public void valueFor_001() throws Exception
	{
		assertEquals(150, valueFor(-3), 0d);
		assertEquals(150, valueFor(Double.valueOf(3.2d)), 0d);
	}

	@Test
    public void valueFor_002() throws Exception
	{
		assertEquals(150, valueFor(4), 0d);
		assertEquals(150, valueFor(-3), 0d);
	}

	@Test
    public void valueFor_003() throws Exception
	{
		assertEquals(147, valueFor(5), 0d);
		assertEquals(143, valueFor(-4), 0d);
	}

}

// DemandCurveFunction_0Test.java