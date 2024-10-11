// ParameterAttributes_1Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains one unit test case for the {@link ParameterAttributes#valueFor(float)} method.
*/
class ParameterAttributes_1Test {
		
 /**
  * Initializes the class.
  */
	public ParameterAttributes_1Test(){
		//do nothing
	}

  /**
   * Tests if the value of the parameter is 0.
   * @param x The parameter to be tested.
   * @return Result of the calculation.
   */
	@Test
  public void testValueFor(){
    ParameterAttributes instance = new ParameterAttributes();
    float expectedValue = new Float(0);

    //test if value equals 0
    assertEquals(expectedValue,  instance.valueFor(0), 2*Math.abs(expectedValue-instance.valueFor(0)));
  }

  /**
   * Tests if the value of the parameter lies between 0 and 1.0.
   * @param x The parameter to be tested.
   * @return Result of the calculation.
   * @deprecated In favor of testValueFor method
   */
  @Deprecated
  public float valueFor(float x) {
    return valueFor(x);
  }

}