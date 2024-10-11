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
		
	public ParameterAttributes_1Test() {}
	
	/**
	 * Value for the demand curve is: elasticity * [ ln ] (demandCurveFunction(step) )
	 */
	@Test
    public void test_valueFor_step1() {
		ParameterAttributes_1 p = new ParameterAttributes_1();
		p.setName("demandCurveFunction");
		p.setElasticity(new Float(1));
		p.setLn(Boolean.TRUE);
		p.setDemandCurveFunction(new Function("1"));
		p.setSocial(Boolean.FALSE);
		double value = p .valueFor(1f);
		assertEquals(value,1,0.001);
	}
	
	/**
	 * Value for the social function is: sum of the weights of all the neighbours.
	 */
	@Test
    public void test_valueFor_step2() {
		ParameterAttributes_1 p = new ParameterAttributes_1();
		p.setName("socialFunction");
		p.setElasticity(new Float(1));
		p.setLn(Boolean.TRUE);
		p.setSocial(Boolean.FALSE);
		double value = p .valueFor(1f);
		assertEquals(value,1.0,0.001);
	}
	
	/**
	 * Get the string representation of the object
	 */
	@Test
    public void test_toString_step1() {
		ParameterAttributes_1 p = new ParameterAttributes_1();
		p.setName("demandCurveFunction");
		p.setElasticity(new Float(0));
		p.setLn(Boolean.FALSE);
		p.setDemandCurveFunction(new Function("0"));
		p.setSocial(Boolean.TRUE);
		String value = p.toString();
		assertEquals(value,": elasticity = 0");
	}
}	 /* end class ParameterAttributes_1Test */